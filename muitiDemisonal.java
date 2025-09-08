import java.util.ArrayList;

public class muitiDemisonal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);
        list.add(3);list.add(4);
        mainList.add(list);

         ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);list3.add(4);
        list3.add(6);list3.add(8);
        mainList.add(list3);


         ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(6);
        list2.add(9);list2.add(12);
        mainList.add(list2);
        
        for(int i = 0 ; i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);

    }
}
