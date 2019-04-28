package nz.ac.ara.lab0442.EyeBallMaze;

import static org.junit.Assert.*;

import org.junit.Test;

public class EyeBallMazeUnitTests {

	@Test
	public void test1ForLocationXY() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		
		//TestCase
		Object[] result = model.whatsAt(2, 0);
		Object[] expected = {Shapes.Triangle, Colours.Red, Goal.Open};
		
		//Result
		assertEquals(expected, result);
	}

	@Test
	public void test2ForLocationXY() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		
		//TestCase
		Object[] result = model.whatsAt(1, 1);
		Object[] expected = {Shapes.Triangle, Colours.Yellow, Goal.NaG};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test3ForLocationXY() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		
		//TestCase
		Object[] result = model.whatsAt(2, 1);
		Object[] expected = {Shapes.Diamond, Colours.Yellow, Goal.NaG};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test4ForLocationXY() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		
		//TestCase
		Object[] result = model.whatsAt(3, 3);
		Object[] expected = {Shapes.Triangle, Colours.Green, Goal.NaG};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test5ForLocationXY() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		
		//TestCase
		Object[] result = model.whatsAt(3, 4);
		Object[] expected = {Shapes.Diamond, Colours.Blue, Goal.NaG};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test6ForEnumGoal() {
		//Assert
		
		//TestCase
		Goal result = Goal.get("G");
		Goal expected = Goal.Open;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test7ForEnumGoal() {
		//Assert
		
		//TestCase
		Goal result = Goal.get(" ");
		Goal expected = Goal.NaG;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test8ForEnumGoal() {
		//Assert
		
		//TestCase
		Goal result = Goal.get("X");
		Goal expected = Goal.Done;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test9ForEnumGoal() {
		//Assert
		
		//TestCase
		String result = Goal.Open.getAbbreviation();
		String expected = "G";
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test10ForEnumGoal() {
		//Assert
		
		//TestCase
		String result = Goal.NaG.getAbbreviation();
		String expected = " ";
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test11ForEnumGoal() {
		//Assert
		
		//TestCase
		String result = Goal.Done.getAbbreviation();
		String expected = "X";
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test12ForEnumDirection() {
		//Assert
		
		//TestCase
		String result = Direction.Up.getAbbreviation();
		String expected = "W";
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test13ForEnumDirection() {
		//Assert
		
		//TestCase
		Integer result = Direction.Up.getNumber();
		Integer expected = 2;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test14ForEnumDirection() {
		//Assert
		
		//TestCase
		Direction result = Direction.get("W");
		Direction expected = Direction.Up;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test15ForEnumDirection() {
		//Assert
		
		//TestCase
		Direction result = Direction.getInt(2);
		Direction expected = Direction.Up;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test16ForEnumDirection() {
		//Assert
		
		//TestCase
		Direction result = Direction.getInt(-2);
		Direction expected = Direction.Down;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test17ForEnumDirection() {
		//Assert
		
		//TestCase
		String result = Direction.Down.getAbbreviation();
		String expected = "S";
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test18ForEnumDirection() {
		//Assert
		
		//TestCase
		Integer result = Direction.Down.getNumber();
		Integer expected = -2;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test19ForEnumDirection() {
		//Assert
		
		//TestCase
	    Direction result = Direction.get("S");
	    Direction expected = Direction.Down;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test20ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		PlayerDirection result = PlayerDirection.getInt(-2);
		PlayerDirection expected = PlayerDirection.Down;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test21ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		String result = PlayerDirection.Down.getAbbreviation();
		String expected = "D";
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test22ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		Integer result = PlayerDirection.Down.getNumber();
		Integer expected = -2;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test23ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		PlayerDirection result = PlayerDirection.get("D");
		PlayerDirection expected = PlayerDirection.Down;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test24ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		PlayerDirection result = PlayerDirection.get("U");
		PlayerDirection expected = PlayerDirection.Up;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test25ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		PlayerDirection result = PlayerDirection.get("L");
		PlayerDirection expected = PlayerDirection.Left;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test26ForEnumPlayerDirection() {
		//Assert
		
		//TestCase
		PlayerDirection result = PlayerDirection.get("R");
		PlayerDirection expected = PlayerDirection.Right;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test27ForMoveUpdate() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		model.makeMove("w2");
		
		//TestCase
		Object[] result = model.whatsAt(1, 3);
		Object[] expected = {Shapes.Triangle, Colours.Blue, Goal.NaG};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test28ForMoveUpdate() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("a1");
		
		//TestCase
		Object[] result = model.whatsAt(0, 3);
		Object[] expected = {Shapes.Triangle, Colours.Red, Goal.NaG};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test29ForGoalPath() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("d2");
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("a3");
		model.updateMaze();
		model.makeMove("s3");
		model.updateMaze();
		model.makeMove("d2");
		model.updateMaze();
		model.makeMove("w4");
		model.updateMaze();
		
		//TestCase
		Object[] result = model.whatsAt(2, 0);
		Object[] expected = {Shapes.Triangle, Colours.Red, Goal.Done};
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test30ForCantMoveBackwards() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		model.makeMove("w2");
		model.makeMove("s2");
				
		//TestCase
		PlayerDirection result = model.player.looking;
		PlayerDirection expected = PlayerDirection.Up;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test31CheckIsComplete() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("d2");
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("a3");
		model.updateMaze();
		model.makeMove("s3");
		model.updateMaze();
		model.makeMove("d2");
		model.updateMaze();
		model.makeMove("w4");
		model.updateMaze();
		
		//TestCase
		Boolean result = model.isComplete();
		Boolean expected = false;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test32CheckIsComplete() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		
		//TestCase
		Boolean result = model.isComplete();
		Boolean expected = true;
		
		//Result
		assertEquals(expected, result);
	}
	
	@Test
	public void test33CheckMoveCounter() {
		//Assert
		Model model = new Model();
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("d2");
		model.updateMaze();
		model.makeMove("w2");
		model.updateMaze();
		model.makeMove("a3");
		model.updateMaze();
		model.makeMove("s3");
		model.updateMaze();
		model.makeMove("d2");
		model.updateMaze();
		model.makeMove("w4");
		model.updateMaze();
		
		//TestCase
		Integer result = model.moveCounter;
		Integer expected = 7;
		
		//Result
		assertEquals(expected, result);
	}
}
