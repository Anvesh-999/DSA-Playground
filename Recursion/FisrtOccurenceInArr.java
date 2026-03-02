public class FisrtOccurenceInArr {
    public static int FisrtOccurence(int arr[],int key,int i){
        if(i==arr.length) return -1;
         if(arr[i]==key) return i;
         return FisrtOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,8,9,5};
        System.out.println(FisrtOccurence(arr, 5, 0));
    }    
}
