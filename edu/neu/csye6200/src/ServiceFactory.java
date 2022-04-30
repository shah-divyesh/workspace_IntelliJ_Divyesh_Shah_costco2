package neu.csye6200.src;

import java.util.List;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private ServiceFactory() {
    }
    public static ServiceFactory getInstance() {
        return instance;
    }

    public void addItems(ConvertUtility convertUtility, String items, List<ItemAPI> list){
        String[] s=items.split(",");
        list.add(new Service(convertUtility.integerConversion(s[0]),convertUtility.doubleConversion(s[1]),s[2],s[3],s[4],s[5],s[6]));
    }

}
