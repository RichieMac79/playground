package com.richie.mcdonough.yourprime.media.genre;

public class Rap extends Genre {

    //TODO complete method override
    @Override
    public double setPrice(int rating) {
        if (rating > 3) {
            return 4.99;
        } else if (rating == 3) {
            return 3.99;
        }
        return 1.99;
    }
}
