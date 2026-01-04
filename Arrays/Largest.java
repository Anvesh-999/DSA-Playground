class Largest{
    public static int findLargest(int arr[]){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={10, 25, 5, 70, 45};
        System.out.println("The largest element is: " + findLargest(arr));
    }
}