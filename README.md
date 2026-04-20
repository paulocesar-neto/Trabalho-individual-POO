
# Trabalho Individual POO 💻                                                                   
### **Nome:** Paulo Cesar Ferreira Vale Neto   
### **Turma:** 37 - NOVA FRIBURGO


### 🎯**Trabalho Individual da Disciplina de POO do Serratec: Da Lógica de Programação à Orientação a Objetos!**

Este projeto foi criado para colocar em prática o que foi aprendido em todo o processo da disciplina durante as aulas, ultilizando Linguagem de Programação Java, desde a  lógica de programação até Porgramação Orientada a Objetos, ultilizando todos os conceitos de Classes e Objetos, Métodos, atributos, instancias de Objetos, regras de Encapsulamento, Relacionamentos entre classes, Heranças, Polimorfismo, Enums, Excepstion e muito mais, que todo conceito da Linguagem traz.

 # Exercicios 📑

### 🟢 Informações e Explicações sobre os Exercícios e o que foi feito e pedido em cada um.</br> Segue a baixo:
</br>

 ## 📝 **Exercício 1:  Lógica e Estruturas de Controle (Conta Bancária)**

O primeiro exercicio foi pedido para ser feito apenas com lógica de programação e estrutura de controle ultilizando a linguagem Java,construindo toda a lógica dentro do método main, permitindo controle do código, adicionando
funcionalidades, menus, confimação de operações, verificaão de saldo, e regras de segurança. simulando um caixa eltrônico real de forma bem simples e estruturada.

## 📝 Exercício 2:  Classes e Objetos (Conta Bancária)

Como no exercicio 01, ainda com o sistema de caixa eletrônico, o objetivo do exercicio era continuar a ideia do primeiro exercicio, migrando a lógica para o conceito de POO(Programação Orientada a Objetos), onde era necessário criar uma classe de Conta Bancário, com os principais atributos numero, titular, e saldo, implementando os metodos tambem de Sacar() e Depositar () com as mesmas funcionalidades do exercicio 01, mas agora Classes e Objetos dentro do Sistema, garantiondo melhor o controle, contendo também regra de negócio onde toda nova conta instanciada recebe um bonus de R$ 50,00.

## 📝 Exercício 3:  Relacionamentos e Encapsulamento (Sistema de E-commerce)

Avançando um pouco mais criando sistemas mais complexos, onde classes se relacionam entre si, usando o conceito de **Relacionamento** e **Herança**, a Idéia era crir classes de CLIENTE -> PEDIDO -> ITEM PEDIDO  e modelar um sistema de E-commerce onde um pedido pertecene a um cliente e possui uma lista de itens com uma ou mais quantidades, além do relaconamento entre classes, usar o conceito de encapsulamento para melhor controle e proteção dos dados,atributos e métodos pertencentes em cada classe, o objetivo geral é mostrar o ensinamento adquirido duarante as aulas, as regras de negócio do sistema era calcular o frete criando o método fechar pedido (), se o valor total dos itens fosse maior que  R$ 250,00, o frete é gratuito. Caso contrário, sria cobrado uma taxa fixa de R$25,00, e deveria imprimir o recibo detalhado com os métodos get para ser exibido os atributos das classes no recibo e um metodo toString() com StrigBuilder para imprimir o recibo.

## 📝 Exercício 4: Sistema de Veículos (Um pouco de tudo)
Quarto e ultimo exercicio individual de POO

## ⚙**Funcionalidades e Implementos:**

 ###  EXERCICIO 01 - ▶

➖ **Menu do Principal Caixa**: Usando comando do-while e switch para criar um menu que fica rodando até que o usuário escolha sair (opção 0).

➖ **Menus de Operação Saque/Depósito:** Criado menu interativo com switch dentro de outro switch para opção das operações de saque e dpósito, permitindo escolher valores padrão ou outros valores.

➖ **Confirmação da operação:** Permite que o usuário possa ou não confirmar a operação de saque ou depósito depois de escolher o valor desejado digitando "SIM" ou "NÂO", ou apenas usando caracteres "S" ou "N", tanto minúsculo,quanto maiúsculo.

➖ **Limite de Saques:** Permite e limita o usuário a 3 saques diários, ao tentar o 4º Saque, o sistema bloqueia.

➖ **Limite de Valor de Saque:** Bloqueia o usuário de sacar valores acima de R$ 1000,00 reais, por motivos de segurança.

➖ **Saldo Insuficiente**: Bloqueia o usuário de sacar qualquer valor se o saldo for menor que o valor do saque.


 ###  EXERCICIO 02 - ▶
 
  * ### 🔁 O que mudou?
  
➖ **Menu de cadastro de conta**: Menu inicial onde tem 3 opões sendo a ultima opção (Opção 0) sair e encerrar o programa, e a primeira opção para cadastrar uma nova conta onde se gera um numnero aleatorio de onta aops digitar nome e senha, para ser usado na segunda opção e acessar assim o caixa eletronico para realizar as operações.

➖ **Menus de Operação Saque/Depósito:** Agora os menus e as funcionalidades e a logica foi migrado para dentro dos metodos da classe ContaBancária, onde tem os dois métodos de sacar e depositar, os menus contam com opções próprias de valores, ou pode escolher a opão de digitar outro valor qu deseja em determinada operação escolhida: Sacar ou depositar.

➖ **Finalização**: A lógica foi mantida, porem implementada com o conceito de Programação Orientada a Objetos(POO), Criando Classes e Objetos para melhor controle de negócio, e estrutura do coódigo, trazendo funcionalidades usando métodos criados dentro das Classes para ser usado nos Objetos que instanciam essa classe .


 ###  EXERCICIO 03 - ▶
 
➖ **Adicionar Itens nos Pedidos do Cliente**: Permite adicionar lista de produtos com um ou mais produos e podedndo conter uma ou mais quantidades de cada produto ou do mesmo produto, permitindo uma lista de itend de cada produto dentro do pedido do cliente, exercendo o relacionamento entre as classes.

➖ **fechamento do pedido**: Após instanciar as classes,criar um novo objeto de cada entidade, adicionar Itens e produtos com variadas quantidades o metodo fechar pedido é adicionado, aplicando assim a regra de negócio,
sobre o valor total do pedido, e calculo do frete, e imprimindo o recibo de forma detalhada, contendo o subtotal de cada pedido, os dados do cliente e do pedido, lista dos produtod (quantidade e preço), custo do frete, e o valor total do pedido.
 


