package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    private String testOrganizationCode, testUserEmail;

    @Before
    public void setUp() throws Exception {
        this.testOrganizationCode = "DI0001";
        this.testUserEmail = "james@example.com";
    }

    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser(this.testOrganizationCode, this.testUserEmail);
        Assert.assertNotNull(organisationUser);
    }
}