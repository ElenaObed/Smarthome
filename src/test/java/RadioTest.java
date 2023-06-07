import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    void shouldSetСurrentStationNumber() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setСurrentStationNumber(expected);

        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void shouldsummStation() {
        int summStation = 20;
        Radio radio = new Radio(summStation);
        int expected = 10;
        radio.setСurrentStationNumber(10);


        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void shouldСurrentStationNumber() {
        Radio radio = new Radio();

        radio.setСurrentStationNumber(11);
        int expected = 0;

        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void shouldNextRadioStation() {
        Radio radio = new Radio();
        int station = 7;
        radio.setСurrentStationNumber(station);
        radio.nextRadioStation();
        int expected = 8;


        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void shouldRadioStationNine() {
        Radio radio = new Radio();
        int station = 9;
        radio.setСurrentStationNumber(station);
        radio.nextRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void shouldRadioStationZero() {
        Radio radio = new Radio();
        int station = 0;
        radio.setСurrentStationNumber(station);
        radio.prevRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void shouldRadioStationPrev() {
        Radio radio = new Radio();
        int station = 4;
        radio.setСurrentStationNumber(station);
        radio.prevRadioStation();
        int expected = 3;

        Assertions.assertEquals(expected, radio.getСurrentStationNumber());
    }

    @Test
    void currentVolume() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    public void shouldVolumeMax() {
        Radio radio = new Radio();
        int volume = 101;
        radio.setCurrentVolume(volume);

        int expected = 0;

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setCurrentVolume(volume);

        int expected = 0;

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        int volume = 50;
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int expected = 51;gir

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int expected = 9;

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
