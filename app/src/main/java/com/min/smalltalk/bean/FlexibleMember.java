package com.min.smalltalk.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Min on 2016/12/15.
 */

public class FlexibleMember implements Parcelable{
    private String tu_id;
    private String vsername;
    private int sex;
    private String avatar_image;

    public FlexibleMember(String tu_id, String vsername, int sex, String avatar_image) {
        this.tu_id = tu_id;
        this.vsername = vsername;
        this.avatar_image = avatar_image;
        this.sex = sex;
    }

    protected FlexibleMember(Parcel in) {
        tu_id = in.readString();
        vsername = in.readString();
        avatar_image = in.readString();
        sex = in.readInt();
    }

    public static final Creator<FlexibleMember> CREATOR = new Creator<FlexibleMember>() {
        @Override
        public FlexibleMember createFromParcel(Parcel in) {
            return new FlexibleMember(in);
        }

        @Override
        public FlexibleMember[] newArray(int size) {
            return new FlexibleMember[size];
        }
    };

    public String getTu_id() {
        return tu_id;
    }

    public void setTu_id(String tu_id) {
        this.tu_id = tu_id;
    }

    public String getVsername() {
        return vsername;
    }

    public void setVsername(String vsername) {
        this.vsername = vsername;
    }

    public String getAvatar_image() {
        return avatar_image;
    }

    public void setAvatar_image(String avatar_image) {
        this.avatar_image = avatar_image;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(tu_id);
        parcel.writeString(vsername);
        parcel.writeString(avatar_image);
        parcel.writeInt(sex);
    }
}
