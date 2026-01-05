class TrapingRainWater{
    public static int trap(int[] height) {
        int n=height.length;
        if(n<=2) return 0;
        int []leftMax=new int[n];
        int []rightMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trapWtr=0;
        for(int i=0;i<n;i++){
            int  waterLvl=Math.min(leftMax[i],rightMax[i]);
            trapWtr += waterLvl-height[i];
        }
    return trapWtr;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}