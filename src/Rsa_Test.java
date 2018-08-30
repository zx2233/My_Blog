import sun.misc.BASE64Decoder;

/**
 * @author @chnxy_xrabbit
 * @date 2018/8/21 14:37
 */
public class Rsa_Test {

    public static void main(String[] args)throws Exception {
        /*String A="123456";
        byte[] data=A.getBytes();
        byte[] encodeData=null;*/
        String a="SGVsbG8=";
        byte[] b=new BASE64Decoder().decodeBuffer(a);
        System.out.println(new String (b));

    }
}
