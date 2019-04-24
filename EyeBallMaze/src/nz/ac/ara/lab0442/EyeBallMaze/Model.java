package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.ArrayList;
import java.util.Arrays;
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
	CoOrds player = new CoOrds(0, 0, PlayerDirection.Up);
	
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
				
				StringBuilder sb = new StringBuilder(GameMap[y][x]);
				if (sb.charAt(2) != ' '){
					player.x = x;
					player.y = y;
					player.looking = PlayerDirection.get(item[2]);
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
    	Object[] out = new Object[]{};
    	ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(out));
    	if(y > GameMap.length || x > GameMap[0].length || y < 0 || x < 0){
    		temp.add(false);
    		System.out.println("Invalid Mo");
    	} else {
	    	String[] item = GameMap[y][x].split("");
	    	Shapes shape = Shapes.get(item[0]);
	    	Colours colour = Colours.get(item[1]);
	    	Boolean isGoal = false;
	    	if (item[3] == "G"){
	    		isGoal = true;
	    	}
	    	temp.add(shape);
	    	temp.add(colour);
	    	temp.add(isGoal);
	    	
    	}
		return temp.toArray();
    }
    
    public void checkMove(String move){
    	String[] theirInput = move.split("");
    	Direction direction = Direction.get(theirInput[0]);
    	
    	int spaces = Integer.parseInt(theirInput[1]);
    	
    	moveCounter++;
    	if (direction == Direction.Down) { this.moveVertical(spaces, PlayerDirection.Down);}
    	if (direction == Direction.Up) { this.moveVertical(-spaces, PlayerDirection.Up);}
    	
    	if (direction == Direction.Left) { this.moveHorizontal(-spaces, PlayerDirection.Left);}
    	if (direction == Direction.Right) { this.moveHorizontal(spaces, PlayerDirection.Right);}
    }
    
    public void moveHorizontal(int spaces, PlayerDirection playerDirection){
    	int movingTo = player.x + spaces;
    	
    	Object[] newLocation = whatsAt(movingTo, player.y);
    	
    	if (newLocation.length < 2){
    		System.out.println("Invalid Move");
    	}
    	else {
	    	Shapes newShape = (Shapes) newLocation[0];
	    	Colours newColour = (Colours) newLocation[1];
	    	Boolean isGoal = (Boolean) newLocation[2];
	    	
	    	if (this.currentShape == newShape || this.currentColour == newColour){ 
	    		player.looking = playerDirection;
	    		
	    		StringBuilder sb = new StringBuilder(GameMap[player.y][player.x]);
	    		sb.deleteCharAt(2);
	    		sb.insert(2, " ");
	    		GameMap[player.y][player.x] = sb.toString();
	    		
	    		System.out.println(sb.toString());
	    		
	    		StringBuilder sb2 = new StringBuilder(GameMap[player.y][movingTo]);
	    		System.out.println(sb2.toString());
	    		sb2.deleteCharAt(2);
	    		sb2.insert(2, player.looking.getAbbreviation());
	    		GameMap[player.y][movingTo] = sb2.toString();
	    		
	    		System.out.println(sb2.toString());
	    		
	    	} else { System.out.println("Invalid MoveX");}
    	}
    }
    
    public void moveVertical(int spaces, PlayerDirection playerDirection){
    	int movingTo = player.y + spaces;
    	
    	Object[] newLocation = whatsAt(player.x, movingTo);
    	
    	if (newLocation.length < 2){
    		System.out.println("Invalid Move");
    	}
    	else {
	    	Shapes newShape = (Shapes) newLocation[0];
	    	Colours newColour = (Colours) newLocation[1];
	    	Boolean isGoal = (Boolean) newLocation[2];
	    	
	    	if (this.currentShape == newShape || this.currentColour == newColour){ 
	    		player.looking = playerDirection;
	    		
	    		StringBuilder sb = new StringBuilder(GameMap[player.y][player.x]);
	    		sb.deleteCharAt(2);
	    		sb.insert(2, " ");
	    		GameMap[player.y][player.x] = sb.toString();
	    		
	    		StringBuilder sb2 = new StringBuilder(GameMap[movingTo][player.x]);
	    		sb2.deleteCharAt(2);
	    		sb2.insert(2, player.looking.getAbbreviation());
	    		GameMap[movingTo][player.x] = sb2.toString();
	    		
	    	} else { System.out.println("Invalid Move");}
    	}
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
