import java.util.Random;


public class World {
    public int spawn(){
        //Produces a random number between 1 and 20. This is the odds of a creature spawning randomly.
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        return randomNumber;
    }

    public int food(){
        //Produces a random number between 5 and 10. This is the odds of food spawning randomly.
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 5;
        return randomNumber;
    }

}
