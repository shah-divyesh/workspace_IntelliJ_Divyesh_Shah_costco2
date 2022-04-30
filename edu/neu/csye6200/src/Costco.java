package neu.csye6200.src;

import java.util.*;

public class Costco extends StoreAPI  {

    public  static  void demo(){

        String[] items=new String[]{
                "2,3.49,OJ,Tropicana Oriage Juice",
                "1,2.49,Cheese,Provolone cheese",
                "3,1.49,Milk,Almond Milk",
                "4,0.89,Snack,Mounds chocolate bar",
                "6,384.49,Treadmill,Voyager Pro Treadmill,98.3,kg",
                "5,12.49,Chair,folding chair,2.89,Lbs",
                "7,101.49,Mattress,Air Mattress,27.6,kg",
                "8,6.89,Slippers,bath slippers,2.5,oz"
        };

        Costco costco=new Costco();
        DurableFactory durableFactory=DurableFactory.getInstance();
        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        ConvertUtility convertUtility=new ConvertUtility();
        List<ItemAPI> itemAPIList=new ArrayList<>();

        System.out.println("-----------------------------Add Items to their respective classes---------------------------");
        itemAPIList=costco.addItems(convertUtility,items[0],itemAPIList);
        itemAPIList=costco.addItems(convertUtility,items[1],itemAPIList);
        itemAPIList=costco.addItems(convertUtility,items[2],itemAPIList);
        itemAPIList=costco.addItems(convertUtility,items[3],itemAPIList);
        itemAPIList=durableFactory.addDurable(convertUtility,items[4],itemAPIList);
        itemAPIList=durableFactory.addDurable(convertUtility,items[5],itemAPIList);
        itemAPIList=durableFactory.addDurable(convertUtility,items[6],itemAPIList);
        itemAPIList=durableFactory.addDurable(convertUtility,items[7],itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }


        System.out.println("\n"+"----------------------Sorting All Items by ID in Ascending Order------------------");
        itemAPIList=sortByID(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }

        System.out.println("\n"+"-----------------------Sorting All Items by ID in Descending Order-------------------------");
        itemAPIList=sortByID(itemAPIList);
        Collections.reverse(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }



        System.out.println("\n"+"--------------------------Sorting All Items by Price in Ascending Order----------------------");
        itemAPIList=sortByPrice(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }

        System.out.println("\n"+"--------------------------Sorting All Items by Price in Descending Order----------------------");
        itemAPIList=sortByPrice(itemAPIList);
        Collections.reverse(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }

        System.out.println("\n"+"--------------------------Sorting All Items by Name in Ascending Order----------------------");
        itemAPIList=sortByName(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }

        System.out.println("\n"+"--------------------------Sorting All Items by Name in Descending Order----------------------");
        itemAPIList=sortByName(itemAPIList);
        Collections.reverse(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }

        System.out.println("\n"+"--------------------------Sorting All Items by Description in Ascending Order----------------------");
        itemAPIList=sortByDescription(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }

        System.out.println("\n"+"--------------------------Sorting All Items by Description in Descending Order----------------------");
        itemAPIList=sortByDescription(itemAPIList);
        Collections.reverse(itemAPIList);
        for (ItemAPI s : itemAPIList) {
            System.out.println(s.toString());
        }
    }

    public static  List<ItemAPI> sortByID(List<ItemAPI> itemAPIList){
        Comparator<ItemAPI> sortById = (o1, o2) -> Integer.valueOf(o1.getItemID()).compareTo(Integer.valueOf(o2.getItemID()));
        itemAPIList.sort(sortById);
        return itemAPIList;
    }

    public  static  List<ItemAPI> sortByPrice(List<ItemAPI> itemAPIList){
        Comparator<ItemAPI> sortById = (o1, o2) -> Double.valueOf(o1.getItemPrice()).compareTo(Double.valueOf(o2.getItemPrice()));
        itemAPIList.sort(sortById);
        return itemAPIList;
    }

    public static  List<ItemAPI> sortByName(List<ItemAPI> itemAPIList){
        Comparator<ItemAPI> sortByName = (o1, o2) -> String.valueOf(o1.getItemName()).compareToIgnoreCase(String.valueOf(o2.getItemName()));
        itemAPIList.sort(sortByName);
        return itemAPIList;
    }

    public static  List<ItemAPI> sortByDescription(List<ItemAPI> itemAPIList){
        Comparator<ItemAPI> sortByDescription = (o1, o2) -> String.valueOf(o1.getItemDescription()).compareToIgnoreCase(String.valueOf(o2.getItemDescription()));
        itemAPIList.sort(sortByDescription);
        return itemAPIList;
    }

    public List<ItemAPI> addItems(ConvertUtility convertUtility,String items, List<ItemAPI> list) {
        String[] s=items.split(",");
        list.add(new ItemAPI(convertUtility.integerConversion(s[0]),convertUtility.doubleConversion(s[1]),s[2],s[3]));
        return  list;
    }


}
