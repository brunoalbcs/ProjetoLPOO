package interfaceGrafica;

import javax.swing.JPanel;

import principal.Jogador;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import cartas.Carta;

import javax.swing.border.BevelBorder;

public class Tela4 extends JPanel { // Tela da batalha
	DefaultListModel maoP1DLM;
	DefaultListModel maoP2DLM;
	DefaultListModel campoP1DLM;
	DefaultListModel campoP2DLM;
	DefaultListModel cemiterioP1DLM;
	DefaultListModel cemiterioP2DLM;

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tela4(Janela frame, Jogador p1, Jogador p2, boolean jogadorAtual) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 185));
		panel.setBounds(0, 0, 1280, 720);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNomeP2 = new JLabel(p2.getNome());
		lblNomeP2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeP2.setBounds(1000, 11, 270, 29);
		panel.add(lblNomeP2);
		
		JLabel lblNomeP1 = new JLabel(p1.getNome());
		lblNomeP1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeP1.setBounds(10, 573, 270, 29);
		panel.add(lblNomeP1);
		
		// Criando ImageIcon estrela
		ImageIcon estrela = new ImageIcon(getClass().getResource("/img/estrela.png"));
		Image img = estrela.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon estrelaRedimensionada = new ImageIcon(img);

		// Criar JLabel com o ícone e o texto
		JLabel lblNivelP1 = new JLabel(""+p1.getNivel());
		lblNivelP1.setIcon(estrelaRedimensionada);
		lblNivelP1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNivelP1.setBounds(10, 601, 118, 29);
		panel.add(lblNivelP1);
		
		JLabel lblNivelP2 = new JLabel(""+p2.getNivel());
		lblNivelP2.setIcon(estrelaRedimensionada);
		lblNivelP2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNivelP2.setBounds(1000, 35, 118, 29);
		panel.add(lblNivelP2);
		
		maoP1DLM = criarDLM(p1.getMao());
		JList listMaoP1 = new JList(maoP1DLM);
		listMaoP1.setBackground(new Color(156, 103, 254));
		listMaoP1.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listMaoP1.setBounds(308, 572, 643, 138);
		panel.add(listMaoP1);
		
		maoP2DLM = criarDLM(p2.getMao());
		JList listMaoP2 = new JList(maoP2DLM);
		listMaoP2.setBackground(new Color(156, 103, 254));
		listMaoP2.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listMaoP2.setBounds(308, 10, 643, 138);
		panel.add(listMaoP2);
		
		campoP1DLM = criarDLM(p1.getCampo());
		JList listCampoP1 = new JList(campoP1DLM);
		listCampoP1.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listCampoP1.setBackground(new Color(156, 103, 254));
		listCampoP1.setBounds(246, 368, 775, 192);
		panel.add(listCampoP1);
		
		campoP2DLM = criarDLM(p2.getCampo());
		JList listCampoP2 = new JList(campoP2DLM);
		listCampoP2.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listCampoP2.setBackground(new Color(156, 103, 254));
		listCampoP2.setBounds(246, 161, 775, 192);
		panel.add(listCampoP2);
		
		cemiterioP1DLM = criarDLM(p1.getCemiterio());
		JList listCemiterioP1 = new JList(cemiterioP1DLM);
		listCemiterioP1.setBackground(new Color(156, 103, 254));
		listCemiterioP1.setBounds(1061, 501, 170, 192);
		panel.add(listCemiterioP1);

		cemiterioP2DLM = criarDLM(p2.getCemiterio());
		JList listCemiterioP2 = new JList(cemiterioP2DLM);
		listCemiterioP2.setBackground(new Color(156, 103, 254));
		listCemiterioP2.setBounds(1061, 191, 170, 192);
		panel.add(listCemiterioP2);

		
		// Criando ImageIcon caveira
		ImageIcon caveira = new ImageIcon(getClass().getResource("/img/caveira.png"));
		Image img2 = caveira.getImage().getScaledInstance(60, 50, Image.SCALE_SMOOTH);
		ImageIcon caveiraRedimensionada = new ImageIcon(img2);
		
		JLabel lblCaveiraP2 = new JLabel("");
		lblCaveiraP2.setIcon(caveiraRedimensionada);
		lblCaveiraP2.setBounds(1113, 130, 72, 58);
		panel.add(lblCaveiraP2);
		
		JLabel lblCaveiraP1 = new JLabel("");
		lblCaveiraP1.setIcon(caveiraRedimensionada);
		lblCaveiraP1.setBounds(1112, 435, 87, 71);
		panel.add(lblCaveiraP1);
		
		
		// Criando ImageIcon cartaDeck
		ImageIcon cartaDeck = new ImageIcon(getClass().getResource("/img/cartaDeck.png"));
		Image img3 = cartaDeck.getImage().getScaledInstance(150, 192, Image.SCALE_SMOOTH);
		ImageIcon cartaDeckRedimensionada = new ImageIcon(img3);
		
		JButton btnDeckP1 = new JButton("");
		btnDeckP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (p1.comprarCarta() != 0) {
					Carta carta = p1.getMao().get(p1.getMao().size() - 1);
					maoP1DLM.addElement(carta.getNome()+" | Custo: "+carta.getCustoMana()+"  ");
				} else {
					btnDeckP1.setEnabled(false);
					// acabou as cartas, mas não quero que o player perca por isso.
				}
			}
		});
		if (jogadorAtual) {
			btnDeckP1.setEnabled(true);
		} else {
			btnDeckP1.setEnabled(false);
		}
		btnDeckP1.setIcon(cartaDeckRedimensionada);
        // Tornar o botão transparente para exibir apenas a imagem
		btnDeckP1.setOpaque(false);
		btnDeckP1.setContentAreaFilled(false);
		btnDeckP1.setBorder(new LineBorder(new Color(102, 0, 185), 0, true));
		btnDeckP1.setBackground(new Color(156, 103, 254));
		btnDeckP1.setBounds(56, 368, 150, 192);
		panel.add(btnDeckP1);
		
		JButton btnDeckP2 = new JButton("");
		if (!jogadorAtual) {
			btnDeckP2.setEnabled(true);
		} else {
			btnDeckP2.setEnabled(false);
		}
		btnDeckP2.setIcon(cartaDeckRedimensionada);
        // Tornar o botão transparente para exibir apenas a imagem
		btnDeckP2.setOpaque(false);
		btnDeckP2.setContentAreaFilled(false);
		btnDeckP2.setBorderPainted(false);
		btnDeckP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (p2.comprarCarta() != 0) {
					Carta carta = p2.getMao().get(p2.getMao().size() - 1);
					maoP2DLM.addElement(carta.getNome()+" | Custo: "+carta.getCustoMana()+"  ");
				} else {
					btnDeckP2.setEnabled(false);
					// acabou as cartas, mas não quero que o player perca por isso.
				}
			}
		});
		btnDeckP2.setBackground(new Color(156, 103, 254));
		btnDeckP2.setBounds(56, 123, 150, 192);
		panel.add(btnDeckP2);
		
		// Criando ImageIcon mana
		ImageIcon mana = new ImageIcon(getClass().getResource("/img/mana.png"));
		Image img4 = mana.getImage().getScaledInstance(46, 46, Image.SCALE_SMOOTH);
		ImageIcon manaRedimensionada = new ImageIcon(img4);
		
		JLabel lblManaP1 = new JLabel(""+p1.getMana());
		lblManaP1.setForeground(new Color(211, 210, 253));
		lblManaP1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblManaP1.setIcon(manaRedimensionada);
		lblManaP1.setBounds(208, 612, 126, 81);
		panel.add(lblManaP1);
		
		JLabel lblManaP2 = new JLabel(""+p2.getMana());
		lblManaP2.setForeground(new Color(211, 210, 253));
		lblManaP2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblManaP2.setIcon(manaRedimensionada);
		lblManaP2.setBounds(961, 62, 152, 81);
		panel.add(lblManaP2);
		
		JButton btnSimularVitoria = new JButton("SIMULAR VITÓRIA P1");
		btnSimularVitoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vitoria(frame, p1);
			}
		});
		btnSimularVitoria.setBounds(80, 42, 126, 21);
		panel.add(btnSimularVitoria);
		

	}
	
	public DefaultListModel<String> criarDLM(ArrayList<Carta> a) { // DefaultListModel<String>
		DefaultListModel<String> lista = new DefaultListModel<>();
		for (Carta carta : a) {
			lista.addElement(carta.getNome()+" | Mana: "+carta.getCustoMana()+"  ");
		}
		return lista;
	}
	
	public void vitoria(Janela frame, Jogador pVencedor) {
		frame.setContentPane(new Tela5(frame, pVencedor));
		atualizarTela(frame);
	}
	
	public void atualizarTela(Janela frame) {
		frame.revalidate();
		frame.repaint();
	}

}
