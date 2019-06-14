package com.kkmserver;


import java.util.ArrayList;
import java.util.List;


public class CheckEntity {
    private int id;
    private String command;
    private int numDevice;
    private int timeout;
    private String idCommand;
    private boolean isFiscalCheck;
    private int typeCheck;
    private boolean cancelOpenedCheck;
    private boolean notPrint;
    private int numberOfCopies;
    private String cashierName;
    private String cashierVATIN;
    private String clientAddress;
    private boolean payByProcessing;
    private double cash;
    private double electronicPayment;
    private double advancePayment;
    private double credit;
    private double cashProvision;
    private int checkNumber;
    private int sessionNumber;
    private int sessionCheckNumber;
    private String qrCode;
    private String error;
    private int status;
    private long date;
    private String dateS;
    private String timeS;
    private List<CheckString> strings = new ArrayList<CheckString>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCommand() {
        return command;
    }
    public void setCommand(String command) {
        this.command = command;
    }
    public int getNumDevice() {
        return numDevice;
    }
    public void setNumDevice(int numDevice) {
        this.numDevice = numDevice;
    }
    public int getTimeout() {
        return timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    public String getIdCommand() {
        return idCommand;
    }
    public void setIdCommand(String idCommand) {
        this.idCommand = idCommand;
    }
    public boolean isFiscalCheck() {
        return isFiscalCheck;
    }
    public void setFiscalCheck(boolean fiscalCheck) {
        isFiscalCheck = fiscalCheck;
    }
    public int getTypeCheck() {
        return typeCheck;
    }
    public void setTypeCheck(int typeCheck) {
        this.typeCheck = typeCheck;
    }
    public boolean isCancelOpenedCheck() {
        return cancelOpenedCheck;
    }
    public void setCancelOpenedCheck(boolean cancelOpenedCheck) {
        this.cancelOpenedCheck = cancelOpenedCheck;
    }
    public boolean isNotPrint() {
        return notPrint;
    }
    public void setNotPrint(boolean notPrint) {
        this.notPrint = notPrint;
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    public String getCashierName() {
        return cashierName;
    }
    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
    public String getCashierVATIN() {
        return cashierVATIN;
    }
    public void setCashierVATIN(String cashierVATIN) {
        this.cashierVATIN = cashierVATIN;
    }
    public String getClientAddress() {
        return clientAddress;
    }
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
    public boolean isPayByProcessing() {
        return payByProcessing;
    }
    public void setPayByProcessing(boolean payByProcessing) {
        this.payByProcessing = payByProcessing;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public double getElectronicPayment() {
        return electronicPayment;
    }
    public void setElectronicPayment(double electronicPayment) {
        this.electronicPayment = electronicPayment;
    }
    public double getAdvancePayment() {
        return advancePayment;
    }
    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public double getCashProvision() {
        return cashProvision;
    }
    public void setCashProvision(double cashProvision) {
        this.cashProvision = cashProvision;
    }
    public int getCheckNumber() {
        return checkNumber;
    }
    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }
    public int getSessionNumber() {
        return sessionNumber;
    }
    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    public int getSessionCheckNumber() {
        return sessionCheckNumber;
    }
    public void setSessionCheckNumber(int sessionCheckNumber) {
        this.sessionCheckNumber = sessionCheckNumber;
    }
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public long getDate() {
        return date;
    }
    public void setDate(long date) {
        this.date = date;
    }
    public List<CheckString> getStrings() {
        return strings;
    }
    public void setStrings(List<CheckString> strings) {
        this.strings = strings;
    }

    public String getDateS() {
        return dateS;
    }

    public void setDateS(String dateS) {
        this.dateS = dateS;
    }

    public String getTimeS() {
        return timeS;
    }

    public void setTimeS(String timeS) {
        this.timeS = timeS;
    }

    public int countStrings(){
        return strings.size();
    }


}
