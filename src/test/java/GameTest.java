import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    @Test
    public void shouldHaveBoard(){
        //given
        Board aBoard = new Board();
        Game aGame = new Game(aBoard, null);
        //when
        Board boardInAGame = aGame.getBoard();
        //then
        Assert.assertNotNull(boardInAGame);
    }

    @Test
    public void shouldHaveTwoPlayers(){

        //given
        Board aBoard = new Board();
        Player player1 = new Player(Symbol.X, "A");
        Player player2 = new Player(Symbol.O, "B");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Game aGame = new Game(aBoard,players);
        //when
        List<Player> playersInAGame = aGame.getPlayers();
        //then
        Assert.assertEquals(2,playersInAGame.size());

    }

    @Test
    public void gameShouldStart(){
        //given
        Board aBoard = new Board();
        Player player1 = new Player(Symbol.X, "A");
        Player player2 = new Player(Symbol.O, "B");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Game aGame = new Game(aBoard,players);
        //when
        aGame.start();
        Board board = aGame.getBoard();
        //then
        Assert.assertEquals(aBoard,board);
    }

    @Test
    public void gameShouldGiveTurns(){
        //given
        Player player1 = new Player(Symbol.X, "A");
        Player player2 = new Player(Symbol.O, "B");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Game aGame = new Game(null,players);
        //when
        aGame.assignTurn();

        Assert.assertEquals(1,aGame.getTurn());

    }



}
