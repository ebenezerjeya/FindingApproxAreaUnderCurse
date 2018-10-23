public class TrapezoidalRule {
    public static void main(String[] args) {
        double a, b, totalSum, x, h;
        int n = 40;

        a = 1.0;
        b = 11.0;
        totalSum = 0.0;
        h = (b-a)/n;
        x = 1;
        for(int i = 0; i<=n ;i++){
            if(i == 0){
                x=a;
            }
            else{
                x = x+h;
            }

            if(x == a || x ==b){
                totalSum += (.5) * (1 +(x * x));
            }
            else {
                totalSum += (1 +(x * x));
            }

        }
        System.out.println("Approximate integral value = " + totalSum * h);
    }
}
