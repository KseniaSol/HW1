public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        String numStr = args[0];
        int num = Integer.parseInt(numStr);
        double div = 1;
        for (int i = 0 ; i < num; i++ ) {
            double exp = Math.pow(-1,i);
            approxPi += (1/div)*exp;
            div += 2;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
