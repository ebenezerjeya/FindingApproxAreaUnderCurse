public class SimpsonsRule {
    public static void main(String[] args) {
        double a, b, totalSum, x, h, w;
        int n = 40;

        a = 1.0;
        b = 11.0;
        totalSum = 0.0;
        h = ((b-a)/n)/3;
        w = (b-a)/n;
        x = 1;
        for(int i = 0; i<=n ;i++){
            if(i == 0){
                x=a;
            }
            else{
                x = x+w;
            }

            if(x == a || x ==b){
                totalSum += (1 +(x * x));
            }
            else {
                if(i%2 != 0){
                    totalSum += 4 * (1 +(x * x));
                }
                if(i%2 == 0){
                    totalSum += 2 * (1 +(x * x));
                }
            }

        }
        System.out.println("Approximate integral value = " + totalSum * h);
    }
}
