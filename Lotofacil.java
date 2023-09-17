import java.util.Scanner;
import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int escolha = 0;
        int numero_aposta;
        int numero_sorteado;
        int par_impar;

        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite um número de 0 a 100: ");
                    numero_aposta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Realizando aposta de 0 a 100...");

                    if (numero_aposta < 0 || numero_aposta > 100) {
                        System.out.println("Aposta inválida.");
                        continue;
                    }
                    numero_sorteado = random.nextInt(101);
                    System.out.println("Número sorteado: " + numero_sorteado);

                    if (numero_aposta == numero_sorteado) {
                        System.out.println("Você ganhou R$ 1.000,00 reais.");
                    } else {
                        System.out.println("Que pena! O número sorteado foi: " + numero_sorteado);
                    }
                    break;

                case 2:
                    System.out.println("Digite uma letra de A a Z: ");

                    try {
                        int entrada = System.in.read();

                        char letra_digitada = Character.toUpperCase((char) entrada);

                        if (Character.isLetter(letra_digitada) && (letra_digitada >= 'A' && letra_digitada <= 'Z')) {
                            char letra_premiada = 'C';

                            System.out.println("Realizando aposta de A a Z com a letra: " + letra_digitada);
                            System.out.println("Letra sorteada: " + letra_premiada);

                            if (letra_digitada == letra_premiada) {
                                System.out.println("Você ganhou R$ 500,00 reais.");
                            } else {
                                System.out.println("Que pena! A letra sorteada foi: " + letra_premiada);
                            }
                        } else {
                            System.out.println("Aposta inválida.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro de entrada.");
                    }
                    break;

                case 3:
                    System.out.println("Digite um número Par ou Impar: ");
                    par_impar = scanner.nextInt();

                    if (par_impar % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
            }
        } while (escolha != 0);
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("********************");
        System.out.println("Menu LOTOFÁCIL: ");
        System.out.println("1- Apostar de 0 a 100.");
        System.out.println("2- Apostar de A a Z.");
        System.out.println("3- Apostar em Par ou Ímpar.");
        System.out.println("0- Sair.");
        System.out.println("********************\n");
    }
}
