package CORE;

abstract class om {

    public om()
    {
        System.out.println("the constructur of the ABSTRACT CLASS");
    }

    abstract public void name();
    public void age()
    {
        System.out.println("the age is 20");
    }

}



public class abstractexapmle extends om {

    public abstractexapmle()
    {
        System.out.println("this is the abstract example default constructor ");
    }

    

    public void agee()
    {
        System.out.println("my new age is now 22");
    }

    @Override
    public void name()
    {
        System.out.println("this is the name method of the sub class ");
    }
    public static void main(String[] args) {
        
        om o = new abstractexapmle();
       o.age();

    }
    

}
