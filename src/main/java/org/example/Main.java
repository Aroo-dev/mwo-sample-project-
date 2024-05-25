package org.example;

import org.example.model.Race;
import org.example.utils.JsonParser;
import raceOperation.CountAvgPitStops;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        try {

            List<Race> races = JsonParser.parseRaceJson();
            races.forEach(System.out::println);
            CountAvgPitStops avg = new CountAvgPitStops();
            double v = avg.countAvgPitStops(races);
            System.out.println(v);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }
}