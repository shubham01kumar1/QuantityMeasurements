package com.quantitymeasurement;

/**
 * Purpose : enum class to implements MeasurementUnits Interface
 */
public enum Weight implements MeasurementUnits {

    GRAM(0.001), KILOGRAM(1.0), TONNE(1000.0);

    private double conversionValue;

    private Weight(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param value
     * @return double
     */
    @Override
    public double convertToBaseUnit(double value) {
        return value * conversionValue;
    }

    @Override
    public boolean supportAddition() {
        return true;
    }
}