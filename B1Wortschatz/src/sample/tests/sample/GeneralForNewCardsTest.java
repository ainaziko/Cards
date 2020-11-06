package sample;

import javafx.scene.control.TextArea;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralForNewCardsTest {

    @Test
    public void checkIfTheMethodWritesTheProperFile() {
        GeneralForNewCards g = new GeneralForNewCards("a1Words.txt");
        assertEquals("a1Words.txt", g.getFileName());
    }

    @Test
    public void checkIfTheMethodWritesTheProperFile2() {
        GeneralForNewCards g = new GeneralForNewCards("a2Words.txt");
        assertEquals("a2Words.txt", g.getFileName());
    }
    @Test
    public void checkIfTheMethodWritesTheProperFile3() {
        GeneralForNewCards g = new GeneralForNewCards("b1Words.txt");
        assertEquals("b1Words.txt", g.getFileName());
    }

    @Test
    public void wordInputTest() {
        GeneralForNewCards g = new GeneralForNewCards("a1Words.txt", "");
        assertEquals("Write some text here.", g.getWordInput());
    }

    @Test
    public void wordInputTest2(){
        GeneralForNewCards g = new GeneralForNewCards("a1Words.txt", " ");
        assertEquals("Write some text here.", g.getWordInput());
    }
}