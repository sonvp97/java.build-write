public class Student {
    private String name = "john";
    private String classes = "C02";

     protected void setName(String name){
        this.name = name;
    }
     protected void setClasses(String classes){
        this.classes = classes;
    }
    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }
}
