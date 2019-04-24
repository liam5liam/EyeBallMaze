package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.HashMap;
import java.util.Map;

public enum PlayerDirection {
	Up("U", 2),
	Down("D", -2),
	Left("L", 1),
	Right("R", -1);
	
	public final String abbreviation;
	public final int number;
	
	private static final Map<String, PlayerDirection> lookup = new HashMap<String, PlayerDirection>();
	private static final Map<Integer, Direction> lookupInt = new HashMap<Integer, Direction>();
	
	static {
        for (PlayerDirection d : PlayerDirection.values()) {
            lookup.put(d.getAbbreviation(), d);
        }
    }
	
	static {
        for (Direction d : Direction.values()) {
            lookupInt.put(d.getNumber(), d);
        }
    }
	
	PlayerDirection(String abbreviation, int number){
		this.abbreviation = abbreviation;
		this.number = number;
	}
	
	public String getAbbreviation() {
        return abbreviation;
    }
	
	public int getNumber() {
        return number;
    }
	
    public static PlayerDirection get(String abbreviation) {
        return lookup.get(abbreviation);
    }
    
    public static PlayerDirection getInt(int number) {
        return lookup.get(number);
    }
}
