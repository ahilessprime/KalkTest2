package com.ahilessPrime.main.res;

public class StringToInt {
    private int userDataint;
    private boolean errorParse;

    public void setStringToInt(String userInput){ //прямой перевод из строки
        try{
            userDataint=Integer.parseInt(userInput); //пытаемся перевести
            errorParse=false; //если удается, вносим коррекктиву что ошибки не было
        }catch (NumberFormatException e){ errorParse=true;} //в случай если невозможно привести, сообщаем об ошибке
    }

    public int getUserDataint(){return userDataint;}
    public boolean getErrorParse(){return errorParse;}

}

