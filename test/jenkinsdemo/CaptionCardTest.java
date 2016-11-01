package jenkinsdemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for the CaptionCard class.
 * @author Jonathan Molina
 */
public class CaptionCardTest
{

    /**
     * Test of getCaption method, of class CaptionCard.
     */
    @Test
    public void testGetCaption()
    {
        CaptionCard instance = new CaptionCard("This is a caption.");
        String expResult = "This is a caption.";
        String result = instance.getCaption();
        assertEquals("Testing getCaption", expResult, result);
    }
    
    /**
     * Test getCaption method for null.
     */
    @Test
    public void testGetCaptionNull()
    {
        CaptionCard instance = new CaptionCard(null);
        String result = instance.getCaption();
        assertNull("Testing getCaption with null", result);
    }
}