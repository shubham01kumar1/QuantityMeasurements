package com.quantitymeasurement;

import java.util.Objects;

public class Length {
    private final UnitEnum unit;
    private final double value;

    public Length(UnitEnum unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public UnitEnum getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit.equals(length.unit);
    }
}
