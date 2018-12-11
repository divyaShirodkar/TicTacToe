import java.util.Scanner;

public class GameConsoleReader implements GameInputReader {
    @Override
    public void input(Board board, Symbol symbol) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter input (Symbol->(xcoordinate, ycoordinate)");
//        String input = in.next();
//        assignToBoard(board, symbol);
    }
    //TODO process and validate
    public void assignToBoard(Board board, Symbol symbol){
        board.coordinateMap.put(new Coordinate(0,1), symbol);
    }
}
