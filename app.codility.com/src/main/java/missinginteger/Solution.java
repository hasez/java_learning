package missinginteger;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution { 
    public int solution(int[] A) {
        int min = 1;
        Arrays.sort(A);
        for (int a : A) {
            if (a == min) {
                min = a + 1;
            } 
        }
        return min;
    } 

    public int solution_set(int[] A) {
        int min = 1;
        SortedSet<Integer> set = new TreeSet<>();
        for (int a : A) {
            set.add(a);
        }
        for (int a : set) {
            if (a == min) {
                min = a + 1;
            } 
        }
        return min;
    } 


}