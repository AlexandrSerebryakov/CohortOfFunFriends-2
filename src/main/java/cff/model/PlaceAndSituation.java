package cff.model;

import java.util.Date;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class PlaceAndSituation {

    private String placeOfAcquaintance;
    private String circumstancesOfDating;
    private boolean conductor;
    //TODO If field conductor true then visible and access other fields of this module
    private byte busNumber;
    private String stateNumber;
    private String from;
    private String to;
    private Date date;
    private String tripPurpose;
    private boolean isAccurateDateAbsent;
    //TODO if field isAccurateDateAbsent true then date became not access and notAccurateDate became visible and access
    private String notAccurateDate;

    public String getPlaceOfAcquaintance() {
        return placeOfAcquaintance;
    }

    public void setPlaceOfAcquaintance(String placeOfAcquaintance) {
        this.placeOfAcquaintance = placeOfAcquaintance;
    }

    public String getCircumstancesOfDating() {
        return circumstancesOfDating;
    }

    public void setCircumstancesOfDating(String circumstancesOfDating) {
        this.circumstancesOfDating = circumstancesOfDating;
    }

    public boolean isConductor() {
        return conductor;
    }

    public void setConductor(boolean conductor) {
        this.conductor = conductor;
    }

    public byte getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(byte busNumber) {
        this.busNumber = busNumber;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTripPurpose() {
        return tripPurpose;
    }

    public void setTripPurpose(String tripPurpose) {
        this.tripPurpose = tripPurpose;
    }

    public boolean isAccurateDateAbsent() {
        return isAccurateDateAbsent;
    }

    public void setAccurateDateAbsent(boolean accurateDateAbsent) {
        isAccurateDateAbsent = accurateDateAbsent;
    }

    public String getNotAccurateDate() {
        return notAccurateDate;
    }

    public void setNotAccurateDate(String notAccurateDate) {
        this.notAccurateDate = notAccurateDate;
    }
}
