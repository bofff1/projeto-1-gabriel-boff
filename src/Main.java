import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("=================================");
        System.out.println("   CALCULADORA SIMPLES EM JAVA   ");
        System.out.println("=================================");
        
        while (continuar) {
            try {
                System.out.println("\nEscolha uma operação:");
                System.out.println("1 - Adição (+)");
                System.out.println("2 - Subtração (-)");
                System.out.println("3 - Multiplicação (*)");
                System.out.println("4 - Divisão (/)");
                System.out.println("0 - Sair");
                System.out.print("\nOpção: ");
                
                int opcao = scanner.nextInt();
                
                if (opcao == 0) {
                    System.out.println("\nEncerrando a calculadora. Até logo!");
                    continuar = false;
                    continue;
                }
                
                if (opcao < 1 || opcao > 4) {
                    System.out.println("\nOpção inválida! Por favor, escolha uma opção entre 0 e 4.");
                    continue;
                }
                
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                
                double resultado = 0;
                String operacao = "";
                
                switch (opcao) {
                    case 1:
                        resultado = Calculadora.somar(num1, num2);
                        operacao = "+";
                        break;
                    case 2:
                        resultado = Calculadora.subtrair(num1, num2);
                        operacao = "-";
                        break;
                    case 3:
                        resultado = Calculadora.multiplicar(num1, num2);
                        operacao = "*";
                        break;
                    case 4:
                        resultado = Calculadora.dividir(num1, num2);
                        operacao = "/";
                        break;
                }
                
                System.out.println("\n---------------------------------");
                System.out.printf("Resultado: %.2f %s %.2f = %.2f\n", num1, operacao, num2, resultado);
                System.out.println("---------------------------------");
                
            } catch (ArithmeticException e) {
                System.out.println("\n❌ " + e.getMessage());
            } catch (Exception e) {
                System.out.println("\n❌ Erro: Entrada inválida! Por favor, digite apenas números.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
        
        scanner.close();
    }
}
