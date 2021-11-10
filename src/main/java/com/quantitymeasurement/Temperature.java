package com.quantitymeasurement;

/**
 * Purpose : create enum class to implements MeasurementUnits Interface
 */
public enum Temperature implements MeasurementUnits {

    FAHRENHEIT(true), CELCIUS(false);

    private boolean conversionValue;

    private Temperature(boolean conversionValue) {
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
        if (conversionValue) {
            System.out.println("Temprature" + (value - 32) * 5 / 9);
            return (value - 32) * 5 / 9;
        }
        return value;
    }

    /**
     * Purpose : To override the supportAddition() method
     *
     * @return boolean
     */
    @Override
    public boolean supportAddition() {
        return false;
    }
}