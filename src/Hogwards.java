public class Hogwards {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwards(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public  int sum(){
        return magicPower + transgressionDistance;
    }
    public void  compare(Hogwards other){


        if (magicPower > other.magicPower){
            System.out.println( name + " обладает бОльшей силой Магии,чем " + other.name);
        }
        else {
            System.out.println(other.name + " обладает бОльшей силой Магии,чем " + name);

        }
         if (transgressionDistance > other.transgressionDistance) {
             System.out.println(name + "обладает бОльшей Дистанцией в Магии ,чем " + other.name);

         } else {
            System.out.println(other.name + "обладает бОльшей Дистанцией в Магии ,чем " + name);
        }
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance
                ;
    }
}
