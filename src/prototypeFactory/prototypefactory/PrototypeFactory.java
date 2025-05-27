package prototypeFactory.prototypefactory;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, AJucator> prototipuriJucatori = new HashMap<>();

    static {
        JucatorFotbal jucatorFotbal = new JucatorFotbal();
        prototipuriJucatori.put("fotbal", jucatorFotbal);

        JucatorHandbal jucatorHandbal = new JucatorHandbal();
        prototipuriJucatori.put("handbal", jucatorHandbal);

        JucatorTenis jucatorTenis = new JucatorTenis();
        prototipuriJucatori.put("tenis", jucatorTenis);
    }

    public static AJucator getPrototipJucator(String tip){
        AJucator jucator = null;
        AJucator prototipJucator = prototipuriJucatori.get(tip);
        if(prototipJucator!=null){
            jucator = prototipJucator.clone();
        }
        return jucator;
    }
}
