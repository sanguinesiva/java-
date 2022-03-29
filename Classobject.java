/**
 * Classobject
 */
public class Classobject {
public static void main(String[] args) {
    Class c= new Class("siva", 1);
    c.printdetails();

    
}
}
    class Class{
    String name;
    int number;

    public Class(String name, int number){
        this.name= name;
        this.number= number;

    }
    public void printdetails(){
        System.out.println(this.name);
        System.out.println(this.number);

    }


}

