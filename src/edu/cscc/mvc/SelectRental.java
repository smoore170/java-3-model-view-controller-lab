package edu.cscc.mvc;

import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectRental extends ApplicationView {
    public SelectRental(MVCContext context) {
        super(context);
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rental Id:  ");
        String rentalId = scanner.nextLine();
        Map params = new HashMap<>();
        params.put("id", rentalId);
        route("Rentals", "show", params);
    }
}
