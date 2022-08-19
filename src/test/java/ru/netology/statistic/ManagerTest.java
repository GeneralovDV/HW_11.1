package ru.netology.statistic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    @Test
    public void addSeveralFilms() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");

        String[] actual = manager.findAll();
        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10",
                "film11"
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() {
        Manager manager = new Manager();
        manager.addFilm("film1");

        String[] actual = manager.findAll();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addZeroFilms() {
        Manager manager = new Manager();

        String[] actual = manager.findAll();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsAboveLimit() {
        Manager manager = new Manager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");


        String[] actual = manager.findLast();
        String[] expected = {
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2"

        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsLessLimit() {
        Manager manager = new Manager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");


        String[] actual = manager.findLast();
        String[] expected = {
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1",

        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmLimit() {
        Manager manager = new Manager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");


        String[] actual = manager.findLast();
        String[] expected = {
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1"

        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmEmptyList() {
        Manager manager = new Manager(10);



        String[] actual = manager.findLast();
        String[] expected = {

        };

        assertArrayEquals(expected, actual);
    }
}
