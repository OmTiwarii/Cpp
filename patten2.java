public class patten2 {
    public static void main (String args[] ){
     
        for(int i=10;i>=1;i+=2){
    
            for(int j=1;j<=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
