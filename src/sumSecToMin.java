import java.util.Scanner;

public class sumSecToMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = 1;

        int second = 1;

        int third = 1;
        while(true) {
            System.out.println("Racer one seconds: ");
            first = Integer.parseInt(scanner.nextLine());
            if(first < 51 && first > 0){
                break;
            }
            System.out.print("Try again! ");

        }
        while(true) {
            System.out.println("Racer two seconds: ");
            second = Integer.parseInt(scanner.nextLine());
            if(second < 51 && second > 0){
                break;
            }
            System.out.print("Try again! ");
        }
        while(true) {
            System.out.println("Racer three seconds: ");
            third = Integer.parseInt(scanner.nextLine());
            if(third < 51 && third > 0){
                break;
            }
            System.out.print("Try again! ");
        }

        int overallTime = first+second+third;
        int minutes = overallTime/60;
        int seconds = overallTime%60;
        System.out.println("Overall Time is: ");
        System.out.printf(minutes+":%02d",seconds);
    }
}
