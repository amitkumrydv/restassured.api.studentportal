package com.nmims.api.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class FailSubjectsAssignmentFilesListModel {

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

    @JsonProperty("submissionAllowed")
    private boolean submissionAllowed;

    @JsonProperty("submissionAllow")
    private String submissionAllow;

    @JsonProperty("evaluated")
    private String evaluated;

    @JsonProperty("remarks")
    private String remarks;

    @JsonProperty("score")
    private String score;

    @JsonProperty("evaluationCount")
    private String evaluationCount;

    @JsonProperty("toBeEvaluated")
    private String toBeEvaluated;

    @JsonProperty("faculties")
    private List<String> faculties;

    @JsonProperty("revalAssignments")
    private List<String> revalAssignments;

    @JsonProperty("subjectList")
    private List<String> subjectList;

}
