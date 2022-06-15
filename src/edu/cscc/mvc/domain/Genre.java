package edu.cscc.mvc.domain;

public enum Genre {
    HORROR,
    ACTION,
    COMEDY,
    DRAMA,
    ROMANCE;

    public static Genre fromString(String x) {

        switch (x) {
            case "HORROR":
                return HORROR;
            case "ACTION":
                return ACTION;
            case "COMEDY":
                return COMEDY;
            case "DRAMA":
                return DRAMA;
            case "ROMANCE":
                return ROMANCE;
        }
        return null;

    }
}

