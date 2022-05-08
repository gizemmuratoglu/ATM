import java.util.Scanner;
public class hesap {
    
    private String kullanıcıAdı;
    private int sifre;
    private int bakiye;
    
    public hesap(String kullanıcıAdı, int sifre, int bakiye){
        this.kullanıcıAdı=kullanıcıAdı;
        this.sifre=sifre;
        this.bakiye=bakiye;
        
    }

    /**
     * @return the kullanıcıAdı
     */
    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    /**
     * @param kullanıcıAdı the kullanıcıAdı to set
     */
    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    /**
     * @return the sifre
     */
    public int getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
    
  

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
     
    public void paraCekme(int tutar){
            
        
        
        if (tutar > bakiye){
            System.out.println("yeterli bakiyeniz yok");
        }
        else 
    
            bakiye-=tutar;
       
        System.out.println("yeni bakiyeniz"+ bakiye);
    
    }
    
    public void paraYatırma (int para){
       
        
        bakiye+=para;
        System.out.println("yeni bakiyeniz "+ bakiye);
        
    }
    
    
    
}
