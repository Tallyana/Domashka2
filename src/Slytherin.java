public class Slytherin extends  Hogwards{

    private int cunning;
    private int determination;
    private  int ambition;
    private  int resourcefullness;
    private  int list;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefullness,
                     int list) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefullness = resourcefullness;
        this.list = list;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefullness() {
        return resourcefullness;
    }

    public int getList() {
        return list;
    }

    public void  compare(Slytherin other) {
        if (this.cunning + this.determination + this.ambition + this.resourcefullness + this.list
                > other.cunning + other.determination + other.ambition + other.resourcefullness + other.list)
        {  System.out.println(this.getName() + " - лучший Слизеринец,чем " + other.getName());

        } else {
            System.out.println(other.getName() + " - лучший Слизеринец, чем " + this.getName());
        }
    }
    @Override
    public String toString() {
        return getName()+ "  обладает магической силой = " + magicPower +
                ", умением летать = " +   transgressionDistance +
                "cunning= " + cunning +
                ", determination= " + determination +
                ", ambition= " + ambition +
                ", resourcefullness = " + resourcefullness +
                ", list= " + list ;
    }
}

