import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	GradeBook g1, g2;

	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(4);
		g1.addScore(3);
		g1.addScore(2);
		g1.addScore(1);
		g2 = new GradeBook(5);
		g2.addScore(1);
		g2.addScore(2);
		g2.addScore(3);
		g2.addScore(4);
		g2.addScore(5);
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().contains("4.0 3.0 2.0 1.0 0.0"));
		assertTrue(g2.toString().contains("1.0 2.0 3.0 4.0 5.0"));
		assertEquals(g1.getScoreSize(), 4);
		assertEquals(g2.getScoreSize(), 5);
	}

	@Test
	public void testSum() {
		assertEquals(.100, g1.sum(), 10.0);
		assertEquals(.100, g2.sum(), 15.0);
	}

	@Test
	public void testMinimum() {
		assertEquals(.100, g2.minimum(), 1.0);
		assertEquals(.100, g1.minimum(), 1.0);
		
	}

	@Test
	public void testFinalScore() {
		assertEquals(.100, g1.finalScore(), 9.0);
		assertEquals(.100, g2.finalScore(), 14.0);
	}
		
	

}
