package com.example.mladen.xwsclient.model;

public class SendOrderModel {
    private int Id;
    private int Money;
    private String Description;

    public SendOrderModel(int id, int money, String description) {
        Id = id;
        Money = money;
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
