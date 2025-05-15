package Means;
import Means.app;

public class book extends app {
    public String name;

    public book(String name) {
        this.name = name;
    }

    @Override
    public String coverName() {
        return name;
    }

    // public book(book original) {
    //     this.name = name;
    // }
    
    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // @Override
    // public void display() {
    //     System.out.println(name);
    // }

    // public String toString () {
    //     return "Book{ Name:" + name + "}";
    // }

}

class TestBook {
    public static void main(String[] args) {
        // book b = new book("lolita");
        // book b1 = new book(b);
        // b.display();
        // b1.setName("BangPhat");
        // b1.setName("NguyenChiPhat");
        // b1.display();
        // System.out.println(b1.getName());
        book a = new book("Cac");
        System.out.println(a.coverName());        
    }
}