package com.adriansoftware.format;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class CompactDecimalFormat extends NumberFormat {
    private static final DecimalFormat baseFormat = new DecimalFormat("##0");
    private static final DecimalFormat thousandsFormat = new DecimalFormat("##0.0#k");
    private static final DecimalFormat millionsFormat = new DecimalFormat("##0.0#m");
    private static final DecimalFormat billionsFormat = new DecimalFormat("##0.0#B");

    @Override
    public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
        return format((long) number, toAppendTo, pos);
    }

    @Override
    public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
        if (number >= 1e9) {
            return billionsFormat.format(number / 1e9, toAppendTo, pos);
        }
        if (number >= 1e6) {
            return millionsFormat.format(number / 1e6, toAppendTo, pos);
        }
        if (number >= 1e3) {
            return thousandsFormat.format(number / 1e3, toAppendTo, pos);
        }

        return baseFormat.format(number, toAppendTo, pos);
    }

    @Override
    public Number parse(String source, ParsePosition parsePosition) {
        return null;
    }
}
