public class Flodypyramid {
   
    public static void main(String[] args) {
        int n =5 ;
        int counter = 1;
        for(int i = 0 ; i<=n;i++){
            for(int j = 1 ; j<=i+1;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}

