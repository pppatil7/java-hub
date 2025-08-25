package leet;

public class PlusOneSolution {


    public int plusOne(int[] digits) {
        int power = digits.length - 1;
        int sum = 0;
        int powerSum = 0;
        for (int i = 0; i < digits.length; i++) {
            powerSum = (int) Math.pow(10, power);
            sum = sum + digits[i] * powerSum;
            power--;
        }

        if (sum % 10 == 0) {
            int[] result = new int[digits.length + 1];
        } else {
            int[] result1 = new int[digits.length];
        }
        return sum;
    }

    public static void main(String[] args) {
        PlusOneSolution solution = new PlusOneSolution();
        int[] digits = {1, 2, 3};
        int sum = solution.plusOne(digits);
        System.out.println(sum);
    }

}
