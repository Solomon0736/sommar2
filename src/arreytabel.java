public class arreytabel {
    // man kan skapa tabeler när man skapar areey   
        public static void main(String[] args) {
            int ferst[][] = {{1, 2, 3, 4, 5}, {5, 6, 7, 9}};
            int second[][] = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};

            System.out.println(" ferst arrey");
            display(ferst);


            System.out.println(" second arrey");
            display(second);
        }

            public static void display( int x [][]){
                for (int count=0; count<x.length;count++){
                    for (int counters=0; counters<x[count].length;counters++){
                    System.out.print(x[count][counters] +"\t");
            }
                System.out.println();
        }
    }
}