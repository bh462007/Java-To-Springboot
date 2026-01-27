class LongestSubarray{
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        int k=7;
        int j=0;
        int sum=0;
        int max=0;
        
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            while(sum > k){
                sum-=arr[j];
                j++;
            }
            max=Math.max(max, i-j+1);
            
        }
        System.out.println(max);

    }
}


// Process:

// 1. Move right → add element to sum

// 2. If sum > k:

//  - Move left forward

//  - Subtract elements until sum ≤ k

// 3. When sum ≤ k:

//  - Update maxLength

// That’s the entire algorithm.