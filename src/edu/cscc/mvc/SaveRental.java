package edu.cscc.mvc;

import edu.cscc.mvc.domain.Rental;
import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

public class SaveRental extends ApplicationView {
    private Rental rental;

    public SaveRental(MVCContext context, Rental rental) {
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
        route("Rentals", "index");
    }
}
