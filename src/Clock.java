
interface Readable {
    void readTime();
}


public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;


    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Методы установки (setters)
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    public void tic() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }

    @Override
    public void readTime() {
        System.out.println(String.format("Time: %02d:%02d:%02d", hours, minutes, seconds));
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 58);
        clock.readTime();
        clock.tic();
        clock.readTime();
        clock.tic();
        clock.readTime();
    }
}

