<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회사 등록</title>
</head>
<body>
<div id="container">
	<form id="wrapFrm">
	<table id="table_com">
		<tr>
			<th>회사명</th>
			<td> <input type="text" name="comName" placeholder="회사명을 입력하세요." size="100"> </td>
		</tr>
		<tr>
			<td colspan="2"><div id="comChk"></div></td>
		</tr>
		<tr>
			<th>회사 대표자명</th>
			<td> <input type="text" name="comRep" placeholder="대표자명을 입력하세요." size="100"> </td>
		</tr>
		<tr>
			<th>회사 대표번호</th>
			<td> <input type="text" name="comTel" placeholder="회사 대표번호를 입력하세요. (ex:02-000-0000)" size="100"> </td>
		</tr>
	</table>
	</form>
	<div>
		<input type="button" value="제출" id="btn_submit">
		<input type="button" value="뒤로" id="btn_back">
	</div>
</div>
<script type="text/javascript">
$(document).ready(function() {
	let flag = 0;
	let comNameMax = 50;
	let comRepMax = 50;
	let comTelMax = 30;
	
	function checkBytes(obj, maxByte){ //바이트체크
		let txt = obj.value; // 입력한 문자
		let len = txt.length; // 입력한 문자수
		let totalBytes = 0;
		
		for (let i = 0; i < len ; i++){
			const each_char = txt.charAt(i);
			const uni_char = escape(each_char)
			if(uni_char.length > 4){
				totalBytes += 3;
			}else{
				totalBytes += 1;
			}
		}

 		if(totalBytes > maxByte ){
			alert('최대허용 바이트는 ' + maxByte + '바이트입니다.');
			obj.value = txt.slice(0,-1);
		} 
//		console.log('현재 토탈바이트' + totalBytes);
		return totalBytes;
	}
	
	$("input[name=comRep]").on('propertychange change keyup paste input', function(){
		 checkBytes(this,comRepMax)
	});
	
	$("input[name=comName]").on('propertychange change keyup paste input', function() {
		 checkBytes(this,comNameMax)
		$.ajax({
			url:"comNameCheck.do",
			type:"get",
			data:{comName:$("input[name=comName]").val() },
			success:function(msg){
//			$("#comChk").text(JSON.stringify(msg));
			if(msg == 'exist' || $("input[name=comName]").val().trim() == ''){
				$("#comChk").text('이미 존재하는 회사명이거나 값이 공백입니다.');
				$("#comChk").css("color", "#ff0000");
				flag = 0;
			}else{	
				$("#comChk").text('사용가능한 회사명입니다.');
				$("#comChk").css("color", "#0000ff");
				flag = 1;
			}
			},
			error:function(){
				alert('에러: 시스템관리자에게 문의하세요.');
			}
			});
	
	});
	
	$("input[name=comTel]").on('propertychange change keyup paste input', function(){
		 checkBytes(this,comTelMax);
	});
	
	$("#btn_back").click(function() {
		location.href = "adminCompany.do";
	});
	
	$("#btn_submit").click(function() {
		if(flag == 0 || $("input[name=comName]").val().trim() == '' ){
			alert("회사명을 확인하세요.");
			$("input[name=comName]").focus();
			return;
		}else if(flag == 0 || $("input[name=comRep]").val().trim() == '' ){
			alert("대표자명을 확인하세요.");
			$("input[name=comRep]").focus();
			return;
		}else if(flag == 0 || $("input[name=comTel]").val().trim() == '' ){
			alert("대표번호를 확인하세요.");
			$("input[name=comTel]").focus();
			return;
		}

		$("#wrapFrm").attr({"target":"_self","action":"addCompany.do"}).submit();
	});
	
});
	
</script>
</body>
</html>