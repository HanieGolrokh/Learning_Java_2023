package com.sample.hello;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Start Hello Application");
        System.out.println("-----------------------");
        System.out.println("Please enter your name");
        String userInput = myObj.nextLine();
        System.out.println("Hello "+userInput);
        myObj.close();
        System.out.println("End Hello Application");
    }
}
