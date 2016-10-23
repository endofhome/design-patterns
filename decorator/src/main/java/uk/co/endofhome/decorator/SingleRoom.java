package uk.co.endofhome.decorator;

public class SingleRoom extends HotelRoom {
    public SingleRoom() {
        description = "Single room";
    }

    @Override
    public double cost() {
        return 60.00;
    }
}
