package com.sczlin.cycleball.service;

import java.time.LocalDateTime;
import java.util.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sczlin.cycleball.domain.*;
import com.sczlin.cycleball.repository.*;

@Service
public class MockService {

    private static final Logger LOGGER = Logger.getLogger(MockService.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private LicenceRepository licenceRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private TeamRepository teamRepository;

    public static List<League> leagues = new ArrayList<>();
    public static List<Club> clubs = new ArrayList<>();
    public static List<Team> teams = new ArrayList<>();
    public static List<Match> matches = new ArrayList<>();
    public static Player player = null;
    
    public static List<String> clubNames = Arrays.asList("Zlin", "Prerov", "Praha", "Olomouc", "Plzen", "Svitavka");

    public void init() {
        initStatics();
        initDb();
    }

    public static void initStatics() {
        LOGGER.info("XXX " + "INIT MOCK DATA");

        for (int i = 1; i < 6; i++) {
            Club c = new Club();
            c.setClubName(clubNames.get(i));
            for (int j = 1; j < 2; j++) {
                Team t = new Team();
                t.setName("Team " + clubNames.get(i) + " " + j);

                teams.add(t);
                c.getTeams().add(t);
            }
            clubs.add(c);
        }

        List<Team> teams = MockService.teams;
        Collections.shuffle(teams);
        if (teams.size() % 2 == 1) {
            Team t = new Team();
            t.setName("No team");
            teams.add(t);
        }
        int counter = 1;
        for (int n = 0; n < teams.size() - 1; n++) {

            List<Team> temp = new ArrayList<>();
            temp.add(teams.get(0));
            temp.add(teams.get(teams.size() - 1));
            temp.addAll(teams.subList(1, teams.size() - 1));
            teams = temp;

            for (int i = 0; i < teams.size() - 1; i += 2) {

                Match m = new Match();
                m.setRound(n + 1);
                m.setMatchNo(counter++);
                m.setTeam1(teams.get(i));
                m.setTeam2(teams.get(i + 1));
                matches.add(m);
            }
        }

    }

    private void initDb() {

        mockLeague();
        mockClubs();
        mockPlayers();
        mockLicences();

    }

    private void mockLicences() {
        Random rand = new Random(System.currentTimeMillis());
        for (int n = 0; n < 10; n++) {
            Licence l = new Licence();
            l.setNumber(rand.nextInt(99999) + "");
            l.setYear(2000 + n);
            l.setPlayer(player);
            licenceRepository.save(l);
        }
    }

    private void mockPlayers() {
        Player p1 = new Player();
        p1.setFirstname("Tomas");
        p1.setSurname("nesvadba");
        p1.setBirthdate(LocalDateTime.now());

        Player p2 = new Player();
        p2.setFirstname("Honza");
        p2.setSurname("Krejčí");
        p2.setBirthdate(LocalDateTime.now());

        Player p3 = new Player();
        p3.setFirstname("Martin");
        p3.setSurname("Struhař");
        p3.setBirthdate(LocalDateTime.now());
        
        player = p1;

        playerRepository.save(p1);
        playerRepository.save(p2);
        playerRepository.save(p3);

        Team t1 = new Team();
        t1.setPlayer1(p1);
        t1.setPlayer2(p2);
        t1.setReservePlayer(p3);

        teamRepository.save(t1);

    }

    private void mockClubs() {

        Club c1 = new Club();
        c1.setClubName("Sokol Zlin - prštné");

        Club c2 = new Club();
        c2.setClubName("Prerov");

        Club c3 = new Club();
        c3.setClubName("Milo Olomouc");

        Club c4 = new Club();
        c4.setClubName("Plzen");

        Club c5 = new Club();
        c5.setClubName("SC svitavka");

        clubRepository.save(c1);
        clubRepository.save(c2);
        clubRepository.save(c3);
        clubRepository.save(c4);
        clubRepository.save(c5);

    }

    private void mockLeague() {
        League extraliga = new League();
        extraliga.setName("Extraliga");

        League liga1 = new League();
        liga1.setName("1. Liga");

        League liga2 = new League();
        liga2.setName("2. Liga");

        leagueRepository.save(extraliga);
        leagueRepository.save(liga1);
        leagueRepository.save(liga2);

        leagues.addAll(leagueRepository.findAll());
    }

}
