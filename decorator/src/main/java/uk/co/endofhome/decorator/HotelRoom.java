package uk.co.endofhome.decorator;

public abstract class HotelRoom {
    String description = "Unknown room type";
    public abstract double cost();

    public String description() {
        return description;
    }
}