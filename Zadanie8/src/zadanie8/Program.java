package zadanie8;

public class Program {
    
    private char IsZero(char value1, char value2, char value3)
    {
        int zeros = 0;
        
        if (value1 == '0')
        {
            zeros += 1;
        }
        
        if (value2 == '0')
        {
            zeros += 1;
        }
            
        if (value3 == '0')
        {
            zeros += 1;
        }
        
        
        if (zeros >= 2)
        {
            return '0';
        }
        
        return '1';
    }
    
    
    private String Decode(String data)
    {
        String signal = "";
        
        int lenght = data.length()/3;
        int index = 0;
        
        
        for (int i = 0; i < lenght; i++) {
            
            char value1 = data.charAt(index);
            char value2 = data.charAt(index + 1);
            char value3 = data.charAt(index + 2);
            
            signal += IsZero(value1, value2, value3);
            
            index+=3;
        }
        
        return signal;
    }
    
    public void Run()
    {
        //0101
        String data = Decode("110111001011");
        System.out.println(data);
    }
}
