package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.Collection;
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
			{"    ", "DBU ", "    ", "    "}
		};
		
	public int moveCounter = 0;
	CoOrds player = new CoOrds(0, 0, Direction.Up);
	
	Shapes currentShape = Shapes.Diamond;
	Colours currentColour = Colours.Blue;
	
	public void updateMaze(){
		for (int y = 0; y < GameMap.length; ++y){
			for (int x = 0; x < GameMap[y].length; ++x){
				String pos = GameMap[y][x];
				
				if (x == GameMap[y].length - 1){
					System.out.println(pos);
				} else {
					System.out.print(pos);
				}
				
				//Might as well update the current player position in the process
				String[] item = GameMap[y][x].split("");
				
				if (item[2] != " "){
					player.x = x;
					player.y = y;
					player.looking = Direction.get(item[2]);
					this.currentShape = Shapes.get(item[0]);
					this.currentColour = Colours.get(item[1]);
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
    
    public Object[] whatsAt(int x, int y){
    	String[] item = GameMap[y][x].split("");
    	Shapes shape = Shapes.get(item[0]);
    	Colours colour = Colours.get(item[1]);
    	Boolean isGoal = false;
    	if (item[3] == "G"){
    		isGoal = true;
    	}
    	return new Object[]{shape, colour, isGoal};
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
    	Object[] newLocation = whatsAt(player.x, movingTo);
    	Shapes newShape = newLocation[0]; 
    	if (this.currentShape == )
    }
    
    public void updateMove(){
    	
    }
    
    public void showNextMove(){
    	
    }
    
    public void start() {
    	boolean isRunning = true;
    	while (isRunning){
    		//Console.Clear();
    		this.updateMaze();
    		
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Enter next move. Format {direction}{steps}");
	    	String s = in.nextLine();
	    	this.checkMove(s);
    	}
    }
}
