package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    private String testGender;

    @Before
    public void setUp() throws Exception {
        this.testGender = "Male";
    }

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender(this.testGender);
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertNotNull(gender);
    }
}