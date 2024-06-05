public class Student {
     int id;
     String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println(id+name+age);
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = 0;
        System.out.println(id+name);
    }
    public Student(String name) {
        this.id = 0;
        this.name = name;
        this.age = 0;
        System.out.println(name);
    }
 
    public static void main(String[] args) {
        Student s= new Student(23,"subbu",22);
        Student r= new Student(23,"subbu");
        Student p= new Student("subbu");
      ;
      
    }
}