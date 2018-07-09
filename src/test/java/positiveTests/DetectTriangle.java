package positiveTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import triangle.Triangle;

public class DetectTriangle {
    Triangle firstIsoscelesTriangle;
    Triangle secondIsoscelesTriangle;
    Triangle thirdIsoscelesTriangle;
    Triangle equilateralTriangle;
    Triangle usualTriangle;
    Triangle firstRightTriangle;
    Triangle secondRightTriangle;
    Triangle thirdRightTriangle;
    Triangle rightIsoclencesTriangle;

    @BeforeTest
    public void setUp() {
        firstIsoscelesTriangle = new Triangle(12, 12, 20);
        secondIsoscelesTriangle = new Triangle(12.5, 20.5, 12.5);
        thirdIsoscelesTriangle = new Triangle(20, 12, 12);
        equilateralTriangle = new Triangle(12, 12, 12);
        usualTriangle = new Triangle(10, 12, 14);
        firstRightTriangle = new Triangle(3, 4, 5);
        secondRightTriangle = new Triangle(5, 4, 3);
        thirdRightTriangle = new Triangle(3, 5, 4);
        rightIsoclencesTriangle = new Triangle(12, 12, 16.971);
    }

    @Test
    public void detectTriangle() {
        Assert.assertEquals(firstIsoscelesTriangle.detectTriangle(), 2);
        Assert.assertEquals(secondIsoscelesTriangle.detectTriangle(), 2);
        Assert.assertEquals(thirdIsoscelesTriangle.detectTriangle(), 2);
        Assert.assertEquals(equilateralTriangle.detectTriangle(), 3);
        Assert.assertEquals(rightIsoclencesTriangle.detectTriangle(), 10);
        Assert.assertEquals(usualTriangle.detectTriangle(), 4);
        Assert.assertEquals(firstRightTriangle.detectTriangle(), 8);
        Assert.assertEquals(secondRightTriangle.detectTriangle(), 8);
        Assert.assertEquals(thirdRightTriangle.detectTriangle(), 8);


    }

    @AfterTest
    public void clear() {
        firstIsoscelesTriangle = null;
        secondIsoscelesTriangle = null;
        thirdIsoscelesTriangle = null;
        equilateralTriangle = null;
        usualTriangle = null;
        firstRightTriangle = null;
        secondRightTriangle = null;
        thirdRightTriangle = null;
        rightIsoclencesTriangle = null;
    }
}
