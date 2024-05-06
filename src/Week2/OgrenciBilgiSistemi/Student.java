package Week2.OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String clases;
    double avarage;
    boolean isPass;
    double c3Score;
    double c2Score;
    double c1Score;


    Student(String name,String stuNo,String clases,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.clases = clases;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    void printStudent(){
        System.out.println("Adı: " + name + "  Numarası: " + stuNo + "  Sınıfı: " + clases);
    }

    void addExamScores(int examNote, double verbalNote, String course) {
        if (course.equals(c1.prefix)) {
            c1.note = examNote;
            c1.verbalNote = verbalNote;
        } else if (course.equals(c2.prefix)) {
            c2.note = examNote;
            c2.verbalNote = verbalNote;
        } else if (course.equals(c3.prefix)) {
            c3.note = examNote;
            c3.verbalNote = verbalNote;
        } else {
            System.out.println("Geçersiz ders!");
        }
    }

    void isPass(){
        System.out.println("====================");
        double c1Score = (c1.note * (1 - c1.verbalImpact)) + (c1.verbalNote * c1.verbalImpact);
        double c2Score = (c2.note * (1 - c2.verbalImpact)) + (c2.verbalNote * c2.verbalImpact);
        double c3Score = (c3.note * (1 - c3.verbalImpact)) + (c3.verbalNote * c3.verbalImpact);
        this.avarage = (c1Score + c2Score + c3Score) / 3.0;
        if (this.avarage > 50){
            System.out.println("Habam sınıfı uyanıyor...");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı sınıfta kaldı...");
            this.isPass = false;
        }
        System.out.println("Ortalamanız: " + this.avarage);
    }

    void printNote(){
        System.out.println(c1.name +" notu :" + c1.note);
        System.out.println(c2.name +" notu :" + c2.note);
        System.out.println(c3.name +" notu :" + c3.note);
    }
}
