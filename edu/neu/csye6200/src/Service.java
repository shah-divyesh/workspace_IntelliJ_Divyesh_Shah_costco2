package neu.csye6200.src;

import java.time.LocalDateTime;

public class Service extends ItemAPI{
    String startTIme;
    String endTime;
    String timeUnit;


    public Service(int itemID, double itemPrice, String itemCategory, String itemName, String startTIme, String endTime, String timeUnit) {
        super(itemID, itemPrice, itemCategory, itemName);
        this.startTIme = startTIme;
        this.endTime = endTime;
        this.timeUnit = timeUnit;
    }

    public Service() {
    }


    public String getStartTIme() {
        return startTIme;
    }

    public void setStartTIme(String startTIme) {
        this.startTIme = startTIme;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public String toString() {
        return "Service{ " +super.toString()+
                ", startTIme='" + startTIme + '\'' +
                ", endTime='" + endTime + '\'' +
                ", timeUnit='" + timeUnit + '\'' +
                "} " ;
    }
}
