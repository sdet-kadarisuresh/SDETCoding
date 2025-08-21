package com.coding;

public class Stringrev {

    public static void main(String[] args) {
        String s = "Heelo world";

        char[] arr = s.toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // ✅ Correct way: build new String from char array
        String reversed = new String(arr);
        System.out.println("Reversed: " + reversed);
    }
}
