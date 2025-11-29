/*Print all Armstrong numbers between 1 and 10,000.*/

public class Armstrong {
    public static void main(String[] args) {
        for (int num = 1; num <= 10000; num++) {
            int temp = num, sum = 0, digits = String.valueOf(num).length();

            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}
