package com.company;

public class ToDoListItem {

    private String itemName;
    private String itemState;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public ToDoListItem(String itemName, String itemState) {
        this.itemName = itemName;
        this.itemState = itemState;

    }



}
