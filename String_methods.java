public class String_methods {
    public static void main(String[] args) {
       /*  Veriables use is containers which store iteam values
         more types this name 
         String, int, float, char, boolean
         String: mean Text
         int: mean number
         char: mean one charcter
         float: mean floating number e.g 2.13
         boolean: mean true , false
         
        water - Bucket
        Masala - box
        Lunch - LunchBox
        How to dectare veriables:
        syntax - <dataType> <veriablesName> - <value>;
        */ 
        // This use is name length
        String name = "Haider";
        // System.out.println(name.length());
        // This use is exmple: Haider name + channel
        String channel = "Eqan With harry";
        System.out.println(name + " from "  + channel);
        // System.out.println(name + " from/"   + channel);
        // System.out.println(name + " from// " + channel);
        // System.out.println(name + " from/t " + channel);
        // System.out.println(name + " from/. " + channel);

        // String man = "Haider";
        // System.out.println(man);
        // String Topper = "Haider";
        // System.out.println(Topper.toUpperCase());
        // String Backbencher = "Haider";
        // System.out.println(Backbencher.toLowerCase());
        // who hai name pe hai 
        System.out.println(name.contains("Hai"));
        System.out.println(name.charAt(2));
        System.out.println(name.endsWith("er"));
        System.out.println(name.indexOf("aid"));
    }
}
