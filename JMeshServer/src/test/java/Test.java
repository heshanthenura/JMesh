public class Test {
    public static void main(String[] args) {
        Person person1   = new Person();
        person1.setName("name1");
        System.out.println(person1.getName());
        Person person2   = new Person();
        System.out.println(person2.getName());


    }


}
class Person{

    public static String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}