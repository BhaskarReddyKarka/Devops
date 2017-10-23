import java.text.NumberFormat;
import java.util.Scanner;


public class ConverNumberstoWordMain {

    public static void main(final String[] args) {

        ConvertNumberstoWord cntw=new ConvertNumberstoWord();
        String choice = "";
        int n;
         Scanner s =new Scanner(System.in);
            
         while (choice != "0"){
             System.out.println("");
             System.out.println("Enter number between 0-999 to convert into word");
             System.out.println("  (0) Exit");
             n =s.nextInt();
             choice=Integer.toString(n);
             
             if (choice.equals("0")) {
                 System.out.println("Exit");
                 break;
             }else if (n > 1000 || n < 0){
                 System.out.println("Invalid Number Only Enter number between 0-999");
             }
                            
             else System.out.println(NumberFormat.getInstance().format(n) + "='" + cntw.convert(n) + "'");

             
         }
     
     }

}
