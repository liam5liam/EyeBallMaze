package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
	Up("w"),
	Down("s"),
	Left("a"),
	Right("d");
	
	public final String abbreviation;
	
	private static final Map<String, Direction> lookup = new HashMap<String, Direction>();
	
	static {
        for (Direction d : Direction.values()) {
            lookup.put(d.getAbbreviation(), d);
        }
    }
	
	Direction(String abbreviation){
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
        return abbreviation;
    }

    public static Direction get(String abbreviation) {
        return lookup.get(abbreviation);
    }
}
