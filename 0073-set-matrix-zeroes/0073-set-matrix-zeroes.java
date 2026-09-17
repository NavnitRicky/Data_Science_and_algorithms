class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int row[]=new int[n];
        for(int i=0;i<n;i++){
            row[i]=-1;
        }
        int col[]=new int[m];
         for(int j=0;j<m;j++){
            col[j]=-1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(col[j]==0||row[i]==0){
                    mat[i][j]=0;
                }
            }
         }

    }
}