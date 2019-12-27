package com.ahilessPrime.main.res;

public class VelichinaZnacheniy {

    public void startProverkaVelichini(int [] userData){
        for(int n:userData){
            if(n>10|n<0) throw new IllegalArgumentException("приведено слишком большое или малое значение");
        }
    }

}
