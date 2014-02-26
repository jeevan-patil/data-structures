package org.java.test;

public class Test {
    public static void main(String[] a) {
        User user = new User();
        user.setName("ok");
        user.setNumber(120);
        changeUser(user);
        
        A aa = new InterfaceTest();
        aa.print();
        B bb = new InterfaceTest();
        bb.print();
    }

    private static void changeUser(User user) {
        user.setName("change");
        user.setNumber(123);
    }
}

class User {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", number=" + number + "]";
    }

}
