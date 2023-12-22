package tests;

import org.testng.annotations.Test;

public class DragTest extends BaseMobileTest {


    @Test
    public void testDrag(){
        getDragScreen();
        dragScreen.toMoveFirstPiece().perform();
    }


}
