public class Radio {
    private int currentStation = 0; //станция 0..9
    private int volume = 0; // громкость 0..100
    private int numberOfRadioStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation;
        maxStation = numberOfRadioStation - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    //Volume
    public int getCurrentVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void enlargeVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void reduceVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}