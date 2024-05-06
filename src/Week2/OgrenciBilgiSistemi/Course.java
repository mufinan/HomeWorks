package Week2.OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double verbalImpact;
    double verbalNote;

    Course(String name,String code,String prefix,double verbalImpact){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalImpact = verbalImpact;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve Ders bilgileri uyuşmuyor!");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
