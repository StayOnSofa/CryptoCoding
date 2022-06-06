package crypto1;

public class Crypto1 {

    public static void main(String[] args) {
      
        int AnyaIQ = 60;
        int BoryaIQ = 110;
        int VasyaIQ = 86;
        int GenaIQ = 83;
        
        //secret
        int AnyaR = (int)(Math.random()*100);
       
        int result = (AnyaIQ + BoryaIQ + VasyaIQ + GenaIQ)/4;
        System.out.println(result);
        
        AnyaIQ  += AnyaR;
        BoryaIQ += AnyaIQ;
        VasyaIQ += BoryaIQ;
        GenaIQ += VasyaIQ;

       
        result = (GenaIQ - AnyaR)/4;
        System.out.println(result);
    }
    
}
