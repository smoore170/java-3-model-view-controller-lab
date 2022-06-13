package edu.cscc.mvc;

import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeIndex extends ApplicationView {
    public HomeIndex(MVCContext context) {
        super(context);
    }


    @Override
    public void show() {
        System.out.println("Welcome to Lackluster Video!");
        System.out.println("****************************");
        System.out.println("Options are:");
        System.out.println("1. Manage rentals");
        System.out.println("2. Exit");
        System.out.print("Choice:");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    route("Orders", "index");
                    break;
                case 2:
                    route("Home", "goodbye");
                    break;
                default:
                    route ("Home", "index");
                    break;
            }
        } catch (InputMismatchException ex) {
            route ("Home", "index");
        }
    }
}
