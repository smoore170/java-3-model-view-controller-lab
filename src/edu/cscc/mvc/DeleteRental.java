package edu.cscc.mvc;

import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

public class DeleteRental extends ApplicationView {
    public DeleteRental(MVCContext context) {
        super(context);
    }

    @Override
    public void show() {
        route("Rentals", "index");
    }
}
