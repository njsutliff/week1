package nik.ui;

import nik.Capsule;
import nik.Hotel;

public class View {
    ConsoleIO io;
    public View(ConsoleIO io){
        this.io = io;
    }
    public  MainMenu selectMainMenuOption() {
        displayHeader("Main Menu");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (MainMenu option : MainMenu.values()) {

            System.out.printf("%s. %s%n",  option.getMessage(), option.getValue());

            min = Math.min(min, option.getValue());
            max = Math.max(max, option.getValue());
        }

        String message = String.format("Select [%s-%s]: ", min, max);
        return MainMenu.fromValue(io.readInt(message, min, max));
    }

    public void displayHeader(String message) {
        io.println("");
        io.println(message);
        io.println("=".repeat(message.length()));
    }
    public Capsule getCapsule(){
        displayHeader("Add a capsule");
        Capsule capsule = new Capsule();
        capsule.setGuestName(io.readRequiredString("Enter a name"));
        capsule.setCapsule(io.readInt("Enter a capsule number", 0, 500));
        return  capsule;
    }

    public int getCapacity() {
        return io.readInt("Enter the capacity of the hotel", 0, 500);
    }
}
