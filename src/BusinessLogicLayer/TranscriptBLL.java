package BusinessLogicLayer;

import DataAccessLayer.TranscriptDAL;
import DataTransferObject.TranscriptDTO;

public class TranscriptBLL {
    private TranscriptDAL dal = new TranscriptDAL();

    public TranscriptDTO GetTranscriptOfClass(String classID, String studentID) {
        return dal.GetTranscriptOfClass(classID, studentID);
    }

    public int UpdateTranscript(TranscriptDTO transcript) {
        return dal.UpdateTranscript(transcript);
    }
}
