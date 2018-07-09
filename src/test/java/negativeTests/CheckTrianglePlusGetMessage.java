package negativeTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import triangle.Triangle;

public class CheckTrianglePlusGetMessage {
    Triangle aEualsZero;
    Triangle bEqualsZero;
    Triangle cEqualsZero;
    Triangle aBelowZero;
    Triangle bBelowZero;
    Triangle cBelowZero;
    Triangle aPlusBLessThenC;
    Triangle aPlusCLessThenB;
    Triangle bPlusCLessThenA;
    Triangle aPlusBEqualsC;
    Triangle aPlusCEqualsB;
    Triangle bPlusCEqalsA;

    @BeforeTest
    public void setUp() {
        aEualsZero = new Triangle(0, 4, 5);
        bEqualsZero = new Triangle(4, 0, 5);
        cEqualsZero = new Triangle(4, 5, 0);
        aBelowZero = new Triangle(-1, 5, 6);
        bBelowZero = new Triangle(4, -5, 6);
        cBelowZero = new Triangle(4, 5, -6);
        aPlusBLessThenC = new Triangle(6, 5, 15);
        aPlusCLessThenB = new Triangle(2, 20, 5);
        bPlusCLessThenA = new Triangle(20, 5, 10);
        aPlusBEqualsC = new Triangle(6, 5, 11);
        aPlusCEqualsB = new Triangle(11, 5, 6);
        bPlusCEqalsA = new Triangle(5, 11, 6);

    }


    @Test
    public void checkTriangleSidesEqalToZero() {
        Assert.assertEquals(aEualsZero.checkTriangle(), false);
        Assert.assertEquals(aEualsZero.getMessage(), "a<=0");
        Assert.assertEquals(bEqualsZero.checkTriangle(), false);
        Assert.assertEquals(bEqualsZero.getMessage(), "b<=0");
        Assert.assertEquals(cEqualsZero.checkTriangle(), false);
        Assert.assertEquals(cEqualsZero.getMessage(), "c<=0");
    }

    @Test
    public void checkTtiangleSidesBelowZero() {
        Assert.assertEquals(aBelowZero.checkTriangle(), false);
        Assert.assertEquals(aBelowZero.getMessage(), "a<=0");
        Assert.assertEquals(bBelowZero.checkTriangle(), false);
        Assert.assertEquals(bBelowZero.getMessage(), "b<=0");
        Assert.assertEquals(cBelowZero.checkTriangle(), false);
        Assert.assertEquals(cBelowZero.getMessage(), "c<=0");
    }

    @Test
    public void checkTriangleSummOfSidesBelowZero() {
        Assert.assertEquals(aPlusBLessThenC.checkTriangle(), false);
        Assert.assertEquals(aPlusBLessThenC.getMessage(), "a+b<=c");
        Assert.assertEquals(aPlusCLessThenB.checkTriangle(), false);
        Assert.assertEquals(aPlusCLessThenB.getMessage(), "a+c<=b");
        Assert.assertEquals(bPlusCLessThenA.checkTriangle(), false);
        Assert.assertEquals(bPlusCLessThenA.getMessage(), "b+c<=a");
    }

    @Test
    public void checkTrianleSummOfSidesEualToZero() {
        Assert.assertEquals(aPlusBEqualsC.checkTriangle(), false);
        Assert.assertEquals(aPlusBEqualsC.getMessage(), "a+b<=c");
        Assert.assertEquals(aPlusCEqualsB.checkTriangle(), false);
        Assert.assertEquals(aPlusCEqualsB.getMessage(), "a+c<=b");
        Assert.assertEquals(bPlusCEqalsA.checkTriangle(), false);
        Assert.assertEquals(bPlusCEqalsA.getMessage(), "b+c<=a");
    }

    @AfterTest
    public void clear() {
        aEualsZero = null;
        bEqualsZero = null;
        cEqualsZero = null;
        aBelowZero = null;
        bBelowZero = null;
        cBelowZero = null;
        aPlusBLessThenC = null;
        aPlusCLessThenB = null;
        bPlusCLessThenA = null;
        aPlusBEqualsC = null;
        aPlusCEqualsB = null;
        bPlusCEqalsA = null;

    }
}
