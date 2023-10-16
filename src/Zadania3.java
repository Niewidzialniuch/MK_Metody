import java.util.Scanner;

public class Zadania3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int powierzchniaSciany = 10;
        double farba = 1.5;
        int praca = 8;
        double kosztNaGodzine = 18.00;
        int pokoje;
        double farbaLitr;
        System.out.println("liczba pokoi: ");
        pokoje = klawiatura.nextInt();
        System.out.println("cena za litr farby: ");
        farbaLitr = klawiatura.nextDouble();
        int[] powierzchniaPokoi = new int[pokoje];
        int calaPowierzchnia = 0;
        for (int i = 0; i < powierzchniaPokoi.length; i++) {
            System.out.println("powierzchnia pokoju " + i + 1);
            powierzchniaPokoi[i] = klawiatura.nextInt();
        }
        farby(farba, calaPowierzchnia);
    }
    public static double farby(double farba, int calaPowierzchnia){

    }

}
