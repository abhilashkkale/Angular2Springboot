package com.clairvoyant.workshop.persistence;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by imteyaz on 24/2/17.
 */
public class CustomDateSerializer extends JsonSerializer<Date> {

  private static final DateTimeFormatter dateFormat = DateTimeFormatter.ISO_INSTANT;

  @Override
  public void serialize(Date date, JsonGenerator gen, SerializerProvider serializers)
      throws IOException, JsonProcessingException {
    String formattedDate = dateFormat.format(date.toInstant());
    gen.writeString(formattedDate);
  }
}
