package accessmodifier.write_only_classes;

public class Student {
    private String name = "John";
    private String classes = "CO2";
    public Student(){};

    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String clas){
        this.classes = classes;
    }
    public String toString(){
        return "Student { name:'" + name + "'"+ ", clas:'" + classes + "'" + " }";
    }
}
