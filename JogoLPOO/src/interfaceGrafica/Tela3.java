package interfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import cartas.Carta;
import cartas.CriarCarta;
import cartas.Criatura;
import cartas.Encantamento;
import cartas.Feitico;
import principal.Jogador;

public class Tela3 extends JPanel {

    private static final long serialVersionUID = 1L;
    private ArrayList<Carta> deckP2; // Lista para armazenar o deck do jogador
    private JLabel lblDeckCount; // JLabel para mostrar a quantidade de cartas no deck
    private JButton btnProximo; // Botão para avançar
    private int maxCartas = 30; // Limite máximo de cartas no deck

    /**
     * Create the panel.
     */
    public Tela3(Janela frame, Jogador p1, Jogador p2) {
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 0, 185));
        panel.setBounds(0, 0, 1280, 720);
        add(panel);
        panel.setLayout(null);

        JLabel lblP1 = new JLabel();
        lblP1.setFont(new Font("Tahoma", Font.BOLD, 32));
        lblP1.setText("Jogador: " + p2.getNome());
        lblP1.setBounds(10, 10, 410, 65);
        panel.add(lblP1);

        JLabel lblNewLabel = new JLabel("Escolha 30 cartas para seu deck:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(10, 47, 274, 60);
        panel.add(lblNewLabel);

        // Inicializando o deck
        deckP2 = new ArrayList<>();

        CriarCarta cc = new CriarCarta(); // instanciei essa classe pra pegar todas as cartas

        // Criando um array de String que armazena o nome de cada Criatura e o custo.
        String[] nomesCriaturas = new String[cc.getCriaturas().size()];
        int contador1 = 0;
        for (Criatura c : cc.getCriaturas()) {
            nomesCriaturas[contador1] = c.getNome() + " | Custo: " + c.getCustoMana();
            contador1++;
        }
        JList<String> listCriaturas = new JList<>(nomesCriaturas);
        listCriaturas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        listCriaturas.setFont(new Font("Tahoma", Font.PLAIN, 18));
        listCriaturas.setBackground(new Color(156, 103, 254));
        listCriaturas.setBounds(10, 145, 410, 503);
        panel.add(listCriaturas);

        // Adicionando ListSelectionListener para capturar cliques em Criaturas
        listCriaturas.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int index = listCriaturas.getSelectedIndex();
                    if (index != -1 && deckP2.size() < maxCartas) {
                        deckP2.add(cc.getCriaturas().get(index));
                        listCriaturas.clearSelection(); // Limpar a seleção para permitir escolha repetida
                        atualizarDeckCount();
                    }
                }
            }
        });

        // Fiz o mesmo para os Feitiços
        String[] nomesFeiticos = new String[cc.getFeiticos().size()];
        int contador2 = 0;
        for (Feitico c : cc.getFeiticos()) {
            nomesFeiticos[contador2] = c.getNome() + " | Custo: " + c.getCustoMana();
            contador2++;
        }
        JList<String> listFeiticos = new JList<>(nomesFeiticos);
        listFeiticos.setFont(new Font("Tahoma", Font.PLAIN, 18));
        listFeiticos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        listFeiticos.setBackground(new Color(156, 103, 254));
        listFeiticos.setBounds(435, 145, 410, 503);
        panel.add(listFeiticos);

        listFeiticos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int index = listFeiticos.getSelectedIndex();
                    if (index != -1 && deckP2.size() < maxCartas) {
                        deckP2.add(cc.getFeiticos().get(index));
                        listFeiticos.clearSelection(); // Limpar a seleção para permitir escolha repetida
                        atualizarDeckCount();
                    }
                }
            }
        });

        // Fiz o mesmo para os Encantamentos
        String[] nomesEncantamentos = new String[cc.getEncantamentos().size()];
        int contador3 = 0;
        for (Encantamento c : cc.getEncantamentos()) {
            nomesEncantamentos[contador3] = c.getNome() + " | Custo: " + c.getCustoMana();
            contador3++;
        }
        JList<String> listEncantamentos = new JList<>(nomesEncantamentos);
        listEncantamentos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        listEncantamentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
        listEncantamentos.setBackground(new Color(156, 103, 254));
        listEncantamentos.setBounds(860, 145, 410, 503);
        panel.add(listEncantamentos);

        listEncantamentos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int index = listEncantamentos.getSelectedIndex();
                    if (index != -1 && deckP2.size() < maxCartas) {
                        deckP2.add(cc.getEncantamentos().get(index));
                        listEncantamentos.clearSelection(); // Limpar a seleção para permitir escolha repetida
                        atualizarDeckCount();
                    }
                }
            }
        });

        // JLabel para mostrar a quantidade de cartas no deck
        lblDeckCount = new JLabel("Cartas Adicionadas: 0/30");
        lblDeckCount.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblDeckCount.setBounds(10, 668, 300, 30);
        panel.add(lblDeckCount);

        // Botão "Próximo"
        btnProximo = new JButton("Próximo");
        btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnProximo.setBounds(580, 658, 120, 50);
        btnProximo.setEnabled(false); // Inicialmente desabilitado
        panel.add(btnProximo);
        
        JLabel lblNewLabel_1 = new JLabel("Criaturas");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(172, 118, 130, 22);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Feitiços");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(604, 118, 130, 22);
        panel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Encantamentos");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_2.setBounds(998, 118, 150, 22);
        panel.add(lblNewLabel_1_2);

        // Verifica quando o número de cartas no deck atinge o limite de 30
        btnProximo.addActionListener(e -> {
            if (deckP2.size() == maxCartas) {
                
            	p2.setDeck(deckP2);
            	
            	// aqui já tenho dois jogadores instanciados e seus deck feitos. 
            	// agora preciso embaralhar os decks, criar a primeira mão e definir quem inicia jogando
            	
            	Collections.shuffle(p1.getDeck()); // embaralhar os decks
        		Collections.shuffle(p2.getDeck());
        		
        		p1.primeiraMao(); // cada jogador puxa as 5 primeiras cartas do deck embaralhado
        		p2.primeiraMao();
        		
        		Random random = new Random();
        		boolean jogadorAtual = random.nextBoolean(); // sorteia quem começa jogando
            	
            	frame.setContentPane(new Tela4(frame, p1, p2, jogadorAtual)); 
				frame.revalidate();
				frame.repaint();
            }
        });
    }

    // Método para atualizar o JLabel com a quantidade de cartas no deck
    private void atualizarDeckCount() {
        lblDeckCount.setText("Cartas no Deck: " + deckP2.size() + "/" + maxCartas);
        // Habilita o botão "Próximo" quando o deck atingir 30 cartas
        if (deckP2.size() == maxCartas) {
            btnProximo.setEnabled(true);
        }
    }
}
