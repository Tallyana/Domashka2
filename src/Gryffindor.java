public class Gryffindor  extends Hogwards{
   private int nobility;
   private int honor;
   private int bravery;


    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    public void  compare(Gryffindor other)
    { if( this.nobility + this.honor + this.bravery > other.nobility + other.honor + other.bravery)
    {
        System.out.println(this.getName() + "лучший Грифендорец,чем " + other.getName());
    } else {
        System.out.println(other.getName() + "лучший Гриффендорец, чем " + this.getName());
        }
           }

  @Override
    public String toString(){
        return
                ", nobility = " + nobility +
                "honor = " + honor +
                ",bravery = " + bravery;


    }
}

