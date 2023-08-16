
// Calculator:

import java.util.*;
public class conditionals{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operation = sc.next();
        
        int add= a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a%b;
        
        switch(operation){
            case "+":
            System.out.print(add);
            break;
            case "-":
            System.out.println(sub);
            break;
            case "*":
            System.out.println(mul);
            break;
            case "%":
            System.out.println(div);
            break;
            default:
            System.out.println("invalid operation");
            sc.close();
        }

    }
}