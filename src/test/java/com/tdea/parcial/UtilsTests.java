package com.tdea.parcial;

import org.junit.jupiter.api.Test;

public class UtilsTests {

    @Test
    public void blankTest() {
        String night = Utils.getTimeOfDay(5);
        String morning = Utils.getTimeOfDay(8);
        String afternoon = Utils.getTimeOfDay(16);
        String evening = Utils.getTimeOfDay(21);
        String invalidHour = Utils.getTimeOfDay(30);
    }

}
