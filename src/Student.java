public class Student {
    private String firstName;
    private String lastName;
    private int age ;
    String universet = "Terdu";

    public Student(String fName, String lName , int age){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
    public void getStrudentInfo(){
        System.out.println("Ismi: "+firstName+"\n"+"Familyasi: "+lastName+"\n"+
                "Yoshi: "+age+"\n"+"Universetitet: "+universet+"\n");
    }

}
