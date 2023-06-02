import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetСurrentStationNumber() {
        Radio radio = new Radio();

        radio.setСurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSetСurrentStationNumber() {
        Radio radio = new Radio();

        radio.setСurrentStationNumber(25);
        int expected = 0;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSetСurrentStationNumber() {
        Radio radio = new Radio();

        radio.setСurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setСurrentStationNumber(5);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationNine() {
        Radio radio = new Radio();
        radio.setСurrentStationNumber(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.setСurrentStationNumber(8);
        radio.prevRadioStation();
        int expected = 7;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationMinus() {
        Radio radio = new Radio();
        radio.setСurrentStationNumber(-1);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getСurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

     @Test
    public void shouldIncreaseVolumePlus() {
        Radio radio = new Radio();
        radio.currentVolume = 20;
        radio.increaseVolume();

        int expected = 21;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.currentVolume = 120;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
     @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = -1;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
