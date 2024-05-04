import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = 0;
            int mx=Integer.MAX_VALUE;
            for (int i = 0; i+k <n ; i++) {
                if(mx>a[i+k]-a[i]){
                    mx=a[i+k]-a[i];
                    ans=(a[i+k]+a[i])/2;
                }
            }
            System.out.println(ans);
        }
    }
}
