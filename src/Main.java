import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String s1 = "la";
        String s2 = "vie";
        String s3 = "un long";
        String s4 = "fleuve tranquille";

        ArrayList <String> maListe = new ArrayList();


        maListe.add(s1);
        maListe.add(s2);
        maListe.add(s2);
        maListe.add(s3);
        maListe.add(s4);


        for (int i = 0; i < maListe.size(); i++) {
            System.out.print(maListe.get(i) + " ");
        }
        System.out.println();


        maListe.add( "est");

        for (int i = 0; i < maListe.size(); i++) {
            System.out.print(maListe.get(i) + " ");
        }
        System.out.println();

        maListe.remove(s2);

        for (int i = 0; i < maListe.size(); i++) {
            System.out.print(maListe.get(i) + " ");
        }
        System.out.println();

        maListe.set(0, maListe.get(0).substring(0, 1).toUpperCase() + maListe.get(0).substring(1));

        for (int i = 0; i < maListe.size(); i++) {
            System.out.print(maListe.get(i) + " ");
        }
        System.out.println();

        maListe.add(".");

        maListe.sort(null);
        for (int i = 0; i < maListe.size(); i++) {
            System.out.print(maListe.get(i) + " ");
        }
        System.out.println();

        maListe.sort(Comparator.reverseOrder());
        for (int i = 0; i < maListe.size(); i++) {
            System.out.print(maListe.get(i) + " ");
        }
        System.out.println();

    }
}