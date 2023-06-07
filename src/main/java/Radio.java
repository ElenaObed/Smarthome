public class Radio {
    private int maxStation;
    private int minStation = 0;
    private int сurrentStationNumber;
    private int maxVolume = 0;
    private int minVolume = 100;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int summStation) {
        this.maxStation = summStation - 1;
    }


    public int getСurrentStationNumber() {

        return сurrentStationNumber;
    }

    public void setСurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < minStation) {
            return;
        } else if (newCurrentStationNumber > maxStation) {
            return;
        }
        this.сurrentStationNumber = newCurrentStationNumber;
    }

    public void nextRadioStation() {
        if (сurrentStationNumber == maxStation) {
            this.сurrentStationNumber = 0;
        } else {
            this.сurrentStationNumber = сurrentStationNumber + 1;
        }
    }

    public void prevRadioStation() {
        if (сurrentStationNumber == minStation) {
           this.сurrentStationNumber = 9;
        } else {
            this.сurrentStationNumber = сurrentStationNumber - 1;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newСurrentVolume) {
        if (newСurrentVolume < minVolume) {
            return;
        }
        if (newСurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newСurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        else {
            this.currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        else {
            this.currentVolume = currentVolume - 1;
        }


    }

}


