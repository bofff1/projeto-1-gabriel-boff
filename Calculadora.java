import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("=== CALCULADORA SIMPLES ===\n");
        
        while (continuar) {
            try {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Digite a operação (+, -, *, /): ");
                char operacao = scanner.next().charAt(0);
                
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                
                double resultado = calcular(num1, num2, operacao);
                
                System.out.println("\nResultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
                
                System.out.print("\nDeseja fazer outro cálculo? (s/n): ");
                char resposta = scanner.next().charAt(0);
                continuar = (resposta == 's' || resposta == 'S');
                System.out.println();
                
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida!\n");
                scanner.nextLine(); // Limpa o buffer
            }
        }
        
        System.out.println("Calculadora encerrada. Até logo!");
        scanner.close();
    }
    
    public static double calcular(double num1, double num2, char operacao) {
        switch (operacao) {
            case '+':
                return somar(num1, num2);
            case '-':
                return subtrair(num1, num2);
            case '*':
                return multiplicar(num1, num2);
            case '/':
                return dividir(num1, num2);
            default:
                throw new IllegalArgumentException("Operação inválida! Use +, -, * ou /");
        }
    }
    
    public static double somar(double a, double b) {
        return a + b;
    }
    
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}
