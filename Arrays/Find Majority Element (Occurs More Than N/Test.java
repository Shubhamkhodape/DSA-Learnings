
// Problem Statement: Given an integer array nums of size n, return the majority element of the array.
//The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

public class Test {

    // Function to find majority element
    public static int findMajorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {     
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        int result = findMajorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
        }
    }
}