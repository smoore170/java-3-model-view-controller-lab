package edu.cscc.mvc;

import edu.cscc.mvc.domain.Format;
import edu.cscc.mvc.domain.Genre;
import edu.cscc.mvc.domain.Rental;
import edu.cscc.mvc.domain.RentalRepository;
import edu.cscc.mvc.framework.ApplicationController;
import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RentalsController extends ApplicationController {

    private final RentalRepository rentalRepository;

    public RentalsController(MVCContext context) {
        super(context);
        rentalRepository = RentalRepository.getInstance();
    }

    @Override
    public void render(ApplicationView view) {
        super.render(view);
    }

    public void list() {
        render(new RentalsIndex(context));
    }

    public void create() {
        render(new CreateRental(context));
    }

    public void select() {
        //     render(new SelectRental(context));
    }

    public void index() {
        render(new RentalsIndex(context));
    }

    public void show() {
        Rental rental = rentalRepository.read(getRentalIdFromParams());
        render(new ShowRental(context, rental));
    }

    private UUID getRentalIdFromParams() {
        return UUID.fromString((String) context.getRequest().getParams().get("id").toString());
    }

    public void save() {
        Format format = null;
        Genre genre = null;
format = format.fromString(context.getRequest().getParams().get("format").toString());
genre = genre.fromString(context.getRequest().getParams().get("genre").toString());
        Rental rental = rentalRepository.create(new Rental(
                context.getRequest().getParams().get("name").toString(),
                format,
                genre,
                context.getRequest().getParams().get("director").toString(),
                context.getRequest().getParams().get("year").toString()));
        render(new ShowRental(context, rental));
    }
}


