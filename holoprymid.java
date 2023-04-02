import java.util.Scanner;

public class holoprymid {
    public static void main(String[] args) {
        // how to make holo pryamid
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==2*i-1){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}