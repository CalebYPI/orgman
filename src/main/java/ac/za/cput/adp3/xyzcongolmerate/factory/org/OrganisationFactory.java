package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.util.Misc;

public class OrganisationFactory {

    //TODO: Implement body.
    public static Organisation buildOrganisation(String organisationName) {
        return new Organisation.Builder().orgCode(Misc.generateId()).orgName(organisationName).build();
    }
}
