package com.example.mann.testapp1.DAO;



public class Item {

    String itemTitle;
    String itemStatus;

    public Item() {

    }

    public Item(String itemTitle, String itemStatus) {
        this.itemTitle = itemTitle;
        this.itemStatus = itemStatus;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
}
