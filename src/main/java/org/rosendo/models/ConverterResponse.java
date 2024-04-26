package org.rosendo.models;

public record ConverterResponse(
        Double conversion_rate,
        Double conversion_result
) {
}
