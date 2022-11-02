import java.util.Scanner;
class multiply{
    public static void main(String[] args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the the value of a:");
        a = input.nextInt();
        System.out.println("Enter the the value of b:");
        b = input.nextInt();
        c=a*b;
        System.out .println("Result is " +c);
        input.close();
    }}