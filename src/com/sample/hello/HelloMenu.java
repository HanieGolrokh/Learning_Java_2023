package com.sample.hello;

import java.util.Scanner;

public class HelloMenu {
    public static void main(String[] args) {
        System.out.println("Start Hello Application");
        System.out.println("-----------------------");
        System.out.println("1. print default message");
        System.out.println("2. Get the name and say hello ");
        System.out.println("Select a menu item ");
        Scanner myObj = new Scanner(System.in);
        String userInput = myObj.nextLine();
        if (userInput.equals("1")){
            System.out.println("Hello World");
        }
        if (userInput.equals("2")){
            System.out.println("Please enter your name");
            String name = myObj.nextLine();
            System.out.println("Hello "+ name);
        }
    }
}
