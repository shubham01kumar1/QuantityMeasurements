package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void Given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void Given0FeetAnd1Feet_ShouldNotReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void Given0FeetAndNull_ShouldNotReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void Given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertFalse(feet1 == feet2);
    }

    @Test
    public void GivenFeetWithDiffType_ShouldNotReturnEqual() {
        Feet feet1 = new Feet(0.0);
        String feet2 = "0.0";
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void Given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void Given0InchAnd1Inch_ShouldNotReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void Given0InchAndNull_ShouldNotReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void GivenInchWithDiffReference_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertFalse(inch1 == inch2);
    }

    @Test
    public void GivenInchWithSameReference_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = inch1;
        Assert.assertTrue(inch1 == inch2);
    }

    @Test
    public void GivenInchWithDiffType_shouldNotReturnEqual() {
        Inch inch1 = new Inch(0.0);
        String inch2 = "0.0";
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void Given1FeetAnd12Inch_WhenFeetConvertedToInch_ShouldReturn12Inch() {
        Feet feet = new Feet(1.0);
        Inch expected = new Inch(12.0);
        LengthConversion lengthConversion = new LengthConversion();
        Inch actual = lengthConversion.ftToInch(feet);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Given0YardAnd0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void Given0YardAnd1Yard_ShouldNotReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void Given0YardAndNull_ShouldNotReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = null;
        Assert.assertNotEquals(yard1, yard2);
    }
}