package com.example.mladen.xwsclient.model;


public class RecieveOrderModel {

    private String Description;
    private boolean IsOk;

    public RecieveOrderModel(String description, boolean isOk) {
        Description = description;
        IsOk = isOk;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isOk() {
        return IsOk;
    }

    public void setOk(boolean ok) {
        IsOk = ok;
    }
}
