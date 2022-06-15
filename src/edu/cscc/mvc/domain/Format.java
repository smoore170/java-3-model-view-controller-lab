package edu.cscc.mvc.domain;

public enum Format {
    DVD,
    VHS,
    BLU_RAY;

    public static Format fromString(String x) {

        switch (x) {
            case "DVD":
                return DVD;
            case "VHS":
                return VHS;
            case "BLU_RAY":
                return BLU_RAY;
        }
        return null;

    }
}