/**
 * @author @chnxy_xrabbit
 * @date 2018/8/20 15:12
 */
public class Test {
    //  二分递归
    public static String r1(String s){
        int length = s.length();
        if(length <= 1){
            return s;
        }
        System.out.println(length/2);
        String left = s.substring(0, length/2);
        System.out.println(left+"---left");
        String right = s.substring(length/2, length);
        System.out.println(right+"---right");
       String A=r1(right)+r1(left);
        System.out.println(A+"123");
        return A;
    }
    public static void main(String[] args) {
       /* String s="qw er12et";
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        System.out.println(reverse);*/
        /**********************/
      /*  StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse().toString());*/
        /**********************/
        System.out.println(Test.r1("ab cd1"));
    }
}
