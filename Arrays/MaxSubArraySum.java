class MaxSubArraySum{
    public static int MaxSubArrSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int st=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=st;k<=end;k++){
                    currSum +=arr[k];
                }
                if(currSum>maxSum) maxSum=currSum;
            }
        }
    return maxSum;
    }
    public static int PrefixSumMethod(int arr[]){
        int prefix[]=new int [arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int maxSum=prefix[0];
        int minPrefix=0;
        for(int i=0;i<prefix.length;i++){
            maxSum=Math.max(maxSum,prefix[i]-minPrefix);
            minPrefix=Math.min(minPrefix,prefix[i]);
        }
        return maxSum;
    }
    public static int kadanesAlgoMethod(int arr[]){
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(currSum+arr[i],arr[i]);
            maxSum=Math.max(maxSum,currSum);
        }
    return maxSum;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        System.out.println("Maximum SubArray sum is : "+kadanesAlgoMethod(arr));
    }
}