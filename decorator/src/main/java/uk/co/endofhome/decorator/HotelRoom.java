package uk.co.endofhome.decorator;

public abstract class HotelRoom {
    String description = "Unknown room type";
    double cost = 0.0;
    public abstract double cost();

    public String description() {
        return description;
    }
}