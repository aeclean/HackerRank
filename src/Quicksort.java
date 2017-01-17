package src;

class Quicksort {
    
    public static int[] list;


    public static void main(String[] args)
    {
        System.out.println("10, 40, 30, -67, 20, 32");

        list = new int[] {10, 40, 30, -67, 20, 32};

        quicksort(0, list.length-1);
        trace(list);
    }

    public static void quicksort(int start, int end) {
        int i = start, j = end;
        int pivot = list[start+(end-start)/2];
        System.out.println(pivot);

        while(i < j) {
            while(list[i] < pivot) {
                i++;
            }

            while(list[j] > pivot) {
                j--;
            }

            if(i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (start < j)
            quicksort(start, j);
        if (i < end)
            quicksort(i, end);

        System.out.println(pivot);
    }

    public static void exchange(int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    
    public static void trace(int[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}