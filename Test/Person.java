package Test;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person myobj = new Person();
        myobj.setName("Johnson");
        System.out.println(myobj.getName());
    }
}