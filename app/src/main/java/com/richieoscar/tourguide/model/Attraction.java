package com.richieoscar.tourguide.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Attraction implements Parcelable {
    private String name;
    private String location;
    private String phoneNumber;
    private String openHours;
    private int image;

    public int getImage() {
        return image;
    }

    public Attraction(String name, String location, String phoneNumber, String openHours, int image ) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.openHours = openHours;
        this.image = image;
    }

    protected Attraction(Parcel in) {
        name = in.readString();
        location = in.readString();
        phoneNumber = in.readString();
        openHours = in.readString();
        image = in.readInt();
    }

    public static final Creator<Attraction> CREATOR = new Creator<Attraction>() {
        @Override
        public Attraction createFromParcel(Parcel in) {
            return new Attraction(in);
        }

        @Override
        public Attraction[] newArray(int size) {
            return new Attraction[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOpenHours() {
        return openHours;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(location);
        dest.writeString(phoneNumber);
        dest.writeString(openHours);
        dest.writeInt(image);
    }
}
