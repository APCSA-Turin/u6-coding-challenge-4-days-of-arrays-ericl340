package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int x = 0; x < size; x++) {
          for (int y = 0; y < size; y++) {
            grid[x][y] = x == y || x == size / 2 || y == size / 2 || x == size - y - 1? "*" : " ";
          }
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      for (int x = 0; x < snowflake.length; x++) {
        for (int y = 0; y < snowflake[x].length; y++) {
          System.out.print(snowflake[x][y]);
        }
        System.out.println();
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(generateSnowflake(101));
    }
}
