package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    private String testOrganization;

    @Before
    public void setUp() throws Exception {
        this.testOrganization = "Diamond Inc";
    }

    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation(this.testOrganization);
        Assert.assertNotNull(organisation.getOrgCode());
        Assert.assertNotNull(organisation);
    }
}