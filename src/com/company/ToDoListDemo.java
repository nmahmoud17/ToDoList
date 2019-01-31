package com.company;

import java.util.Scanner;

public class ToDoListDemo {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        ToDoList myToDoList = new ToDoList();

        System.out.println("Please enter the description of your to-do item: ");
        String userInputDescription = myScanner.nextLine();
        System.out.println("Please if it is ToDo, InProgress, or Done:  ");

        String userInputStatus = myScanner.nextLine();

        ToDoListItem myItem = new ToDoListItem(userInputDescription, userInputStatus);

        myItem.printDetail();

    }
}
