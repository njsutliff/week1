package nik;

import nik.ui.ConsoleIO;
import nik.ui.Controller;
import nik.ui.View;

public class App {
    public static void main(String[] args) {
        ConsoleIO io = new ConsoleIO();
        View view = new View(io);
        Hotel hotel = new Hotel();
        Controller controller = new Controller(view, hotel);
        controller.run();
    }
}
