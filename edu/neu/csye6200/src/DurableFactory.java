package neu.csye6200.src;

import java.util.List;

public class DurableFactory {
    public static DurableFactory instance;

    private DurableFactory() {
        instance = null;
    }
    public static synchronized DurableFactory getInstance() {
        if (instance == null) {
            instance =  new DurableFactory();
        }
        return instance;
    }

    public List<ItemAPI> addDurable(ConvertUtility convertUtility, String items, List<ItemAPI> list){
        String[] s=items.split(",");
        list.add(new Durable(convertUtility.integerConversion(s[0]),convertUtility.doubleConversion(s[1]),s[2],s[3],convertUtility.doubleConversion(s[4]),s[5]));
        return list;
    }

}
