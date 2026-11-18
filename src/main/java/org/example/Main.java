import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int mark1,mark2,mark3;
        System.out.println("Enter Three Subjects marks:");
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
        int avg=(mark1+mark2+mark3)/3;
        if(avg>=90){
            System.out.println("Grade:A");
        }
        else if(avg>=80){
            System.out.println("Grade:B");
        }
        else if(avg>=60){
            System.out.println("Grade:C");
        }
        else{
            System.out.println("Grade:D");
        }
        sc.close();
    }
}
