package services;

public class Calc {
    public int som(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public double div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
        return (double) num1 / num2;
    }
}