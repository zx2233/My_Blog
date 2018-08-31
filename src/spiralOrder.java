import java.util.ArrayList;
import java.util.List;

/**
 * @author @chnxy_xrabbit
 * @date 2018/8/27 16:11
 */
public class spiralOrder {
    /*
     * 螺旋方式访问二维数组，返回结果集合
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int beginX, endX, beginY, endY;
        beginX = 0;
        endX = n - 1;
        beginY = 0;
        endY = m - 1;
        while (true) {
            // 从左上到右上
            for (int j = beginX; j <= endX; j++) {
                result.add(matrix[beginY][j]);
            }
            beginY++;
            if (beginY > endY)
                break;
            // 从右上到右下
            for (int i = beginY; i <= endY; i++) {
                result.add(matrix[i][endX]);
            }
            endX--;
            if (endX < beginX)
                break;

            // 从右下到左下
            for (int j = endX; j >= beginX; j--) {
                result.add(matrix[endY][j]);
            }
            endY--;
            if (endY < beginY)
                break;

            // 从左下到左上
            for (int i = endY; i >= beginY; i--) {
                result.add(matrix[i][beginX]);
            }
            beginX++;
            if (beginX > endX)
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] A={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(A);
        System.out.println(spiralOrder(A));
    }
}
