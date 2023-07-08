class Solution
{
    public void  Mutliply(int[][] matrixA, int[][] matrixB)
    {
        int result[][]=new int[matrixA.length][matrixA[0].length];
        
        for(int i=0;i<matrixA.length;i++){
             for(int j=0;j<matrixA[i].length;j++){
                   for(int k=0;k<matrixB.length;k++){
                       result[i][j]+= matrixA[i][k]*matrixB[k][j] ;
                   }
             }
        }
                for(int i=0;i<matrixA.length;i++){
                    for(int j=0;j<matrixA[i].length;j++){
                        matrixA[i][j]=result[i][j];
                    }
                }
                return;
    }
}
