package nz.ac.ara.lab0442.EyeBallMaze;
import java.util.ArrayList;
import java.util.Arrays;

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
	
	public void printMaze(){
		for (int i = 0; i < GameMap.length; ++i){
			for (int j = 0; j < GameMap[i].length; ++j){
				if (j == GameMap[i].length - 1){
					System.out.println(GameMap[i][j]);
				} else {
					System.out.print(GameMap[i][j]);
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
    
    public void checkMove(){
    	
    }
    
    public void updateMove(){
    	
    }
    
    public void showNextMove(){
    	
    }
}
