package interfaceGrafica;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import principal.Jogador;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela5 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tela5(Janela frame, Jogador pVencedor) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 185));
		panel.setBounds(0, 0, 1280, 720);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNomeVencedor = new JLabel("Jogador "+pVencedor.getNome()+" VENCEU!");
		lblNomeVencedor.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNomeVencedor.setBounds(290, 53, 690, 115);
		lblNomeVencedor.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNomeVencedor);
		
		JLabel lblXpGanho = new JLabel("XP GANHO: +"+pVencedor.aumentarXp());
		lblXpGanho.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblXpGanho.setBounds(509, 247, 259, 55);
		lblXpGanho.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblXpGanho);
		
		JLabel lblNivelAtual = new JLabel("Nível atual: "+pVencedor.getNivel());
		lblNivelAtual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNivelAtual.setBounds(509, 341, 259, 55);
		lblNivelAtual.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNivelAtual);
		
		JButton btnNewButton = new JButton("Voltar ao Início");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(new Tela1(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(548, 595, 191, 55);
		lblNomeVencedor.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(btnNewButton);

	}

}
