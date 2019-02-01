package com.company;

import java.util.Scanner;

public class ToDoListDemo {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        ToDoList myList = new ToDoList();
        boolean running = true;

       do {
           System.out.println("What would you like to do?");
           System.out.println("1. Add to the To-Do List");
           System.out.println("2. Display all items of To-Do List");
           System.out.println("3. Display all items by status: ToDo, InProgress, Done"); //need submenu?
           System.out.println("4. Edit a To-Do list item");
           System.out.println("5. Delete an Item");
           System.out.println("6. Exit!");

           int userMenuInput = myScanner.nextInt();
           myScanner.nextLine();


           switch (userMenuInput) {

               case 1:
                   System.out.println("Please enter the description of your to-do item: ");
                   String userInputDescription = myScanner.nextLine();
                   System.out.println("Please if it is ToDo, InProgress, or Done:  ");

                   String userInputStatus = myScanner.nextLine();

                   ToDoListItem myItem = new ToDoListItem(userInputDescription, userInputStatus);
                   myList.addToList(myItem);
                   myItem.printDetail();
                   break;

               case 2:
                   myList.viewList();
           }
       }while (running);
    }
}
