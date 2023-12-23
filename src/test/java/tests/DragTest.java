package tests;

import org.testng.annotations.Test;

public class DragTest extends BaseMobileTest {


    @Test
    public void testDrag() throws InterruptedException {
        getDragScreen();
        dragScreen.toMoveNinthPiece().perform();
        dragScreen.toMoveFirstPiece().perform();
        dragScreen.toMoveSecondPiece().perform();
        dragScreen.toMoveThirdPiece().perform();
        dragScreen.toMoveFourthPiece().perform();
        dragScreen.toMoveFifthPiece().perform();
        dragScreen.toMoveSixthPiece().perform();
        dragScreen.toMoveSeventhPiece().perform();
        dragScreen.toMoveEighthPiece().perform();

    }


}
