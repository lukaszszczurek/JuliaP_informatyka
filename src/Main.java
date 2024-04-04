
public class Main {
    public static void main(String[] args) {
       // pętla for (ile razy)
        // pętla while (dopuki warunek jest prawdziwy);
        // < to dopuki;

        int ileRazy = 14;
        // napisz program, który wypisze pierwsze 14 liczb podzielnych przez
        int ileTeraz =0;
        int aktualnaliczba = 0;
        while (ileTeraz < ileRazy) {
            if (aktualnaliczba % 13 == 0) {
                System.out.println(aktualnaliczba);
                ileTeraz++;
            }

            aktualnaliczba++;
        }

    }
}



