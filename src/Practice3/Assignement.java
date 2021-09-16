package Practice3;

public class Assignement {
    public static void main (String[] args){

        // Write Java program to find a number is positive or negative
        int num1=13;
        int num2=-3;

        if(num1>=0){
            System.out.println("The number " +num1+ " is positive number.");
            }
        else{
            System.out.println("The number " +num1+ " is negative number.");
        }

        if(num2<=0){
            System.out.println("The number " +num2+ " is negative number.");
        }
        else{
            System.out.println("The number " +num2+ " is positive number.");
        }

        System.out.println("---------------------------------------------------");

        // Write Java program fo find a greatest of 3 numbers
        int numa=9;
        int numb=432;
        int numc=123;

        if(numa>numb && numa>numc) {
            System.out.println(numa);
        }

         else if(numb>numc){
            System.out.println(numb);
        }
        else{
            System.out.println(numc);
        }
        System.out.println("---------------------------------------------------");

        //Write Java program that display multiplication table of 5
        int num=5;

        for(int i=0; i<=10; i++){
            System.out.println(num+ " * " +i+ " = " +num*i );
        }

    }
}
