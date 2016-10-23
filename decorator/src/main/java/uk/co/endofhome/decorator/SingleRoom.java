package uk.co.endofhome.decorator;

public class SingleRoom extends HotelRoom {
    public SingleRoom() {
        cost = 60.00;
        description = "Single room: €" + cost + "\n";
    }

    @Override
    public double cost() {
        return cost;
    }
}
