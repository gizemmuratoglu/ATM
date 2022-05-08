import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
public class atm {
    private Object scan;
    
    public void calıstır(hesap hesap, giris giris){
        Scanner scan=new Scanner(System.in);
        int sayac=3;
        while (true){
            if (giris.kontrol(hesap)){
                System.out.println("giriş başarılı");
                break;
            }
            else  {
                System.out.println("giriş başarısız tekrar deneyin");
            sayac--;
            
            }
             if(sayac==0);{
            System.out.println("sistemden çıkılıyor");
            return;
        }
    }
        
        while (true){
        String secenek ="1- para çekme/n"
                + "2- para yatırma/n"
                + "3- bakiye öğrenme/n"
                + "4- çıkıs/n";
        
        System.out.println("yapmak istediğiniz işlemi seçiniz" + secenek);
        String islem=scan.nextLine();
        
        if(islem.equals("1")){
            
        System.out.println("cekmek istediğiniz tutarı giriniz");
        int tutar=scan.nextInt();
        scan.nextLine();
            hesap.paraCekme(tutar);
        }
            else if(islem.equals("2")){
                 
        System.out.println("yatırmak istediğiniz parayı girnniz");
        int para=scan.nextInt();
        hesap.paraYatırma(para);
        
                
                    }
            else if(islem.equals("q")){
               break;
            }
            else 
                System.out.println("gecersiz işlem");
            
            
            
        }
        
    }
    }
    

