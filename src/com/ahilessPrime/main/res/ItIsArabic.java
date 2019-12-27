package com.ahilessPrime.main.res;

public class ItIsArabic {

    private boolean isArabic=false;
    private int userDataInt []= new int[2];
    private int parseError=0;
    private int n=0;

    public void setItIsArabic(String [] userDataString){  //арабское ли исчислении и возможно ли сразу привести к целым

        StringToInt toInt = new StringToInt(); //объект класса приводящий строки в инт

        for(String s:userDataString){ //перебор строкоого массива
            toInt.setStringToInt(s);  //передаем строку для обработки
            if(toInt.getErrorParse()==false){ //если ошибка переобразования не была выявленна
                userDataInt[n]=toInt.getUserDataint(); //то инициализируем целочисленный массив
            }
            else parseError++; //если ошибка переобразования была выявленна, вносим коррективы
            n++;} //значение для корректировки ячейки userDataInt
        //если parseError ==1 то только одно из значений было приведенно, значит значения были приведеннны не верно
        if(parseError==1) throw new IllegalArgumentException("похоже вы ввели разные исчисления");
        if(parseError==0) isArabic=true; //если не было ошибок приведения значит исчисления на арабском
    }

    public int [] getUserDataInt(){return userDataInt;}
    public boolean getIsArabic(){return isArabic;}
}
