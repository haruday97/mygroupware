package bit.com.a.dto;

/*

CREATE TABLE ELECDOCUREPLY(
	-- PK
	REPLYSEQ NUMBER(2) PRIMARY KEY,
	 
	-- FK
	DOCUSEQ NUMBER(5) NOT NULL,
	USERNO NUMBER(8) NOT NULL,
	JOBCODE NUMBER(4) NOT NULL,
	DEPTCODE NUMBER(4) NOT NULL,
	WPCODE NUMBER(4) NOT NULL,
	
	-- 댓글깊이
	REF NUMBER(3) NOT NULL,
	STEP NUMBER(1) NOT NULL,
	DEPTH NUMBER(1) NOT NULL,
	
	REPLYCONTENT VARCHAR2(600),
	REPLYFILENAME VARCHAR2(600),
	REPLYNEWFILENAME VARCHAR2(600),
	 
	REPLYDATE DATE,
	REPLYDEL NUMBER(1)
);

CREATE SEQUENCE REPLYSEQ_ELECDOCUREPLY
START WITH 1
INCREMENT BY 1;

DROP SEQUENCE SET_REPLYSEQ;


CREATE TABLE ELECDOCU(
	-- PK
	DOCUSEQ NUMBER(5) PRIMARY KEY,
	RELATEDNUM VARCHAR2(30) NOT NULL,  -- 2021080213051108 // 실제 PK는 아니나, 연관문서 연결 시 필요한 고유번호
	 
	-- FK
	USERNO NUMBER(8) NOT NULL,
	JOBCODE NUMBER(4) NOT NULL,
	DEPTCODE NUMBER(4) NOT NULL,
	WPCODE NUMBER(4) NOT NULL,
		
	WRITEDATE DATE, -- 자동으로 SYSDATE
	UPDATEDATE DATE, -- -- 자동으로 SYSDATE
	 
	CONFIRMLINE VARCHAR2(300) NOT NULL, -- 결재자는 필수, 참조 협조는 선택
	REFEREE VARCHAR2(300),
	COOPERATOR VARCHAR2(300),
	
	CHECKING NUMBER(1), -- 0미상신 1 상신후 2 결재중 3 반려 4 결재최종완료
	STATEMENT NUMBER(1), -- 결재자 각각마다 미결재0 승인1 반려2
	  
	CATEGORY VARCHAR2(50) NOT NULL,
	PERIOD VARCHAR2(50) NOT NULL,
	RELATED VARCHAR2(150), --연관글번호 RELATEDNUM을 끌어와서 저장, 최대 5개까지만 연결 가능
	TITLE VARCHAR2(400) NOT NULL,
	CONTENT VARCHAR2(2000) NOT NULL,
	FILENAME VARCHAR2(600),
	NEWFILENAME VARCHAR2(600),
	DEL NUMBER(1) -- 미상신 시만 기능
);


--- 여기못한상태
CREATE SEQUENCE DOCUSEQ_ELECDOCU
START WITH 1
INCREMENT BY 1;

ALTER TABLE ELECDOCU
ADD CONSTRAINT FK_ELECDOCU_USERNO FOREIGN KEY(USERNO)
REFERENCES USERS(USERNO);

ALTER TABLE ELECDOCU
ADD CONSTRAINT FK_ELECDOCU_JOBCODE FOREIGN KEY(JOBCODE)
REFERENCES JOB(JOBCODE);

ALTER TABLE ELECDOCU
ADD CONSTRAINT FK_ELECDOCU_DEPTCODE FOREIGN KEY(DEPTCODE)
REFERENCES DEPARTMENT(DEPTCODE);

ALTER TABLE ELECDOCU
ADD CONSTRAINT FK_ELECDOCU_WPCODE FOREIGN KEY(WPCODE)
REFERENCES WORKPLACE(WPCODE);


-- 리플 외래키
CREATE SEQUENCE SET_REPLYSEQ
START WITH 1
INCREMENT BY 1;
ALTER TABLE ELECDOCUREPLY
ADD CONSTRAINT FK_ELECDOCUREPLY_DOCUSEQ FOREIGN KEY(DOCUSEQ)
REFERENCES ELECDOCU(DOCUSEQ);
ALTER TABLE ELECDOCUREPLY
ADD CONSTRAINT FK_ELECDOCUREPLY_USERNO FOREIGN KEY(USERNO)
REFERENCES USERS(USERNO);
ALTER TABLE ELECDOCUREPLY
ADD CONSTRAINT FK_ELECDOCUREPLY_JOBCODE FOREIGN KEY(JOBCODE)
REFERENCES JOB(JOBCODE);
ALTER TABLE ELECDOCUREPLY
ADD CONSTRAINT FK_ELECDOCUREPLY_DEPTCODE FOREIGN KEY(DEPTCODE)
REFERENCES DEPARTMENT(DEPTCODE);
ALTER TABLE ELECDOCUREPLY
ADD CONSTRAINT FK_ELECDOCUREPLY_WPCODE FOREIGN KEY(WPCODE)
REFERENCES WORKPLACE(WPCODE);
*/
public class ElecDocuDto {

