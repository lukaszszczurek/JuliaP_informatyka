public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.println("Hello Julia");

        int gruszki = 5;
        int jablka  = 3;
        int wisnie = 4;

        // napisz polecenie które wyświetli kwadrat liby gruszek

        //System.out.println(w);


        // Konstrukcja IF

        double wiek = 17.3;  // x> 17, x>= 18
        // 17
        if(wiek >= 17) {
            System.out.println("Możesz jechać samochoem");
        } else { System.out.println("Nie możesz jechac samochodem");
        }

        // RESZTA Z DZIELENIA
//        System.out.println(7 % 2);
//        System.out.println(11 % 99);


        // napisz program który sprawdza resztę z dzielenia libny n przez 3;
        // masz prgram wypisał
        // A - jeżeli reszta wynosi 1
        // B- jeżeli reszta wynosi 2
        // C- jeżeli reszt wynosi 3

        int n = 3213213;
        int wyn = n % 3;
        if (wyn == 1) {
            System.out.println("A");
        }
            if (wyn == 2) {
                System.out.println("B");
            }
                if (wyn == 0) {
                    System.out.println("C");
                }

        // Jeżeli liczba jest podzielna przez 2 wypiszmy "niebieski"
        // Jeżeli liczba jest podzielna przez 3 wypiszemy "czerowny"
        // Jeżeli liczba jest podzielna przez 6 wypiszemy "niebieskiCzerowny"

        int n = 36;
        if (n % 6 == 0) {
            System.out.println("niebieskiCzerwony");
        }

        else if (n % 2 == 0) {
            System.out.print("niebieski");
        }
        else if (n % 3 == 0) {
            System.out.print("czerwony");
        }
        else {
            System.out.println(n);
        }



    }
}

// NA NASTĘPNYCH ZAJĘCIACH
// pętlne
// tablice (/3  -> automatyczne)
