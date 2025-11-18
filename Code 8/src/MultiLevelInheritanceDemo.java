class GrandParent {
    void showGP() {
        System.out.println("GrandParent method");
    }
}

class Parent extends GrandParent {
    void showP() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void showC() {
        System.out.println("Child method");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.showGP(); 
        c.showP();  
        c.showC();  
    }
}
