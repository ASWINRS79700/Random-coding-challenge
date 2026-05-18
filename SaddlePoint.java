
class SaddlePoint {
    public int findSaddlePoint(int [][]mat) {
        int rows=mat.length;
        int cols=mat[0].length;

        for(int i=0;i<rows;i++){
            int col=0;   
            int minR=Integer.MAX_VALUE;
            for(int j=0;j<cols;j++){
                if(minR>mat[i][j]){
                    minR=mat[i][j];
                    col=j;
                }
            }
            boolean found=true;
            for(int j=0;j<rows;j++){
                if(minR<mat[j][col]){
                    found=false;
                    break;
                }
            }
            if(found){
                return minR;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        SaddlePoint sol = new SaddlePoint();
        int[][]max={
            {3, 1, 3},
            {3, 2, 4},
            {0, 0, 5}
        };
        System.out.println(sol.findSaddlePoint(max)); 
    }
}
