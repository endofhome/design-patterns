package uk.co.endofhome.strategy;

import java.util.Arrays;
import java.util.List;

public class ArtistInformationRunner {
    public static void main(String[] args) {
        List<Band> bands = Arrays.asList(
                new ArtEnsembleOfChicago(),
                new BlackSabbath(),
                new MilesDavis(),
                new NapalmDeath()
        );

        for (Band band : bands) {
            System.out.println(band.name.toUpperCase());
            System.out.println("> Make some noise! ");
            band.makeSomeNoise();
            System.out.println("> Rock out!");
            band.rockOut();
            System.out.println("> Improvise!");
            band.improvise();
            System.out.println("> Introduce the band!");
            band.members();
            System.out.println("");
        }
    }
}
