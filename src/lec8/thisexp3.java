
package lec8;


public class thisexp3 {
    int id;
    String name;
    thisexp3 () {
        System.out.println("default lec8 is invoked");
    }
    thisexp3(int id,String name) {
        this();
        this.id = id;
        this.name = name;
    }
    void display(){System.out.println(id+" "+name);}
    
    public static void main(String args[]) {
        thisexp3 s1 = new thisexp3(111,"karan");
        thisexp3 s2 = new thisexp3(222,"Aryan");
        s1.display();
        s2.display();
    }
}
        
    
    

