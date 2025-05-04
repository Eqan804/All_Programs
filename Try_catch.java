public class Try_catch {
    public static void main(String[] args) {
        /*
         * This use is one error but
         * not run second line this fix is
         */
        String[] cars = {"Muruti haider", "Muruti", "Suzuki", "Innova", "Ford Titainium"};
        try{
            System.out.println(cars[5]);
        }   
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Masoom");
    }
}
