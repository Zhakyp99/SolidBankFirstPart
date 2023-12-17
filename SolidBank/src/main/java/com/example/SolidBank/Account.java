package com.example.SolidBank;


import lombok.Data;

@Data

public class Account {
    private String accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;

    public double getBalance(){
        return balance;
    }
    @Override
    public String toString(){
        return String.format("Account{AccounType=%s, id = %s, cliendId=%s, balance=%.1f");
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public Account(String accountType, String id, String clientID, double balance) {
        this.accountType = accountType;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;

    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
