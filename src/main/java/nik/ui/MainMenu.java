package nik.ui;

public enum MainMenu {

    CHECK_IN(1, "Check in a guest"),
    CHECK_OUT(2,"Check out a guest"),
    VIEW_GUESTS(3, "View Guests"),
    EXIT(4, "Exit");


    private int value;
    private String message;

    private MainMenu(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public static MainMenu fromValue(int value) {
        for (MainMenu option : MainMenu.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        return EXIT;
    }

    public int getValue() {
        return value;
    }
    public String getMessage() {
        return message;
    }

}
