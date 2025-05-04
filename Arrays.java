public class Arrays {
    public static void main(String[] args) {
        // this use is marks 0 to print you are not fix to watch video
        int [] marks = {1,2,3,4,5};
        marks[3] = 34;
        System.out.println(marks[0]);
        System.out.println(marks[3]);

        // Classical way to ilerate an array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // For each Loop
        System.out.println("This is for each loop:");
        for(int value:marks){
            System.out.println(value);
        }

        int [][] matrix = {{1,2,3,}, 
                                {4,5,6,}};
        System.out.println(matrix[0][1]);

        String[] cars = {"Muruti haider", "Muruti", "Suzuki", "Innova", "Ford Titainium"};
        for(String value:cars){
            System.out.println(value);
        }
        
    }
}
