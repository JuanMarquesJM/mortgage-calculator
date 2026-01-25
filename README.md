# Java Mortgage Calculator (OOP Edition)

![Linguagem Principal: Java](https://img.shields.io/badge/Linguagem-Java%20Core-orange)
![Licença: MIT](https://img.shields.io/badge/License-MIT-blue)
![Paradigma: POO](https://img.shields.io/badge/Paradigma-Orientação%20a%20Objetos-green)

---

## Sobre o projeto

Este projeto é uma evolução de uma calculadora de hipoteca para console, agora estruturada sob os princípios da **Programação Orientada a Objetos (POO)**.

O objetivo desta etapa foi ir além da lógica procedural, aplicando o encapsulamento e a separação de responsabilidades para criar um código mais modular, reutilizável e fácil de manter.

---

## Estrutura e Evolução

* **Arquitetura baseada em objetos:** A lógica de cálculo foi isolada na classe `Mortgage`, que encapsula os dados do empréstimo e protege a regra de negócio.
* **DRY (Don't Repeat Yourself):** A validação de dados, que antes era repetida em vários métodos, foi abstraída no método utilitário `readNumber`, permitindo validar qualquer entrada com uma única lógica genérica.
* **Separação de preocupações:**
    * `Main`: Atua como a interface de usuário (UI), gerenciando a entrada e saída.
    * `Mortgage`: Atua como o motor de cálculo, independente de como os dados são lidos.
* **Segurança de input:** Uso de `Scanner` com `Locale.US` para garantir precisão decimal e compatibilidade com o formato de ponto.

---

## Funcionalidades

O programa solicita três variáveis fundamentais, garantindo integridade através de limites realistas:

1.  **Principal ($):** Valor do empréstimo (Range: 1,000 - 1,000,000).
2.  **Annual interest rate (%):** Taxa de juros anual (Range: 1 - 30).
3.  **Period (Years):** Duração do empréstimo (Range: 1 - 30 anos).

Fórmula de Amortização utilizada:
$$M = P \cdot \frac{i(1+i)^n}{(1+i)^n-1}$$

---

## Como executar o projeto

### Pré-requisitos
* JDK 17 ou superior

### Execução via Terminal

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/JuanMarquesJM/mortgage-calculator.git](https://github.com/JuanMarquesJM/mortgage-calculator.git)
    ```
2.  Navegue até o diretório:
    ```bash
    cd mortgage-calculator/src
    ```
3.  Compile todos os arquivos do pacote:
    ```bash
    javac com/juan/*.java
    ```
4.  Execute a classe principal:
    ```bash
    java com.juan.Main
    ```

---

## Tecnologias utilizadas

| Tecnologia | Descrição                                                   |
| :--- |:------------------------------------------------------------|
| **Java SE** | Linguagem principal com foco em POO.                        |
| **POO** | Encapsulamento, abstração e separação de responsabilidades. |
| **Git & GitHub** | Controle de versão.                                         |

---

## Contato

**Juan Carlos**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juanmarques-jm/)