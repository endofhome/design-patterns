package uk.co.endofhome.decorator;

public class LateCheckOut extends RoomService {
    private final HotelRoom hotelRoom;

    public LateCheckOut(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
    @Override
    public double cost() {
        return 30.00 + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + ", Late check out";
    }
}