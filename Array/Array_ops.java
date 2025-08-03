package Array;

public class Array_ops {


    public static void insert (int marks[]){
        for(int i=0;i<marks.length;i++)

        marks[i]=i;
    }

    public static void main(String[] args) {
        
        int marks [] = new int[10]; 
        int rollno [] = {};
        insert(marks);

        for(int i=0;i<marks.length;i++){

           System.out.println(marks[i]);
    }
    }

    }
    

