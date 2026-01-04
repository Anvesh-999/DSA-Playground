class LinearSearch{
    public static int Linear(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }  
        }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(Linear(arr, 30)); // Output: 2
        System.out.println(Linear(arr, 60)); // Output: -1
    }
}
