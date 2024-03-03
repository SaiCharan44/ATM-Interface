
import java.util.Scanner;
class A{
    float b=0;
    int p=3356;
    public void checkpin(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Your Pin: ");
    int p1=s.nextInt();
    if(p1==p){
        menu();
    }
    else{
        System.out.println("Incorrect Pin");
        checkpin();
    }
}
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        if(i==1){
            check();
        }
        else if(i==2){
            withdraw();
        }
        else if(i==3){
            deposit();
        }
        else if(i==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void check(){
        System.out.println("Balance: "+b);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter the amount: ");
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        if(a>b){
            System.out.println("Insufficient amount");
        }
        else{
            b=b-a;
            System.out.println("Withdraw Successful");
        }
        menu();
    }
    public void deposit(){
        System.out.println("Enter the amount: ");
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        b=b+a;
        System.out.println("Depoist Succssful");
        menu();

    }
}
public class ATM {
    public static void main(String[] args) {
        A a1=new A();
        a1.checkpin();
    }
}