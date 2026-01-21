class RotateLeft{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int last=arr[0];
        for (int i = 1; i < arr.length-2; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=last;
        System.out.println("After rotating one element to left:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}