<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회사 수정</title>
</head>
<body>
<div id="container">
	<table id="table_com">
		<tr>
			<th>회사명</th>
			<td> <input type="text" placeholder="회사명을 입력하세요." size="100"> </td>
			<td id="comChk"></td>
		</tr>
		<tr>
			<th>회사 대표자명</th>
			<td> <input type="text" placeholder="대표자명을 입력하세요." size="100"> </td>
		</tr>
		<tr>
			<th>회사 대표번호</th>
			<td> <input type="text" placeholder="회사 대표번호를 입력하세요. (ex:02-000-0000)" size="100"> </td>
		</tr>
	</table>
	<div>
		<input type="button" value="제출" id="btn_submit">
		<input type="button" value="뒤로" id="btn_back">
	</div>
</div>
<script type="text/javascript">
$(document).ready(function() {
	$("#btn_back").click(function() {
		location.href = "adminCompany.do";
	});
	$("#btn_submit").click(function() {
		alert('제출');
		$("#table_com").attr({"target":"_self","action":"newCompany.do"}).submit();
	});
})
	
</script>
</body>
</html>