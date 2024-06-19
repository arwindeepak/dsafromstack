package HASING;

import java.util.*;
public class intersection {
    public static int[] Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        int count =0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                intersection.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        int result[] = new int[intersection.size()];
        int index = 0;
        for (int k = 0; k < result.length; k++) {
            result[index] = intersection[k];
        }
       

    }
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        Intersection(arr1, arr2);
   
    }
}
