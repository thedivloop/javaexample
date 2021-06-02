package tictactoe2;

import javax.swing.*;

public class TicTacToe {
    public  int count = 0;
    public boolean gameIsOver = false;
    public  String[][] board = new String[3][3];
    public Gui gui;
    
    public void getGui(Gui gui) {
    	this.gui = gui;
    }

    public void buttonClicked(JButton button) {
    	if(!gameIsOver) {
	        if(button.getText().equals("")) {
	            count++;
	            if(count % 2 == 1) {
	                button.setText("X");
	            }
	            if(count % 2 == 0) {
	                button.setText("O");
	            }
	        }   
    	}
    }
    
    public void reset() {
    	for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
    	count = 0;
    	gui.reset();
    }


    public void gameRules(JButton button) {
        //"X" or "O"?
    	if (!gameIsOver) {
	        String string = button.getText();
	

	        int x = Character.getNumericValue(button.getName().charAt(0));
	        int y = Character.getNumericValue(button.getName().charAt(1));
	        board[x][y] = string;
	

	        if(board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
	            JOptionPane.showMessageDialog(null,string + " has won."); 
	            reset();
	            //gameIsOver = true;
	       } else if(board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
	            JOptionPane.showMessageDialog(null,string + " has won."); 
	            reset();
	            //gameIsOver = true;
	       } else if(count == 9) {
	            JOptionPane.showMessageDialog(null, "Cats game!"); 
	            reset();
	            //gameIsOver = true;
	       } else {
	           for (int i = 0; i < 3; i++) {
	               if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
	                   JOptionPane.showMessageDialog(null, string + " has won."); 
	                   reset();
	                   //gameIsOver = true;
	                   break;
	                   
	               } 
	               if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
	                   JOptionPane.showMessageDialog(null, string + " has won."); 
	                   reset();
	                   //gameIsOver = true;
	                   break;
	               }
	           }
	       }   
    	}
    }
}