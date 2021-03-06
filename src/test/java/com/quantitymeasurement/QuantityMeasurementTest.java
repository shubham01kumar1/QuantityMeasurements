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

    @Test
    public void givenSameType0GallonAnd1Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assert.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        Assert.assertEquals(litre1, litre2);
    }

    @Test
    public void givenValue0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assert.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAndNullLitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = null;
        Assert.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assert.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenType0LitreAnd1Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        Assert.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        Assert.assertEquals(millilitre1, millilitre2);
    }

    @Test
    public void givenValue0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 1.0);
        Assert.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void given0MillilitreAndNullMillilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = null;
        Assert.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void givenDifferentReference0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 1.0);
        Assert.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void givenSameType0MillilitreAnd1Millilitre_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        Assert.assertEquals(millilitre1.getClass(), millilitre2.getClass());
    }

    @Test
    public void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        boolean result = gallon.compare(litre);
        Assert.assertTrue(result);
    }

    @Test
    public void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean result = gallon.compare(litre);
        Assert.assertFalse(result);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        boolean result = gallon.compare(litre);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        boolean result = litre.compare(gallon);
        Assert.assertTrue(result);
    }

    @Test
    public void given0LitreAnd0Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 0.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 0.0);
        boolean result = litre.compare(millilitre);
        Assert.assertTrue(result);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        boolean result = litre.compare(millilitre);
        Assert.assertTrue(result);
    }

    @Test
    public void given1000MillilitreAnd1Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean result = millilitre.compare(litre);
        Assert.assertTrue(result);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenAdded_ShouldReturn7Point56Litre() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        double actualValue = gallon.add(litre);
        double expected = 7.56;
        Assert.assertEquals(actualValue, expected, 0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenAdded_ShouldReturn2Litre() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        double actualValue = litre.add(millilitre);
        double expected = 2.0;
        Assert.assertEquals(actualValue, expected, 0.0);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        Assert.assertEquals(gram1, gram2);
    }

    @Test
    public void givenValue0GramAnd1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNullGram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = null;
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenReference0GramAnd1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenType0GramAnd1Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(Weight.GRAM, 0.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(Weight.GRAM, 1.0);
        Assert.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void given0KilogramAnd0Kilogram_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        Assert.assertEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenValue0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        Assert.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0KilogramAndNullKilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = null;
        Assert.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenReference0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        Assert.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenType0KilogramAnd1Kilogram_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        Assert.assertEquals(kilogram1.getClass(), kilogram2.getClass());
    }

    @Test
    public void given0TonneAnd0Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        Assert.assertEquals(tonne1, tonne2);
    }

    @Test
    public void givenValue0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        Assert.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void given0TonneAndNullTonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = null;
        Assert.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void givenReference0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        Assert.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void givenType0TonneAnd1Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        Assert.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        boolean result = kilogram.compare(gram);
        Assert.assertTrue(result);
    }

    @Test
    public void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem gram = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        boolean result = gram.compare(kilogram);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        boolean result = tonne.compare(kilogram);
        Assert.assertTrue(result);
    }

    @Test
    public void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(Weight.KILOGRAM, 1000.0);
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        boolean result = kilogram.compare(tonne);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001Kilograms() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(Weight.GRAM, 1000.0);
        double actualResult = tonne.add(gram);
        double expectedResult = 1001.0;
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEqualTemperature() {
        UnitMeasurementSystem fromFahren = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 212.0);
        UnitMeasurementSystem toCelsius = new UnitMeasurementSystem(Temperature.CELCIUS, 100.0);
        Assert.assertTrue(fromFahren.compare(toCelsius));
    }

    @Test
    public void given100CelsiusAnd212Fahrenheit_ShouldReturnEqualTemperature() {
        UnitMeasurementSystem fromFahren = new UnitMeasurementSystem(Temperature.CELCIUS, 100.0);
        UnitMeasurementSystem toCelsius = new UnitMeasurementSystem(Temperature.FAHRENHEIT, 212.0);
        Assert.assertTrue(fromFahren.compare(toCelsius));
    }
}