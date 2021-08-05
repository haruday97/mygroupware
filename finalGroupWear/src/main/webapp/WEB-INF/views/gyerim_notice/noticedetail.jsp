<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table class="list_table" style="width: 85%" id="msgListTable">
<colgroup>
	<col width="50"><col width="230"><col width="50"><col width="70">
</colgroup>

<tr >
	<td colspan="4" style="text-align: left; font-weight:bold; font-size:x-large;">${notice.title }</td>
</tr>
<tr>
	<th>작성자</th>
	<td style="text-align: left;">${notice.username }</td>	
	<th>조회수</th>
	<td style="text-align: left;">${notice.readcount }</td>
</tr>
<tr>
	<th>등록일</th>
	<td colspan="3" style="text-align: left;">${notice.regdate.substring(0,19) }</td>
</tr>
<tr>
	<th>첨부파일명</th>
	<td colspan="3" style="text-align: left;">${notice.filename }</td>
</tr>
<tr>
	<th>내용</th>
	<td colspan="3" style="text-align: left;">
	<img src="./upload/${notice.newfilename} " width="300px">
	<br><br>
	${notice.content }
	</td>
</tr>

</table>

<!-- 수정하기 -->
<c:if test="${login.username eq notice.username }">
<div id="buttons_wrap">
	<span class="button blue">
		<button type="button" id="_btnUpdate">수정하기</button>
	</span>
</div>
</c:if>

<!-- seq만 필요하므로 -->
<form name="frmForm" id="_frmForm" action="noticeupdate.do" method="post">
	<input type="hidden" name="seq" value="${notice.seq }">
</form>


<form name="file_Down" action="fileDownload.do" method="post">
	<input type="hidden" name="newfilename">
	<input type="hidden" name="filename">
	<input type="hidden" name="seq">
</form>

<script>
var myVar;
function filedown(newfilename, seq, filename) {
	let doc = document.file_Down;
	doc.newfilename.value = newfilename;
	doc.filename.value = filename;
	doc.seq.value = seq;
	doc.submit();	
	
	myVar = setTimeout(_refrush, 10);
}	

function _refrush() {
	location.reload();
	clearTimeout(myVar);
}

$("#_btnUpdate").click(function () {
	$("#_frmForm").submit();
});

</script> 

