package com.ahilessPrime.main.res;

public class OverShore {

    //сделать универсальным на арабском исчислении


    public void setOverShore(String userInput){
        if (userInput.length()>5|userInput.length()<3) throw new IllegalArgumentException("слишком маленький или боль" +
                "шой запрос");
    }
}
