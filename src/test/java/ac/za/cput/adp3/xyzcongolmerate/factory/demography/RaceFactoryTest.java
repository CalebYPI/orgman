package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    private String testRace;

    @Before
    public void setUp() throws Exception {
        this.testRace = "Black";
    }

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace(this.testRace);
        Assert.assertNotNull(race.getRaceId());
        Assert.assertNotNull(race);
    }
}