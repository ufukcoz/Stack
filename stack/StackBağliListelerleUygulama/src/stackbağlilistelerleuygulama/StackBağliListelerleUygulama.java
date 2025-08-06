
package stackbağlilistelerleuygulama;

import java.util.Scanner;

public class StackBağliListelerleUygulama {

  
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("stack yapisina kac eleman girmek istersiniz");
        int n=scan.nextInt();
        StackYapisi liste=new StackYapisi(n);
        int seçim=-1,sayi;
        while(seçim!=0){
            System.out.println("1-ekle");
            System.out.println("2-sil");
            System.out.println("3-topu goster");
            System.out.println("4-yazdir");
            System.out.println("0-cikis");
            System.out.println("seciminiz : ");seçim=scan.nextInt();
            
            switch(seçim){
                case 1:System.out.println("sayi : ");sayi=scan.nextInt();
                     liste.push(sayi);break;
                case 2:liste.pop();break;
                case 3:liste.TopGöster();break;
                case 4: liste.print();break;
                case 0:System.out.println("cikis yapiliyor");break;
                default:System.out.println("hatalı secim (0-4)");
            }

            
            
            
            
        }
    }
    
}
