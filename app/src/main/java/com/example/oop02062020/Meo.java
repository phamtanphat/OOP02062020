package com.example.oop02062020;

import android.util.Log;
import android.view.View;

public class Meo extends Animal implements OnPrintable {
    private Integer chieucao;
    private Integer cannang;

    public Meo(String maulong, Integer sochan, String tenconvat,Integer chieucao) {
        super(maulong,sochan,tenconvat);
        this.chieucao = chieucao;
    }

    @Override
    public String toStringValue() {
        return "Meo" + super.toStringValue() ;
    }

    public Integer getChieucao() {
        return chieucao;
    }

    public void setChieucao(Integer chieucao) {
        this.chieucao = chieucao;
    }

    public Integer getCannang() {
        return cannang;
    }

    public void setCannang(Integer cannang) {
        this.cannang = cannang;
    }

    @Override
    public void printName() {
        Log.d("BBB",tenconvat);
    }
}
