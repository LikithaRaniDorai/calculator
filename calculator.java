import java.util.*;

class Calculator{
    public static void main(String[] args){
        System.out.println("enter the operation number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch( n ){

            case 1:
            System.out.println(a+b);
            break;
            case 2: 
            System.out.println(a-b);
            break;   
            case 3 : 
            System.out.println(a*b);
                break; 
            case 4 : 
            System.out.println(a/b);
                break;    

        }
    }
}

