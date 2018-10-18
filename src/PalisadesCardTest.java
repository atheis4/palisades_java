import org.junit.Assert;
import org.junit.Test;


public class PalisadesCardTest {
    Card tenHearts = new PalisadesCard("hearts", 10);
    Card twoClubs = new PalisadesCard("clubs", 2);

    @Test
    public void testIsTenTrue() {
        Assert.assertTrue(tenHearts.isTen());
    }

    @Test
    public void testIsTenFalse() {
        Assert.assertFalse(twoClubs.isTen());
    }

    @Test
    public void testIsTwoTrue() {
        Assert.assertTrue(twoClubs.isTwo());
    }

    @Test
    public void testIsTwoFalse() {
        Assert.assertFalse(tenHearts.isTwo());
    }
}