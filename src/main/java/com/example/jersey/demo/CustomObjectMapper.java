package com.example.jersey.demo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author x
 */
@Component
public class CustomObjectMapper extends ObjectMapper {
    private static final long serialVersionUID = 1413033425692174337L;

    public CustomObjectMapper() {
        super();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        registerModule(simpleModule);

        setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //setTimeZone(TimeZone.getTimeZone("GMT+8"));
    }

    private class NullSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator jgen,
                              SerializerProvider provider) throws IOException,
                JsonProcessingException {
            jgen.writeString("");
        }
    }
}
