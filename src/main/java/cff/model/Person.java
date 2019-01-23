package cff.model;

import java.util.Date;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class Person {
    private int id;
    //TODO base entity as ID
    private enum sex {MALE, FEMALE};
    private String name;
    private String surname;
    private String middleName;
    private byte age;
    //TODO Realise automatic counter of age on today
    private Date dob;
    private boolean isIni;
    private boolean isAnonymous;
    //TODO Realise functional: if anonymous is true then

    //FIXME Fields: name, surname, middleName become not access or
    //FIXME even invisible
    private boolean isCharisma;
    private boolean isShock;
    private boolean isNb;
    private boolean isBb;
    private String bpl;
    private enum education {INCOMPLETE_SECONDARY, SECONDARY, COLLEGE, BACHELOR, MASTER, PHD};
    private String placeOfEducation1;
    private String placeOfEducation2;
    private String placeOfEducation3;
    private String placeOfJob1;
    private String placeOfJob2;
    private String placeOfJob3;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isIni() {
        return isIni;
    }

    public void setIni(boolean ini) {
        isIni = ini;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public boolean isCharisma() {
        return isCharisma;
    }

    public void setCharisma(boolean charisma) {
        isCharisma = charisma;
    }

    public boolean isShock() {
        return isShock;
    }

    public void setShock(boolean shock) {
        isShock = shock;
    }

    public boolean isNb() {
        return isNb;
    }

    public void setNb(boolean nb) {
        isNb = nb;
    }

    public boolean isBb() {
        return isBb;
    }

    public void setBb(boolean bb) {
        isBb = bb;
    }

    public String getBpl() {
        return bpl;
    }

    public void setBpl(String bpl) {
        this.bpl = bpl;
    }

    public String getPlaceOfEducation1() {
        return placeOfEducation1;
    }

    public void setPlaceOfEducation1(String placeOfEducation1) {
        this.placeOfEducation1 = placeOfEducation1;
    }

    public String getPlaceOfEducation2() {
        return placeOfEducation2;
    }

    public void setPlaceOfEducation2(String placeOfEducation2) {
        this.placeOfEducation2 = placeOfEducation2;
    }

    public String getPlaceOfEducation3() {
        return placeOfEducation3;
    }

    public void setPlaceOfEducation3(String placeOfEducation3) {
        this.placeOfEducation3 = placeOfEducation3;
    }

    public String getPlaceOfJob1() {
        return placeOfJob1;
    }

    public void setPlaceOfJob1(String placeOfJob1) {
        this.placeOfJob1 = placeOfJob1;
    }

    public String getPlaceOfJob2() {
        return placeOfJob2;
    }

    public void setPlaceOfJob2(String placeOfJob2) {
        this.placeOfJob2 = placeOfJob2;
    }

    public String getPlaceOfJob3() {
        return placeOfJob3;
    }

    public void setPlaceOfJob3(String placeOfJob3) {
        this.placeOfJob3 = placeOfJob3;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}