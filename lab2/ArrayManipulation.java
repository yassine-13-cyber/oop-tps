public class ArrayManipulation {

    // Method to find the maximum and minimum values in the array
    public static void findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Print the reversed array
        System.out.print("Reversed Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method to calculate the average of the array elements
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return 0.0;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    // Method to count the number of even and odd numbers in the array
    public static void countEvenOdd(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};

        findMaxMin(arr);
        reverseArray(arr);
        System.out.println("Average: " + calculateAverage(arr));
        countEvenOdd(arr);
    }
}