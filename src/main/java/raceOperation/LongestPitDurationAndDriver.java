package raceOperation;

import org.example.model.Race;

import java.util.List;

public class LongestPitDurationAndDriver {

        public double getLongestPitDuration(List<Race> races) {
            sortRaceListByPitDuration(races);
            return races.get(races.size() - 1).getPitDuration();
        }

        public int getDriverOfLongestPitDuration(List<Race> races) {
            sortRaceListByPitDuration(races);
            return races.get(races.size() - 1).getDriverNumber();
        }

        private void sortRaceListByPitDuration(List<Race> races) {
            races.sort((Race r1, Race r2) ->
                    r1.getPitDuration() > r2.getPitDuration() ? 1 : -1);
        }
    }

