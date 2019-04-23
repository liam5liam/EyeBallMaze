package nz.ac.ara.lab0442.EyeBallMaze;

public class CoOrds {
	public int x, y;
	public Direction looking;
	
	public CoOrds(int p1, int p2, Direction dir){
		x = p1;
		y = p2;
		looking = dir;
	}
}
