

public class main {
    public static void main (String Args[]){
        hesap hesap1=new hesap("gizem", 1245, 500);
        giris giris=new giris();
        atm atm=new atm();
        
        atm.calıstır(hesap1, giris);
        System.out.println("çıkıldı");
        
        
    }
    
}
