
package zadanie3;


public class Program {
    
    char[] abs ="абвгдеёжзиклмнопрстуфхцчшщъыьэюя ".toCharArray();
    char[] coded_abs ="qwertyuiop[]asdfghjkl;'zxcvbnm,:7".toCharArray();
    
    private int getIndexOfChar(char[] abc, char _char)
    {
        for (int i = 0; i < abc.length; i++) {
            String value = "" + abc[i];
            if (value.equals((_char) + ""))
            {
                return i;
            }
        }
        
        return 0;
    }
    
    private String encode(String word)
    {
        String newWord = "";
        
        for (int i = 0; i < word.length(); i++) {
            char _char = word.charAt(i);
            int index = getIndexOfChar(abs, _char);
         
            newWord += coded_abs[index];
        }
        
        return newWord;
    }
    
    private String decode(String word)
    {
        String newWord = "";
        
        for (int i = 0; i < word.length(); i++) {
            char _char = word.charAt(i);
            int index = getIndexOfChar(coded_abs, _char);
         
            newWord += abs[index];
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
