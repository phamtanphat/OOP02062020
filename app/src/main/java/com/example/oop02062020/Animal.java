package com.example.oop02062020;

import android.util.Log;

public class Animal implements OnPrintable{
    // Thuoc tinh
    String maulong;
    Integer sochan;
    String tenconvat;

    // Phuong thuc
//    alt + insert

    //constructor

    public Animal(String maulong, Integer sochan, String tenconvat) {
        this.maulong = maulong;
        this.sochan = sochan;
        this.tenconvat = tenconvat;
    }

    public String toStringValue() {
        return
                "maulong='" + maulong + '\'' +
                ", sochan=" + sochan +
                ", tenconvat='" + tenconvat + '\'' +
                '}';
    }

    @Override
    public void printName() {
        Log.d("BBB",tenconvat);
    }
}
