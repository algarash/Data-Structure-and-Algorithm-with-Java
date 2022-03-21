public class Student {
    int id;
    String sName;
    String sMajor;

    public Student(int id, String sName, String sMajor) {
        this.id = id;
        this.sName = sName;
        this.sMajor = sMajor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", sMajor='" + sMajor + '\'' +
                '}';
    }
}
