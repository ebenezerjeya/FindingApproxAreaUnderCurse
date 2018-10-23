public class RectangleMethod {
    public static void main(String[] args)
    {

        double a, b, w, totalSum, uSum, lSum, x,y;
        int i, n;

         //Initialize input values
        a = 1.0;
        b = 11.0;
        n = 40;

        uSum = 0.0;
        lSum = 0.0;
        //algorithm
        w = (b-a)/n;  //delta x

        totalSum = 0.0;

        for (i = 1; i<=n ;i++){
            x = a + (i-1)*w;
            y = 1 + (x*x);
            uSum += w * y;
        }

        for (i = 2; i<=n+1 ;i++){
            x = a + (i-1)*w;
            y = 1 + (x*x);
            lSum += w * y;
        }

        totalSum = (uSum + lSum) / 2;

      /*  //midpoint
        for ( i = 1; i < n; i++ )
        {
            x = a + (i-1)*w;
            totalSum = totalSum + (w * (1 + (x * x)) );
        }
*/
        System.out.println("Approximate integral value = " + totalSum);
    }
}
