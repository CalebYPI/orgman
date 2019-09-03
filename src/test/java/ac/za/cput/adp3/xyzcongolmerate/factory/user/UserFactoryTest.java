package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    private String testEmail, testFirstName, testSurname;

    @Before
    public void setUp() throws Exception {
        this.testEmail = "james@example.com";
        this.testFirstName = "James";
        this.testSurname = "Johnson";
    }

    @Test
    public void buildUser() {
        User user = UserFactory.buildUser(this.testEmail, this.testFirstName, this.testSurname);
        Assert.assertNotNull(user);
    }
}