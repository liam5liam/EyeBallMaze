package nz.ac.ara.lab0442.EyeBallMaze;
import java.util.ArrayList;
import java.util.Arrays;

public class Model implements IGame {	
		
	public Model()
	{
		ArrayList<ArrayList<String>> gameMap = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> row = new ArrayList<String>(
			    Arrays.asList("", "", "TR G", ""));
		gameMap.add(row);
		
		ArrayList<String> row2 = new ArrayList<String>(
			    Arrays.asList("PB", "TY", "DY", "PG"));
		gameMap.add(row);
		
		ArrayList<String> row3 = new ArrayList<String>(
			    Arrays.asList("TG", "SR", "SG", "DY"));
		gameMap.add(row);
		
		ArrayList<String> row4 = new ArrayList<String>(
			    Arrays.asList("TR", "TB", "SR", "TG"));
		gameMap.add(row);
		
		ArrayList<String> row5 = new ArrayList<String>(
			    Arrays.asList("SB", "DR", "TB", "DB"));
		gameMap.add(row);
		
		ArrayList<String> row6 = new ArrayList<String>(
			    Arrays.asList("", "DBP", "", ""));
		gameMap.add(row);
	}
	
	public Integer getRowCount(){
		return null;	
	}
	
	public Integer getcolumnCount(){
		return null;
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
