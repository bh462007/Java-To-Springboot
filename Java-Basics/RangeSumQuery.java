class RangeSumQuery{
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        int[] prefix = arr;

        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("Prefix sum:");
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }

        int L=1,R=3;
        int sum=0;

        if(prefix[L]==0){
            sum=prefix[R];
        }
        else{
            sum=prefix[R] - prefix[L-1];
        }
        System.out.println("Sum: "+sum);
    }
}