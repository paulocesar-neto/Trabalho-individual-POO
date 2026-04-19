
# Trabalho Individual POO 💻                                                                   
### **Nome:** Paulo Cesar Ferreira Vale Neto   
### **Turma:** 37 - NOVA FRIBURGO


### 🎯**Trabalho Individual da Disciplina de POO do Serratec: Da Lógica de Programação à Orientação a Objetos**

Este projeto foi criado para colocar em prática o que foi aprendido em todo o processo da disciplina durante as aulas, ultilizando Linguagem de Programação Java, desde a  lógica de programação até Porgramação Orientada a Objetos, ultilizando todos os conceitos de Classes e Objetos, Métodos, atributos, instancias de Objetos, regras de Encapsulamento, Relacionamentos entre classes, Heranças, Polimorfismo, Enums, Excepstion e muito mais, que todo conceito da Linguagem traz.

 ## Exercicios 📑


### 📝 **Exercício 1: Lógica e Estruturas de Controle (Conta Bancária)**

O primeiro exercicio foi pedido para ser feito apenas com lógica de programação e estrutura de controle ultilizando a linguagem Java,construindo toda a lógica dentro do método main, permitindo controle do código, adicionando
funcionalidades, menus, confimação de operações, verificaão de saldo, e regras de segurança. simulando um caixa eltrônico real de forma bem simples e estruturada.

### 📝 Exercício 2: Classes e Objetos (Conta Bancária)

Como no exercicio 01, ainda com o sistema de caixa eletrônico, o objetivo do exercicio era continuar a ideia do primeiro exercicio, migrando a lógica para o conceito de POO(Programação Orientada a Objetos), onde era necessário criar uma classe de Conta Bancário, com os principais atributos numero, titular, e saldo, implementando os metodos tambem de Sacar() e Depositar () com as mesmas funcionalidades do exercicio 01, mas agora Classes e Objetos dentro do Sistema, garantiondo melhor o controle, contendo também regra de negócio onde toda nova conta instanciada recebe um bonus de R$ 50,00.



## ⚙**Funcionalidades e Implementos:**

 ### 💡 EXERCICIO 01 -

✔ **Menu do Principal Caixa**: Usando comando do-while e switch para criar um menu que fica rodando até que o usuário escolha sair (opção 0).

✔ **Menus de Operação Saque/Depósito:** Criado menu interativo com switch dentro de outro switch para opção das operações de saque e dpósito, permitindo escolher valores padrão ou outros valores.

✔ **Confirmação da operação:** Permite que o usuário possa ou não confirmar a operação de saque ou depósito depois de escolher o valor desejado digitando "SIM" ou "NÂO", ou apenas usando caracteres "S" ou "N", tanto minúsculo,quanto maiúsculo.

✔ **Limite de Saques:** Permite e limita o usuário a 3 saques diários, ao tentar o 4º Saque, o sistema bloqueia.

✔ **Limite de Valor de Saque:** Bloqueia o usuário de sacar valores acima de R$ 1000,00 reais, por motivos de segurança.

✔ **Saldo Insuficiente**: Bloqueia o usuário de sacar qualquer valor se o saldo for menor que o valor do saque.


 ### 💡 EXERCICIO 02 -
 
  * ### O que mudou?
  
✔ **Menu de cadastro de conta**: Menu inicial onde tem 3 opões sendo a ultima opção (Opção 0) sair e encerrar o programa, e a primeira opção para cadastrar uma nova conta onde se gera um numnero aleatorio de onta aops digitar nome e senha, para ser usado na segunda opção e acessar assim o caixa eletronico para realizar as operações.

✔ **Menus de Operação Saque/Depósito:** Agora os menus e as funcionalidades e a logica foi migrado para dentro dos metodos da classe ContaBancária, onde tem os dois métodos de sacar e depositar, os menus contam com opções próprias de valores, ou pode escolher a opão de digitar outro valor qu deseja em determinada operação escolhida: Sacar ou depositar.

✔ **Finalização**: A lógica foi mantida, porem implementada com o conceito de Programação Orientada a Objetos(POO), Criando Classes e Objetos para melhor controle de negócio, e estrutura do coódigo, trazendo funcionalidades usando métodos criados dentro das Classes para ser usado nos Objetos que instanciam essa classe 

