import java.util.Scanner;
public class lab3 {
    // Method to calculate 5^n
    public static int The_power_of_5(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) { // Loop should run n times
            sum *= 5;
        }
        return sum;
    }
    static int productMsum(int a, int b) {
        return a * b - (a + b);
    }

    static int productOf3(int[] arr) {
        return arr[0] * arr[1] * arr[2];
    }
    public static String[] table = { "Courtois", "Dani", "Alaba", "Nacho", "Fran", "Mbappe", "Bellingham", "Rodrygo",
            "Vinicius" };
    
    static int[] tshirtNumbers ={1,2,4,6,20,9,5,11,7};

    static String getPlayerName(int tshirtNumber) {
        for (int i = 0; i < tshirtNumbers.length; i++) {
            if (tshirtNumbers[i] == tshirtNumber) {
                return table[i];
            }
        }
        return "Player not found"; // Return this if the T-shirt number is not found
    }
     static boolean endsWithSuffix(String email) {
        // Define the suffix as a character array
        char[] suffix = {'@', 'e', 's', 'i', '-', 's', 'b', 'a', '.', 'd', 'z'};
        int suffixLength = suffix.length;

        // Check if the email is shorter than the suffix
        if (email.length() < suffixLength) {
            return false;
        }

        // Compare the suffix with the end of the email
        for (int i = 0; i < suffixLength; i++) {
            if (email.charAt(email.length() - suffixLength + i) != suffix[i]) {
                return false; // Mismatch found
            }
        }

        return true; // Suffix matches
    }
    static String reverseString(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
    static String recRev(String str) {

        if (str.length() == 0) {
            return "";
        } else {
            return str.charAt(str.length() - 1) + recRev(str.substring(0, str.length() - 1));
        }
    }
    
    // static char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, };
    
    // static void show() {
    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             System.out.print(board[i][j]+" | ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static int get_cell_column(char cellNumber) {
    //     int value = (int) (cellNumber) - 48;
    //     if (value < 0 || value > 9) {
    //         System.out.println("please enter a correct cell number");
    //         return -1;
    //     }
    //     return value % 3 == 0 ? 2 : (value % 3) - 1;
    // }

    // static int get_cell_row(char cellNumber) {
    //     int value = (int) (cellNumber) - 48;
    //     if (value < 0 || value > 9) {
    //         System.out.println("please enter a correct cell number");
    //         return -1;
    //     }
    //     return value % 3 == 0 ? value / 3 - 1 : value / 3;
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "asd@esi-sba.dz";
        if (endsWithSuffix(email)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        scanner.close();
    }
}