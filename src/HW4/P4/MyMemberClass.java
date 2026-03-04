package HW4.P4;

public class MyMemberClass {
    private String s = "outer";
    private int x = 20;
    private MyMemberInner ob;

    public MyMemberClass() {
        ob = new MyMemberInner();
        ob.display();
    }

    public class MyMemberInner {
        private String s = "inner";
        private int num=100;
        public void display(){
            System.out.println(s);
            System.out.println(MyMemberClass.this.s);
            System.out.println(num);
        }
    }

    static String st= "Static Class";
    static class StClass{
        static String st1 = "Static Class 1";
        static void st2(){
            System.out.println(st);
            System.out.println(st1);
//            System.out.println(x);
        }
    }
}