	// pk
	private int docuSeq;
	private int relatedNum; // 쿼리문에 반드시 추가하기
	
	// fk
	private int userNo;
	private String userName;
	private String jobPosition;
	private String deptName;
	private String wpName;
	
	// date
	private String writeDate;
	private String updateDate;
	
	// 결재라인, 참조자, 협조자
	private String confirmLine;
	private String referee;
	private String cooperator;
	
	// 결재 진행상태
	private int cheking; // 미상신0 미결재1 결재중2 반려3 완료4
	private int statement; // 결재자 진행여부, 승인0 반려1
		
	// 글내용
	private String category; // 분류
	private String period; // 시행기간
	private String related; // 연관문서
	private String title; // 제목
	private String content; // 내용
	private String fileName; // 파일명
	private String newFileName; //변환파일명	
	
	// 미상신 기안 삭제
	private int del;
	
	public ElecDocuDto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ElecDocuDto(int docuSeq, int relatedNum, int userNo, String userName, String jobPosition, String deptName,
			String wpName, String writeDate, String updateDate, String confirmLine, String referee, String cooperator,
			int cheking, int statement, String category, String period, String related, String title, String content,
			String fileName, String newFileName, int del) {
		super();
		this.docuSeq = docuSeq;
		this.relatedNum = relatedNum;
		this.userNo = userNo;
		this.userName = userName;
		this.jobPosition = jobPosition;
		this.deptName = deptName;
		this.wpName = wpName;
		this.writeDate = writeDate;
		this.updateDate = updateDate;
		this.confirmLine = confirmLine;
		this.referee = referee;
		this.cooperator = cooperator;
		this.cheking = cheking;
		this.statement = statement;
		this.category = category;
		this.period = period;
		this.related = related;
		this.title = title;
		this.content = content;
		this.fileName = fileName;
		this.newFileName = newFileName;
		this.del = del;
	}



	// 수정용
	public ElecDocuDto(int userNo, String updateDate, String confirmLine, String referee, String cooperator,
			String category, String period, String related, String title, String content, String fileName,
			String newFileName) {
		super();
		this.userNo = userNo;
		this.updateDate = updateDate;
		this.confirmLine = confirmLine;
		this.referee = referee;
		this.cooperator = cooperator;
		this.category = category;
		this.period = period;
		this.related = related;
		this.title = title;
		this.content = content;
		this.fileName = fileName;
		this.newFileName = newFileName;
	}

	public int getDocuSeq() {
		return docuSeq;
	}

	public void setDocuSeq(int docuSeq) {
		this.docuSeq = docuSeq;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getConfirmLine() {
		return confirmLine;
	}

	public void setConfirmLine(String confirmLine) {
		this.confirmLine = confirmLine;
	}

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public String getCooperator() {
		return cooperator;
	}

	public void setCooperator(String cooperator) {
		this.cooperator = cooperator;
	}

	public int getCheking() {
		return cheking;
	}

	public void setCheking(int cheking) {
		this.cheking = cheking;
	}

	public int getStatement() {
		return statement;
	}

	public void setStatement(int statement) {
		this.statement = statement;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRelated() {
		return related;
	}

	public void setRelated(String related) {
		this.related = related;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}	
	
	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getWpName() {
		return wpName;
	}

	public void setWpName(String wpName) {
		this.wpName = wpName;
	}

	
	public int getRelatedNum() {
		return relatedNum;
	}

	public void setRelatedNum(int relatedNum) {
		this.relatedNum = relatedNum;
	}

	@Override
	public String toString() {
		return "ElecDocuDto [docuSeq=" + docuSeq + ", relatedNum=" + relatedNum + ", userNo=" + userNo + ", userName="
				+ userName + ", jobPosition=" + jobPosition + ", deptName=" + deptName + ", wpName=" + wpName
				+ ", writeDate=" + writeDate + ", updateDate=" + updateDate + ", confirmLine=" + confirmLine
				+ ", referee=" + referee + ", cooperator=" + cooperator + ", cheking=" + cheking + ", statement="
				+ statement + ", category=" + category + ", period=" + period + ", related=" + related + ", title="
				+ title + ", content=" + content + ", fileName=" + fileName + ", newFileName=" + newFileName + ", del="
				+ del + "]";
	}
	
	
	
}
