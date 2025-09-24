import java.util.Locale;
import java.util.Scanner;
public class EuroTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O PREÇO DO EURO: ");
        double europrc = sc.nextDouble();

        System.out.println("QUANTIDADE DE EUROS QUE DESEJA COMPRAR: ");
        double euroqtd = sc.nextDouble();

        System.out.println("VALOR FINAL QUE VOCÊ VAI PAGAR: " + Euro.euroresultado(europrc, euroqtd));


        sc.close();
    }
}