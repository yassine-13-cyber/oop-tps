import java.util.Scanner;

public class test {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    System.out.print("first number :");
    int  num1 = scanner.nextInt();
    System.out.print("second number :");
    int  num2 = scanner.nextInt();
    System.out.print(" pleas specify an operation \n");
    System.out.println("1 ->- +");
    System.out.println("2 ->- -");
    System.out.println("3 ->- *");
    System.out.println("4 ->- /");
    int  op = scanner.nextInt();
    if (op ==1){
        System.out.print("result of "+num1+"+"+num2+" is "+ (num1+num2) +"\n");
    }else{
        if (op ==2){
            System.out.print("result of "+num1+"-"+num2+" is "+ (num1-num2)+"\n");
        }else{
            if (op ==3){
                System.out.print("result of "+num1+"*"+num2+" is "+(num1*num2)+"\n");
            }else{
                System.out.printf("result of "+num1+"/"+num2+" is "+(num1/num2) +"\n");
            }
        }
    }
}
}