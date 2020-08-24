public class forloop{
    public static void main( String[] args) {
   // den skriver lista från 1 till 10
        /*for( int counter= 1; counter <= 10;counter++)
            System.out.println(counter  );*/

        for (int i = 0; i < 10; i++) {
            if (i < 5) {

                continue;
            }
            System.out.println(i);
        }
    }
    }
