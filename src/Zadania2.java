import java.util.Scanner;

public class Zadania2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int cenaHurtowa;
        System.out.println("Prosze podać cene hurtową produktu: ");
        cenaHurtowa = klawiatura.nextInt();
        double marza;
        System.out.println("Podaj marze produktu: ");
        marza = klawiatura.nextDouble();
        double cenaDetaliczna = calculateRetail(cenaHurtowa,marza);
        System.out.println("Cena detaliczna wynosi: " + cenaDetaliczna);
    }
    public static double calculateRetail(int cenaHurtowa, double marza){
        double procentMarza = marza/100;
        marza = cenaHurtowa*procentMarza;
        return cenaHurtowa+marza;
    }
}
