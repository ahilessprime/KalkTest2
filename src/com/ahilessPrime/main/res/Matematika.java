package com.ahilessPrime.main.res;

import java.awt.*;

public class Matematika {
    private int rezult;


    public void setZadacha(int [] userDataInt, int arifZnak){
        switch (arifZnak){
            case 1:
                rezult=(userDataInt[0]+userDataInt[1]);
                break;
            case 2:
                rezult=(userDataInt[0]-userDataInt[1]);
                break;
            case 3:
                rezult=(userDataInt[0]*userDataInt[1]);
                break;
            case 4:
                rezult=(userDataInt[0]/userDataInt[1]);
                break;
        }
    }

    public int getRezult(){
        return rezult;
    }
}
