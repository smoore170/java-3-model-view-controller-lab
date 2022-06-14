package edu.cscc.mvc;

import edu.cscc.mvc.domain.Rental;
import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ShowRental extends ApplicationView {
    private Rental rental;

    public ShowRental(MVCContext context, Rental rental) {
        super(context);
        this.rental = rental;
    }

    @Override
    public void show() {

        System.out.println("******************************");
        System.out.println("Id:  " + rental.getId());
        System.out.println("Name:  " + rental.getName());
        System.out.println("Format: " + rental.getFormat());
        System.out.println("Genre: " + rental.getGenre());
        System.out.println("Director:  " + rental.getDirector());
        System.out.println("Year:  " + rental.getYear());
        System.out.println("******************************");
        System.out.println("");

        Map params = new HashMap<>();
        params.put("id", rental.getId().toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Manage rental");
        System.out.println("1. Update rental");
        System.out.println("2. Delete rental");
        System.out.println("3. Rentals menu");
        System.out.print("Choice:");

        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    route("Rentals", "edit", params);
                    break;
                case 2:
                    route("Rentals", "delete", params);
                    break;
                case 3:
                    route("Rentals", "index");
                    break;
                default:
                    route("Rentals", "index");
                    break;
            }
        } catch (InputMismatchException ex) {
            route("Rentals", "index");
        }
    }
}
