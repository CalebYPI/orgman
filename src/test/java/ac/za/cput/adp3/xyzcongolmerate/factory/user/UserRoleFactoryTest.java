package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    private String orgCode, userEmail, roleId;

    @Before
    public void setUp() throws Exception {
        this.orgCode = "01";
        this.userEmail = "james@example.com";
        this.roleId = "01";
    }

    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole(this.orgCode, this.userEmail, this.roleId);
        Assert.assertNotNull(userRole);
    }
}