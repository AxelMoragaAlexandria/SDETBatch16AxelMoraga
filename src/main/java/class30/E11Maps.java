package class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E11Maps {
    public static void main(String[] args) {

        Map<String,String>info=new HashMap<>();
        info.put("Moncef","Morocco");

        Map<String, List<String>>moreInfo=new HashMap<>();

        List<String>moncefCitites=new ArrayList<>();
        List<String>halimaCities=new ArrayList<>();
        moncefCitites.add("Rabat");
        moncefCitites.add("Chefchaoun");
        moncefCitites.add("AL Hoceiuma");
        moncefCitites.add("Marrakech");

        halimaCities.add("Frankfurt");
        halimaCities.add("Dubai");
        halimaCities.add("Malikah");

        moreInfo.put("Halima",halimaCities);
        moreInfo.put("Moncef",moncefCitites);
        System.out.println(moreInfo);











    }
}
