package uk.co.endofhome.decorator;

public class MiniBarWater extends RoomService {
    private final HotelRoom hotelRoom;

    public MiniBarWater(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        this.cost = 5.00;
    }

    @Override
    public double cost() {
        return cost + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + "Mini-bar - water: €" + cost + "\n";
    }
}
