public class Main {
    public static void main(String[] args) {

        // Ученики   в качестве объектов наследуют свойства класса-факультета и класса-школы.
        Hogwards dumbldorf = new Hogwards("Dumbldopf",100,98);

        Gryffindor harry = new Gryffindor( "Harry Potter " , 99,76,56,43,79);
        Gryffindor ron =  new Gryffindor( "Ron Uizli",70,79,34,67,59);
        Gryffindor germiona  = new Gryffindor("Germiona Greindjer",89,78,34,56,89);


        Slytherin drako = new Slytherin("Drako Malfoy ",75,80,95,74,45,27,85);
        Slytherin grehem = new Slytherin("Grehem Montegu ",56,84,98,66,87,78,82);
        Slytherin gregory = new Slytherin("Gregory Goil ",74,83,91,45,53,87,78);

        Huffiepuff zaharia = new Huffiepuff("Zaharia Smit ",56,80,89,54,78);
        Huffiepuff sedrik = new Huffiepuff("Sedrik Diggory ",76,84,98,67,45);
        Huffiepuff djastin = new Huffiepuff("Djastin Finch-Fletchly ",87,83,91,45,53);

        Ravenclaw chjoy = new Ravenclaw("Chjoy Chang ",67,78,79,88,56,44);
        Ravenclaw padma = new Ravenclaw("Padma Patik ",76,84,98,67,45,87);
        Ravenclaw markus = new Ravenclaw("Marcus Belby ",89,45,76,65,53,56);

        // Реализован метод, который выводит на экран описание студента. В описание  качества,
        // которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
        System.out.println(dumbldorf.toString());
        System.out.println(harry.toString());
        System.out.println(ron.toString());
        System.out.println(germiona.toString());
        System.out.println(drako.toString());
        System.out.println(grehem.toString());
        System.out.println(gregory.toString());
        System.out.println(zaharia.toString());
        System.out.println(sedrik.toString());
        System.out.println(djastin.toString());
        System.out.println(chjoy.toString());
        System.out.println(padma.toString());
        System.out.println(markus.toString());

       // Реализован метод, который сравнивают между собой двух учеников одного факультета по свойствам.
        harry.compare(ron);
        harry.compare(germiona);
        germiona.compare(ron);

        drako.compare(grehem);
        grehem.compare(gregory);
        drako.compare(gregory);

        zaharia.compare(djastin);
        sedrik.compare(djastin);
        sedrik.compare(zaharia);

        chjoy.compare(padma);
        padma.compare(markus);
        markus.compare(chjoy);

        //Реализован метод, который сравнивает двух любых учеников Хогвартса по силе магии и
        // расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
        harry.compare(drako);
        germiona.compare(gregory);
        sedrik.compare(padma);
        markus.compare(grehem);

        ron.compare(grehem);
        chjoy.compare(drako);
        drako.compare(germiona);
        harry.compare(markus);
    }
}