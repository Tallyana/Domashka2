public class Ravenclaw extends Hogwards{

    private int creativity;
    private int witty;
    private int wisdom;
    private int intelligence;


    public Ravenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int creativity,
                     int witty,
                     int wisdom,
                     int intelligence) {
        super(name, magicPower, transgressionDistance);
        this.creativity = creativity;
        this.witty = witty;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWitty() {
        return witty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void  compare(Ravenclaw other) {
        if (this.creativity + this.witty + this.wisdom + this.intelligence > other.creativity + other.witty + +other.wisdom + other.intelligence) {
            System.out.println(this.getName() + " - лучший Когтеранец,чем " + other.getName());
        } else {
            System.out.println(other.getName() + " - лучший Когтевранец, чем " + this.getName());
        }
    }
    @Override
    public String toString() {
        return getName()+ "  обладает магической силой = " + magicPower +
                ", умением летать = " +   transgressionDistance +
                ", creativity = " + creativity +
                ", witty = " + witty +
                ",wisdom = " + wisdom +
                        ",intelligence = " + intelligence;
    }
}

