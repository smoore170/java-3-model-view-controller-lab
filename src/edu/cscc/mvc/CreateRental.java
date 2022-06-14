package edu.cscc.mvc;

import edu.cscc.mvc.domain.Format;
import edu.cscc.mvc.domain.Genre;
import edu.cscc.mvc.framework.ApplicationView;
import edu.cscc.mvc.framework.MVCContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class CreateRental extends ApplicationView {


    public CreateRental(MVCContext context) {
        super(context);

    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        Map params = new HashMap<>();
        System.out.println("Create a rental");
        System.out.println("Name:");
        String name = scanner.nextLine();
        params.put("name", name);

        System.out.println("Format:");
        System.out.println("     1. DVD");
        System.out.println("     2. VHS");
        System.out.println("     3. BLU_RAY");
        System.out.println("Choice:");
        int formatChoice = Integer.parseInt(scanner.nextLine());
        Format format;
        switch (formatChoice) {
            case 1:
                format = Format.DVD;
                params.put("format", "DVD");
                break;
            case 2:
                params.put("format", "VHS");
                break;
            case 3:
                params.put("format", "BLU_RAY");
                break;
            default:
                route("Orders", "Index");
                break;
        }

        System.out.println("Genre:");
        System.out.println("     1. HORROR");
        System.out.println("     2. ACTION");
        System.out.println("     3. COMEDY");
        System.out.println("     4. DRAMA");
        System.out.println("     5. ROMANCE");
        System.out.println("Choice:");
        int genre = Integer.parseInt(scanner.nextLine());
        switch (genre) {
            case 1:
                params.put("genre", "HORROR");
                break;
            case 2:
                params.put("genre", "ACTION");
                break;
            case 3:
                params.put("genre", "COMEDY");
                break;
            case 4:
                params.put("genre", "DRAMA");
                break;
            case 5:
                params.put("genre", "ROMANCE");
                break;
            default:
                route("Orders", "Index");
                break;
        }

        System.out.println("Director:");
        String director = scanner.nextLine();
        params.put("director", director);

        System.out.println("Year:");
        String year = scanner.nextLine();
        params.put("year", year);

        route("Rentals","save", params);
    }

}
