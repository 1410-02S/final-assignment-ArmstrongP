public class Roll {

    static int creatureNumber = 0;
    static int foodNumber = 5; 

    //This is the code for rolling for reproduction number. It checks if the number of creatures is 2 or more, and then if it is mating season. 
    //It then divides the creatures into pairs. Each pair has a child if it is mating season. This returns the new number of creatures.
    public static int matingSeason(){
        Creature creatureReproduceObject = new Creature();
        int numberOfCouples = 0;
        if(creatureNumber >= 2){
            if(creatureReproduceObject.reproduce() == 1){
                if(creatureNumber % 2 == 0){
                    numberOfCouples = creatureNumber/2;
                }else{
                    numberOfCouples = (creatureNumber-1)/2;
                }
            }
        }
        return numberOfCouples;
    }


    public static int spawning(){
        int numberOfSpawns = 0;
        World worldSpawnObject = new World();
        if(worldSpawnObject.spawn() == 1){
            numberOfSpawns++;
        }
        return numberOfSpawns;
    }

    public static int starvation(){
        int deathsFromStarvation = 0;
        World worldFoodObject = new World();
        foodNumber = foodNumber + worldFoodObject.food();
        if(creatureNumber > foodNumber){
            deathsFromStarvation = (creatureNumber - foodNumber)/2;
            foodNumber = 0;
        }else{
            foodNumber = foodNumber - creatureNumber;
        }
        return deathsFromStarvation;
    }

    public static int dying(){
        int deathsFromDeath = 0;
        Creature creatureDeathObject = new Creature();
        if(creatureNumber > 0){
            if(creatureDeathObject.die() == 1){
                deathsFromDeath++;
            }
        }
        return deathsFromDeath;
    }



    public static void main(String[] args) throws Exception {
        while(true){
            int totalSpawns = spawning();
            int newBabies = matingSeason();
            int foodDeaths = starvation();
            int expiredCreatures = dying();

            creatureNumber = creatureNumber+(totalSpawns + newBabies - foodDeaths - expiredCreatures);
            System.out.println("Number of creatures is: "+creatureNumber+" Amount of food is: "+foodNumber);
            Thread.sleep(50);
        }
        
    }
}
