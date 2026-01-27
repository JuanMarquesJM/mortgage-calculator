# Java Mortgage Calculator

![Linguagem Principal: Java](https://img.shields.io/badge/Linguagem-Java%20Core-orange)
![Licença: MIT](https://img.shields.io/badge/License-MIT-blue)
![Paradigma: POO](https://img.shields.io/badge/Paradigma-Orientação%20a%20Objetos-green)

---

## Sobre o projeto

Este projeto é uma calculadora de hipoteca desenvolvida em **Java**, estruturada sob os princípios da **Programação Orientada a Objetos (POO)** e **Clean Code**.

O foco desta versão foi eliminar a fragilidade de scripts simples, implementando tratamento de exceções e separação de responsabilidades. O resultado é uma aplicação que não trava com entradas inválidas e possui classes com funções bem definidas.

---

## Estrutura e Arquitetura

O código foi refatorado para dividir o sistema em três componentes lógicos, facilitando a manutenção e a leitura:

* **`Main`:**
  * Ponto de entrada da aplicação.
  * Conecta a entrada de dados (`Console`) com a lógica de negócios (`Mortgage`) e exibe o resultado formatado.

* **`Mortgage`:**
  * Encapsula o estado do empréstimo (`principal`, `juros`, `anos`).
  * Contém a lógica matemática pura, sem dependência de interfaces de entrada/saída.

* **`Console`:**
  * Classe utilitária com métodos estáticos (`readDouble`, `readInt`).
  * **Tratamento de Erros:** Implementa blocos `try-catch` para capturar `InputMismatchException`. Se o usuário digitar texto onde deveria ser número, o programa não quebra; ele captura o erro, limpa o buffer do scanner e solicita o dado novamente.
  * **Validação de Intervalo:** Garante que os inputs respeitem os limites (min/max) definidos pelo negócio.

---

## Funcionalidades

O programa solicita três variáveis fundamentais, garantindo integridade através de loops de validação:

1.  **Principal ($):** Valor do empréstimo.
    * *Validação:* Aceita apenas valores entre 1.000 e 1.000.000.
2.  **Annual Interest Rate (%):** Taxa de juros anual.
    * *Validação:* Aceita apenas valores entre 1 e 30.
3.  **Period (Years):** Duração do empréstimo.
    * *Validação:* Aceita apenas valores entre 1 e 30 anos.

### Fórmula de Amortização
O cálculo é realizado utilizando a fórmula padrão de hipoteca:

$$M = P \cdot \frac{i(1+i)^n}{(1+i)^n-1}$$

---

## Como executar o projeto

### Pré-requisitos
* JDK 17 ou superior

### Execução via terminal

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/JuanMarquesJM/mortgage-calculator.git](https://github.com/JuanMarquesJM/mortgage-calculator.git)
    ```
2.  Navegue até o diretório fonte:
    ```bash
    cd mortgage-calculator/src
    ```
3.  Compile os arquivos:
    ```bash
    javac com/juan/*.java
    ```
4.  Execute a classe principal:
    ```bash
    java com.juan.Main
    ```

---

## Tecnologias e Conceitos

| Tecnologia / Conceito | Descrição |
| :--- |:--- |
| **Java SE** | Linguagem base. |
| **POO** | Encapsulamento (private fields), Classes e Métodos Estáticos. |
| **Exception Handling** | Uso de `try-catch` para evitar falhas de execução (`InputMismatchException`). |
| **Input Validation** | Lógica de loops `while` para garantir integridade dos dados. |
| **Java Scanner** | Leitura de inputs com `Locale.US` para padronização decimal. |

---

## Contato

**Juan Carlos**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juanmarques-jm/)
