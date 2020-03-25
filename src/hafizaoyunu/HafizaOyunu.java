package hafizaoyunu;

import java.util.Scanner;

public class HafizaOyunu {
        private static Karti [][] kartlar=new Karti[4][4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        
        kartlar[0][0]=new Karti('E');
         kartlar[0][1]=new Karti('A');
          kartlar[0][2]=new Karti('B');
           kartlar[0][3]=new Karti('F');
           
            kartlar[1][0]=new Karti('G');
            kartlar[1][1]=new Karti('A');
             kartlar[1][2]=new Karti('D');
           kartlar[1][3]=new Karti('H');
           
            kartlar[2][0]=new Karti('F');
         kartlar[2][1]=new Karti('C');
          kartlar[2][2]=new Karti('D');
           kartlar[2][3]=new Karti('H');
           
            kartlar[3][0]=new Karti('E');
         kartlar[3][1]=new Karti('G');
          kartlar[3][2]=new Karti('B');
           kartlar[3][3]=new Karti('C');
           
          //oyunTahtasi();
          while(oyunBittiMi()==false){
              oyunTahtasi();
              tahminEt();
              
          }
        
        
        
    }
    public static void tahminEt(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birini tahmin (i ve j degerlerini 1 bosluklu giriniz:....)");
        int i1=scanner.nextInt();
        int j1=scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        System.out.println("Birini tahmin (i ve j degerlerini 1 bosluklu giriniz:....)");
        int i2=scanner.nextInt();
        int j2=scanner.nextInt();
       
        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger()){
              kartlar[i2][j2].setTahmin(true);
        }
        else{
             kartlar[i1][j1].setTahmin(false);
        }
        
        
    }
    public static boolean oyunBittiMi(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()==false){
                    return false;
                }
                
            }
        }
        return true;
    }
    public static void  oyunTahtasi(){
        for(int i=0;i<4;i++){
            System.out.println("---------------------------");
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" |"+kartlar[i][j].getDeger()+"| ");
                }
                else{
                    System.out.print("| |  ");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
    }
    
}
