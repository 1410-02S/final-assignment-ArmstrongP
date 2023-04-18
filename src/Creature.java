import java.util.Random;

public class Creature {
    public int reproduce(){
        //Produces a random number between 1 and 7. This is the odds of the number of creatures doubling by the nearest even number (called in mating season).
        Random random = new Random();
        int randomNumber = random.nextInt(7) + 1;
        return randomNumber;
    }


    public int die(){
        //Produces a random number between 1 and 20. This is the odds of a creature dying.
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        return randomNumber;

    }
}
