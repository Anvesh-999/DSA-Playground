package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,10,20,30,50};
        System.out.println("Target found at index : "+binarySearch(arr,20));
    }
}
