package com.ahilessPrime.main.res;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class SharedResources {

    private String userInput; //входное значение пользователя
    public void setUserInput(String userInput){
        this.userInput=userInput;
    }
    public String getUserInput(){
        return userInput;
    }



    private String arifZnakString;  //арифметический знак в строке
    public void setArifZnakString(String arifZnakString){
        this.arifZnakString=arifZnakString;
    }
    public String getArifZnakString(){
        return arifZnakString;
    }



    private int arifZnakInt; //арифметическое значение в инт
    //условное значение: 1 - +, 2 - -, 3 - *, 4 - /.
    public void setArifZnakInt(int arifZnakInt) {
        this.arifZnakInt = arifZnakInt;
    }
    public int getArifZnakInt(){
        return arifZnakInt;
    }


    private String [] userDataString; //массив значений в стринг
    public void setUserDataString(String [] userDataString){
        this.userDataString=userDataString;
    }
    public String[] getUserDataString(){
        return userDataString;
    }


    private int [] userDataInt; //массив значений в инт
    public void setUserDataInt(int [] userDataInt){ this.userDataInt=userDataInt;}
    public int [] getUserDataInt(){return userDataInt;}

    private boolean isArabic; //арабское ли исчисления
    public void setIsArabic(Boolean isArabic){this.isArabic=isArabic;}
    public boolean getIsArabic(){return isArabic;}

    private boolean isLatin; //латинское ли исчисления
    public void setIsLatin(boolean isLatin){this.isLatin=isLatin;}
    public boolean getIsLatin(){return isLatin;}

    private int rezult; //результат вычисления
    public void setRezult(int rezult){this.rezult=rezult;}
    public int getRezult(){return rezult;}

}
