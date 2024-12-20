package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int dist;
        private int spd;
        private int run;
        private int rest;
        private int p = 0;

        // Constructor 
        public Reindeer(String n, int speed, int runDuration, int restDuration) {
            name = n;
            spd = speed;
            run = runDuration;
            rest = restDuration;
            
        }

        public int getDistanceTraveled(){ // this method is required
            return dist;
        }
        
        public String getName() {
            return name;
        }

        public void simulateSecond(){ //this method is required but not tested
            if (p % (run + rest) < run)
                dist += spd;
            p++;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for (int i = 0; i < reindeers.length; i++) {
            for (int ii = 0; ii < time; ii++) {
                reindeers[i].simulateSecond();
            }
        }
        for (int i = 1; i < reindeers.length; i++) {
            if (reindeers[i].getDistanceTraveled() > reindeers[0].getDistanceTraveled())
                reindeers[0] = reindeers[i];
        }
        return reindeers[0].getName();
    }

    
    public static void main(String[] args) { // for testing purposed
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 70, 6, 1)
        };

        String winner = Day4.simulateRace(100, reindeers);
        System.out.println(winner);
    }

 
}



