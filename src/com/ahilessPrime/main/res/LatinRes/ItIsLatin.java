package com.ahilessPrime.main.res.LatinRes;

public class ItIsLatin {

    private boolean isLatin=false;
    private int userDataIntArray []= new int[2];
    private int parseError=0;
    private int n=0;
    private LatinAlfavit latAlf = new LatinAlfavit(); //объект алфавита латиницы

    public void setItIsLatin(String [] userDataStringArray){ //метд для проверки на соответствие и для приведения к ар


        for(String s:userDataStringArray){ //перебор полученного массива
            latAlf.setArIsLat(s.toUpperCase()); //передаем в алфавит для перевода в исчисление
            userDataIntArray[n]=latAlf.getOtvet(); //получаем ответ исчисления и вносим в инт массив
            n++; //корректировка ячеек инт массива
        }

        if(n==2) isLatin=true; //если два перевода прошли успешно, то признаем что полученные данные были латинскими
        else throw new IllegalArgumentException("похоже вы не верно ввели латинские значения"); //если нет то ошибка
    }

    public String getLatinFromArab(int n){ //метод переобразовывает араб исчисление в латин
        return latAlf.getLatinAlfavit(n-1); //обращается к массиву латинского алфавита
    }

    public boolean getIsLatin(){return isLatin;}
    public int [] getUserDataInt(){return userDataIntArray;}
}
