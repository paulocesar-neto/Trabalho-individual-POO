
# Trabalho Individual POO 💻                                                                   
### **Nome:** Paulo Cesar Ferreira Vale Neto   
### **Turma:** 37 - NOVA FRIBURGO


### 🎯**Trabalho Individual da Disciplina de POO do Serratec: Da Lógica de Programação à Orientação a Objetos!**

Este projeto foi criado para colocar em prática o que foi aprendido em todo o processo da disciplina durante as aulas, ultilizando Linguagem de Programação Java, desde a  lógica de programação até Programação Orientada a Objetos, utilizando todos os conceitos de Classes e Objetos, Métodos, atributos, instâncias de Objetos, regras de Encapsulamento, Relacionamentos entre classes, Heranças, Polimorfísmo, Enums, Exceptions e muito mais, que todo conceito da Linguagem traz.

 # Exercícios 📑

### 🟢 Informações e Explicações sobre os Exercícios e o que foi feito e pedido em cada um.</br> Segue a baixo:
</br>

 ## 📝 **Exercício 1:  Lógica e Estruturas de Controle (Conta Bancária)**

O primeiro exercício foi pedido para ser feito apenas com lógica de programação e estrutura de controle utilizando a linguagem Java, construindo toda a lógica dentro do método main, permitindo controle do código, adicionando funcionalidades, menus, confimação de operações, verificação de saldo, e regras de segurança. Simulando um caixa eltrônico real de forma bem simples e estruturada.

## 📝 Exercício 2:  Classes e Objetos (Conta Bancária)

Como no exercício 01, ainda com o sistema de caixa eletrônico, o objetivo era continuar a idéia do primeiro exercício, migrando a lógica para o conceito de POO(Programação Orientada a Objetos), onde era necessário criar uma classe de Conta Bancário, com os principais atributos número, títular, e saldo, implementando os métodos também de Sacar() e Depositar () com a mesma funcionalidade do exercício 01, mas agora com Classes e Objetos dentro do Sistema, garantindo melhor o controle, contendo também regra de negócio onde toda nova conta instanciada recebe um bonus de R$ 50,00 reais.

## 📝 Exercício 3:  Relacionamentos e Encapsulamento (Sistema de E-commerce)

Avançando um pouco mais criando sistemas mais complexos, onde classes se relacionam entre si, usando o conceito de **Relacionamento** e **Herança**, a Idéia era criar classes de CLIENTE -> PEDIDO -> ITEM PEDIDO  e modelar um sistema de E-commerce onde um pedido pertecene a um cliente e possui uma lista de itens com uma ou mais quantidades. Além do relacionamento entre classes, foi usado o conceito de encapsulamento para melhor controle e proteção dos dados, atributos e métodos pertencentes em cada classe, o objetivo geral é mostrar o ensinamento adquirido durante as aulas, as regras de negócio do sistema era cálcular o frete criando o método fechar pedido (), se o valor total dos itens fosse maior que R$ 250,00, o frete é gratuito. Caso contrário, seria cobrado uma taxa fixa de R$25,00, e deveria imprimir o recibo detalhado.

## 📝 Exercício 4: Sistema de Veículos (Um pouco de tudo)

Quarto e último exercício individual de POO, com base em tudo que foi passado, esse exercício abrange um pouco de tudo, a idéia era criar um Sistema de Locação de veículos, tributação e gestão de frotas de Carros de Passeio e Caminhão, com foco em segurança, heranças de classes e tratamento de exceções, o principal objetivo era criar interfaces para definir comportamentos, as interfaces são Fretável com método de alugar veículos e tributável com método de cálculo de IPVA, uma classe mãe abstrata e sealed Veículos com atributos: placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe, para ser herdados nas classes CarroPasseio e Caminhao, a ideia também era tratamento de exceções dentro dos construtores e dos métodos alugarVeiculos e CalculoIpva, e ser lançada exceção para ser tratada no método Main, as regras de negócio eram: Ao calcular o valor da locação através do método alugarVeiculo(pesoCarga, dias), caso o peso da carga informado seja maior que a capacidade máxima do caminhão, deverá ser aplicado um acréscimo de 10% sobre o valor total das diárias como taxa de sobrecarga. Além das Regras de Negócio tinham tambem as Regra do Governo: Veículos com mais de 20 anos de fabricação são isentos de IPVA (retornam 0.0). Se for mais novo, o CarroPasseio paga 4% do valor de tabela e o Caminhao paga 1.5%.

