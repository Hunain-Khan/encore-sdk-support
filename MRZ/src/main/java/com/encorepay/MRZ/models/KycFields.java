package com.encorepay.MRZ.models;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class KycFields implements Parcelable {
    public static final Creator<KycFields> CREATOR = new Creator<KycFields>() {
        @Override
        public KycFields createFromParcel(Parcel in)
        { return new KycFields(in);
        }

        @Override
        public KycFields[] newArray(int size) {
            return new KycFields[size];
        }
    };


    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDob() {
        return dob;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    private String personalNumber;
    private String dob;
    private String nationality;
    private String name;
    private String mrzString;
    private String checkDocumentDigit;
    private String issuingCountry;
    private String documentNumber;
    private String gender;
    private String surname;
    private Bitmap fullImage;

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }



    public String getCheckDocumentDigit() {
        return checkDocumentDigit;
    }

    public void setCheckDocumentDigit(String checkDocumentDigit) {
        this.checkDocumentDigit = checkDocumentDigit;
    }



    public void setMrzString(String mrzString) {
        this.mrzString = mrzString;
    }

    public String getMrzString() {
        return mrzString;
    }



    public KycFields(){
        personalNumber = "";
        dob = "";
        nationality ="";
        name="";
        mrzString = "";
        checkDocumentDigit = "";
        issuingCountry = "";
        documentNumber = "";
        surname = "";
        fullImage = null;
    }

    protected KycFields(Parcel in){
        personalNumber = in.readString();
        dob = in.readString();
        nationality =in.readString();
        name=in.readString();
        mrzString = in.readString();
        checkDocumentDigit = in.readString();
        issuingCountry = in.readString();
        documentNumber = in.readString();
        surname = in.readString();
        fullImage = in.readParcelable(Bitmap.class.getClassLoader());
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(personalNumber);
        parcel.writeString(dob);
        parcel.writeString(nationality);
        parcel.writeString(name);
        parcel.writeString(mrzString);
        parcel.writeString(checkDocumentDigit);
        parcel.writeString(issuingCountry);
        parcel.writeString(documentNumber);
        parcel.writeString(surname);
        parcel.writeValue(fullImage);

    }

    private Bitmap getFullImageInBitmap(){
        return fullImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Bitmap getFullImage() {
        return fullImage;
    }

    public void setFullImage(Bitmap fullImage) {
        this.fullImage = fullImage;
    }
}
