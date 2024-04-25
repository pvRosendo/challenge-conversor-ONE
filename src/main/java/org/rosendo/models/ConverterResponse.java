package org.rosendo.models;

public record ConverterResponse(
        Integer conversion_rate,
        Integer conversion_result
) {
}
