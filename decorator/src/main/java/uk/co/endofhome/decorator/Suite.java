package uk.co.endofhome.decorator;

public class Suite extends HotelRoom {
    public Suite() {
        description = "Luxury suite";
    }

    @Override
    public double cost() {
        return 150.00;
    }
}
