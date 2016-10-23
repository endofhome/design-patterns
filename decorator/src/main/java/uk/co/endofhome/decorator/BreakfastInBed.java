package uk.co.endofhome.decorator;

public class BreakfastInBed extends RoomService {
    private final HotelRoom hotelRoom;

    public BreakfastInBed(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        this.cost = 20;
    }

    @Override
    public double cost() {
        return cost + hotelRoom.cost();
    }

    @Override
    public String description() {
        return hotelRoom.description() + "Breakfast in bed: €" + cost + "\n";
    }
}
