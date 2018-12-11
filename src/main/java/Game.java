import java.util.List;

public class Game {
    private final Board board;
    private List<Player> players;
    private int iteration;

    public int getTurn() {
        return turn;
    }

    private int turn;


    public Game(Board aBoard, List<Player> players) {
        this.board = aBoard;
        this.players = players;
        this.turn = 0;
        this.iteration = 0;
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
       return players;
    }

    public void start() {
        while(this.iteration < 9){
            Player activePlayer = players.get(this.turn);
            activePlayer.play(board);
            if(board.validateWinner()){
                System.out.println("WE HAVE A WINNER"+ activePlayer);
                break;
            }
            else{
                assignTurn();
                iteration++;
                continue;
            }

        }
        System.out.println("GAME ENDS");

    }

    public void assignTurn() {
        this.turn =  this.turn == 1 ? 0 : 1 ;

    }

}
