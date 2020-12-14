package com.example.richbox.EichText.model;

import android.os.Parcel;
import android.os.Parcelable;


public class TodoBean implements Parcelable {
    private String items;

    private int status;

    public String getItems() {
        return items == null ? "" : items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.items);
        dest.writeInt(this.status);
    }

    public TodoBean() {
    }

    protected TodoBean(Parcel in) {
        this.items = in.readString();
        this.status = in.readInt();
    }

    public static final Creator<TodoBean> CREATOR = new Creator<TodoBean>() {
        @Override
        public TodoBean createFromParcel(Parcel source) {
            return new TodoBean(source);
        }

        @Override
        public TodoBean[] newArray(int size) {
            return new TodoBean[size];
        }
    };
}
