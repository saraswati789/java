import java.util.*;

public class Battle {
	public static String[][] ocean =new String[10][10];
	public static Scanner input = new Scanner(System.in); 
	public static Random ran = new Random();
	public static void main (String[] args)
	 {
	
	oCean();
		for (int j = 1; j < 6; j++){
				int com_x = ran.nextInt(10);
				int com_y = ran.nextInt(10);
				if (ocean[com_x][com_y] == null) {
				ocean[com_x][com_y] = "com";
				System.out.println(j+". Computer Ship has actives");
				}
		}
		
		for(int k = 0; k < 5; k++) {			
		System.out.print("Enter X co-ordinate for your Ship:");
		int X = input.nextInt();
		
		System.out.print("Enter Y co-ordinate for your Ship:");
		int Y = input.nextInt();
		
		ocean[X][Y] = "myship"; 
		}
		System.out.print("\f");
		oCean();
		player();
		computer();
		for(int row = 0; row < ocean.length;row++)
		{
			for (int col = 0; col < ocean[row].length; col++)
			{
				while( ocean[row][col] == "com" || ocean[row][col] == "myship" ) {
					oCean();
					player();
					computer();
				}
				if ( ocean[row][col] == "com" )
				{
				System.out.print("you lost the game");}
				else{
					System.out.print("you won the game");
				}
			}
		}
					
			}
		public static void oCean(){
		System.out.println("  0123456789  ");
		for (int row = 0; row < ocean.length; row++) {
			System.out.print(row + "|");
			
			for (int col = 0;col< ocean[row].length; col++) {
				if ( ocean[row][col] == "com" ){
					System.out.print(" "); }
				else if (ocean[row][col] == "!" ) {
					System.out.print("!"); }
				else if ( ocean[row][col] == null){
					System.out.print(" "); 
					
				}
				else {
					System.out.print("@");
					}
			
			}
			System.out.println("|" + row );
		}
		System.out.println("  0123456789  ");
		}
		public static void player() {
			System.out.print("Your Turn");
			System.out.print("Enter X co-ordinate:");
			int x = input.nextInt();
			System.out.print("Enter Y co-ordinate:");
			int y = input.nextInt();
		
		if (ocean[x][y] == "com"){
			ocean[x][y] = "!" ;
			System.out.print("Boom!, com ship sunk");}
		else if(ocean[x][y] == "myship" ){
			System.out.print("You sunk your own ship");
		}
		else {
			System.out.print("Sorry, You missed");
		}
		}
		public static void computer() {
			System.out.print(" its computer's turn ");
			int cx = ran.nextInt(10);
			int cy = ran.nextInt(10);
			
			if (ocean[cx][cy] == "myship") {
				ocean[cx][cy] = "x";
				System.out.print("comp won");}
			else if(ocean[cx][cy] == "com") {
				ocean[cx][cy] = "!";
				System.out.print("comp lost"); } 
			else {
				System.out.print("computer missed ");
			}
		}	
		
				
	
			
			
			
		
    }
		
	



				