//good problm
import java.util.Scanner;
public class cal_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operation");
        //sc.nextLine();// addition of new line
        //char c = sc.nextLine();
        //to take ip as char , first take as string then convert to char
        char c=sc.nextLine().charAt(0);
        switch (c){
            case '+': System.out.println("Addition is"+(a+b));
            break;
            case '-':  System.out.println("substraction is"+(a-b));
            break;
            case '*': System.out.println("Multiplication is"+(a*b));
            break;
            case '/': System.out.println("division is "+(a/b));
            break
            case   
            break;
            default: System.out.println("inout invaild");

        }
        sc.close();
        

    }
    
    
}
