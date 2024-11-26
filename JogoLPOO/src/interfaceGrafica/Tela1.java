package interfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JTextField;

import principal.CampoDeBatalha;
import principal.Jogador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldP1;
	private JTextField textFieldP2;

	/**
	 * Create the panel.
	 */
	public Tela1(Janela frame) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 185));
		panel.setBounds(1, 0, 1280, 720);
		add(panel);
		panel.setLayout(null);
		
		textFieldP1 = new JTextField();
		textFieldP1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldP1.setBackground(new Color(211, 210, 253));
		textFieldP1.setColumns(10);
		textFieldP1.setBounds(447, 209, 385, 42);
		panel.add(textFieldP1);
		
		JLabel lblNewLabel = new JLabel("Player 1:");
		lblNewLabel.setForeground(new Color(211, 210, 253));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(447, 166, 201, 42);
		panel.add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player 2:");
		lblPlayer.setForeground(new Color(211, 210, 253));
		lblPlayer.setBackground(new Color(240, 240, 240));
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlayer.setBounds(447, 284, 201, 42);
		panel.add(lblPlayer);
		
		textFieldP2 = new JTextField();
		textFieldP2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldP2.setBackground(new Color(211, 210, 253));
		textFieldP2.setColumns(10);
		textFieldP2.setBounds(447, 326, 385, 42);
		panel.add(textFieldP2);
		
		JButton btnNewButton = new JButton("Próximo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Jogador p1 = new Jogador(textFieldP1.getText());
				Jogador p2 = new Jogador(textFieldP2.getText());
				
				// Substitui o painel atual pelo próximo
				frame.setContentPane(new Tela2(frame, p1, p2));
				frame.revalidate();
				frame.repaint();

				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(211, 210, 253));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(552, 496, 167, 58);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("CRÔNICAS DE ARCANA");
		lblNewLabel_1.setForeground(new Color(211, 210, 253));
		lblNewLabel_1.setFont(new Font("Ink Free", Font.BOLD, 88));
		lblNewLabel_1.setBounds(142, 20, 983, 96);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CRÔNICAS DE ARCANA");
		lblNewLabel_1_1.setBackground(new Color(211, 210, 253));
		lblNewLabel_1_1.setFont(new Font("Ink Free", Font.BOLD, 88));
		lblNewLabel_1_1.setBounds(143, 25, 983, 96);
		panel.add(lblNewLabel_1_1);

	}

}
