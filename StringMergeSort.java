public class StringMergeSort {
    static void merge(String a[], int l, int m, int r) {
        int i=l, j=m+1, k=0; 
        String temp[]=new String[r-l+1];
        while(i<=m && j<=r) temp[k++]=a[i].compareTo(a[j])<=0?a[i++]:a[j++];
        while(i<=m) temp[k++]=a[i++];
        while(j<=r) temp[k++]=a[j++];
        for(i=0;i<temp.length;i++) a[l+i]=temp[i];
    }

    static void sort(String a[], int l, int r) {
        if(l>=r) return;
        int m=(l+r)/2;
        sort(a,l,m); sort(a,m+1,r); merge(a,l,m,r);
    }

    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        sort(arr,0,arr.length-1);
        for(String s:arr) System.out.print(s+" ");
    }
}
