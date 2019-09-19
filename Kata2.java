package uk.ac.wlv.cs5006.kata2;

public class Kata2 {
    
    public static double evaluate(String equation) {
        double sum = 0;

        try {
            String[] equationArray = equation.split(" ");
            if (equationArray.length != 5) {
                return sum;
            }
            double num1 = Double.parseDouble(equationArray[0]);
            double num2 = Double.parseDouble(equationArray[2]);
            double num3 = Double.parseDouble(equationArray[4]);


            if (!(num1 == 0 || num2 == 0 || num3 == 0)) {
                
                sum = calc(calc(num1, num2, equationArray[1]), num3, equationArray[3]);

            }

        } catch (NumberFormatException e) {

            System.out.println("ERROR : " + e);
        }

        return sum;
    }
    private static double calc(double num1, double num2, String operator) {
        double sum = num1;
        if (operator.equals("+")) {
            sum += num2;
        } else if (operator.equals("-")) {
            sum -= num2;
        } else if (operator.equals("*")) {
            sum *= num2;
        } else if (operator.equals("/")) {
            sum /= num2;
        } else {
            return 0;
        }
        return sum;
    }
}
