import java.util.Scanner;
public class giris {
    
    public boolean kontrol(hesap hesap){
        
        
           
        Scanner scan=new Scanner (System.in);
        System.out.println("kullanıcı adını giriniz");
        String kullanıcıAdı=scan.nextLine();
        System.out.println("şifrenizi giriniz");
        int sifre=scan.nextInt();
        
           if(  hesap.getKullanıcıAdı().equals(kullanıcıAdı) && hesap.getSifre() == sifre){  //equals metotu string için kullanılıyor sadece
               return true;
               
           }
           else 
               return false;
           
        
        
        
        
        
        
        
        
        
    }
   
    
}
