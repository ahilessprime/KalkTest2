package com.ahilessPrime.main.res;

public class BirthUserData {
    private String userInput; //входное значение
    private String znak; //ариф знак
    private String[] userDataString; //выходной массив

    public void setUserData(String userInput,String znak){
        if(znak=="+"|znak=="*"){ //исправление конфликта регулярных выражений
            if(znak=="+") userDataString=userInput.split("\\+");
            if(znak=="*") userDataString=userInput.split("\\*");
        }
       else userDataString= userInput.split(znak);

    }

    public String[] getUserDataString(){return userDataString;}

}
