package rubbish;

/**
 * &#064;program:  Student
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-25 09:10
 * @author GK_L2
 */
public class Student {
    String name;
    int age;
    String clas;
    String hobby;
    public Student(){}
    
    public Student ( String name, int age, String clas, String hobby) {
        this.name = name;this.age = age;this.clas = clas; this.hobby = hobby;
    }
    
    public void getinfo(){
        System.out.println ("姓名：" + this.name + "\t年龄："+ this.age + "\t班级："+ this.clas + "\t爱好："+ this.name );
    }
/*
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setClas(String clas) {
        this.clas = clas;
    }
    void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getClas() {
        return clas;
    }
    public String getHobby() {
        return hobby;
    }
    
    public void setclas ( String clas ) {
        this.clas = clas;
    }
    
    public void sethobby ( String s ) {
        this.hobby = s;
    }
*/
}
