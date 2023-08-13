import java.util.Scanner;

public class MultiplicationTableOfAnyNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        System.out.println("TABLE : ");
        for(int y = 1; y<=10;y++){
            System.out.println(x + " * " + y + " = " + x*y);
        }

    }

}
