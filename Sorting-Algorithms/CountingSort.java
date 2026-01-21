public class CountingSort {
    public static void CountingSortAlgo(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            while(count[i]>0){
                nums[idx]=i;
                idx++;
                count[i]--;
            }
        }
    }
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,0,1,0,4,5,1,7,19};
        CountingSortAlgo(nums);
        printArr(nums);
    }
}
