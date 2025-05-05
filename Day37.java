// Rotate Matrix by 90 degrees
// Time Complexity :> O(n^2)
class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n = mat.length;
        int[][] res = new int[n][n];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[n-j-1][i] = mat[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = res[i][j];
            }
        }
    }
}
