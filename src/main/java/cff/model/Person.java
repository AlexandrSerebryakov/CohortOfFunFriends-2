package cff.model;

import java.util.Date;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class Person {
    private int id;
    //TODO base entity as ID
    private String name;
    private String surname;
    private String middleName;
    private byte age;
    //TODO Realise automatic counter of age on today
    private Date dob;
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


}