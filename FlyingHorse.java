package EnhörningOOP;

public class FlyingHorse {
    String name;
    int age;
    int price;
    String stable;
    boolean hasHorn;

    public long getHorseId() {
        return horseId;
    }

    public void setHorseId(long horseId) {
        this.horseId = horseId;
    }

    long horseId;

    public FlyingHorse(String name, int age, int price, String stable, boolean hasHorn) {
        this.name= name;
        this.age= age;
        this.price=price;
        this.stable = stable;
        this.hasHorn= false;
    }

    public FlyingHorse(String name, int age, int price, String stable, boolean hasHorn, long horseId) {
        this.name= name;
        this.age= age;
        this.price=price;
        this.stable = stable;
        this.hasHorn= false;
        this.horseId = horseId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStable() {
        return stable;
    }

    public void setStable(String stable) {
        this.stable = stable;
    }

    public boolean isHasHorn() {
        return hasHorn;
    }

    public void setHasHorn(boolean hasHorn) {
        this.hasHorn = hasHorn;
    }

    public void printFlyingHorseDetails(){
        System.out.println("This horse name is: " + name);
        System.out.println("This horse age is: " + age);
        System.out.println("This horse price is: " + price);
        System.out.println("This horse is from the stable: " + stable);
        System.out.println("This horse has a horn: " + hasHorn);
        System.out.println("This horse has the idnumber: " + horseId);
    }
}
