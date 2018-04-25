package com.sczlin.cycleball.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.sczlin.cycleball.domain.Club;
import com.sczlin.cycleball.domain.League;
import com.sczlin.cycleball.domain.Match;
import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.domain.Team;
import com.sczlin.cycleball.domain.Tournament;

public class MockService {

    private static final Logger LOGGER = Logger.getLogger(MockService.class);

    public static List<League> leagues = new ArrayList<>();
    public static List<Club> clubs = new ArrayList<>();
    public static List<Team> teams = new ArrayList<>();
    public static List<Match> matches = new ArrayList<>();

    public static List<String> clubNames = Arrays.asList("Zlin", "Prerov", "Praha", "Olomouc", "Plzen", "Svitavka");

    public static void init() {
        League l = new League();
        l.setName("1. Liga");

        League l2 = new League();
        l2.setName("2. Liga");
        leagues.add(l);
        leagues.add(l2);

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
        if (teams.size()%2==1) {
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

}
