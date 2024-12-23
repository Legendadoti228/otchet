abstract class Student {
    protected String fio;
    protected int kurs;
    protected double ocenkaZaPosledniyEkzamen;

    public Student(String fio, int kurs, double ocenkaZaPosledniyEkzamen) {
        this.fio = fio;
        this.kurs = kurs;
        this.ocenkaZaPosledniyEkzamen = ocenkaZaPosledniyEkzamen;
    }

    public abstract void writeExam();
}

class IUStudent extends Student {
    public IUStudent(String fio, int kurs, double ocenkaZaPosledniyEkzamen) {
        super(fio, kurs, ocenkaZaPosledniyEkzamen);
    }

    public void writeExam() {
        System.out.println("Студент направления IU " + fio + " пишет экзамен.");
    }
}

class MathStudent extends Student {
    public MathStudent(String fio, int kurs, double ocenkaZaPosledniyEkzamen) {
        super(fio, kurs, ocenkaZaPosledniyEkzamen);
    }

    public void writeExam() {
        System.out.println("Студент направления Math " + fio + " пишет экзамен.");
    }
}

public class Zadacha3 {
    public static void main(String[] args) {
        IUStudent iuStudent = new IUStudent("Любое имя", 2, 4.5);
        MathStudent mathStudent = new MathStudent("Любоме имя 2", 3, 5.0);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}

