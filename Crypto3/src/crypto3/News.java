package crypto3;


public class News {
    public String _data;
    
    public News(String data)
    {
        _data = data;
    }
    
    @Override
    public String toString()
    {
        return _data;
    }
}
