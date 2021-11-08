package com.quantitymeasurement;

/**
 * purpose-create enum class that implements MeasurementSystem class
 */
public enum Length implements MeasurementUnits {
    YARD(36.0), FEET(12.0), INCH(1.0), CENTIMETER(0.4);

    private final double conversionValue;

    /**
     * purpose - parameterized constructor to initialize the conversionValue
     *
     * @param conversionValue
     */
    private Length(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param value (double type)
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

    /**
     * purpose - getter, to get the value stored in baseValue
     *
     * @return baseValue (double type)
     */
}