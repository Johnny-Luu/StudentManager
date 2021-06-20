package BusinessLogicLayer;

import DataAccessLayer.SubjectClassDAL;
import DataTransferObject.StudentCLassDTO;
import DataTransferObject.SubjectClassDTO;

import java.util.List;

public class SubjectClassBLL {
    SubjectClassDAL dal = new SubjectClassDAL();

    public List<SubjectClassDTO> getAllSubjectClass() {
        return dal.getAllSubjectClass();
    }

    public List<SubjectClassDTO> getClassesByStudentId(String id) {
        return dal.getClassesByStudentId(id);
    }

    public SubjectClassDTO getClassById(String id){return dal.getClassById(id);}

    public List<SubjectClassDTO> getClassesBySubjectName(String name){ return dal.getClassesBySubjectName(name); }

}
