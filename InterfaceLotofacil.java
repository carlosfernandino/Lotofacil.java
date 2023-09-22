import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class InterfaceLotofacil extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
    // Construtor
    Random random = new Random();
    int numero_sorteado = -1;
    public InterfaceLotofacil(){
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String aposta = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100:");
                    numero_sorteado = random.nextInt(101);
                    int numero = Integer.parseInt(aposta);
                    if (numero < 0 || numero > 100) {
                        JOptionPane.showMessageDialog(null, "Aposta Inválida");
                    } else if (numero >= 0 && numero <= 100) {
                        if (numero == numero_sorteado) {
                            JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou R$1000 reais.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Não foi dessa vez. O número sorteado foi: " + numero_sorteado);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Aposta Inválida");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada Inválida. Digite um número válido.");
                }
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z:");
                char letra_premiada = 'C';
                if (aposta != null && aposta.length() == 1 && Character.isLetter(aposta.charAt(0))) {
                    char letra_aposta = Character.toUpperCase(aposta.charAt(0));

                    if(letra_aposta == letra_premiada){
                        JOptionPane.showMessageDialog(null,"Parabéns! Você ganhou R$500 reais.");
                    }else{
                        JOptionPane.showMessageDialog(null,"Não foi dessa vez. A letra premiada era:"+letra_premiada);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Aposta Inválida.");
                }
            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String aposta = JOptionPane.showInputDialog(null, "Digite um número Par ou Impar:");
                    int par_impar = Integer.parseInt(aposta);

                    if (par_impar % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou R$100 reais.");
                    } else{
                        JOptionPane.showMessageDialog(null, "Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Entrada Inválida. Digite um número válido.");
                }
            }
        });


        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }
    public static void main(String[] args) {new InterfaceLotofacil();}
}
