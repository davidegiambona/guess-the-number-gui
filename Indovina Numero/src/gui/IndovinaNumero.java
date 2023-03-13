package gui;
import random.GeneraRandom;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IndovinaNumero extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel1, panel2, pannell;
	private static JLabel lbTextFieldIndoNum, success;
	private static JButton button;
	private static JTextField textFieldIndoNum, textFieldGenerato;
	private int numeroGen;
	
	public IndovinaNumero() {
		frame = new JFrame();
		pannell = new JPanel();
		
		panel1 = new JPanel(new GridLayout(0, 1));
		panel2 = new JPanel();
		
		textFieldIndoNum = new JTextField();
		lbTextFieldIndoNum = new JLabel("Inserire un numero: ");
		
		button = new JButton("Lancia il tuo numero..");
		
		frame.setSize(500/*WINDOW_HEIGHT*/, 400/*WINDOW_WITDH*/);
		frame.setTitle("Indovino indovinello!");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setResizable(true);
		
		success = new JLabel();
		success.setBounds(10, 110, 300, 25);
		
		panel1.add(textFieldIndoNum);
		panel1.add(lbTextFieldIndoNum);
		panel2.add(button);
		panel2.add(success);
		
		pannell.add(panel1);
		pannell.add(panel2);
		
		frame.setContentPane(pannell);
		button.addActionListener(this);		
		
		GeneraRandom random = new GeneraRandom();
		numeroGen = random.generaRandom();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str;
		int choice;
		str = textFieldIndoNum.getText();
		choice = (int) Double.parseDouble(str);
			
			if(choice == numeroGen) {
				success.setText("[ HAI VINTO IL NUMERO DA INDOVINARE ERA: " + numeroGen + " ]");
			} else if(choice < numeroGen/2) {
				success.setText("Numero troppo piccolo!");
			} else if(choice < numeroGen) {
				success.setText("Numero piccolo!");
			} else if(choice > numeroGen*2) {
				success.setText("Numero troppo grande!");
			} else if(choice > numeroGen) {
				success.setText("Numero grande!");
			}
	}
}
