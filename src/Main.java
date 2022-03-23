import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Baxtiyor","Melimamatov",27);

        Student student1 = new Student("Bobur","Ashurov",26);

        Student student2 = new Student("Nurzod","Shunqorov",26);

        Student student3 = new Student("Jonibek","Berdalov",26);

        Student student4 = new Student("Oybek", "Murodov",26);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        for (Student talaba:arrayList){
            talaba.getStrudentInfo();
        }
    }
}
