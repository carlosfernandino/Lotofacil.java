# Lotofácil Interface
Este é um pequeno projeto em Java que demonstra uma interface gráfica simples para simular apostas da conhecida "Lotofácil". O código utiliza a biblioteca Swing para criar uma janela de interface com botões e caixas de diálogo para interação com o usuário. O objetivo principal deste projeto é exemplificar o uso de componentes gráficos em Java.

## Funcionalidades
Botão "Apostar de 0 a 100"
Este botão permite ao usuário fazer uma aposta de um número entre 0 e 100. Após a aposta, o programa gera aleatoriamente um número e verifica se a aposta do usuário coincide com o número gerado. Dependendo do resultado, uma mensagem é exibida para indicar se o usuário ganhou ou não.

Botão "Apostar de A a Z"
Este botão permite ao usuário fazer uma aposta em uma letra do alfabeto, de A a Z. O programa assume que a letra premiada é 'C'. Se a aposta do usuário for igual à letra premiada, uma mensagem de parabéns é exibida; caso contrário, o usuário é informado de que não ganhou.

Botão "Apostar par ou ímpar"
Este botão permite ao usuário fazer uma aposta em um número, indicando se o número é par ou ímpar. O programa verifica se o número é par e exibe uma mensagem de parabéns se a aposta for correta; caso contrário, informa ao usuário que a premiação foi para números pares.

## Como Executar
Para executar o programa, basta compilar o código-fonte Java e executá-lo. Certifique-se de que você possui uma instalação adequada do Java em sua máquina. O método main da classe InterfaceLotofacil é o ponto de entrada do programa, e a janela de interface será exibida quando o programa for executado.

## Bibliotecas Utilizadas
Este projeto em Java utiliza as seguintes bibliotecas:

Swing (javax.swing)
Descrição: A biblioteca Swing é uma parte do Java Foundation Classes (JFC) que fornece uma estrutura para a criação de interfaces gráficas de usuário (GUIs) em Java.
Utilização no Projeto: É usada para criar janelas, botões, rótulos e caixas de diálogo que compõem a interface gráfica do programa.

Random (java.util.Random)
Descrição: A classe Random faz parte do pacote java.util e é usada para gerar números aleatórios.
Utilização no Projeto: É utilizada para gerar números aleatórios usados nas simulações de apostas.

JOptionPane (javax.swing.JOptionPane)
Descrição: A classe JOptionPane faz parte da biblioteca Swing e é usada para exibir caixas de diálogo que permitem a interação com o usuário, como caixas de entrada de texto e mensagens de diálogo.
Utilização no Projeto: É usada para obter entrada do usuário e exibir mensagens informativas ou de parabéns, dependendo dos resultados das apostas.

FlowLayout (java.awt.FlowLayout)
Descrição: A classe FlowLayout faz parte do pacote java.awt e é usada para organizar os componentes gráficos em um painel de forma que eles fluam da esquerda para a direita e de cima para baixo.
Utilização no Projeto: É usada para organizar os botões na janela de interface, especificando a disposição e o espaçamento entre eles.

Color (java.awt.Color)
Descrição: A classe Color faz parte do pacote java.awt e é usada para representar cores em um formato que pode ser usado em componentes gráficos.
Utilização no Projeto: É usada para definir a cor de fundo do painel da janela de interface.

## Requisitos
Java Development Kit (JDK) instalado na máquina.

## Contribuições
Este é um projeto simples destinado a fins de demonstração. Se você deseja contribuir ou expandir a funcionalidade, sinta-se à vontade para fazê-lo e envie suas contribuições.

## Autor
Este código foi escrito por Carlos Fernandino para a disciplina de Linguagens de Programação com Java.
