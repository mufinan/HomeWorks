package Week2.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca" , "TRH" , "1111");
        Teacher t2 = new Teacher("Graham Bell","FZK","222");
        Teacher t3 = new Teacher("KülYutmaz","BIO","333");

        Course tarih = new Course("Tarih","101", "TRH",0.3);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK",0.4);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO",0.25);
        biyo.addTeacher(t3);


        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addExamScores(89,98,"TRH");
        s1.addExamScores(78,65,"FZK");
        s1.addExamScores(96,58,"BIO");
        s1.isPass();
        s1.printNote();
        s1.printStudent();

        Student s2 = new Student("Ali","456","3",tarih,fizik,biyo);
        s2.addExamScores(78,82,"TRH");
        s2.addExamScores(95,63,"FZK");
        s2.addExamScores(88,73,"BIO");
        s2.isPass();
        s2.printNote();
        s2.printStudent();

        Student s3 = new Student("Veli","789","2",tarih,fizik,biyo);
        s3.addExamScores(32,33,"TRH");
        s3.addExamScores(25,81,"FZK");
        s3.addExamScores(55,84,"BIO");
        s3.isPass();
        s3.printNote();
        s3.printStudent();
    }
}
