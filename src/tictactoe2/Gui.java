package tictactoe2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	TicTacToe ticTacToe;
	
	public void initializeGui(TicTacToe ticTacToe) {
		this.ticTacToe = ticTacToe;
		panel.setLayout(new java.awt.GridLayout(3, 3));

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                final JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setFont(new Font("Arial", Font.PLAIN, 50));
                button.setName(string);
                button.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	ticTacToe.buttonClicked(button);
                        	ticTacToe.gameRules(button);
                        }
                    });
                button.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                panel.add(button);
            }

        }

        frame.add(panel);
	}
	
	public void reset() {
		panel.removeAll();
		panel.setLayout(new java.awt.GridLayout(3, 3));
		for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                final JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setFont(new Font("Arial", Font.PLAIN, 50));
                button.setName(string);
                button.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	ticTacToe.buttonClicked(button);
                        	ticTacToe.gameRules(button);
                        }
                    });
                button.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                panel.add(button);
            }

        }

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public Gui(TicTacToe ticTacToe) {
    	initializeGui(ticTacToe);
    	
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}