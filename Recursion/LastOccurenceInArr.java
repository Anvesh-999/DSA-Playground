public class LastOccurenceInArr {
    public static int FisrtOccurence(int arr[],int key,int i){
        // if(i==0) return -1;
        //  if(arr[i]==key) return i;
        //  return FisrtOccurence(arr, key, i-1);
        if(i==arr.length) return -1;
        int isFound=FisrtOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5,5};
        System.out.println(FisrtOccurence(arr, 5, 0));
    }
}
