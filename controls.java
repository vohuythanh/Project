import java.util.Random;
import java.util.Stack;

public class controls {
	
	private int maxcells, highscore,x,y, numOfTurn;
	public int currentscore;
	public String str = "";
	public Stack stack_arr = new Stack();
	public Stack stack_board = new Stack();
	public Stack stack_score = new Stack();
	public int[][] board = new int [16][16];
	public int numberEleOfStack = -1;
	
	//default constructor
	public controls() {
		numOfTurn = 0;
		maxcells = 4;
		this.x = x;
		this.y = y;
		this.highscore = highscore;
		this.currentscore = currentscore;
		this.board = board;
	}
	
	public void setDefaultValue() {
		for (x=0; x <maxcells; x++ ) {
			for(y=0; y <maxcells; y++) {
				board[x][y] = 0;
			}
		}
	}
	//constructor size Max*Max
	public controls(int Max) {
		maxcells = Max;
		this.x = x;
		this.y = y;
		this.highscore = highscore;
		this.currentscore = currentscore;
		for (x = 0; x <maxcells; x++) {
			for(y = 0; y< maxcells; y++) {
				board [x][y] = 0;
			}
		}
	}
	Random random = new Random();
	
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	public int[][] getBoard() {
		return board;
	}
	
	public int getHighscore() {
		return highscore;
	}
	
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
	
	public int getCurrentscore() {
		return currentscore;
	}
	
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	
	public void addNewCell() {
		
		int value = (random.nextInt(10) < 9 ? 2 : 4);
		boolean findcell = false;
		int k = 1;
		while (!findcell && k < 1000) {
			int x = random.nextInt(maxcells);
			int y = random.nextInt(maxcells);
			if (board[x][y] == 0) {
				board [x][y] = value;
				
				findcell = true;				
			}
			k++;
		}
	}
	private boolean key = true;
	
	void swap(int i1, int j1, int i2, int j2, boolean key) {
		if(key) {
			int temp = board[i1][j1];
			board [i1][j1]= board [i2][j2];
			board [i2][j2]= temp;
		}
		else {
			board[i1][j1]*=2;
			currentscore += board[i1][j1];
			board[i2][j2] = 0;
		}
		key=true;
	}
	
	public void moveLeft() {
		for(int i = 0; i< maxcells; i++) {
			boolean case1 = false;
			int jj=0;
			boolean zero = false;
			for (int j = 0; j<maxcells - 1; j++) {
				if(board[i][jj] ==0) {
					if(board[i][jj] != board[i][j+1]) {
						key=true;
						swap(j, jj, i, j+1, key );
						zero = true;
					}
					else {
						zero = true;
					}
				}
				else {
					if(board[i][jj] == board [i][j+1]) {
						board[i][jj] *=2;
						currentscore += board[i][jj];
						board[i][j+1] = 0;
						jj++;
						zero = true;
					}
					else {
						if (zero && board[i][j+1] != 0) {
							key= true;
							swap(i, jj+1, i, j+1, key);
							jj++;
						}
						if (board[i][j+1] !=0) {
							jj++;
						}
						else {
							zero = true;
						}
					}
					
				}
			}
		}
	}
	public void moveright()	{	
		for(int i = 0; i < maxcells  ; i++)	{
			boolean case1 = false ;	
			int jj = maxcells-1;
			boolean zero = false ; 
			for( int j = maxcells-1; j > 0 ; j--) {
				if(board[i][jj]==0 ) {
					if( board[i][jj]!= board[i][j-1]) {
						key = true ;
			  			swap(i,jj,i,j-1 , key); //
			  			zero = true ;
			  		}
			  		else {
			  			zero=true ;
			  		}
			  	}
			  	else {
			  		if(board[i][jj] == board[i][j-1] ) {
			  			board[i][jj] *= 2;
			  			currentscore += board[i][jj];
			  			board[i][j-1] = 0 ; //
			  			jj--; //
			  			zero=true;
			  		}
			  		else {
			  			if(zero  && board[i][j-1] != 0)	{
			  				key= true ;
			  				swap(i,jj-1,i,j-1,key); 
			  				jj--; 
			  			}
			  			if( board[i][j-1] != 0) {
			  				jj--; 
			  			}
			  			else { 
			  				zero= true ;
			  			}
			  		}	
			  	}
			}
		}
	}
	public void moveup() {
		for(int j= 0; j< maxcells  ; j++) {
		
			boolean case1 = false ;	
			int ii=0;
			boolean zero = false ; 
		
			for( int i = 0; i < maxcells-1  ; i++) {
				if(board[ii][j]==0 ) {
					if( board[ii][j]!= board[i+1][j]) {
						key = true ;
						swap(ii,j,i+1,j , key);
						zero=true ;	  						
					}
					else {
						zero=true ;
					}
				}
				else {
					if(board[ii][j] == board[i+1][j] ) {
						board[ii][j] *= 2;
						currentscore += board[ii][j];
						board[i+1][j] = 0 ;
						ii++;
						zero=true;
						swap(ii+1,j,i+1,j,key);
			  		}
					else {
						if(zero && board[i+1][j] != 0) {
							key= true ;
							swap(ii+1,j,i+1,j,key);
							ii++;                                          
						}
						if( board[i+1][j] != 0)	{
							ii++;
						}
						else { 
							zero= true ;
						}
					}	
				}
			}
		}		
	}
	public void movedown() {
		for(int j= 0; j< maxcells  ; j++)	{
			boolean case1 = false ;	
			int ii=maxcells -1;
			boolean zero = false ; 
			for( int i = maxcells -1; i >0  ; i--) {
				if(board[ii][j]==0 ) {
					if( board[ii][j]!= board[i-1][j]) {
						key = true ;
				  		swap(ii,j,i-1,j , key); //
				  		zero=true ;		
				  	}
				  	else {
				  		zero=true ;
				  	}
				}
				else {
					if(board[ii][j] == board[i-1][j] ) {
						board[ii][j] *= 2;
				  		currentscore += board[ii][j];
				  		board[i-1][j] = 0 ; //
				  		ii--;//
				  		zero=true;
				  	}
				  	else {
				  		if(zero && board[i-1][j] != 0) {
				  			key= true ;
				  			swap(ii-1,j,i-1,j,key); 
				  			ii--; 
				  		}
				  		if( board[i-1][j] != 0) {
				  			ii--; 
				  		}
				  		else {
				  			zero= true ;
				  		}
				  	}	
				}
			}
		}
	}
	
