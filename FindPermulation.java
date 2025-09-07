public class FindPermulation {

public static void findPermualtation(String str,String ans){

if(str.length()==0){
    System.out.println(ans);
    return;
}
    for(int i = 0 ; i<str.length();i++){
        char curr = str.charAt(i);
       String Newstr = str.substring(0, i)+ str.substring(i+1);
        findPermualtation(Newstr, ans+curr);
    }
}

     public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String str = "abc";
        findPermualtation(str, "");

    }

}
