package uebung01;

public class TicTacToe {

	    enum State {EMPTY, RED, BLACK};
	    State[][] field;

	    public TicTacToe()
	    {
	        field = new State[3][3];
	        for(int i=0; i<field.length; i++)
	          for(int j=0; j<field[i].length; j++)
	            field[i][j]=State.EMPTY;
	    }

	    public void makeMove(int i, int j, State player)
	    {
	        if(field[i][j]==State.EMPTY && player!=State.EMPTY)   
	            field[i][j]=player;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
