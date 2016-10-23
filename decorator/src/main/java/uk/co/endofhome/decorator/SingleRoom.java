package uk.co.endofhome.decorator;

public class SingleRoom extends HotelRoom {
    public SingleRoom() {
        description = "Single room";
        cost = 60.00;
    }

    @Override
    public double cost() {
        return cost;
    }
}
