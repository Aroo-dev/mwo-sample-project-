package org.example;

import org.example.model.Race;
import org.example.utils.JsonParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        try {

            List<Race> races = JsonParser.parseRaceJson();
            races.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }
}