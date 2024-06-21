package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private Set<Race> raceDB;
    private static RaceRepository raceRepository = null;

    private RaceRepositoryImpl() {
        this.raceDB = new HashSet<>();
    }

    public static RaceRepository getRaceRepository() {
        if (raceRepository == null) raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }

    //TODO: Implement body
    @Override
    public Race create(Race race) {
        boolean created = raceDB.add(race);
        if (!created) return null;
        return race;
    }

    //TODO: Implement body
    @Override
    public Race read(String raceId) {
        for (Race race : raceDB) {
            if (race.getRaceId().equals(raceId)) return race;
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public Race update(Race race) {
        Race oldRace = read(race.getRaceId());
        if (oldRace != null) {
            raceDB.remove(oldRace);
            raceDB.add(race);
            return race;
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public boolean delete(String raceId) {
        Race race = read(raceId);
        if (race == null)
            return false;
        raceDB.remove(race);
        return true;
    }

    //TODO: Implement body
    @Override
    public Set<Race> getAll() {
        return raceDB;
    }
}
