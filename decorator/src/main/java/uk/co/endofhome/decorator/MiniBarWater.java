package uk.co.endofhome.decorator;

public class MiniBarWater extends RoomService {
    private final HotelRoom hotelRoom;

    public MiniBarWater(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public double cost() {
        return 5.00 + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + ", Mini-bar: water";
    }
}
