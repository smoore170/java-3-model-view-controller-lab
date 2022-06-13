package edu.cscc.mvc;

import edu.cscc.mvc.framework.ApplicationController;
import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

public class RentalsController extends ApplicationController {
    public RentalsController(MVCContext context) {
        super(context);
    }

    @Override
    public void render(ApplicationView view) {
        super.render(view);
    }

    public void list() {
        render(new RentalsIndex(context));
    }

    public void create() {
 //       render(new RentalsCreate(context));
    }

    public void select() {
   //     render(new RentalsSelect(context));
    }

    public void index() {
        render(new RentalsIndex(context));
    }

}


