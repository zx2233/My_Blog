import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author @chnxy_xrabbit
 * @date 2018/8/27 16:57
 */
public class RecursiveSpiral {
    /***
     *
     */
    /**递归方式
     * 螺旋方式访问二维数组，返回结果集合
     */
     static List<Integer>  result = new ArrayList<Integer>();
    public void spiralOrder(int[][] matrix,int m,int n,int beginX, int endX,int beginY,int endY) {
        if(m==1){
            for (int j = beginX; j <= endX; j++) {
                result.add(matrix[beginY][j]);
            }
        }
        if(endY==0)
            return;
            // 从左上到右上
            for (int j = beginX; j <= endX; j++) {
                result.add(matrix[beginY][j]);
            }
            beginY++;
        if(beginY>endY)
            return;
            // 从右上到右下
            for (int i = beginY; i <= endY; i++) {
                result.add(matrix[i][endX]);
            }
            endX--;
            // 从右下到左下
            for (int j = endX; j >= beginX; j--) {
                result.add(matrix[endY][j]);
            }
            endY--;
            // 从左下到左上
            for (int i = endY; i >= beginY; i--) {
                result.add(matrix[i][beginX]);
            }
            beginX++;
        spiralOrder( matrix, m, n, beginX,  endX, beginY, endY) ;
        }
        //sss
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] matrix=new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int m = matrix.length;
        int n = matrix[0].length;
        RecursiveSpiral p=new RecursiveSpiral();
        int beginX, endX, beginY, endY;
        beginX = 0;
        endX = n - 1;
        beginY = 0;
        endY = m - 1;
        p.spiralOrder( matrix, m, n, beginX,  endX, beginY, endY) ;
            System.out.println(result.toString());

    }
}
