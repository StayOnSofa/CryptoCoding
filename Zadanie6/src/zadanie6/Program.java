/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadanie6;

/**
 *
 * @author StayO
 */
public class Program {
 
    int N = 6;
    int[] key = {3,4,0,5,1,2};
   
    
    private String encode(String word)
    {
        String newWord = "";
        
        for (int i = 0; i < key.length; i++) {
            int index = key[i];
            
            newWord += word.charAt(index);
        }
       
        return newWord;
    }
    
    private String decode(String word)
    {
        char[] chars = new char[key.length];

        for (int i = 0; i < key.length; i++) {
            int index = key[i];
            chars[index] = word.charAt(i);
        }

        String newWord = "";
         
        for (int i = 0; i < chars.length; i++) {
             newWord += chars[i];
        }
         
        return newWord;
    }
    
    public void Run()
    {
        String encode = encode("яблоко");
        System.out.println(encode);
        
        String decode = decode(encode);
        System.out.println(decode);
    }
}
