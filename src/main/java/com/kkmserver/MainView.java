package com.kkmserver;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {
    private Button buttonRefund;


    public MainView() {
        Tab manualChecks = new Tab("Пробитие чеков в ручную");
        Div manualChecksPage = new ManualChecksPage();

        Tab statistics = new Tab("Статистика работы");
        Div statisticsPage = new Div();
        statisticsPage.setText("2222");
        statisticsPage.setVisible(false);

        Tabs mainTabs = new Tabs(manualChecks, statistics);
        Div pages = new Div(manualChecksPage, statisticsPage);
        pages.setWidth("100%");
        add(mainTabs);
        add(pages);




        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(manualChecks, manualChecksPage);
        tabsToPages.put(statistics, statisticsPage);
        Set<Component> pagesShown = Stream.of(manualChecksPage).collect(Collectors.toSet());

        mainTabs.addSelectedChangeListener(event->{
            pagesShown.forEach(page->page.setVisible(false));
            pagesShown.clear();
            Component selectedPage = tabsToPages.get(mainTabs.getSelectedTab());
            System.out.println(selectedPage);
            selectedPage.setVisible(true);
            pagesShown.add(selectedPage);
        });
    }
}
