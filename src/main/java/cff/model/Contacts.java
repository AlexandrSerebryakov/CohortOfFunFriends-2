package cff.model;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class Contacts {

    private int id;
    private String residentialAddress1;
    private String residentialAddress2;
    private String residentialAddress3;
    //TODO Think about magic numbers
    private String legalAddress1;
    private String legalAddress2;
    private String legalAddress3;
    //TODO Think about magic numbers
    private int telephoneNumber1;
    private int telephoneNumber2;
    private int telephoneNumber3;
    private int telephoneNumber4;
    private int telephoneNumber5;
    private int telephoneNumber6;
    //TODO Think about magic numbers
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResidentialAddress1() {
        return residentialAddress1;
    }

    public void setResidentialAddress1(String residentialAddress1) {
        this.residentialAddress1 = residentialAddress1;
    }

    public String getResidentialAddress2() {
        return residentialAddress2;
    }

    public void setResidentialAddress2(String residentialAddress2) {
        this.residentialAddress2 = residentialAddress2;
    }

    public String getResidentialAddress3() {
        return residentialAddress3;
    }

    public void setResidentialAddress3(String residentialAddress3) {
        this.residentialAddress3 = residentialAddress3;
    }

    public String getLegalAddress1() {
        return legalAddress1;
    }

    public void setLegalAddress1(String legalAddress1) {
        this.legalAddress1 = legalAddress1;
    }

    public String getLegalAddress2() {
        return legalAddress2;
    }

    public void setLegalAddress2(String legalAddress2) {
        this.legalAddress2 = legalAddress2;
    }

    public String getLegalAddress3() {
        return legalAddress3;
    }

    public void setLegalAddress3(String legalAddress3) {
        this.legalAddress3 = legalAddress3;
    }

    public int getTelephoneNumber1() {
        return telephoneNumber1;
    }

    public void setTelephoneNumber1(int telephoneNumber1) {
        this.telephoneNumber1 = telephoneNumber1;
    }

    public int getTelephoneNumber2() {
        return telephoneNumber2;
    }

    public void setTelephoneNumber2(int telephoneNumber2) {
        this.telephoneNumber2 = telephoneNumber2;
    }

    public int getTelephoneNumber3() {
        return telephoneNumber3;
    }

    public void setTelephoneNumber3(int telephoneNumber3) {
        this.telephoneNumber3 = telephoneNumber3;
    }

    public int getTelephoneNumber4() {
        return telephoneNumber4;
    }

    public void setTelephoneNumber4(int telephoneNumber4) {
        this.telephoneNumber4 = telephoneNumber4;
    }

    public int getTelephoneNumber5() {
        return telephoneNumber5;
    }

    public void setTelephoneNumber5(int telephoneNumber5) {
        this.telephoneNumber5 = telephoneNumber5;
    }

    public int getTelephoneNumber6() {
        return telephoneNumber6;
    }

    public void setTelephoneNumber6(int telephoneNumber6) {
        this.telephoneNumber6 = telephoneNumber6;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
