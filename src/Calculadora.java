public class Calculadora {
    
    /**
     * Realiza a soma de dois números
     */
    public static double somar(double a, double b) {
        return a + b;
    }
    
    /**
     * Realiza a subtração de dois números
     */
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    /**
     * Realiza a multiplicação de dois números
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Realiza a divisão de dois números
     * Lança exceção se o divisor for zero
     */
    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida!");
        }
        return a / b;
    }
}
