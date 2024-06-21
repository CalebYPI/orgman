package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    //TODO: Implement body
    @Override
    public Gender create(Gender gender) {
        boolean created = genderDB.add(gender);
        if (!created)
            return null;
        return gender;
    }

    //TODO: Implement body
    @Override
    public Gender read(String genderId) {
        for (Gender gender : genderDB) {
            if (gender.getGenderId().equals(genderId))
                return gender;
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public Gender update(Gender gender) {
        Gender oldGender = read(gender.getGenderId());
        if (oldGender != null) {
            genderDB.remove(oldGender);
            genderDB.add(gender);
            return gender;
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public boolean delete(String genderId) {
        Gender gender = read(genderId);
        if (gender == null) {
            return false;
        }
        genderDB.remove(gender);
        return true;
    }

    //TODO: Implement body
    @Override
    public Set<Gender> getAll() {
        return genderDB;
    }
}
