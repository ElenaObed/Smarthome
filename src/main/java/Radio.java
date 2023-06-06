public class Radio {
    private int сurrentStationNumber;
    private int currentVolume;

    public int getСurrentStationNumber() {

        return сurrentStationNumber;
    }

    public void setСurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        } else if (newCurrentStationNumber > 9) {
            return;
        }
        сurrentStationNumber = newCurrentStationNumber;
    }

    public void nextRadioStation() {
        if (сurrentStationNumber < 9) {
            сurrentStationNumber = сurrentStationNumber + 1;
        } else {
            сurrentStationNumber = 0;
        }
    }

    public void prevRadioStation() {
        if (сurrentStationNumber > 0) {
            сurrentStationNumber = сurrentStationNumber - 1;
        } else {
            сurrentStationNumber = 9;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newcurrentVolume) {
        currentVolume = newcurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }


    }

}


