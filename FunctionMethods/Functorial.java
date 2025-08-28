import java.util.Scanner;

public class Functorial {
    public static int factoial(int n){
      int fact = 1;
      for(int i = 1 ; i<=n;i++){
        fact = fact*i;
      }   
      return fact;  
   
    }
    public static int bioCofe(int n , int r){
        int fact_n = factoial(n);
        int fact_r = factoial(r);
        int fact_nmr = factoial(n-r);
        int bioCofe = fact_n / (fact_r * fact_nmr);
        return bioCofe;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number ");
        int n = sc.nextInt();
         System.out.print("enter the second number ");
        int r = sc.nextInt();
        int result = bioCofe(n , r);
        System.out.println("sum of biocofe =" + result);
       sc.close();
    }
}
