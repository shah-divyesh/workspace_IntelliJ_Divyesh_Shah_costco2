package neu.csye6200.src;

public class Driver {
    public static void main(String[] args) {
        Midterm.demo();
    }
}


//C:\Users\DIVYESH\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=60365:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath F:\CSYE6200\project_IntelliJ_Divyesh_Shah_midterms\out\production\project_IntelliJ_Divyesh_Shah_midterms neu.csye6200.src.Driver
//        neu.csye6200.src.Midterm.main()...
//
//        demoAbstraction...
//        Printing toString() value to demonstrate Abstraction using Parent Class by hiding implementation of child class
//neu.csye6200.src.Costco@776ec8df
//
//        demoEncapsulation...
//        Printing itemName to demonstrate encapsulation
//        itemName: Chips
//
//        demoInheritance...
//        Child Class object(service) accessing member of Parent Class(ItemAPI) demonstrate inheritance
//        ItemName: Butter
//
//        demoPolymorphism...
//        Overriding toString() method to demonstrate polymorphism
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//
//        demoStaticData...
//        Printing the value of static data  member count which i created expliclity to demonstrate static data
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
//
//        demoImmutableData...
//        Since hashcode of both objects are same it indicates Both Objects are same and have not changed
//        a=2024204569  ,b=2024204569
//        -----------------------------Add Items to their respective classes---------------------------
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//
//        ----------------------Sorting All Items by ID in Ascending Order------------------
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//
//        -----------------------Sorting All Items by ID in Descending Order-------------------------
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//
//        --------------------------Sorting All Items by Price in Ascending Order----------------------
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//
//        --------------------------Sorting All Items by Price in Descending Order----------------------
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//
//        --------------------------Sorting All Items by Name in Ascending Order----------------------
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//
//        --------------------------Sorting All Items by Name in Descending Order----------------------
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//
//        --------------------------Sorting All Items by Description in Ascending Order----------------------
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//
//        --------------------------Sorting All Items by Description in Descending Order----------------------
//        Durable{ ItemAPI{ itemID=6, itemPrice=384.49, itemCategory='Treadmill', itemName='Voyager Pro Treadmill'}, weight=98.3, weightUnit='kg'}
//        ItemAPI{ itemID=4, itemPrice=0.89, itemCategory='Snack', itemName='Mounds chocolate bar'}
//        Durable{ ItemAPI{ itemID=8, itemPrice=6.89, itemCategory='Slippers', itemName='bath slippers'}, weight=2.5, weightUnit='oz'}
//        ItemAPI{ itemID=2, itemPrice=3.49, itemCategory='OJ', itemName='Tropicana Oriage Juice'}
//        ItemAPI{ itemID=3, itemPrice=1.49, itemCategory='Milk', itemName='Almond Milk'}
//        Durable{ ItemAPI{ itemID=7, itemPrice=101.49, itemCategory='Mattress', itemName='Air Mattress'}, weight=27.6, weightUnit='kg'}
//        ItemAPI{ itemID=1, itemPrice=2.49, itemCategory='Cheese', itemName='Provolone cheese'}
//        Durable{ ItemAPI{ itemID=5, itemPrice=12.49, itemCategory='Chair', itemName='folding chair'}, weight=2.89, weightUnit='Lbs'}
//        neu.csye6200.src.Midterm.main()... done!
//
//        Process finished with exit code 0