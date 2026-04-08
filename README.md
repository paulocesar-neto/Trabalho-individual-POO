
# Trabalho Individual POO 💻                                                                   
#### **Nome:** Paulo Cesar Ferreira Vale Neto


🏦**Simulador Bancário: Da Lógica de Programação à Orientação a Objetos**

Este projeto foi criado para colocar em prática o que foi aprendido em aula, ultilizando lógica de programação em Java que depois é transformado em uma estrutura Orientada a Objetos.
 ## Exercicios 📑


📝 **Exercício 1: Lógica e Estruturas de Controle**

O primeiro exercicio foi pedido para ser feito apenas com lógica de programação e estrutura de controle ultilizando a linguagem Java,construindo toda a lógica dentro do método main, permitindo controle do código, adicionando
funcionalidades, menus interativos, confimação de operações, verificaão de saldo, e regras de segurança. simulando um caixa eltrônico real de forma bem simples e estruturada.

## ⚙**Funcionalidades e Implementos:**

* **Menu do Principal Caixa**: Usando comando do-while e switch para criar um menu que fica rodando até que o usuário escolha sair (opção 0).

* **Menus de Operação Saque/Depósito:** Criado menu interativo com switch dentro de outro switch para opção das operações de saque e dpósito, permitindo escolher valores padrão ou outros valores.

* **Confirmação da operação:** Permite que o usuário possa ou não confirmar a operação de saque ou depósito depois de escolher o valor desejado digitando "SIM" ou "NÂO", ou apenas usando caracteres "S" ou "N", tanto minúsculo,quanto maiúsculo.

* **Limite de Saques:** Permite e limita o usuário a 3 saques diários, ao tentar o 4º Saque, o sistema bloqueia.

* **Limite de Valor de Saque:** Bloqueia o usuário de sacar valores acima de R$ 1000,00 reais, por motivos de segurança.

* **Saldo Insuficiente**: Bloqueia o usuário de sacar qualquer valor se o saldo for menor que o valor do saque.
