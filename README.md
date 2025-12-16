# Java Mortgage Calculator
![Linguagem Principal: Java](https://img.shields.io/badge/Linguagem-Java%20Core-orange)
![Licença: MIT](https://img.shields.io/badge/License-MIT-blue)
---

## Sobre o projeto

Este projeto é uma calculadora de hipoteca desenvolvida em Java para console.

O principal objetivo foi solidificar os fundamentos do Java Core, focando em controle de fluxo, validação de dados e arquitetura limpa.

---

## Estrutura

* Validação Robusta: Implementação de loops `do-while` dedicados para cada entrada de dados. O sistema rejeita valores inválidos, por exemplo, juros negativos ou zero, e solicita novamente apenas o campo incorreto.
* Separação de Responsabilidades:
    * `main`: Atua apenas como orquestrador.
    * Métodos Privados (`getValid...`): Isolam a lógica de interação e validação com o usuário.
    * `calculateMortgage`: Método puro focado exclusivamente na regra de negócio matemática.
* Segurança de Input: Uso de `Scanner` com `Locale.US` para garantir compatibilidade global com formatos decimais.

---

## Funcionalidades

O programa solicita três variáveis, garantindo que estejam dentro de limites realistas:

1.  **Principal ($):** Valor do empréstimo (Aceita entre 1k e 1M).
2.  **Annual Interest Rate (%):** Taxa de juros anual (Aceita entre 1% e 30%).
3.  **Period (Years):** Duração do empréstimo (Aceita entre 1 e 30 anos).

Fórmula de Amortização:
$$M = P \cdot \frac{i(1+i)^n}{(1+i)^n-1}$$

---

## Como executar o projeto

Para rodar este projeto localmente, você precisa ter o JDK instalado.

### Pré-requisitos
* JDK 17 ou superior

### Execução via Terminal

1.  Clone o repositório:
    ```bash
    git clone https://github.com/JuanMarquesJM/mortgage-calculator.git
    ```
2.  Entre na pasta do código fonte:
    ```bash
    cd mortgage-calculator/src
    ```
3.  Compile o código:
    ```bash
    javac com/juan/MortgageCalculator.java
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

## Contato

**Juan Carlos**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juanmarques-jm/)
