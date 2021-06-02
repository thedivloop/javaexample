package tictactoe2;

public class tictactoe2 {
    public static void main(String args[]) {
    	TicTacToe ticTacToe = new TicTacToe();
        Gui gui = new Gui(ticTacToe);
        ticTacToe.getGui(gui);
    }
}