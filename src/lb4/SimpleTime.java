package lb4;

public class SimpleTime {

    int hours;
    int minutes;
    int seconds;

    public SimpleTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public SimpleTime(int seconds) {
        SimpleTime simpleTime = secondsToHMS(seconds);
        this.hours = simpleTime.hours;
        this.minutes = simpleTime.minutes;
        this.seconds = simpleTime.seconds;
    }

    public SimpleTime secondsToHMS(int seconds) {
        if (seconds <= 359999) {
            return new SimpleTime(
                    seconds / 60 / 60,
                    seconds / 60 % 60,
                    seconds % 60 % 60
            );
        } else {
            return null;
        }
    }

    public String timeToString() {
        String res = "";
        if (hours < 10) {
            res += "0" + hours + ":";
        } else {
            res += hours + ":";
        }
        if (minutes < 10) {
            res += "0" + minutes + ":";
        } else {
            res += minutes + ":";
        }
        if (seconds < 10) {
            res += "0" + seconds;
        } else {
            res += seconds;
        }
        return res;
    }

}
