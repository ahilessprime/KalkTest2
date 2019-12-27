package com.ahilessPrime.main.res.LatinRes;

public class LatinAlfavit {


    int otvet=0;
    private String[] latinString = new String[]{"I", "II", "III", "IV", //латинский алфавит
            "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
            "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXIII","XXIX",
            "XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX",
            "XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX",
            "L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX",
            "LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX",
            "LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX",
            "LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX",
            "XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX",
            "C" };

    public String [] getLatinAlfavit(){ return latinString; } //возвращает массив алфавита
    public String getLatinAlfavit(int n){return latinString[n];}//возвращает указанную ячейку
    public void setArIsLat(String s){ //обрабатывает полученную строку на соответствие Латиницы
        otvet=0;
        for(int i=0;i<11;i++) { //до 10 птому что иначе приведенное значение больше чем допустимо
            if (s.equals(latinString[i])) { //сравнивает приведенную строку с ячейками массива
                otvet= i+1; //при нахождения соответствия приводится к арабскому значению от номера ячейки массива
            }}
        // в случай если не удалось привести значение
        if(otvet==0) throw new IllegalArgumentException("возможно вы ввели неверо латинские цифры или же значение больш");
    }
    public int getOtvet(){return otvet;} //пполучить ответ пиведения

}
