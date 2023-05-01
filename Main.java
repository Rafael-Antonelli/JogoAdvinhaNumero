import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int contador = 1;
        int palpite = 0;
        int continua = 1;

        while (continua != 2) {
            while (contador <= 5) {
                System.out.println("Tente advinhar o número que eu pensei... Uma dica, ele está entre 1 e 100");
                palpite = leitor.nextInt();
                if (palpite == numero) {
                    System.out.println("Parabéns, você ganhou em " + contador + " tentativas");
                    contador = 7;
                }
                if (palpite > numero) {
                    System.out.println("Você digitou um valor maior que o número que eu pensei. Você ainda tem " + (5 - contador) + " chances");
                }
                if (palpite < numero) {
                    System.out.println("Você digitou um valor menor que o número que eu pensei. Você ainda tem " + (5 - contador) + " chances");
                }
                contador++;
                if (contador == 6) {
                    System.out.println("Você perdeu. O número que pensei era : " + numero);
                }
            }
            System.out.println("Deseja jogar novamente? 1 - Sim / 2 - Sair");
            continua = leitor.nextInt();
            contador = 1;
            numero = new Random().nextInt(100);
        }
    }
}