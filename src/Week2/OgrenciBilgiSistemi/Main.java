package Week2.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca" , "TRH" , "1111");
        Teacher t2 = new Teacher("Graham Bell","FZK","222");
        Teacher t3 = new Teacher("KülYutmaz","BIO","333");

        Course tarih = new Course("Tarih","101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(30,89,98);
        s1.isPass();
        s1.printNote();
        s1.printStudent();
        Student s2 = new Student("Ali","456","3",tarih,fizik,biyo);
        s2.addBulkExamNote(89,98,36);
        s2.isPass();
        s2.printNote();
        s2.printStudent();
        Student s3 = new Student("Veli","789","2",tarih,fizik,biyo);
        s3.addBulkExamNote(45,85,126);
        s3.isPass();
        s3.printNote();
        s3.printStudent();


    }
}
