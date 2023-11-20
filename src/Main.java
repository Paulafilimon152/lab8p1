public class Main {
    public static void main(String[] args){
        Person person1=new Person("Paula",20,"Henri");
        Person person2=new Person("Andrei",19,"nufar");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAddress());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getAddress());
    }
}
