package PROJETO;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        int operacao = 0;
        boolean operacaoValida = true;

        System.out.println("Qual operacao gostaria de realizar?");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        operacao = scanner.nextInt();
        if (operacao >= 1 && operacao <= 4) {
            System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = scanner.nextDouble();
        }

        switch (operacao) {
            case 1:
                resultado = adicionar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                if(num2 == 0) {
                    operacaoValida = false;
                    System.out.println("Não é possível dividir por zero");
                    break;
                }
                resultado = dividir(num1, num2);
                break;
        
            default:
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("O resultado é: " + resultado);
        }
        System.out.println("Calculadora encerrada");
        scanner.close();
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }
    
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        return a / b;
    }
}
