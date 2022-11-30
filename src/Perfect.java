public class Perfect {
        static void checkPerfectNumber(int n) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == n) {
                System.out.println(n);
            }
        }

        public static void main(String[] args) {

            System.out.println("perfect numbers : ");
            for (int i = 1; i < 1000; i++) {
                checkPerfectNumber(i);
            }
        }
    }

