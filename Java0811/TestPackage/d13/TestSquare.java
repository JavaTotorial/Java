package d13;

import org.junit.Assert;
import org.junit.Test;

import com.pcschool.ocp.d13_assertion.Square;

public class TestSquare {

	@Test
	public void test1() {
		int x = 10;
		int y = 20;
		int h = 4;

		int exp = 60;

		Square sq = new Square();
		int act = sq.getArea(x, y, h);
		Assert.assertEquals(exp, act);
	}

	@Test
	public void test2() {
		int x = 10;
		int h = 2;

		int exp = 10;

		Square sq = new Square();

		int act = sq.getTriangle(x, h);
		Assert.assertEquals(exp, act);
	}
}
