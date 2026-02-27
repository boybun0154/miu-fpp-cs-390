package HW1.P3;

import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {
        String[] input = new String[]{"dog","horse","cat","dog","squirrel","horse","fish"};
//        List<String> output = new ArrayList<>(Arrays.asList(input));
//        for (int i = 0; i < output.size(); i++) {
//            for (int j = i + 1; j < output.size(); j++) {
//                if (output.get(i).equals(output.get(j))) {
//                    output.remove(j);
//                }
//            }
//        }
        String[] output = new String[input.length];
        int idx = 0;
        for (int i = 0; i < input.length; i++) {
            boolean flag = false;
            for (int j = 0; j <= idx; j++) {
                if (input[i].equals(output[j])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                output[idx] = input[i];
                idx++;
            }
        }
        output = Arrays.copyOf(output,idx);
        System.out.println(Arrays.toString(output));
    }
}
