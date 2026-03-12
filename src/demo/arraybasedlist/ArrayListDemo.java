package demo.arraybasedlist;

import java.util.*;

public class ArrayListDemo {
    static void main(String[] args) {
        // default capacity: 10
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(15);
        list.add("C--");
        // to achieve polymorphism - prefer super type
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        // remove <> - raw type, all ele are object type
        List ob = new ArrayList();
        var x = new ArrayList<Integer>();

        ArrayList<String> codeList = new ArrayList<>(Arrays.asList("java","html"));
        System.out.println(codeList);
        codeList.add("kotlin");
        codeList.add(3,"css");
        System.out.println(codeList.size());
        System.out.println(codeList.get(1));
        String old = codeList.set(0,"Java 25");
        System.out.println(old);
        System.out.println(codeList);
        var l1= new ArrayList<String>(Arrays.asList("js","ts"));
        codeList.addAll(l1);
        System.out.println(codeList);
        int b = codeList.indexOf("test");
        boolean b1 = codeList.contains("arr");
        System.out.println(b+" "+b1);
        String[] arr = codeList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        Collections.sort(codeList);
        System.out.println(codeList);
        Collections.sort(codeList, Collections.reverseOrder());
        System.out.println(codeList);

        int pos = Collections.binarySearch(codeList,"js");
        System.out.println(pos);

        pos = Collections.binarySearch(codeList,"css", Comparator.reverseOrder());
        System.out.println(pos);
    }
}
