
public class NQueens {
	
	
 final int size;
 int board[][];
 int row ;
 int col;

	NQueens(int n){
	 size = n; 
	 row = n;
	 col = n;

	}
	
	/*  Ensures the instance has a board of nxn, with n defined in the
constructor. Attempts to place n queens on the nxn board so that no two
queens attack each other. Returns true when successful, false otherwise.
Throws Exception if “n” is smaller than 0.*/
	
	
	
//	 boolean placeNQueens() 
//	    { 
//	        int i, j; 
//	  
//	        for (i = 0; i < col; i++) 
//	            if (board[row][i] == 1) 
//	                return false; 
//	  
//	      
//	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
//	            if (board[i][j] == 1) 
//	                return false; 
//	  
//	       
//	        for (i = row, j = col; j >= 0 && i < size; i++, j--) 
//	            if (board[i][j] == 1) 
//	                return false; 
//	  
//	        return true; 
//	    } 
//	
	

	 boolean placeNQueens() 
	 {
	           
	        return true; 
	    } 
	
public void printToConsole() {
	
	 for (int i = 0; i < size; i++) { 
	        for (int j = 0; j < size; j++) 
	            System.out.print(" " + board[i][j] 
	                             + " "); 
	        System.out.println(); 
	    } 
}

}
