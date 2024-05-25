package org.example;

import org.example.model.Race;
import org.example.utils.JsonParser;
import raceOperation.CountAvgPitStops;
import raceOperation.LongestPitDurationAndDriver;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        try {

            List<Race> races = JsonParser.parseRaceJson();
            races.forEach(System.out::println);
//            CountAvgPitStops avg = new CountAvgPitStops();
//            double v = avg.countAvgPitStops(races);
//            System.out.println(v);
            LongestPitDurationAndDriver lng = new LongestPitDurationAndDriver();
            int driverOfLongestPitDuration = lng.getDriverOfLongestPitDuration(races);
            System.out.println(driverOfLongestPitDuration);
            double longestPitDuration = lng.getLongestPitDuration(races);
            System.out.println(longestPitDuration);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }
}