package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.time.YearMonth;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class JsonSerializerWithParentBeanRef<T> extends JsonSerializer<T> {

	@Override
	public void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
		throw new RuntimeException("Not Implemented");
	}
	
	abstract public void serialize(final YearMonth yearMonth, final JsonGenerator generator, final SerializerProvider provider, final Object parentBeanReference) throws IOException, JsonProcessingException;
}
