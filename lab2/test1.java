import java.util.Scanner;

public class test {

    public static void main(String[] args){
        // Task 01
        int score = Integer.parseInt(args[0]);
        if (score >= 17) {
            System.out.print("Excellent");
        } else {
            if (score >= 15) {
                System.out.print("Très bien");
            } else {
                if (score >= 13) {
                    System.out.print("Bien");
                } else {
                    if (score >= 10) {
                        System.out.print("Satisfaisant ");
                    } else {
                        if (score >= 8) {
                            System.out.print("Suffisant");
                        } else {
                            if (score >= 5) {
                                System.out.print("Médiocre");
                            } else {
                                System.out.print("Insuffisant");
                            }
                        }
                    }
                }
            }
        }

    }
}