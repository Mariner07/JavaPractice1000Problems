package maps;

import java.util.ArrayList;

public class MapIntro1 {
    public static void main(String[] args) {
        String ssnElena= "011-10-1011";
        String nameElena="Elena Sova";

        ArrayList<String> infoElena = new ArrayList<>();
        infoElena.add(ssnElena);
        infoElena.add(nameElena);

        int indexOfSSN= infoElena.indexOf("011-10-1011");
        System.out.println("Here is the name associated with this SSN:"+ infoElena.get(indexOfSSN+1));
    }

    
}
