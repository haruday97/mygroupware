<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
#btnLogin{
	width:100%;
	margin:auto;
	display:block;
}

</style>

</head>
<body>

 <div class="bs-docs-section">
        
	
	<div style="width:50%; margin-left:25%; margin-top:5%; margin-bottom:10%; ">
		<form>		
			<div class="form-group">
		       <label for="userNo">사원번호</label>
		       <input type="text" class="form-control" id="_userNo" name="userNo" placeholder="Enter userNumber">
		     </div>
		     <div class="form-group">
		       <label for="userPw">비밀번호</label>
		       <input type="password" class="form-control" id="_userPw" name="userPw" placeholder="Password">
		       <small id="pwHelp" class="form-text text-muted" style="margin-right:0;">※ 비밀번호를 분실하였을 경우, 관리자에게 연락해주시기 바랍니다.</small>
		     </div>
	     
	     	<button class="btn btn-lg btn-primary" type="button" id="btnLogin">LOG IN</button>
		</form>		
	</div>
	
	<a href="formtest.do">임시 - 일단 로그인 안거치고 그룹웨어로 가기</a>
	<a href="adminCompany.do">관리자</a>
	

</div>

</body>
</html>