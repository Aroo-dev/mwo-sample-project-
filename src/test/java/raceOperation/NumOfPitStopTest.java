package raceOperation;

import org.example.model.Race;
import org.example.utils.JsonParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumOfPitStopTest {

    private List<Race> races = new ArrayList<>();

    @Test
    void numOfPitStop() throws IOException {
        races = JsonParser.parseRaceJson();
        assertEquals(27, races.size());
    }
}