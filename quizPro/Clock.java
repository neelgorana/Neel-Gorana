package quizPro;

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        this.hours = (secondsSinceMidnight / 3600) % 24;
        this.minutes = (secondsSinceMidnight % 3600) / 60;
        this.seconds = secondsSinceMidnight % 60;
    }

    public int getHours() {
        return this.hours;
    }
    
    public void setHours(int hours) {
    	if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return this.minutes;
    }
    
    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public void tick() {
        this.seconds++;
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
    }

    public void tickDown() {
        this.seconds--;
        if (this.seconds < 0) {
            this.seconds = 59;
            this.minutes--;
            if (this.minutes < 0) {
                this.minutes = 59;
                this.hours--;
                if (this.hours < 0) {
                    this.hours = 23;
                }
            }
        }
    }

    public void addClock(Clock anotherClock) {
        int totalSeconds = (this.hours * 3600 + this.minutes * 60 + this.seconds) +
                (anotherClock.getHours() * 3600 + anotherClock.getMinutes() * 60 + anotherClock.getSeconds());
        setClock(totalSeconds);
    }

    public Clock subtractClock(Clock anotherClock) {
        int totalSeconds1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSeconds2 = anotherClock.getHours() * 3600 + anotherClock.getMinutes() * 60 + anotherClock.getSeconds();
        int diffSeconds = totalSeconds1 - totalSeconds2;
        if (diffSeconds < 0) {
            diffSeconds += 24 * 3600; 
        }
        return new Clock(diffSeconds);
    }

    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)", this.hours, this.minutes, this.seconds);
    }
}

