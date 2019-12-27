package com.ahilessPrime.main.res;
import java.util.Scanner;

public class UserInput {

    private String userInput;
    public void setUserInput(){
        System.out.println("введите значение: ");
        Scanner scan = new Scanner(System.in);
        userInput=scan.nextLine();

    }
    public String getUserInput(){return userInput;}
}
