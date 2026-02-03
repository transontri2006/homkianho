package lec9_InheritanceAndPolymorphism.Overringding;

public class cat extends Animal {

    @Override
     void makeSound() {
        System.out.println("Meows meows");
    }
}
