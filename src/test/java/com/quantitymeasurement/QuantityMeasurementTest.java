package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void Given0FeetAnd0Feet_ShouldReturnEqual() {
        Length l1 = new Length(UnitEnum.FEET, 0.0);
        Length l2 = new Length(UnitEnum.FEET, 0.0);
        Assert.assertEquals(l1, l2);
    }

    @Test
    public void Given0FeetAnd1Feet_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.FEET, 0.0);
        Length l2 = new Length(UnitEnum.FEET, 1.0);
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0FeetAndNull_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.FEET, 0.0);
        Length l2 = null;
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        Length l1 = new Length(UnitEnum.FEET,0.0);
        Length l2 = new Length(UnitEnum.FEET,0.0);
        Assert.assertFalse(l1 == l2);
    }

    @Test
    public void GivenFeetWithDiffType_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.FEET,0.0);
        String l2 = "0.0";
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0InchAnd0Inch_ShouldReturnEqual() {
        Length l1 = new Length(UnitEnum.INCH,0.0);
        Length l2 = new Length(UnitEnum.INCH,0.0);
        Assert.assertEquals(l1, l2);
    }

    @Test
    public void Given0InchAnd1Inch_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.INCH,0.0);
        Length l2 = new Length(UnitEnum.INCH,1.0);
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0InchAndNull_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.INCH,0.0);
        Length l2 = null;
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void GivenInchWithDiffReference_ShouldReturnFalse() {
        Length l1 = new Length(UnitEnum.INCH,0.0);
        Length l2 = new Length(UnitEnum.INCH,0.0);
        Assert.assertFalse(l1 == l2);
    }

    @Test
    public void GivenInchWithSameReference_ShouldReturnTrue() {
        Length l1 = new Length(UnitEnum.INCH,0.0);
        Length l2 = l1;
        Assert.assertTrue(l1 == l2);
    }

    @Test
    public void GivenInchWithDiffType_shouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.INCH,0.0);
        String l2 = "0.0";
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given1FeetAnd12Inch_WhenFeetEqualToInch_ShouldReturnTrue() {
        Length l1 = new Length(UnitEnum.FEET,1.0);
        Length l2 = new Length(UnitEnum.INCH,12.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given0YardAnd0Yard_ShouldReturnEqual() {
        Length l1 = new Length(UnitEnum.YARD, 0.0);
        Length l2 = new Length(UnitEnum.YARD,0.0);
        Assert.assertEquals(l1, l2);
    }

    @Test
    public void Given0YardAnd1Yard_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.YARD, 0.0);
        Length l2 = new Length(UnitEnum.YARD,1.0);
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0YardAndNull_ShouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.YARD, 0.0);
        Length l2 = null;
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void GivenYardWithDiffReference_ShouldReturnFalse() {
        Length l1 = new Length(UnitEnum.YARD, 0.0);
        Length l2 = new Length(UnitEnum.YARD,0.0);
        Assert.assertFalse(l1 == l2);
    }

    @Test
    public void GivenYardWithDiffType_shouldNotReturnEqual() {
        Length l1 = new Length(UnitEnum.YARD, 0.0);
        String l2 = "0.0";
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given3FeetAnd1Yard_WhenFeetEqualToYard_ShouldReturnTrue() {
        Length l1 = new Length(UnitEnum.FEET,3.0);
        Length l2 = new Length(UnitEnum.YARD,1.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given1FeetAnd1Yard_WhenFeetEqualToYard_ShouldReturnFalse() {
        Length l1 = new Length(UnitEnum.FEET,1.0);
        Length l2 = new Length(UnitEnum.YARD,1.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertFalse(compare);
    }

    @Test
    public void Given1InchAnd1Yard_WhenInchEqualToYard_ShouldReturnFalse() {
        Length l1 = new Length(UnitEnum.INCH,1.0);
        Length l2 = new Length(UnitEnum.YARD,1.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertFalse(compare);
    }

    @Test
    public void Given1YardAnd36Inch_WhenYardEqualToInch_ShouldReturnTrue() {
        Length l1 = new Length(UnitEnum.YARD,1.0);
        Length l2 = new Length(UnitEnum.INCH,36.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given36InchAnd1Yard_WhenInchEqualToYard_ShouldReturnTrue() {
        Length l1 = new Length(UnitEnum.INCH,36.0);
        Length l2 = new Length(UnitEnum.YARD,1.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given1YardAnd3Feet_WhenYardEqualToFeet_ShouldReturnTrue() {
        Length l1 = new Length(UnitEnum.YARD,1.0);
        Length l2 = new Length(UnitEnum.FEET,3.0);
        boolean compare = UnitEnum.compare(l1, l2);
        Assert.assertTrue(compare);
    }
}