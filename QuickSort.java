package Sort;

/**
 * 快速排序伪代码（分治思想）《算法导论p95-97》
 * QUICKSORT(A,p,r)
 * if p<r
 * {
 *    q=Partition(A,p,r)
 *    QUICKSORT(A,p,q-1)
 *    QUICKSORT(A,q+!,r)
 *    }
 */

public class QuickSort {

    public static void main(String[] args){
        //int [] list={0,2,8,7,1,3,5,6,4};
        //int [] list={0,12,98,7,1,3,5,6,4,55,66,45,67};
        int [] list={13,20,16,23,18,7,12,5,22,15,7};
        printArray(list);
        int [] list2=QuickSort(list,0,10);
        printArray(list2);


    }

    public static int[] QuickSort(int[] list,int p,int r){
        if(p<r) {
            int q = Partition(list, p, r);
            QuickSort(list, p, q - 1);
            QuickSort(list, q + 1, r);
        }
        return list;
    }

    public static int Partition(int []list,int p,int r){
        int x=list[r];
        int i=(p-1);
        for(int j=p;j<=r-1;j++)
        {
            if(list[j]<=x) {
                i = i + 1;
                int temp ;
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }
        int temp1 ;
        temp1= list[r];
        list[r] = list[i+1];
        list[i+1] = temp1;
       return i+1;
    }

    public static void printArray(int[] list){

        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+"----");
        }
        System.out.print("\n");
    }
}
