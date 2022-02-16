public class array-alt{


    public static void fun(int[] arr){
        arr [2] = 30;
        arr [3] = 40;
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        arr [0] = 10;
        arr [1] = 20;
        arr [4] = 50;

        fun(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
