package crypto3;

import java.util.ArrayList;

public class Crypto3 {
    
    public static void main(String[] args) {
        ArrayList<News> newsBox = new ArrayList<>();
        
        newsBox.add(new News("Empty"));
        newsBox.add(new News("Empty"));
        newsBox.add(new News("Secret"));
        newsBox.add(new News("Empty"));
        newsBox.add(new News("Empty"));
        
        //show all
        
        for (int i = 0; i < newsBox.size(); i++) {
            News n = newsBox.get(i);
            System.out.println(n);
        }
    }
    
}
