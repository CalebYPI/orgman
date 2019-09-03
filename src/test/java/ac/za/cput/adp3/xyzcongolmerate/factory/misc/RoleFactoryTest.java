package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    private String testRole;

    @Before
    public void setUp() throws Exception {
        this.testRole = "CEO";
    }

    @Test
    public void buildRole() {
        Role role = RoleFactory.buildRole(this.testRole);
        Assert.assertNotNull(role.getRoleId());
        Assert.assertNotNull(role);
    }
}