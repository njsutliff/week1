package nik.ui;

import nik.Capsule;
import nik.Hotel;

public class Controller {
    View view;
    Hotel hotel;

    public Controller(View view, Hotel hotel) {
        this.view = view;
        this.hotel = hotel;
    }

    public void run() {
        System.out.println("Welcome to capsule nik.hotel v2.0!");

        mainMenu();
    }

    private void mainMenu() {
        MainMenu option;
        do {
            option = view.selectMainMenuOption();
            switch (option) {
                case CHECK_IN:
                    checkIn();
                    break;
                case CHECK_OUT:
                    checkOut();
                    break;
                case VIEW_GUESTS:
                    viewGuests();
                    break;
            }
        } while (option != MainMenu.EXIT);
    }

    private void checkIn() {
        Capsule toAdd = view.getCapsule();
        hotel.checkIn(toAdd.capsule, toAdd.getGuestName());
    }

    private void checkOut() {
        view.displayHeader("Enter a capsule to checkout");
        Capsule toCheckOut = view.getCapsule();
        hotel.checkOut(toCheckOut.capsule+1, toCheckOut.getGuestName());
    }

    private void viewGuests() {
        view.displayHeader("Enter a capsule number to view from to checkout");
        int cap = view.io.readInt("",0, 100);
        hotel.viewGuests(cap+1);
    }
}