package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    private String userEmail, userTitle, genderId, raceId;
    Date dateOfBirth;

    @Before
    public void setUp() throws Exception {
        this.userEmail = "james@example.com";
        this.userTitle = "Mr";
        this.genderId = "01";
        this.raceId = "01";
        this.dateOfBirth = new Date(1980, 01, 01);
    }

    @Test
    public void buildUserDemography() {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography(this.userEmail, this.userTitle, this.genderId, this.raceId, this.dateOfBirth);
        Assert.assertNotNull(userDemography);
    }
}