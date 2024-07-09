import java.util.*;
public class diamondpattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // upper half
        for(int i=1; i<=n;i++){
            for(int j=1;j<=(n-i);j++){                  // spaces = n-i
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1);j++){               // no. of stars = odd = 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=n; i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
