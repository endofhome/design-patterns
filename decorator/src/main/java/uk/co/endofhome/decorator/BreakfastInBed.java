package uk.co.endofhome.decorator;

public class BreakfastInBed extends RoomService {
    private final HotelRoom hotelRoom;

    public BreakfastInBed(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
        description = "Breakfast in bed";
    }

    @Override
    public double cost() {
        return 20 + hotelRoom.cost();
    }

    @Override
    public String description() {
        return description;
    }
}
