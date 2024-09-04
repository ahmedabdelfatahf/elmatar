import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int number =scan.nextInt();
        Random random=new Random();
        int randValue= random.nextInt(1,7);
        getMonthName(number);
        System.out.println(randValue);
        getDayName(randValue);
    }
    public static void getMonthName(int number){
        switch (number){
            case 1:
                System.out.println("this month is January ");
                break;
            case 2:
                System.out.println("this month is February ");
                break;
            case 3:
                System.out.println("this month is March ");
                break;
            case 4:
                System.out.println("this month is April ");
                break;
            case 5:
                System.out.println("this month is May ");
                break;
            case 6:
                System.out.println("this month is June ");
                break;
            case 7:
                System.out.println("this month is July ");
                break;
            case 8:
                System.out.println("this month is August ");
                break;
            case 9:
                System.out.println("this month is September ");
                break;
            case 10:
                System.out.println("this month is October ");
                break;
            case 11:
                System.out.println("this month is November ");
                break;
            case 12:
                System.out.println("this month is December ");
                break;
            default:
                System.out.println("wrong month index ");
                break;
        }
    }
    public static void getDayName(int randValue){
        switch (randValue){
            case 1:
                System.out.println("this day is friday ");
                break;
            case 2:
                System.out.println("this day is saturday  ");
                break;
            case 3:
                System.out.println("this day is sunday  ");
                break;
            case 4:
                System.out.println("this day is monday");
                break;
            case 5:
                System.out.println("this day is tuesday ");
                break;
            case 6:
                System.out.println("this day is Wednesday  ");
                break;
            case 7:
                System.out.println("this day is Thursday ");
                break;
            default:
                System.out.println("wrong day index ");
                break;
        }
    }
}