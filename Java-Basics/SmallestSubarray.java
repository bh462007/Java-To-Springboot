class SmallestSubarray{
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        int k=7;
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];

            while(sum >= k){
                min=Math.min(min, right-left+1);
                sum-=arr[left];
                left++;
                
            }
            
        }
        System.out.println(min);
    }
}