import java.util.*;
public class hollowrhombus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // first printing spaces
        for(int i=1;i<=n;i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }

            // hollow rectangle
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
