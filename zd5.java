import java.util.Scanner;
public class zd5 {
    public static void main(String[] args){
        fifth_task();
    }
    public static void fifth_task(){
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 < num2 && num1 < num3) 
            System.out.println(num1);
        
        
        else if (num2 < num1 && num2 < num3)  
            System.out.println(num2);
        
    
        else  
            System.out.println(num3);
        
        

        
    }

}
    