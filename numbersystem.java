import java.util.Scanner;

public class numbersystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pw = 1;
        int ans = 0;
        while (n > 0) {
            int unitdigit = n % 10;
            ans += unitdigit * pw;
            n /= 10;
            pw *= 2;

        }
        System.out.println(ans);

    }
}
