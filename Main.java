
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zadania();
    }

    public static void zadania() {
        //definiowanie zmiennych
        int punkty = 0;
        String wynik;
        boolean p;
        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);

        //wypisanie paru informacji
        System.out.println("======zadanie========");
        System.out.println("Wykonaj działanie i wpisz wynik na klawiaturze");

        //wygenerowanie licz i obliczenie wyniku
        int a = generator.nextInt(32);
        int b = generator.nextInt(32);
        int answer = a & b;

        //wypisanie danych przykładu
        System.out.println("&");
        System.out.println(print(a));
        System.out.println(print(b));
        //System.out.println(print(answer));

        //pobranie wyniku z klawiatury i sprawdzenie jego porawności
        System.out.println("Podaj wynik: ");
        wynik = keyboard.nextLine();
        if ( Integer.parseInt(wynik, 2) == (answer)) {
            p = true;
            punkty++;
        } else {
            p = false;
        }

        //wypisanie graczowi informacji o wyniku
        if (p) {
            System.out.println("Gratulacje dostajesz 1 punkt");
        } else {
            System.out.println("Niestety odpowiedz jest bledna, poprawna to: " + print(answer));
        }
        //=====================================================================================

        //wypisanie paru informacji
        System.out.println("======zadanie========");
        System.out.println("Wykonaj działanie i wpisz wynik na klawiaturze");

        //wygenerowanie licz i obliczenie wyniku
        a = generator.nextInt(32);
        b = generator.nextInt(32);
        answer = a ^ b;

        //wypisanie danych przykładu
        System.out.println("^");
        System.out.println(print(a));
        System.out.println(print(b));
        //System.out.println(print(answer));

        //pobranie wyniku z klawiatury i sprawdzenie jego porawności
        System.out.println("Podaj wynik: ");
        wynik = keyboard.nextLine();
        if ( Integer.parseInt(wynik, 2) == (answer)) {
            p = true;
            punkty++;
        } else {
            p = false;
        }

        //wypisanie graczowi informacji o wyniku
        if (p) {
            System.out.println("Gratulacje dostajesz 1 punkt");
        } else {
            System.out.println("Niestety odpowiedz jest bledna, poprawna to: " + print(answer));
        }
        //======================================================================================

        System.out.println("Zdobyles " + punkty + "/2 punkty");


    }

    public static String print(int x) {
        if (x == 0) {
            return ("00000");
        } else if (x == 1) {
            return ("00001");
        } else if (x > 1 && x < 4) {
            return ("000" + Integer.toBinaryString(x));
        } else if (x > 3 && x < 8) {
            return ("00" + Integer.toBinaryString(x));
        } else if (x > 7 && x < 16) {
            return ("0" + Integer.toBinaryString(x));
        } else {
            return (Integer.toBinaryString(x));
        }
    }


}
