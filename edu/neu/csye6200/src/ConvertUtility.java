package neu.csye6200.src;



public class ConvertUtility {

    public  int integerConversion (String s){
        int cnvt=0;
        try{
            cnvt=Integer.valueOf(s);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        return cnvt;
    }

    public  double doubleConversion (String s){
        double cnvt=0;
        try{
            cnvt=Double.valueOf(s);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        return cnvt;
    }
}
