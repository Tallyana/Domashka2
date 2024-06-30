public class Hogwards {
    private String name;
    protected int magicPower;
    protected int transgressionDistance;


    //конструктор
    public Hogwards(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
   //геттеры
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

    //методы
    public void  compare(Hogwards other){


        if (magicPower > other.magicPower){
            System.out.println( name + " обладает бОльшей силой Магии,чем " + other.name);
        }
        else {
            System.out.println(other.name + " обладает бОльшей силой Магии,чем " + name);

        }
         if (transgressionDistance > other.transgressionDistance) {
             System.out.println(name + " - обладает бОльшей Дистанцией в Магии ,чем " + other.name);

         } else {
            System.out.println(other.name + " - обладает бОльшей Дистанцией в Магии ,чем " + name);
        }
    }

    @Override
    public String toString() {
        return
                "Зовут - " + name +
                ",обладает магической силой = " + magicPower +
                        ", трансгрессией = " + transgressionDistance;

    }
}
