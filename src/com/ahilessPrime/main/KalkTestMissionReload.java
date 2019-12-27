package com.ahilessPrime.main;
import  com.ahilessPrime.main.res.*;
import com.ahilessPrime.main.res.LatinRes.ItIsLatin;
import com.ahilessPrime.main.res.LatinRes.LatinAlfavit;

public class KalkTestMissionReload {

    public static void main(String [] args){
        startKalktest(); } //запуск


    private static void startKalktest(){
        SharedResources res = new SharedResources(); // все ресурсы находятся здесь (БД)

        //входное значение пользователя
        UserInput usIn = new UserInput();
        usIn.setUserInput(); //запрос пользователя
        res.setUserInput(usIn.getUserInput()); //передаем значение в БД



        //определение арифметического знака
        SortZnaka znak= new SortZnaka();
        znak.setIsArifZnak(res.getUserInput()); //запрос на сортировку знака
        res.setArifZnakInt(znak.getIsArifZnakInt()); //передаем значение в БД в виде инт
        res.setArifZnakString(znak.getIsArifZnakString()); //передаем значение в БД в виде стринг


        //разделение на массив для дальнейших операций
        BirthUserData newUsD = new BirthUserData();
        newUsD.setUserData(res.getUserInput(),res.getArifZnakString()); //передаем строковое значение и арифм знак
        res.setUserDataString(newUsD.getUserDataString()); //получаем массив разделенный на значения

        //проверка на каком исчислении запрос и если на Ар, пытаемся сразу же привести к int
        ItIsArabic itAr = new ItIsArabic();
        itAr.setItIsArabic(res.getUserDataString()); //передаем разделенный массив значений

        res.setIsArabic(itAr.getIsArabic()); //вносим в ресурсы на каком исчислении поступили данные
        if (res.getIsArabic()){ res.setUserDataInt(itAr.getUserDataInt());  } //если на ар сразу же переводим и в ресурс


        //проверка на латиницу
        ItIsLatin itsLatin = new ItIsLatin(); //объект класса работающий с латиницей
        if (!res.getIsArabic()){ //если значение приведенны не на арабском
            itsLatin.setItIsLatin(res.getUserDataString()); //передаем массив значений на проверку
            if(itsLatin.getIsLatin()){  //если массив признан латинским
                res.setIsLatin(true); //вносим в бд что исчисления на латинском
                res.setUserDataInt(itsLatin.getUserDataInt());} //вносим в бд значения приведенные из латинского в ар
        }



        //проверка на допустимую величину значений
        VelichinaZnacheniy velichina = new  VelichinaZnacheniy();
        velichina.startProverkaVelichini(res.getUserDataInt());

        //выполнение математических операций
        Matematika mat = new Matematika();
        mat.setZadacha(res.getUserDataInt(),res.getArifZnakInt()); //передаем значения и ариф знак
        res.setRezult(mat.getRezult()); //вносим в рес результат вычеслений



        //вывод результата значений
        if(!res.getIsLatin()) //если значения были изначально приведенны не на латинском
        System.out.println(res.getRezult()); //сразу же вывовдим результат
        //иначе приводим результат из арабского в латинский
        else System.out.println(itsLatin.getLatinFromArab(res.getRezult()));
    }


}
