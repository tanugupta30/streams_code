package org.example;

public class Main {
    public static int[] searchRange(final int[] A, int B) {
        int s = 0;
        int e = A.length - 1;
        int si = -1; // Start index
        int ei = -1; // End index

        while (s <= e) {
            // Check from the start of the array
            if (A[s] == B && si == -1) {
                si = s; // Set the first occurrence of B
            }

            // Check from the end of the array
            if (A[e] == B && ei == -1) {
                ei = e;
                e=A.length-1;// Set the last occurrence of B
            }

            // If both indices are found, exit early
            if (si != -1 && ei != -1) {
                break;
            }

            s++;
            e--;
        }


        // Return the found indices
        return new int[]{si, ei};
    }

    public static void main(String[] args) {

        int[] A= {5,7,7,8,8,10};
        int B=8;
        System.out.println(searchRange(A, B));

    }
}