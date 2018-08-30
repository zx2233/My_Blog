/**
 * @author @chnxy_xrabbit
 * @date 2018/8/22 10:09
 */
class Outer {
    //private int num = 100;

    public void method() {
        final int num = 100;

        class Inner {
            public void show() {
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}

class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
