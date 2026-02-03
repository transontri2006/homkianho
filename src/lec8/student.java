
package lec8;

public class student {

    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        student s1 = new student(111, "Karan");
        student s2 = new student(321, "Aryan");
        s1.display();
        s2.display();
    }
}
 
    
    


