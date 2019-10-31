package littledroidtech.quon;

public class Students {

    private  String StudentId;
    private  String StudentName;
    private  String StudentClas;
    private String  Studentyearstudy;
    private String  Studentunitname;
    private String Studentunitcode;
    private String Studentlecname;
    private  String Studentdescription;


    public  Students(){


    }

    public Students(String studentId, String studentName, String studentClas,
                    String studentyearstudy, String studentunitname, String studentunitcode,
                    String studentlecname, String studentdescription) {
        StudentId = studentId;
        StudentName = studentName;
        StudentClas = studentClas;
        Studentyearstudy = studentyearstudy;
        Studentunitname = studentunitname;
        Studentunitcode = studentunitcode;
        Studentlecname = studentlecname;
        Studentdescription = studentdescription;
    }

    public String getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentClas() {
        return StudentClas;
    }

    public String getStudentyearstudy() {
        return Studentyearstudy;
    }

    public String getStudentunitname() {
        return Studentunitname;
    }

    public String getStudentunitcode() {
        return Studentunitcode;
    }

    public String getStudentlecname() {
        return Studentlecname;
    }

    public String getStudentdescription() {
        return Studentdescription;
    }
}
