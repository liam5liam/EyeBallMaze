package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.Scanner;

public class Model implements IGame {	
		
	
	private static final String[] String = null;

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
		for (int y = 0; y < GameMap.length; ++y){
			for (int x = 0; x < GameMap[y].length; ++x){
				String pos = GameMap[y][x];
				if (x == GameMap[y].length - 1){
					System.out.println(pos);
				} else {
					System.out.print(pos);
				}
				String[] arrPos = pos.split("");
				String chars = arrPos[2];
				if (chars == "P"){
					System.out.print(x);
					System.out.print("found huim");
					player.x = x;
					player.y = y;
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
	
    public void restartMaze(){
    	
    }
    
    public void checkMove(String move){
    	String[] arrOfInput = move.split("");
    	Direction direction = Direction.get(arrOfInput[0]);
    	int spaces = Integer.parseInt(arrOfInput[1]);
    	
    	moveCounter++;
    	if (direction == Direction.Down) { this.moveVertical(spaces);}
    	if (direction == Direction.Up) { this.moveVertical(-spaces);}
    }
    
    public void moveVertical(int spaces){
    	int movingTo = player.y + spaces;
    	System.out.println(player.y);
    }
    
    public void updateMove(){
    	
    }
    
    public void showNextMove(){
    	
    }
    
    public void start() {
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
