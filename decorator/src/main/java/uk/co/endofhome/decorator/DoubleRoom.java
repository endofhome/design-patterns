package uk.co.endofhome.decorator;

public class DoubleRoom extends HotelRoom {
    public DoubleRoom() {
        cost = 80.00;
        description = "Double room: €" + cost + "\n";
    }

    @Override
    public double cost() {
        return cost;
    }
}
