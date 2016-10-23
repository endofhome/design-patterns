package uk.co.endofhome.decorator;

public class Suite extends HotelRoom {
    public Suite() {
        cost = 150.00;
        description = "Luxury suite: €" + cost + "\n";
    }

    @Override
    public double cost() {
        return cost;
    }
}
