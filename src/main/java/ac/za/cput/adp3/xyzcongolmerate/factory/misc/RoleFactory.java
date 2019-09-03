package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.util.Misc;

public class RoleFactory {

    //TODO: Implement body
    public static Role buildRole(String roleName) {
        return new Role.Builder().roleId(Misc.generateId()).roleName(roleName).build();
    }
}
