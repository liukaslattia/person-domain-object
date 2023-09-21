public class Main {
    public static void main(String[] args) {
        Person pekka = new Person(554127,
                "Pekka",
                "Puupää",
                "Kuusikatu 6 24412 Urjala",
                "Finland",
                "Finnish",
                "Single",
                19650821
        );

        Person maija = new Person(454178,
                "Maija",
                "Mehiläinen",
                "Mäntykatu 7 24412 Urjala",
                "Finland",
                "Finnish",
                "Single",
                19850823
        );

        System.out.println(pekka.married(maija));
        System.out.println(pekka.setDateOfDeath(20130228));
        System.out.println(pekka);

    }
}
