package adapter.training2;

import adapter.Chairperson;
import adapter.Taro;

public class Hanako implements Chairperson{
    private Taro taro;
    public Hanako(){
        this.taro = new Taro();
    }
    public void organizeClass(){
        this.taro.enjoyWithAllClassmate();
    }
}