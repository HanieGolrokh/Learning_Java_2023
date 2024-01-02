package com.sample.hello;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class HelloNames {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        method1(myObj);
        method2(myObj);
        myObj.close();
    }

    private static void method1(@NotNull Scanner myObj) {

        System.out.println("Start Hello Application");
        System.out.println("-----------------------");
        System.out.println("Please enter your name");
        String userInput = myObj.nextLine();
        String[] names = userInput.split(" ");
        for (String name: names){
            System.out.println("Hello "+name);
        }

        System.out.println("End Hello Application");
    }
    private static void method2(@NotNull Scanner myObj){
        System.out.println("Start Hello Application");
        System.out.println("-----------------------");
        //Scanner myObj02 = new Scanner(System.in);
        for (;;){
            System.out.println("Please enter a name");
            String userInput = myObj.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Hello " + userInput);
            }
        // myObj.close();
        System.out.println("End Hello Application");
        }
    }

