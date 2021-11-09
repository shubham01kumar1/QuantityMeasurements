package com.quantitymeasurement;

/**
 * Purpose : create enum class to implements MeasurementUnits Interface
 *
 */
public enum Volume implements MeasurementUnits {

    GALLON(3.78), LITRE(1.0), MILLILITRE(0.001);

    private double conversionValue;

    private Volume(double conversionValue) {
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
