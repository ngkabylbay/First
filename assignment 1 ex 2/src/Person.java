public class Person {
    String FullName;
    int age;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Person() {
    }

    public void setFullname(String fullname) {
        FullName = fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String FullName, int age){
        this.FullName = FullName;
        this.age = age;
    }

    public void move(String FullName){
        System.out.println(FullName + " is moving");
    }

    public void talk(String FullName){
        System.out.println(FullName + " is talking");
    }

    public String getFullname(){
        return FullName;
    }
    public void setFullname(){
        this.FullName = FullName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }


}
