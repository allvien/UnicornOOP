package EnhörningOOP;


import CollectionsSolutions.Movie;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // practice with arrays and list
        Bäckahäst bäckahäst = new Bäckahäst();
        Bäckahäst bäckahäst1 = new Bäckahäst();

        bäckahäst.setName("Coralie");
        bäckahäst.setPrice(24000);
        bäckahäst.setAge(90);
        bäckahäst.setStable("The Dark forest");
        bäckahäst.setNotDangerous(true);

        bäckahäst1.setName("Sirius Black");
        bäckahäst1.setPrice(180000);
        bäckahäst1.setAge(20);
        bäckahäst1.setStable("John Bauers stables");
        bäckahäst1.setNotDangerous(false);


        /*printBäckahästDetails(bäckahäst);
        printBäckahästDetails(bäckahäst1);*/

        Bäckahäst[] bäckahästs = new Bäckahäst[2];
        bäckahästs[0] = bäckahäst;
        bäckahästs[1] = bäckahäst1;

        // lists
        List<FlyingHorse> horses = new ArrayList<>();
        // add horse object
        horses.add(new FlyingHorse("Black Beauty", 150, 1500000, "History Horses", false));
        // get a horse object with an index
        FlyingHorse horse= horses.get(0);
        //return size of list
        int size = horses.size();
        // remove the horse with index 0
        horses.remove(0);


        List horses1 = new ArrayList();
        horses1.add(new FlyingHorse("Biscuit", 32, 5000, "Running purebreads", false));
        FlyingHorse horse1 = (FlyingHorse)horses1.get(0);




        /*
        //Qeueue
        Queue<FlyingHorse>flyingHorses = new LinkedList<>();
        // add a horse object
        flyingHorses.add(new FlyingHorse("Windwalker", 344, 50000000, "Old magic ", true));
        //remove one horse at a the time
        while (!flyingHorses.isEmpty()) { FlyingHorse flyingHorse = flyingHorses.remove(); }



        //Set
        Set<FlyingHorse> flyingHorse = new HashSet<>();
        // add horse object
        flyingHorse.add(new FlyingHorse("Geronimo", 2, 150000, "New Generation ", true));
        //return size of the set
        int size1 = flyingHorse.size();
        // remove with an object referens not an index
        flyingHorse.remove(flyingHorse);
            */

        // map
        Map<Integer, FlyingHorse> flyingHorseMap = new HashMap<>();
        // add a object horse with key 3
        flyingHorseMap.put(3, new FlyingHorse("Rainbow", 23, 145345, "Magic flyers", true));
        // get a horse with the key
        FlyingHorse flyingHorsesTry = flyingHorseMap.get(3);
        //remove horse with key 3
        flyingHorseMap.remove(3);

        //loop thrue array and print
        for (int i = 0; i < bäckahästs.length; i++) {
            printBäckahästDetails(bäckahästs[i]);

        }

        FlyingHorse flyingHorse = new FlyingHorse("Pegasus", 5, 250000, "Horse Wisperer", false);
        FlyingHorse flyingHorse1 = new FlyingHorse("Sleipner", 60, 8000000, "Foregin Tales", false);
        FlyingHorse flyingHorse2 = new FlyingHorse("Winddancer", 80, 150000, "Flying beasts", true);

        FlyingHorse[] flyingHorses = new FlyingHorse[3];
        flyingHorses[0] = flyingHorse;
        flyingHorses[1] = flyingHorse1;
        flyingHorses[2] = flyingHorse2;

        // print array
        for (FlyingHorse fH : flyingHorses) {
            fH.printFlyingHorseDetails();
            System.out.println("");
        }
        List flyHorse = new ArrayList();
        flyHorse.add(new FlyingHorse("Rainbow Charlie", 2333, 45555, "Flying Rainbows", true, 45));

        long searchId = 45;

        FlyingHorse fh = findFlyinghorseById(searchId, flyHorse);
        if (fh != null) {
            System.out.println("Found this horse: ");
            fh.printFlyingHorseDetails();
        }
        else {
            System.out.println("Didn't find a horse with horseID: " + searchId);
        }
        //varargs
        printFlyinghorseDetailsVararg(flyingHorses);
        System.out.println("A lot of horses coming up");
        System.out.println(" ");
        printFlyinghorseDetailsVararg(flyingHorse, flyingHorse1, flyingHorse2);
        System.out.println("");
    }

    private static FlyingHorse findFlyinghorseById(long searchId, List<FlyingHorse> flyHorse) {
        for (FlyingHorse flyingHorse : flyHorse) {
            if (flyingHorse.getHorseId() == searchId) {
                return flyingHorse;
            }
        }
        return null;
    }




    // compare different kinds of creating prints
    public static void printFlyinghorseDetailsVararg(FlyingHorse ... flyingHorses) {
        for (FlyingHorse fh : flyingHorses){
           fh.printFlyingHorseDetails();
            System.out.println("");
        }
    }

    public static void printBäckahästDetails(Bäckahäst bäckahäst){
        if (bäckahäst != null) {
            System.out.println("This horse name is: " + bäckahäst.getName());
            System.out.println("This horse age is: " + bäckahäst.getAge());
            System.out.println("This horse price is: " + bäckahäst.getPrice());
            System.out.println("This horse is from the stable: " + bäckahäst.getStable());
            System.out.println("This horse temprament is: " + bäckahäst.isNotDangerous());
            System.out.println("");
        }
    }

}
