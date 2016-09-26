
package challenge.pkg13;
import java.util.Scanner;

public class Challenge13 {

    
    public static void main(String[] args) {
        boolean answer = true;
        while(answer=true){
    
        System.out.println("Type a number: ");
        Scanner sc = new Scanner (System. in);
        String input1 = sc.nextLine ();
        int num1 = Integer.parseInt (input1);
       
        
        System.out.println("Type another number: ");
        String input2 = sc.nextLine ();
        int num2 = Integer.parseInt (input2);
        
        System.out.println("The sum of your two numbers is: " + (num1*num2));
        
        if (input1=="Stop"){  
        break;
        }
        if (input2=="Stop"){
            break;
        }
    }
    }
    
}

    
    
    // get input 1 (strings)
    // if input1 == stop
        // break
    // get input 2
    // if input2 == stop
        // break
    //else
        // int num1 = Integer.parseInt(input1);
    
    
    
    // num1 * num2
    
    
    