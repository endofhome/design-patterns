package uk.co.endofhome.decorator;

public class DoubleRoom extends HotelRoom {
    public DoubleRoom() {
        description = "Double room";
        cost = 80.00;
    }

    @Override
    public double cost() {
        return cost;
    }
}
