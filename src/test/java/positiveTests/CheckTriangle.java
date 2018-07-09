package positiveTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import triangle.Triangle;

public class CheckTriangle {

    Triangle triangle;

    @BeforeTest(groups = "1")
    public void setUp() {
        triangle = new Triangle(17, 12, 15);

    }

    @Test(groups = "1")
    public void checkTriangle() {
        Assert.assertEquals(triangle.checkTriangle(), true);

    }

    @AfterTest
    public void clear() {
        triangle = null;
    }
}
