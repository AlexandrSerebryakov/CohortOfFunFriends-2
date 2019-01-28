package cff.model;

import java.util.Date;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class ITrade {

    private int id;
    private Date date;
    private enum currency {TENGE, RUBLE, DOLLAR, EURO};
    // TODO: Change enum for joda.Money.
    private int cost;
    private boolean barter;
    private String place;
    private enum durationType {HOUR, MIN, SECOND};
    private int duration;
    private boolean ePhoto;
    private boolean eVideo;
    private boolean hidden;
    // TODO: 28.01.2019 If eVideo is TRUE then hidden become access and visible.
    private enum iTradeType {S, PHOTO, VIDEO};
    private enum sType {a1, a2, o1, o2, f1, f2};
    // TODO: 28.01.2019 If iTrade = S then sType become access and visible.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isBarter() {
        return barter;
    }

    public void setBarter(boolean barter) {
        this.barter = barter;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isePhoto() {
        return ePhoto;
    }

    public void setePhoto(boolean ePhoto) {
        this.ePhoto = ePhoto;
    }

    public boolean iseVideo() {
        return eVideo;
    }

    public void seteVideo(boolean eVideo) {
        this.eVideo = eVideo;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
