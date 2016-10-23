package uk.co.endofhome.decorator;

public class MiniBarCola extends RoomService {
    private final HotelRoom hotelRoom;

    public MiniBarCola(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        this.cost = 3.00;
    }

    @Override
    public double cost() {
        return cost + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + "Mini-bar - cola: €" + cost + "\n";
    }
}