	boolean vertical = true ;
	boolean left = true ;
	boolean up = true ;
	
	public boolean checkmove( boolean vertical , boolean left, boolean up  ) {
		boolean check = true ;
		if(!vertical) {
			if(left) {
				for(int i = 0 ; i < maxcells ; i++) {
					for(int j = 0 ; j < maxcells -1 ; j++) {
						if( board[i][j]==0 || board[i][j]== board[i][j+1]) 
							check = true;
						else 
							check = false ;
					}
				}
			}
			else {
				for(int i = 0 ; i < maxcells ; i++) {
					for(int j = maxcells -1 ; j >  0 ; j--) {
						if( board[i][j]==0 || board[i][j]== board[i][j-1])
							check = true ; 
						else 
							check = false ;
					}
				}
			}
		} 
		else {
			if(up) {
				for( int j = 0 ; j < maxcells ; j ++ ) {
					for(int i = 0 ; i < maxcells -1 ; i ++) {
						if(board[i][j]==0 || board[i][j] == board [i+1][j]) 
							check  = true;
						else 
							check = false ;
					}
				}
			}
			else {
				for( int j = 0 ; j < maxcells ; j ++ ) {
					for(int i = maxcells -1  ; i > 0 ; i --) {
						if(board[i][j]==0 || board[i][j] == board [i-1][j])
							check =  true;
						else 
							check = false ;
					}
				}
			}
		} 
	return check ;
	}
	public boolean canmove() {
		for(int x = 0 ; x < maxcells  ; x ++) {
			for( int y = 0 ; y < maxcells ; y ++) {
				if( x+1 < maxcells && board[x][y] == board[x+1][y]) {
					return true ;
				}
				else if ( x-1 >= 0 && board[x][y] == board[x-1][y] ) {
					return true; 
				}
				else if ( y+1 < maxcells && board[x][y] == board[x][y+1] ) {
					return true;
				}
				else if (y-1 >= 0 && board[x][y] == board[x][y-1] ) {
					return true; 
				}
			}
		}
	return false;
	}
	
	public boolean full() {
		for(int x = 0 ; x < maxcells  ; x ++) {
			for( int y = 0 ; y < maxcells ; y ++) {
				if(board[x][y] == 0 ) 
					return false;
			}
		}
     return true;
	}
	
	public boolean gameover() {
		if(!canmove() && full()) 
			return true;
		else 
			return false ;
	}
}
