import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void shouldHaveASymbol(){
        //given
        Player aPlayer = new Player(Symbol.X, "A");
        //when
        Symbol symbolAssociated = aPlayer.getSymbol();
        //then
        Assert.assertEquals(Symbol.X,symbolAssociated);
    }

    @Test
    public void playerShouldPlay(){
        GameInputReader gameInputReader = new GameConsoleReader();
        Player aPlayer = new Player(Symbol.X, "A");
        Board board = new Board();
        aPlayer.play(board);
        //Assert.assertEquals();

    }

}