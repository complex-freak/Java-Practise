public class Clock {
    private int hr;
    private int min;
    private int sec;

    public Clock() {
        setTime(0, 0, 0);
    }
    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    public Clock(Clock otherClock)
    {
        setTime(otherClock.hr, otherClock.min, otherClock.sec);
    }

    public void setTime(int hours, int minutes, int seconds) {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;
        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;
        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    public int getHours() {
        return hr;
    }

    public int getMinutes() {
        return min;
    }

    public int getSeconds() {
        return sec;
    }

    public void printTime() {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");
        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");
        if (sec < 10)
            System.out.print("0");
        System.out.println(sec);
    }

    public void incrementHours() {
        hr++;
        if (hr > 23)
            hr = 0;
    }

    public void incrementMinutes() {
        min++;
        if (min > 59) {
            min = 0;
            incrementHours();
        }

    }

    public void incrementSeconds() {
        sec++;
        if (sec > 59) {
            sec = 0;
            incrementMinutes();
        }
    }

    public boolean equals(Clock otherClock) {
        return (hr == otherClock.hr
                && min == otherClock.min
                && sec == otherClock.sec);
    }

    public void makeCopy(Clock otherClock) {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    public Clock getCopy() {
        return new Clock(hr, min, sec);
    }

    public String toString()
    {
        String str = "";
        if (hr < 10)
            str = "0";
        str = str + hr + ":";
        if (min < 10)
            str = str + "0" ;
        str = str + min + ":";
        if (sec < 10)
            str = str + "0";
        str = str + sec;
        return str;
    }

}
