package Practice3;

public class JumpingStatements {
    public static void main(String[] args){

        for( int num=1;num<=10;num++){
            // stops when reached condition
            if(num==5){ // condition skips this value (5)
                break;
            }
            System.out.println(num);
        }
        System.out.println("-------------------------------------------");
        //continues when reached condition and continues afterwards
        for( int num=1;num<=10;num++) {

            if (num == 5) { // condition skips this value (5)
                continue;
            }
            System.out.println(num);
        }

        System.out.println("-------------------------------------------");
        // this way we can skip odd numbers
        for (int num=1; num<=10; num++){

            if (num==1 || num==3 || num==5 || num==7 || num==9){
                continue;
            }
            System.out.println(num);
        }
    }
}
