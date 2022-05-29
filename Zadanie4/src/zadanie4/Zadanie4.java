package zadanie4;

import java.util.ArrayList;

public class Zadanie4 {

    
    public static class Index
    {
        public int X;
        public int Y;
        
        public Index(int X, int Y)
        {
            this.X = X;
            this.Y = Y;
        }
    }
    
    private static ArrayList<Index> nIndexes = new ArrayList<>();
    
    private static ArrayList<Index> CollectKeysToFillArray(int arrayScale, int wordLenght)
    {        
        nIndexes.clear();
        
        int centerX = (int)Math.floor(arrayScale/2f);
        int centerY = (int)Math.floor(arrayScale/2f);
        
        int iteration = 1;
        int index = 0;
        
        int writeX = centerX;
        int writeY = centerY;
       
        nIndexes.add(new Index(writeX, writeY));
        
        while (iteration <= wordLenght)
        {
            boolean trybreak = false;
            
            index+=1;

            for (int i = 1; i <= index; i++) {
                writeX += 1;
                nIndexes.add(new Index(writeX, writeY));
                iteration +=1;
                
                if (iteration == wordLenght)
                {
                    trybreak = true;
                    break;
                }
            }
           
            if (trybreak == true)
            {
                break;
            }
            
            for (int i = 1; i <= index; i++) {
                 writeY -= 1;
                 nIndexes.add(new Index(writeX, writeY));
                 iteration +=1;
                 
                if (iteration == wordLenght)
                {
                    trybreak = true;
                    break;
                }
            }
            
            if (trybreak == true)
            {
                break;
            }
            
            index+=1;
            for (int i = 1; i <= index; i++) {
                writeX -= 1;
                nIndexes.add(new Index(writeX, writeY));
                iteration +=1;
                
                if (iteration == wordLenght)
                {
                    trybreak = true;
                    break;
                }
            }
            
            if (trybreak == true)
            {
                break;
            }
            
            for (int i = 1; i <= index; i++) {
                writeY += 1;
                nIndexes.add(new Index(writeX, writeY));
                iteration +=1;
                
                if (iteration == wordLenght)
                {
                    trybreak = true;
                    break;
                }
            }
            
            if (trybreak == true)
            {
                break;
            }
           
        }
        
        return nIndexes;
    }
    
    public static char[][] Encode(String word)
    {
        char[][] array = new char[11][11];

        ArrayList<Index> writes = CollectKeysToFillArray(array.length, 121);
        
        for (int i = 0; i < writes.size(); i++) {
            
            Index index = writes.get(i);
            array[index.X][index.Y] = word.charAt(i);
        }
        
        return array;
    }
    
    public static String reverseString(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
}  
    
    public static String Decode(char[][] array)
    {
        String word = "";
        ArrayList<Index> writes = CollectKeysToFillArray(array.length, 121);
         
         for (int i = 0; i < writes.size(); i++) {
            int _i = (writes.size()-1) - i;
            
            Index index = writes.get(_i);
            char _char = array[index.X][index.Y];
            
            word += _char;
        }
         
         return reverseString(word);
    }
    
    public static void main(String[] args) {
   
        String toencode = "приветкакутебяделаменязовут1234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234";
        char[][] array = Encode(toencode);
   
        
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                System.out.print(array[y][x] + " ");
            }
            System.out.print("\n");
        }
        
        String decode = Decode(array);
        System.out.println(decode);    
    }
    
}
