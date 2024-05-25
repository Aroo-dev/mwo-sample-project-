package org.example.utils;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Race;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class JsonParser {

    public static final String RACE_URL ="https://api.openf1.org/v1/pit?session_key=9515";

    public static List<Race> parseRaceJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(RACE_URL),
                new TypeReference<>() {});
    }

}
