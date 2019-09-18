package kata1a;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person pau = new Person("Pau Gasol", new Date(84,1,10));
        System.out.println(pau.getName());
        System.out.println(pau.getAge());
    }
    
}
