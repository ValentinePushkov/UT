package positiveTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import triangle.Triangle;

public class GetSquare {

    Triangle triangle;

    @BeforeTest
    public void setUp() {
        triangle = new Triangle(3, 4, 5);
    }

    @Test
    public void getSquare() {
        Assert.assertEquals(triangle.getSquare(), 6.0, 0.001);
    }

    @AfterTest
    public void clear() {
        triangle = null;
    }
}
