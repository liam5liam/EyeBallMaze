package nz.ac.ara.lab0442.EyeBallMaze;

public interface IGame {
	public Integer getRowCount();
	public Integer getcolumnCount();
	public void printMaze();
	public void restartMaze();
	public void checkMove(String move);
	public void updateMove();
	public void showNextMove();
	public void start();
}
