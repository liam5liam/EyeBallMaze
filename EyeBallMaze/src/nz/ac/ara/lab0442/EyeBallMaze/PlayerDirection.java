package nz.ac.ara.lab0442.EyeBallMaze;

import java.util.HashMap;
import java.util.Map;

public enum PlayerDirection {
	Up("U"),
	Down("D"),
	Left("L"),
	Right("R");
	
	public final String abbreviation;
	
	private static final Map<String, PlayerDirection> lookup = new HashMap<String, PlayerDirection>();
	
	static {
        for (PlayerDirection d : PlayerDirection.values()) {
            lookup.put(d.getAbbreviation(), d);
        }
    }
	
	PlayerDirection(String abbreviation){
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
        return abbreviation;
    }

    public static PlayerDirection get(String abbreviation) {
        return lookup.get(abbreviation);
    }
}
