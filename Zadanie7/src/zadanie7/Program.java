package zadanie7;

public class Program {
    
    public String Encode(String data)
    {
        String newData = "";
        
        newData += data.charAt(0);
        
        for (int i = 1; i < data.length(); i++) {
            
            char prevValue = data.charAt(i-1);
            char newValue = data.charAt(i);
            
            if (prevValue == newValue)
            {
                newData+="1";
            }
            else{
                newData+="0";
            }
            
        }
        
        return newData;
    }
    
    public String Decode(String data)
    {
        StringBuilder _data = new StringBuilder(data);
        
        for (int i = 0; i < data.length() - 1; i++) {
            
            char value = _data.charAt(i);
            char nextValue = _data.charAt(i + 1);
            
            if (nextValue == value)
            {
                _data.setCharAt(i + 1, '1');
            }
            else{
                _data.setCharAt(i + 1, '0');
            }
            
        }
        
        
        return _data.toString();
    }
    
    
    public void Run()
    {
        String encode = Encode("0000111");
        System.out.println(encode);
        
        String decode = Decode(encode);
        System.out.println(decode);
    }
  
}
