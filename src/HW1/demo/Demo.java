package HW1.demo;

import java.util.Arrays;

public class Demo {
    static void main() {
        Board board = new Board();
        Board board2 = new Board(2,3,"Black");
        Board board3 = new Board(3,3);
        Board board4 = new Board(4,3,"Orange");
//        board.display();
//        board2.display();
//        board3.display();
        Board[] boards = new Board[]{board,board2,board3,board4};
        IO.println(Arrays.toString(boards));
//        for (Board b : boards) {
//            IO.println(b.getArea());
//        }
        Board.getTotalArea(boards);

        IO.println("Average perimeter "+ averagePerimeter(boards));
    }

    private static double averagePerimeter(Board[] boards) {
        if (boards==null || boards.length==0) return 0;
        double sum = 0;
        for (Board board : boards) {
            sum += board.getPerimeter();
        }
        return sum/boards.length;
    }
}
