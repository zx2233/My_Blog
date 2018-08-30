/**
 * @author @chnxy_xrabbit
 * @date 2018/8/20 17:11
 */
public class StringRotation {
    public static String rotateString(String A, int n, int p) {
        // write code here
        String left=A.substring(0,p+1);
        String right=A.substring(p+1);
        left = new StringBuffer(left).reverse().toString();
        right = new StringBuffer(right).reverse().toString();
        A=left+right;
        A=new StringBuffer(A).reverse().toString();
        return A;
    }

    public static void main(String[] args) {
        String A="ABCDEFGH";
       System.out.println(rotateString(A,8,4));
    }
}