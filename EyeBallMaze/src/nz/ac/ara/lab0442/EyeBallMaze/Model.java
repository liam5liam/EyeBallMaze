package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.Scanner;

public class Model implements IGame {	
		
	
	public Model()
	{
	
	}
	
	public static String[][] GameMap = 
		{
			{"    ", "    ", "TR G", "    "},
			{"PB  ", "TY  ", "DY  ", "PG  "},
			{"TG  ", "SR  ", "SG  ", "DY  "},
			{"TR  ", "TB  ", "SR  ", "TG  "},
			{"SB  ", "DR  ", "TB  ", "DB  "},
			{"    ", "DBP ", "    ", "    "}
		};
		
	public int moveCounter = 0;
	CoOrds player = new CoOrds(0, 0);
	
	public void printMaze(){
		for (int i = 0; i < GameMap.length; ++i){
			for (int j = 0; j < GameMap[i].length; ++j){
				String pos = GameMap[i][j];
				if (j == GameMap[i].length - 1){
					System.out.println(pos);
				} else {
					System.out.print(pos);
				}
				String[] arrPos = pos.split("");
				if (arrPos[2] == "P"){
					player.x = i;
					player.y = j;
				}
			}
		}
	}
	public Integer getRowCount(){
		return GameMap.length;	
	}
	
	public Integer getcolumnCount(){
		int previousRowLength = 0;
		
		for (String[] row : GameMap)
		{
			if (row.length >= previousRowLength) { previousRowLength = row.length; }
		}
		return previousRowLength;
	}
	
	public void getPlayerPos(){
		
	}
    public void restartMaze(){
    	
    }
    
    public void checkMove(String move){
    	String[] arrOfStr = move.split("");
    	//System.out.println();
    	
    }
    
    public void moveVertical(){
    
    }
    
    public void updateMove(){
    	
    }
    
    public void showNextMove(){
    	
    }
    
    public void start() {
    	this.printMaze();
    	boolean isRunning = true;
    	while (isRunning){
    		//Console.Clear();
    		this.printMaze();
    		
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Enter next move. Format {direction}{steps}");
	    	String s = in.nextLine();
	    	this.checkMove(s);
    	}
    }
}
