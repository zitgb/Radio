package org.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldSetStationWithDefaultCount() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotSetStationAboveDefaultMaximum() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchToFirstStationAfterLast() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);
        radio.next();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchToLastStationBeforeFirst() {
        Radio radio = new Radio(30);

        radio.prev();

        assertEquals(29, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }
}
