package uk.co.endofhome.decorator;

public class DoubleRoom extends HotelRoom {
    public DoubleRoom() {
        description = "Double room";
    }

    @Override
    public double cost() {
        return 80.00;
    }
}
