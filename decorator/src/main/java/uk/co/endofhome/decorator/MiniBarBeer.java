package uk.co.endofhome.decorator;

public class MiniBarBeer extends RoomService {
    private final HotelRoom hotelRoom;

    public MiniBarBeer(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        this.cost = 6.00;
    }

    @Override
    public double cost() {
        return cost + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + "Mini-bar - beer: " + cost + "\n";
    }
}
