import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int freq[]= new int[7];

        for ( int rol=1 ; rol<100; rol++){
           ++freq[0+rand.nextInt(6)];
        }
        System.out.println(" valu\tindex");

        for ( int fre=1; fre<freq.length;fre++){
            System.out.println( fre+"\t "+freq[fre]);
        }

        }
}