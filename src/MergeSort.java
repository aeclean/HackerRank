package src;

class MergeSort {
    
    public static int[] list;
    public static int[] helper;

    public static void main(String[] args)
    {
        System.out.println("10, 40, 30, -67, 20, 32");

        list = new int[] {40, 10, 30, -67, 20, 32};
        helper = new int[list.length];

        mergesort(0, list.length-1);
        trace(list);
    }
    
    public static void mergesort(int start, int end) {
        if (start < end) {
            int middle = start+(end-start)/2;

            mergesort(start, middle);
            mergesort(middle+1, end);

            merge(start, middle, end);
        }
    }
    
    public static void merge(int start, int middle, int end) {
        for(int i = start; i <= end; i++) {
            helper[i] = list[i];
        }
        
        int i = start;
        int j = middle+1;
        int k = start;

        while(i <= middle && j <= end) {
            if(helper[i] <= helper[j]) {
                list[k] = helper[i];
                i++;
            } else {
                list[k] = helper[j];
                j++;
            }
            k++;
        }

        while(i <= middle) {
            list[k] = helper[i];
            k++;
            i++;
        }
    }
    
    public static void trace(int[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}