public class Main {
    public static void main(String[] args) {

        Hogwards dumbldorf = new Hogwards("Dumbldopf",100,78);

        Gryffindor harry = new Gryffindor( "Harry Potter " , 58,76,56,43,79);
        Gryffindor ron =  new Gryffindor( "Ron",44,79,34,67,59);
        harry.compare(ron);

        Slytherin drako = new Slytherin("Drako ",75,80,95,74,45,27,85);
      harry.compare(drako);
    }
}