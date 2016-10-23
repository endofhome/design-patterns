package uk.co.endofhome.decorator;

public class LateCheckOut extends RoomService {
    private final HotelRoom hotelRoom;

    public LateCheckOut(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        this.cost = 30.00;
    }
    @Override
    public double cost() {
        return cost + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + "Late check out: €" + cost + "\n";
    }
}