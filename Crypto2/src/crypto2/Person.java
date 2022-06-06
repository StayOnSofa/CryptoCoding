package crypto2;

public class Person
    {
        public int GetRandomValue(int Min, int Max)
        {
             return (int) (Math.random()*(Max-Min))+Min;
        }
        
        public int GetProcentValue()
        {
            return GetRandomValue(1, 100);
        }

        private int _iqToSend;
                
        private String _name;
        private int _iq;
        
        public int GetIQ()
        {
            return _iq;
        }
        
        public Person(String name, int iq)
        {
            _name = name;
            _iq = iq;
            
            _iqToSend = iq;
        }
        
        public float getIqPart()
        {
            int procent = GetProcentValue();
            float toSend = ((float)_iq/100) * procent;
       
            if (toSend < _iqToSend)
            {
                _iqToSend -= toSend;
                return toSend;
            }
            else
            {
                int b = _iqToSend;
                _iqToSend = 0;
                
                return b;
            }
        }
        
        @Override
        public String toString()
        {
            return _name + " :" + _iq;
        }
    }
