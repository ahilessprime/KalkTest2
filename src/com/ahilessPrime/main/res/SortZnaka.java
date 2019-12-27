package com.ahilessPrime.main.res;

public class SortZnaka {
    private String isArifZnakString;
    private int isArifZnakInt;


    public void setIsArifZnak(String userInput) {
        if(userInput.contains("+")) { isArifZnakString="+"; isArifZnakInt=1; }
        else if(userInput.contains("-")) { isArifZnakString="-"; isArifZnakInt=2; }
        else if(userInput.contains("*")) { isArifZnakString="*"; isArifZnakInt=3; }
        else if(userInput.contains("/")) { isArifZnakString="/"; isArifZnakInt=4; }
        else throw new IllegalArgumentException("отсуствует арифметический знак");
    }

    public String getIsArifZnakString(){return isArifZnakString;}
    public int getIsArifZnakInt(){return isArifZnakInt;}
}
