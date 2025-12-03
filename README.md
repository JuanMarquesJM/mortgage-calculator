# Mortgage Calculator

![Linguagem Principal: Java](https://img.shields.io/badge/Linguagem-Java%20Core-orange)
![Licença: MIT](https://img.shields.io/badge/License-MIT-blue)

---

## Sobre o Projeto

Este projeto é uma calculadora de hipoteca desenvolvida em Java para console.

O principal objetivo foi solidificar os fundamentos do Java Core.

**Contexto:** Este projeto marca minha transição de foco do ecossistema Python para o Java, dedicando à linguagem para projetos em ambientes estruturados.

---

## Estrutura e boas Práticas

O código adota uma arquitetura estruturada, mas com foco na manutenibilidade e na robustez.

* **Separação de responsabilidades:** A lógica de cálculo (`calculateMortgage`) é isolada do método principal (`main`), que lida estritamente com a Entrada/Saída (I/O) de dados.
* **Segurança de Input:** Implementação de **`scanner.useLocale(Locale.US)`** para garantir que a aplicação aceite o formato decimal padrão de programação (ponto `.`), prevenindo erros comuns de `InputMismatchException` em sistemas regionais.

---

## Funcionalidades

O programa solicita três variáveis do usuário para calcular o pagamento mensal da hipoteca (M):

1.  **Principal:** Valor total do empréstimo (P).
2.  **Annual Interest Rate:** Taxa de juros anual (i).
3.  **Period:** Duração do empréstimo em anos (n).

A fórmula de cálculo utilizada é a do pagamento mensal do empréstimo:

$$M = P \cdot \frac{i(1+i)^n}{(1+i)^n-1}$$

---

## Como Executar o Projeto

Para rodar este projeto localmente, você precisa ter o JDK (Java Development Kit) instalado.

### Pré-requisitos
* JDK 17 (ou superior)

### Execução via Terminal (CMD/Bash)

1.  Clone o repositório para sua máquina local:
    ```bash
    git clone https://github.com/JuanMarquesJM/mortgage-calculator
    ```
2.  Navegue até o diretório do projeto.
3.  Compile o código:
    ```bash
    javac MortgageCalculator.java
    ```
4.  Execute a classe principal:
    ```bash
    java com.juan.MortgageCalculator
    ```

---

## Tecnologias utilizadas

| Tecnologia | Descrição |
| :--- | :--- |
| **Java** | Linguagem principal, Java SE. |
| **Terminal** | Interface de I/O para o usuário. |
| **Git & GitHub** | Controle de versão. |

---


## Contato / Autor

**Juan Carlos**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juanmarques-jm/)
