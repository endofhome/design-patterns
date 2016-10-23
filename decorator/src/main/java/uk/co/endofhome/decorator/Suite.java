package uk.co.endofhome.decorator;

public class Suite extends HotelRoom {
    public Suite() {
        description = "Luxury suite";
        cost = 150.00;
    }

    @Override
    public double cost() {
        return cost;
    }
}
