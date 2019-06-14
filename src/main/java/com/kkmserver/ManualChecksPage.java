package com.kkmserver;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import okhttp3.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManualChecksPage extends Div {

    OkHttpClient client;
    private final String url = "http://localhost:8888/";
    private VerticalLayout verticalLayout;
    private DatePicker datePicker;
    private Button buttonGetChecksByDate;
    private List<CheckEntity> checkEntities;
    private Grid<CheckEntity> checkEntityGrid;

    public ManualChecksPage() {
        client = new OkHttpClient();
        String authData = Credentials.basic("admin", "password");
        this.setWidth("100%");
        verticalLayout = new VerticalLayout();
        verticalLayout.setWidth("100%");
        this.add(verticalLayout);
        datePicker = new DatePicker();
        datePicker.setValue(LocalDate.now());
        verticalLayout.add(datePicker);
        buttonGetChecksByDate = new Button("Получить чеки на дату");
        buttonGetChecksByDate.addClickListener(this::reloadCheckGrid);
        verticalLayout.add(buttonGetChecksByDate);

//==============================================================================================
        checkEntityGrid = new Grid<>();
        checkEntityGrid.setWidth("100%");
        verticalLayout.add(checkEntityGrid);
//==============================================================================================



        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        this.add(button);
    }

    private void reloadCheckGrid(ClickEvent<Button> buttonClickEvent) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        urlBuilder.addQueryParameter("date", datePicker.getValue().toString());
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = client.newCall(request).execute();
            Gson g = new Gson();
            List<CheckEntity> checkEntities = new ArrayList<>();
            JsonArray jsonArray = g.fromJson(response.body().string(),JsonArray.class );
            for(JsonElement checkEntityJson: jsonArray){
                CheckEntity checkEntity = g.fromJson(checkEntityJson, CheckEntity.class);
                checkEntities.add(checkEntity);
            }
            checkEntities.stream().forEach(e->System.out.println(e.getIdCommand()));
            checkEntityGrid.setItems(checkEntities);
            checkEntityGrid.addColumn(CheckEntity::getTimeS).setHeader("Время");
            checkEntityGrid.addColumn(CheckEntity::getElectronicPayment).setHeader("Сумма");
            checkEntityGrid.addColumn(CheckEntity::countStrings).setHeader("Количество позиций");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
