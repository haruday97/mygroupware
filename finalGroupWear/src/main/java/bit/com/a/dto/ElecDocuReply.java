package bit.com.a.dto;
/*
CREATE TABLE ELECDDOCUREPLY(
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

CREATE SEQUENCE SET_REPLYSEQ
START WITH 1
INCREMENT BY 1; -- 여기까지는 create함, 하단의 fk설정을 실행해야 함

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
public class ElecDocuReply {

	// pk
	private int replySeq;
	
	//fk
	private int docuSeq;
	private int userNo;
	private String userName;
	private String jobPosition;
	private String deptName;
	private String wpName;
	
	// 댓글깊이
	private int ref;
	private int step;
	private int depth;
	
	private String replyContent;
	private String replyFileName; // 댓글에도 파일 첨부가 가능하도록 함
	private String replyNewFileName;
	
	private String replyDate;
	
	private int del;
	
	public ElecDocuReply() {
	}

	public ElecDocuReply(int replySeq, int docuSeq, int userNo, String userName, String jobPosition, String deptName,
			String wpName, int ref, int step, int depth, String replyContent, String replyFileName,
			String replyNewFileName, String replyDate, int del) {
		super();
		this.replySeq = replySeq;
		this.docuSeq = docuSeq;
		this.userNo = userNo;
		this.userName = userName;
		this.jobPosition = jobPosition;
		this.deptName = deptName;
		this.wpName = wpName;
		this.ref = ref;
		this.step = step;
		this.depth = depth;
		this.replyContent = replyContent;
		this.replyFileName = replyFileName;
		this.replyNewFileName = replyNewFileName;
		this.replyDate = replyDate;
		this.del = del;
	}

	public int getReplySeq() {
		return replySeq;
	}

	public void setReplySeq(int replySeq) {
		this.replySeq = replySeq;
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

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getWpName() {
		return wpName;
	}

	public void setWpName(String wpName) {
		this.wpName = wpName;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyFileName() {
		return replyFileName;
	}

	public void setReplyFileName(String replyFileName) {
		this.replyFileName = replyFileName;
	}

	public String getReplyNewFileName() {
		return replyNewFileName;
	}

	public void setReplyNewFileName(String replyNewFileName) {
		this.replyNewFileName = replyNewFileName;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "ElecDocuReply [replySeq=" + replySeq + ", docuSeq=" + docuSeq + ", userNo=" + userNo + ", userName="
				+ userName + ", jobPosition=" + jobPosition + ", deptName=" + deptName + ", wpName=" + wpName + ", ref="
				+ ref + ", step=" + step + ", depth=" + depth + ", replyContent=" + replyContent + ", replyFileName="
				+ replyFileName + ", replyNewFileName=" + replyNewFileName + ", replyDate=" + replyDate + ", del=" + del
				+ "]";
	}

	
	
	
	
	
}
