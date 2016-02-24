
public class MyCalc {
    private static int L = 4;
     static int k=0;

    public static double calcPi(int n) {
      double res=0;
for (k = 0; k <= n; k++) {
   res += L * (Math.pow(-1, k)) / (2 * k + 1);     }
return  res;}}
