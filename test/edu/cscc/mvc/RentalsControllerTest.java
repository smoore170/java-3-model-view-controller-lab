package edu.cscc.mvc;

import edu.cscc.mvc.domain.Format;
import edu.cscc.mvc.domain.Genre;
import edu.cscc.mvc.domain.Rental;
import edu.cscc.mvc.domain.RentalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class RentalsControllerTest extends MVCTest {
    RentalRepository rentalRepository;

    @BeforeEach
    public void setUp() {
        super.setUp();
        rentalRepository = RentalRepository.getInstance();
    }

    @Test
    public void itCanRouteToRentalsIndex() {
        assertRouteExists("Rentals", "index", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalList() {
        assertRouteExists("Rentals", "list", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalsCreate() {
        assertRouteExists("Rentals", "create", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalsEdit() {
        assertRouteExists("Rentals", "edit", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalsSelect() {
        assertRouteExists("Rentals", "select", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalsShow() {
        assertRouteExists("Rentals", "show", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalsSave() {
        assertRouteExists("Rentals", "save", RentalsController.class);
    }

    @Test
    public void itCanRouteToRentalsUpdate() {
        assertRouteExists("Rentals", "update", RentalsController.class);
    }

    @Test
    public void itRendersTheRentalsIndexView() {
        routeRequest("Rentals", "index");

        assertViewRendered(RentalsIndex.class);
    }

    @Test
    public void itRendersTheRentalsListView() {
        routeRequest("Rentals", "list");

        assertViewRendered(ListRentals.class);
    }

    @Test
    public void itRendersTheRentalsCreateView() {
        routeRequest("Rentals", "create");

        assertViewRendered(CreateRental.class);
    }

    @Test
    public void itRendersTheRentalsEditView() {
        Map params = new HashMap<>();
        Rental rental = rentalRepository.create(new Rental("Breakfast Club", Format.DVD, Genre.ROMANCE, "Cameron", "1988"));
        params.put("id", rental.getId());

        routeRequest("Rentals", "edit", params);

        assertViewRendered(EditRental.class);
    }

    @Test
    public void itRendersTheRentalsDeleteView() {
        Map params = new HashMap<>();
        Rental rental = rentalRepository.create(new Rental("Breakfast Club", Format.DVD, Genre.ROMANCE, "Cameron", "1988"));
        params.put("id", rental.getId());
        routeRequest("Rentals", "delete", params);

        assertViewRendered(DeleteRental.class);
    }

    @Test
    public void itRendersTheRentalsSelectView() {
        routeRequest("Rentals", "select");

        assertViewRendered(SelectRental.class);
    }

    @Test
    public void itRendersTheRentalsShowView() {
        Map params = new HashMap<>();
        Rental rental = rentalRepository.create(new Rental("Breakfast Club", Format.DVD, Genre.ROMANCE, "Cameron", "1988"));
        params.put("id", rental.getId());
        routeRequest("Rentals", "show", params);

        assertViewRendered(ShowRental.class);
    }

    @Test
    public void itRendersTheRentalsSaveView() {
        Map params = new HashMap<>();
        params.put("name", "ET");
        params.put("format", "BLU_RAY");
        params.put("genre", "DRAMA");
        params.put("director", "Spielburg");
        params.put("year", "1985");
        routeRequest("Rentals", "save", params);

        assertViewRendered(SaveRental.class);
    }

    @Test
    public void itRendersTheRentalsUpdateView() {
        Map params = new HashMap<>();
        Rental rental = rentalRepository.create(new Rental("Breakfast Club", Format.DVD, Genre.ROMANCE, "Cameron", "1988"));
        params.put("id", rental.getId());
        params.put("name", "ET");
        params.put("format", "BLU_RAY");
        params.put("genre", "DRAMA");
        params.put("director", "Spielburg");
        params.put("year", "1985");
        routeRequest("Rentals", "update", params);

        assertViewRendered(ShowRental.class);
    }


}
