package uk.co.endofhome.decorator;

public class MiniBarBeer extends RoomService {
    private final HotelRoom hotelRoom;

    public MiniBarBeer(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        description = "Mini-bar: beer";
    }

    @Override
    public double cost() {
        return 6.00 + hotelRoom.cost();
    }

    @Override
    public String description() {
        return description;
    }
}
