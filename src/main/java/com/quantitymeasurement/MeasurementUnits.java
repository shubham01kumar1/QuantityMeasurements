package com.quantitymeasurement;

public interface MeasurementUnits {
    public double convertToBaseUnit(double value);

    public boolean supportAddition();
}
