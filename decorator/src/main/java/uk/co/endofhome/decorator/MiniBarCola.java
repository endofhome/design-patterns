package uk.co.endofhome.decorator;

public class MiniBarCola extends RoomService {
    private final HotelRoom hotelRoom;

    public MiniBarCola(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public double cost() {
        return 3.00 + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + ", Mini-bar: cola";
    }
}