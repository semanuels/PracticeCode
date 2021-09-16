package Practice3;

public class WhileLoop {
    public static void main(String[] args){

        // will print numbers 1 to 10
        int num=1;

        while(num<=10){
            System.out.println(num);
            num++;
        }
    System.out.println("----------------------------------");

        // this will print even numbers between 1-20
        num=2; // start with odd number

        while(num<=20){
            System.out.println(num);
            num+=2; // same as mum=num+2
        }

        System.out.println("----------------------------------");

        // print 10 to 1

        num=10;

        while (num>=1){
            System.out.println(num);
            num--;
        }
    }
}
