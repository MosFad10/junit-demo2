package core;

import junit.framework.TestCase;
public class ArithmeticSolverTest extends TestCase {
	
	public void testAdd() {
		aArithmeticSolver solver = new ArithmeticSolver();
		assertEquals(4.0, solver.add(2,2));
	}
}
