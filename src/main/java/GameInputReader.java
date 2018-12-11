public interface GameInputReader {
    Symbol symbol = null;
    Coordinate coordinate = null;
    public void input(Board board, Symbol symbol);
}
