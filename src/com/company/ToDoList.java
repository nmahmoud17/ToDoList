package com.company;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    List<ToDoListItem> myToDoList = new ArrayList<>();

    public void addToList(ToDoListItem item) {
        myToDoList.add(item);
    }

    public void viewList(){
        for (int i=0; i<myToDoList.size(); i++) {
            System.out.println(i);
            myToDoList.get(i).printDetail();
        }
    }
}
