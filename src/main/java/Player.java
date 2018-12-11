public class Player {
    private final Symbol symbol;

    private final String name;

    private GameInputReader inputReader;

    public Player(Symbol symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        this.inputReader = new GameConsoleReader();
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void play(Board board) {
        inputReader.input(board, this.symbol);
    }
}
