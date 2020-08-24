public class arrey {
    public static void main(String[] args) {
       /* System.out.println("index\tvalue");
        int valu[]= { 22,23,24,25,26};
        for( int count= 0; count< valu.length;count++){
            System.out.println(count+  "\t   " + valu[count] );
        }*/
       // den räknar summa på alla numret
        int number[] = {23, 24, 20, 21};
        int sum=0;

        for ( int count=0; count<number.length;count++){
            sum+=number[count];

        }
        System.out.println(" the result is " + sum);


    }
}