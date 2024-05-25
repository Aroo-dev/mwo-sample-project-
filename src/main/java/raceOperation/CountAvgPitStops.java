package raceOperation;

import org.example.model.Race;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class CountAvgPitStops {
    public double countAvgPitStops(List<Race> races) {
        if (races == null || races.isEmpty()) {
            return 0.0;
        }

        double totalPitDuration = 0;

        for (Race race : races) {
            totalPitDuration += race.getPitDuration();
        }

        double avgPitDuration = totalPitDuration / races.size();

        BigDecimal bd = new BigDecimal(avgPitDuration);
        BigDecimal roundedAvgPitDuration = bd.setScale(2, RoundingMode.HALF_UP);

        return roundedAvgPitDuration.doubleValue();
    }
}
