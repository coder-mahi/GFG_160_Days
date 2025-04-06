class Day4 {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        //reversal algorithm
        int n = arr.length;
        
        d = d%n;
        if(arr.length==0 || d>n){
            return;
        }
        
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    static void reverse(int[] arr,int a,int b){
        int left = a;
        int right = b;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}
