package uk.co.endofhome.decorator;

public class Hotelbillerizer {
    public static void main(String[] args) {
        System.out.println("BASIC STAY:");
        HotelRoom basicStay = new SingleRoom();
        System.out.println(basicStay.description());
        System.out.println("Total bill: €" + basicStay.cost());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        System.out.println("TWO THIRSTY CUSTOMERS:");
        HotelRoom thirstyStay = new DoubleRoom();
        thirstyStay = new MiniBarCola(thirstyStay);
        thirstyStay = new MiniBarWater(thirstyStay);
        System.out.println(thirstyStay.description());
        System.out.println("Total bill: €" + thirstyStay.cost());

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        System.out.println("ROCK STAR:");
        HotelRoom rockStarStay = new Suite();
        rockStarStay = new MiniBarBeer(rockStarStay);
        rockStarStay = new LateCheckOut(rockStarStay);
        rockStarStay = new BreakfastInBed(rockStarStay);
        rockStarStay = new MiniBarBeer(rockStarStay);
        System.out.println(rockStarStay.description());
        System.out.println("Total bill: €" + rockStarStay.cost());
    }
}
