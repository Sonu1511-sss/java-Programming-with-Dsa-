public class SubString {
    

public static String toSubString(String str , int si , int se){
    String subStr = "";
    for(int i = si; i<se;i++){
        subStr += str.charAt(i);
    }
    return subStr;

}
    public static void main(String[] args) {
        String str = "Shubham uprade";
        // System.out.println(toSubString(str, 0, 6));
        System.out.println(str.substring(0,7));
    }
}
