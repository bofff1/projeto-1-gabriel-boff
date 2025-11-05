# Calculadora Simples em Java

Uma calculadora de linha de comando desenvolvida em Java que realiza operações matemáticas básicas.

## 📋 Funcionalidades

- ➕ Adição
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão (com proteção contra divisão por zero)
- Interface interativa no terminal
- Tratamento de erros para entradas inválidas

## 🚀 Como Usar

### Pré-requisitos

- Java 17 ou superior instalado

### Compilação

```bash
javac -encoding UTF-8 src/*.java
```

### Execução

**Opção 1: Usando o script**
```bash
./executar.sh
```

**Opção 2: Comando direto**
```bash
java -cp src Main
```

## 💡 Exemplo de Uso

```
=================================
   CALCULADORA SIMPLES EM JAVA   
=================================

Escolha uma operação:
1 - Adição (+)
2 - Subtração (-)
3 - Multiplicação (*)
4 - Divisão (/)
0 - Sair

Opção: 1
Digite o primeiro número: 10
Digite o segundo número: 5

---------------------------------
Resultado: 10.00 + 5.00 = 15.00
---------------------------------
```

## 📁 Estrutura do Projeto

```
.
├── src/
│   ├── Calculadora.java  # Classe com as operações matemáticas
│   └── Main.java         # Interface do usuário
├── executar.sh           # Script para executar a calculadora
└── README.md
```

## 🛠️ Tecnologias

- Java 17 (Amazon Corretto)
- Scanner para entrada de dados

## 👨‍💻 Autor

Gabriel Boff