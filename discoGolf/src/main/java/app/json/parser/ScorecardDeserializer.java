package app.json.parser;

import java.io.IOException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import app.Scorecard;

public class ScorecardDeserializer extends JsonDeserializer<Scorecard> {
    
    /**
     * Deserialize a scorecard from JSON
     */
    @Override
    public Scorecard deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        // TODO Auto-generated method stub
        return null;
    }
}
