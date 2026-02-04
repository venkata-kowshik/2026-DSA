class ArrayExample1{
    public static void main(String args[]) {

        int arr[] = {12, 12, 3, 34, 23, 34, 54, 45, 67, 78, 56, 21, 3, 1, 22, 34};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
             System.out.println(" index"+ " "+i+" "+arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
        }

    }
 System.out.println(" max value"+max);
         System.out.println("min value"+min);
         
    }
}
