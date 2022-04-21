package training2.adapter;

public class Hanako implements Chairperson{
    private Taro taro;
    public Hanako(){
        this.taro = new Taro();
    }
    public void organizeClass(){
        this.taro.enjoyWithAllClassmate();
    }
}