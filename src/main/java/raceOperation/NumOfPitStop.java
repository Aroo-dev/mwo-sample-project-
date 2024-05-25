package raceOperation;

import java.util.ArrayList;
import java.util.HashMap;

public class NumOfPitStop {
    private List<Race> races = new ArrayList<>();

    public NumOfPitStop(List<Race> races) {
        this.races = races;
    }

    public int NumOfPitStop() {
        return races.size();
    }
}
