class SearchInRotatedSortedArr{
    public static int SearchRotateSortArr(int arr[],int target,int si,int ei){
        int mid=si+(ei-si)/2;
        if(arr[mid]==target) return mid;

        if(arr[si]<=arr[mid]){
             if(arr[si]<=target && target <=arr[mid]){
                return SearchRotateSortArr(arr, target, si, mid-1);
             }else{
                return SearchRotateSortArr(arr, target, mid+1, ei);
             }
        }else{
            if(arr[mid]<=target &&target <=arr[ei]){
                return SearchRotateSortArr(arr, target, mid+1, ei);
            }else{
                return SearchRotateSortArr(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(SearchRotateSortArr(arr,target,0,arr.length-1));
    }
}