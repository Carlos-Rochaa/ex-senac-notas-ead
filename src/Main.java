import services.Calc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calc c = new Calc();


        int opcao;
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-Escolha uma opção-");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("0. Sair");

            System.out.print("Operação: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Qual o primeiro numero: ");
                num1 = scanner.nextInt();
                System.out.print("Qual o segundo numero: ");
                num2 = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        int soma = c.som(num1, num2);
                        System.out.printf("\nO resultado da soma é: %d\n", soma);
                        break;
                    case 2:
                        int subtracao = c.sub(num1, num2);
                        System.out.printf("\nO resultado da subtração é: %d\n", subtracao);
                        break;
                    case 3:
                        int multiplicacao = c.mult(num1, num2);
                        System.out.printf("\nO resultado da multiplicação é: %d\n", multiplicacao);
                        break;
                    case 4:
                        double divisao = c.div(num1, num2);
                        System.out.printf("\nO resultado da divisão é: %.2f\n", divisao);
                        break;
                }
            } else if (opcao == 0) {
                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

