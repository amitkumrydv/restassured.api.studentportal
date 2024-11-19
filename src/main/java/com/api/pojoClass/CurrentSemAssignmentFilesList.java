package com.api.pojoClass;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CurrentSemAssignmentFilesList {

    @JsonProperty("id")
    private String id;

    @JsonProperty("consumerProgramStructureId")
    private String consumerProgramStructureId;

    @JsonProperty("consumerTypeId")
    private String consumerTypeId;

    @JsonProperty("programId")
    private String programId;

    @JsonProperty("programStructureId")
    private String programStructureId;

    @JsonProperty("count")
    private int count;

    @JsonProperty("consumerType")
    private String consumerType;

    @JsonProperty("programStructure")
    private String programStructure;

    @JsonProperty("searchType")
    private String searchType;

    @JsonProperty("year")
    private String year;

    @JsonProperty("month")
    private String month;

    @JsonProperty("fileData")
    private String fileData;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("sem")
    private String sem;

    @JsonProperty("startDate")
    private String startDate;

    @JsonProperty("endDate")
    private String endDate;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("filePath")
    private String filePath;

    @JsonProperty("studentFilePath")
    private String studentFilePath;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("createdDate")
    private String createdDate;

    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;

    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;

    @JsonProperty("sapId")
    private String sapId;

    @JsonProperty("previewPath")
    private String previewPath;

    @JsonProperty("questionFilePreviewPath")
    private String questionFilePreviewPath;

    @JsonProperty("attempts")
    private String attempts;

    @JsonProperty("status")
    private String status;

    @JsonProperty("attemptsLeft")
    private String attemptsLeft;

    @JsonProperty("weightage")
    private String weightage;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("errorRecord")
    private boolean errorRecord;

    @JsonProperty("subjectCodeId")
    private String subjectCodeId;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("program")
    private String program;

    @JsonProperty("enrollmentMonth")
    private String enrollmentMonth;

    @JsonProperty("enrollmentYear")
    private String enrollmentYear;

    @JsonProperty("emailId")
    private String emailId;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("altPhone")
    private String altPhone;

    @JsonProperty("centerCode")
    private String centerCode;

    @JsonProperty("centerName")
    private String centerName;

    @JsonProperty("validityEndMonth")
    private String validityEndMonth;

    @JsonProperty("validityEndYear")
    private String validityEndYear;

    @JsonProperty("prgmStructApplicable")
    private String prgmStructApplicable;

    @JsonProperty("lc")
    private String lc;

    @JsonProperty("facultyId")
    private String facultyId;

    @JsonProperty("faculty1")
    private String faculty1;

    @JsonProperty("faculty2")
    private String faculty2;

    @JsonProperty("faculty3")
    private String faculty3;

    @JsonProperty("facultyIdRevaluation")
    private String facultyIdRevaluation;

    @JsonProperty("faculty1Name")
    private String faculty1Name;

    @JsonProperty("faculty2Name")
    private String faculty2Name;

    @JsonProperty("faculty3Name")
    private String faculty3Name;

    @JsonProperty("facultyRevaluationName")
    private String facultyRevaluationName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("evaluated")
    private String evaluated;

    @JsonProperty("remarks")
    private String remarks;

    @JsonProperty("score")
    private String score;

    @JsonProperty("evaluationCount")
    private String evaluationCount;

    @JsonProperty("revaluationScore")
    private String revaluationScore;

    @JsonProperty("markedForRevaluation")
    private String markedForRevaluation;

    @JsonProperty("revaluated")
    private String revaluated;

    @JsonProperty("revaluationRemarks")
    private String revaluationRemarks;

    @JsonProperty("revaluationCount")
    private String revaluationCount;

    @JsonProperty("revaluationReason")
    private String revaluationReason;

    @JsonProperty("revaluationDate")
    private String revaluationDate;

    @JsonProperty("revisitScore")
    private String revisitScore;

    @JsonProperty("revisitRemarks")
    private String revisitRemarks;

    @JsonProperty("revisited")
    private String revisited;

    @JsonProperty("isPass")
    private String isPass;

    @JsonProperty("sfName")
    private String sfName;

    @JsonProperty("slName")
    private String slName;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("faculties")
    private List<String> faculties;

    @JsonProperty("numberOfAssignments")
    private List<String> numberOfAssignments;

    @JsonProperty("indexes")
    private List<String> indexes;

    @JsonProperty("revalAssignments")
    private List<String> revalAssignments;

    @JsonProperty("unMarkCCList")
    private List<String> unMarkCCList;

    @JsonProperty("level")
    private String level;

    // Add other fields similarly...
}
