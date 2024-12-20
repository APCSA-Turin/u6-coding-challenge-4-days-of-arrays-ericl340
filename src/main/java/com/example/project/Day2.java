
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] res = {new String[names.length], new String[names.length]};
        int i1 = 0, i2 = 0;
        while(i1 + i2 < names.length){
            if (Math.random() < 0.5) {
                res[0][i1] = names[i1 + i2];
                i1++;
            }else{
                res[1][i2] = names[i1 + i2];
                i2++;
            }
        }
        return res; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);
        for (int x = 0; x < result.length; x++) {
            for (int y = 0; y < result[x].length; y++) {
              System.out.print(result[x][y]);
            }
            System.out.println();
          }
    }
}