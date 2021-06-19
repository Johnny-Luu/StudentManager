package DataTransferObject;

public class SubjectClassDTO {
    private String ClassId;
    private String HeadMaster;
    private String SubjectId;
    private int SchoolYear;
    private int Semester;



    public SubjectClassDTO(String classId, String headMaster, String subjectId, int schoolYear, int semester) {
        ClassId = classId;
        HeadMaster = headMaster;
        SubjectId = subjectId;
        SchoolYear = schoolYear;
        Semester = semester;
    }

    public SubjectClassDTO() {
    }

    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public String getHeadMaster() {
        return HeadMaster;
    }

    public void setHeadMaster(String headMaster) {
        HeadMaster = headMaster;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }

    public int getSchoolYear() {
        return SchoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        SchoolYear = schoolYear;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    @Override
    public String toString() {
        return this.getClassId();
    }
}
