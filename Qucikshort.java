public class Qucikshort {
    static void merge(int a[], int l, int m, int r) {
        int i=l, j=m+1, k=0, temp[]=new int[r-l+1];
        while(i<=m && j<=r) temp[k++] = (a[i]<=a[j])?a[i++]:a[j++];
        while(i<=m) temp[k++]=a[i++];
        while(j<=r) temp[k++]=a[j++];
        for(i=0;i<temp.length;i++) a[l+i]=temp[i];
    }

    static void sort(int a[], int l, int r) {
        if(l>=r) return;
        int m=(l+r)/2;
        sort(a,l,m); sort(a,m+1,r);
        merge(a,l,m,r);
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        sort(arr,0,arr.length-1);
        for(int x:arr) System.out.print(x+" ");
    }
}
