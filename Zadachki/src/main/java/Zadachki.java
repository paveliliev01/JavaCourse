import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Zadachki {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.println(j+"*"+i +" = " + j*i +" ");

            }
            System.out.print(" ");


        }
    }
}
