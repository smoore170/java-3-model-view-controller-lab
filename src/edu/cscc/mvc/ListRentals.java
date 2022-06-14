package edu.cscc.mvc;

import edu.cscc.mvc.domain.Rental;
import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

import java.util.List;
import java.util.Set;

public class ListRentals extends ApplicationView {
    private List<Rental> rentals;

    public ListRentals(MVCContext context, List<Rental> rentals) {
        super(context);
        this.rentals = rentals;
    }

    @Override
    public void show() {
        for (Rental rental : rentals) {
            System.out.println("******************************");
            System.out.println("Id:  " + rental.getId());
            System.out.println("Name:  " + rental.getName());
            System.out.println("Format: " + rental.getFormat());
            System.out.println("Genre: " + rental.getGenre());
            System.out.println("Director:  " + rental.getDirector());
            System.out.println("Year:  " + rental.getYear());
            System.out.println("******************************");
        }
        route("Rentals", "index");
    }
}

