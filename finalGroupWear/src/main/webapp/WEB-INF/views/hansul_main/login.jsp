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
		       <label for="userNo">�����ȣ</label>
		       <input type="text" class="form-control" id="_userNo" name="userNo" placeholder="Enter userNumber">
		     </div>
		     <div class="form-group">
		       <label for="userPw">��й�ȣ</label>
		       <input type="password" class="form-control" id="_userPw" name="userPw" placeholder="Password">
		       <small id="pwHelp" class="form-text text-muted" style="margin-right:0;">�� ��й�ȣ�� �н��Ͽ��� ���, �����ڿ��� �������ֽñ� �ٶ��ϴ�.</small>
		     </div>
	     
	     	<button class="btn btn-lg btn-primary" type="button" id="btnLogin">LOG IN</button>
		</form>		
	</div>
	
	<a href="formtest.do">�ӽ� - �ϴ� �α��� �Ȱ�ġ�� �׷����� ����</a>
	<a href="adminCompany.do">������</a>
	

</div>

</body>
</html>