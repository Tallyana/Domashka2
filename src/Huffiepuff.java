public class Huffiepuff extends  Hogwards{

   private int diligence;
    private int loyalty;
    private  int honest;

    public Huffiepuff(String name,
                      int magicPower,
                      int transgressionDistance,
                      int diligence,
                      int loyalty,
                      int honest) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }
    public void  compare(Huffiepuff other) {
        if (this.diligence + this.loyalty + this.honest  > other.diligence + other.loyalty + other.honest ) {
            System.out.println(this.getName() + "лучший Пуффендуец,чем " + other.getName());
        } else {
            System.out.println(other.getName() + "лучший Пуффендуец, чем " + this.getName());
        }
    }


    @Override
    public String toString() {
        return
                ", diligence = " + diligence +
                "loyalty = " + loyalty +
                ",honest = " + honest;

    }
}
