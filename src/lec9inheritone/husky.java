
package lec9inheritone;


 public class husky extends Dog {

    void displayInformation() {
        super.displayPrice(); // gọi method của class cha
        System.out.println("Husky's price is 1500 USD");
    }

    public static void main(String[] args) {
        husky husky = new husky();
        husky.displayInformation(); // gọi đúng cách
    }
}   
     
