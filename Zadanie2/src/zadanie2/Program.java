
package zadanie2;


public class Program {
    
    char[] abs ="абвгдеёжзиклмнопрстуфхцчшщъыьэюя ".toCharArray();
           
    private int getIndexOfChar(char _char)
    {
        for (int i = 0; i < abs.length; i++) {
            String value = "" + abs[i];
            if (value.equals((_char) + ""))
            {
                return i;
            }
        }
        
        return 0;
    }
    
    private int N = 1;
    
    private String decode(String word)
    {
       String newWord = "";
        
       int lenght = abs.length;
       
       for (int i = 0; i < word.length(); i++) {
           char _char = word.charAt(i);
           
           int index = getIndexOfChar(_char);
           
           index -= N;
          
           
           if (index < 0)
           {
               index = index + lenght;
           }
           
           newWord+= abs[index];
       }
       
       return newWord;
    }
    
    private String encode(String word)
    {
       String newWord = "";
        
       int lenght = abs.length;
       
       for (int i = 0; i < word.length(); i++) {
           char _char = word.charAt(i);
           
           int index = getIndexOfChar(_char);
           
           index += N;
          
           
           if (index > lenght - 1)
           {
               index = index - lenght;
           }
           
           newWord+= abs[index];
       }
       
       return newWord;
    }
    
    public void Run()
    {
        String e = encode("привет яблоко");
        System.out.println(e);
        
        
        String d = decode(e);
        System.out.println(d);
        
    }
   
}
