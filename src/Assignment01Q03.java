public class Assignment01Q03 {
    public static void main(String[] args) {
        String strNum = args[0];
        int x = Integer.parseInt(strNum);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////

        int[] fibb = new int[x]; // building the fibb sequence
        fibb[0] = 1;
        fibb[1] = 1;
        for (int i = 2; i < x ; i++){
            int fibbNum = fibb[i-1] + fibb[i-2];
            fibb[i] = fibbNum;
        }

        /////////////////////////

        int numOdd = 0;
        outerLoop : for (int i = 0; i < x; i++) {
            System.out.print(fibb[i]); // print fibb numbers
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space

            for (int currDiv = 2; currDiv < fibb[i]; currDiv++) { // checking for dividers
                if (fibb[i] % currDiv == 0) {
                    continue outerLoop;
                }
            }
            numOdd +=1 ; // if no dividers - odd
            }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
