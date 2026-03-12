package demo.sort5;

public class Test {
    private int a=2;
    private static int b=3;
    Test(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("outer: ");
        System.out.println("outer: "+InnerClass.d);
    }

    private int method(){
        return 69;
    }

      class InnerClass{
        private int c =4;
        private static int d=5;
        InnerClass() throws Exception {
//            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c: "+c);
            System.out.println("d: "+d);
            if (c<0)
                throw new Exception();
        }

        public int method2(){
            return method()-2;
        }
    }

//    void main(String[] args) {
////        InnerClass test=new Test.InnerClass();
////        Test test=new Test();
//        System.out.println(InnerClass.d);
//    }
}
