package com.example;

import java.util.Scanner;

public class UserInputApp {
    public static void main(String[] args) {

        if(args.length > 0){
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("No name provided");
        }
    }
}
