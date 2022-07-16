package fi.jussi.restserver.restserver.util;

import java.util.Random;

/**
 * Simple class containing random functionality.
 *
 * @author Jussi Pohjolainen
 * @version 2022-07-16
 */
public class RandomGenerator {
    /**
     * Generates a pseudorandom integer in the range [min, max]
     * @param `min` The starting value of the range (inclusive)
     * @param `max` The ending value of the range (inclusive)
     */
    public static int rand(int min, int max)
    {
        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid range");
        }

        return new Random().nextInt(max - min + 1) + min;
    }
}
