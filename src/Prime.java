public class Prime {
    static boolean checkPrime(int n){
        boolean prime=true;

        for (int i=2;i<n;i++){
            if (n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        System.out.println("Prime Numbers are : ");
        for (int i=2;i<50;i++){
            boolean isPrime=checkPrime(i);
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}