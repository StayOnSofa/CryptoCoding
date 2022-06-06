package crypto2;

import java.util.ArrayList;
import java.util.Random;

public class Crypto2 {
    
    
    public static Person GetRandomValueFromArray(ArrayList<Person> persons)
    {
        int rnd = new Random().nextInt(persons.size());
        return persons.get(rnd);
    }
    
    public static ArrayList<Person> GetRandomSequence(ArrayList<Person> persons) 
    {
        ArrayList<Person> nPersons = new ArrayList<>();
        
        while (nPersons.size() != persons.size())
        {
            Person person = GetRandomValueFromArray(persons);
            if (!nPersons.contains(person))
            {
                nPersons.add(person);
            }
        }
        
        return nPersons;
    }
    
    public static void main(String[] args) {
        
        Person anya = new Person("Anya", 95);
        Person borya = new Person("Borya", 57);
        Person vasya = new Person("Vasya", 64);
        Person gena = new Person("Gena", 55);
     
        ArrayList<Person> persons = new ArrayList<>();
        
        persons.add(anya);
        persons.add(borya);
        persons.add(vasya);
        persons.add(gena);
                
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        
        
        float value = 0;
        float prevValue = -1;
        
        while (value != prevValue)
        {
            prevValue = value;
            persons = GetRandomSequence(persons);
            
            for (int i = 0; i < persons.size(); i++) {
                value+= persons.get(i).getIqPart();
            }
        }
        
        System.out.println("AnonymousAlgoritm: " + (value/4));
        
        System.out.println("StandartAlgoritm: " + 
                (anya.GetIQ() + borya.GetIQ() + vasya.GetIQ() + gena.GetIQ())/4);
    }
}
