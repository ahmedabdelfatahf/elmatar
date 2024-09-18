import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  scan =new Scanner(System.in);
        System.out.println(" enter the character you want to count it ");
char ch=scan.next().charAt(0);
scan.nextLine();
System.out.println(" enter the string ");
String value=scan.nextLine();
int counter =0;
  for (int i=0;i<value.length();i++) {
      if (ch == (value.charAt(i))) {
          counter++;
      }
  }
        System.out.println(" the numbers of  "+ ch +" is "+counter);
    }
}