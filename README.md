# Calculadora Simples em Java

Uma calculadora de linha de comando que realiza operações matemáticas básicas.

## Funcionalidades

- ✅ Adição (+)
- ✅ Subtração (-)
- ✅ Multiplicação (*)
- ✅ Divisão (/)
- ✅ Tratamento de erros (divisão por zero, operações inválidas)
- ✅ Interface interativa com loop para múltiplos cálculos

## Como Compilar

```bash
javac -encoding UTF-8 Calculadora.java
```

## Como Executar

```bash
java Calculadora
```

## Exemplo de Uso

```
=== CALCULADORA SIMPLES ===

Digite o primeiro número: 10
Digite a operação (+, -, *, /): +
Digite o segundo número: 5

Resultado: 10.0 + 5.0 = 15.0

Deseja fazer outro cálculo? (s/n): s

Digite o primeiro número: 20
Digite a operação (+, -, *, /): /
Digite o segundo número: 4

Resultado: 20.0 / 4.0 = 5.0

Deseja fazer outro cálculo? (s/n): n

Calculadora encerrada. Até logo!
```

## Estrutura do Código

O código está organizado em métodos separados para cada operação:

- `main()` - Método principal com loop interativo
- `calcular()` - Determina qual operação executar
- `somar()` - Realiza adição
- `subtrair()` - Realiza subtração
- `multiplicar()` - Realiza multiplicação
- `dividir()` - Realiza divisão com validação de divisão por zero

## Tratamento de Erros

- **Divisão por zero**: Exibe mensagem de erro apropriada
- **Operação inválida**: Valida se a operação é +, -, * ou /
- **Entrada inválida**: Trata entradas não numéricas