## ⚙**Funcionalidades e Implementos:**

 ###  EXERCICIO 01 - ▶

➖ **Menu do Principal do Caixa Eletrônico**: Usando comando do-while e switch para criar um menu que fica rodando até que o usuário escolha sair (opção 0).

➖ **Menus de Operação Saque/Depósito:** Criado menu interativo com switch dentro de outro switch para opção das operações de saque e dpósito, permitindo escolher valores padrão ou outros valores.

➖ **Confirmação da operação:** Permite que o usuário possa ou não confirmar a operação de saque ou depósito depois de escolher o valor desejado digitando "SIM" ou "NÂO", ou apenas usando caracteres "S" ou "N", tanto minúsculo,quanto maiúsculo.

➖ **Limite de Saques:** Permite e limita o usuário a 3 saques diários, ao tentar o 4º Saque, o sistema bloqueia.

➖ **Limite de Valor de Saque:** Bloqueia o usuário de sacar valores acima de R$ 1000,00 reais, por motivos de segurança.

➖ **Saldo Insuficiente**: Bloqueia o usuário de sacar qualquer valor se o saldo for menor que o valor do saque.


 ###  EXERCICIO 02 - ▶
 
  * ### 🔁 O que mudou?
  
➖ **Menu de cadastro de conta**: Menu inicial onde tem 3 opões sendo a ultima opção (Opção 0) sair e encerrar o programa, e a primeira opção para cadastrar uma nova conta onde se gera um número aleatório de conta ao digitar nome e senha, para ser usado na segunda opção e acessar assim o caixa eletronico para realizar as operações.

➖ **Menus de Operação Saque/Depósito:** Agora os menus e as funcionalidades e a lógica foi migrado para dentro dos métodos da classe ContaBancária, onde tem os dois métodos de sacar e depositar, os menus contam com opções próprias de valores, ou pode escolher a opção de digitar outro valor que deseja em determinada operação escolhida: Sacar ou depositar.

➖ **Finalização**: A lógica foi mantida, porém implementada com o conceito de Programação Orientada a Objetos(POO), Criando Classes e Objetos para melhor controle de negócio, e estrutura do coódigo, trazendo funcionalidades usando métodos criados dentro das Classes para ser usado nos Objetos que instanciam essa classe .


 ###  EXERCICIO 03 - ▶
 
➖ **Adicionar Itens nos Pedidos do Cliente**: Permite adicionar lista de produtos com um ou mais produtos e podendo conter uma ou mais quantidades de cada produto (ou do mesmo produto), permitindo uma lista de itens de cada produto dentro do pedido do cliente, exercendo o relacionamento entre as classes.

➖ **Fechamento do Pedido**: Após instanciar as classes, criar um novo objeto de cada classe, adicionar Itens e produtos com várias quantidades, o metodo fechar pedido é adicionado, aplicando assim a regra de negócio,
sobre o valor total do pedido, e cálculo do frete, e imprimindo o recibo de forma detalhada, contendo o subtotal de cada pedido, os dados do cliente e do pedido, lista dos produtos (quantidade e preço), custo do frete, e o valor total do pedido.
 
###  EXERCICIO 04 - ▶

➖ **Cálculo de Locação e Sobrecarga**: O Sistema permite o cálculo de Locação, calculado o valor da locação diária com os dias que o veículo vai ser alugado, gerando o resultado, se o veículo for Caminhão também é realizado cálculo de sobrecarga, onde entra a regra de negócio, onde se o peso da carga for maior que o valor máximo de capacidade de carga toneladas do caminhão sera cobrada uma taxa de 10% do valor.

➖ **Cálculo de IPVA e Regras Tributárias**: o Cálculo do Ipva implementado na interface Tributável, segue a regra tributária da legislação conforme o tipo de veículo, onde os carros de passeio mais novos o valor é de 4% sobre o preço Fipe , e os caminhões 1,5%. Veículos com 20 anos ou mais contado do ano de fabricação são insentos do IPVA.

➖ **Tratamento das Exceções**: O sistema possui exceções para tratamentos de erros, não permitindo valores nulos, vazios, ou inválidos, com exceões lançadas dento dos construtores e dos métodos das classes e tratadas no método Main.IMplementando um gerenciamento de erros rigoroso.
