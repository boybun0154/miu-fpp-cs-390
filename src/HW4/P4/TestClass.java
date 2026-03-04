package HW4.P4;

public class TestClass {
    static void main(String[] args) {
//        MyMemberClass obj = new MyMemberClass();
        MyMemberClass.MyMemberInner inner = new MyMemberClass().new MyMemberInner();
        inner.display();
        MyMemberClass.StClass stClass = new MyMemberClass.StClass();
    }
}
