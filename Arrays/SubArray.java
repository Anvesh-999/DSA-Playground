public class SubArray {
    public static void printSubArray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int st=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                for(int k=st;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays :"+ts);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,5,20,19};
        printSubArray(arr);
    }
}
