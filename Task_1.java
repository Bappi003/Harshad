public class HarshadChecker {
    public static boolean isHarshad(int n) {
        if (n <= 0) return false;
        
        int sum = 0;
        int temp = n;
        
        // Extract digits and sum them up
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        // Check if the original number is divisible by the sum
        return n % sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(18)); // true (18 % 9 == 0)
        System.out.println(isHarshad(19)); // false
    }
}


