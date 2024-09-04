import java.lang.reflect.Array;
public class Main {
    public static void main(String[] args) {
        int []numbers={1,1,1,1};
        boolean flagEqual =false;
        boolean flagNotEqual =false;
        for (int i=0;i<numbers.length-1;i++){
            for (int j=i+1;j<numbers.length;j++){
             if (numbers[i]==numbers[j]){
                 flagEqual=true;
             }
             else  {
                 flagNotEqual=true;
             }
            }
        }
        if (flagEqual && !flagNotEqual){
            System.out.println("All numbers are equal");
        }
        else if (flagNotEqual && !flagEqual){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal nor different");
        }
    }
}