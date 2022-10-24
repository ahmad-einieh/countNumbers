import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b =0;
        int c=0;
        do{
            System.out.print("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            if(temp>0){
                a++;
            }
            else if(temp<0){
                b++;
            }
            else{
                c++;
            }
            System.out.print("Do you want to continue? (y/n): ");
            Scanner sc1 = new Scanner(System.in);
            String temp1 = sc1.next();
            if (temp1.equals("n")){
                break;
            }else if(temp1.equals("y")){
                continue;
            }else {
                System.out.println("Invalid input");
            }
        }while (true);

        System.out.println("Positive numbers: "+a);
        System.out.println("Negative numbers: "+b);
        System.out.println("Zeroes: "+c);

    }
}