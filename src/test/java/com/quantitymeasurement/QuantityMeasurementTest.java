package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void Given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assert.assertEquals(l1, l2);
    }

    @Test
    public void Given0FeetAnd1Feet_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0FeetAndNull_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem l2 = null;
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assert.assertFalse(l1 == l2);
    }

    @Test
    public void GivenFeetWithDiffType_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        String l2 = "0.0";
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0InchAnd0Inch_ShouldReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assert.assertEquals(l1, l2);
    }

    @Test
    public void Given0InchAnd1Inch_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0InchAndNull_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem l2 = null;
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void GivenInchWithDiffReference_ShouldReturnFalse() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assert.assertFalse(l1 == l2);
    }

    @Test
    public void GivenInchWithSameReference_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem l2 = l1;
        Assert.assertTrue(l1 == l2);
    }

    @Test
    public void GivenInchWithDiffType_shouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        String l2 = "0.0";
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given1FeetAnd12Inch_WhenFeetEqualToInch_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.INCH, 12.0);
        boolean compare = l1.compare(l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given0YardAnd0Yard_ShouldReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 0.0);
        Assert.assertEquals(l1, l2);
    }

    @Test
    public void Given0YardAnd1Yard_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given0YardAndNull_ShouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem l2 = null;
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void GivenYardWithDiffReference_ShouldReturnFalse() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 0.0);
        Assert.assertFalse(l1 == l2);
    }

    @Test
    public void GivenYardWithDiffType_shouldNotReturnEqual() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        String l2 = "0.0";
        Assert.assertNotEquals(l1, l2);
    }

    @Test
    public void Given3FeetAnd1Yard_WhenFeetEqualToYard_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 3.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compare = l1.compare(l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given1FeetAnd1Yard_WhenFeetEqualToYard_ShouldReturnFalse() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compare = l1.compare(l2);
        Assert.assertFalse(compare);
    }

    @Test
    public void Given1InchAnd1Yard_WhenInchEqualToYard_ShouldReturnFalse() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compare = l1.compare(l2);
        Assert.assertFalse(compare);
    }

    @Test
    public void Given1YardAnd36Inch_WhenYardEqualToInch_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.INCH, 36.0);
        boolean compare = l1.compare(l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given36InchAnd1Yard_WhenInchEqualToYard_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 36.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compare = l1.compare(l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given1YardAnd3Feet_WhenYardEqualToFeet_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.FEET, 3.0);
        boolean compare = l1.compare(l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given2InchAnd5Centimeter_WhenInchEqualToCentimeter_ShouldReturnTrue() {
        UnitMeasurementSystem l1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem l2 = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        boolean compare = l1.compare(l2);
        Assert.assertTrue(compare);
    }

    @Test
    public void Given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        double expectedResult = 4.00;
        double actualResult = inch1.add(inch2);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        double actualResult = feet.add(inch);
        Assert.assertEquals(14.00, actualResult, 0);
    }

    @Test

    public void Given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.FEET, 1.0);
        double actualResult = feet.add(inch);
        Assert.assertEquals(24.00, actualResult, 0);
    }

    @Test
    public void Given2InchAnd2point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(Length.CENTIMETER, 2.5);
        double actualResult = inch.add(centimeter);
        Assert.assertEquals(3.0, actualResult, 0);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        Assert.assertEquals(gallon1, gallon2);
    }

    @Test
    public void givenValue0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAndNullGallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = null;
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assert.assertNotEquals(gallon1, gallon2);
    }
}