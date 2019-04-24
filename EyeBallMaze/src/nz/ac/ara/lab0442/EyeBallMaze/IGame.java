package nz.ac.ara.lab0442.EyeBallMaze;

public interface IGame {
	public Integer getRowCount();
	public Integer getcolumnCount();
	public void restartMaze();
	public void checkMove(String move);
	public Object[] whatsAt(int x, int y);
	public void updateMove();
	public void showNextMove();
	public void start();
	public void clearConsole();
	public boolean isComplete();
}
