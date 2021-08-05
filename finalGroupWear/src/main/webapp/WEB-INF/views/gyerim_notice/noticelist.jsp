<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="button.wrap" align="right">
	<span class="button blue">
		<button type="button" id="_btnAdd">글쓰기</button>
	</span>
</div>
<table class="list_table" style="width: 85%">
<colgroup>
	<col width="40"><col width="70"><col width="250">
	<col width="40"><col width="70"><col width="100">
</colgroup>

<thead>
<tr>
	<th>번호</th><th>카테고리</th><th>제목</th>
	<th>조회수</th><th>작성자</th><th>작성일</th>
</tr>	
</thead>

<tbody>

<c:forEach var="notice" items="${noticelist}" varStatus="i">
<tr>
	<th>${i.count}</th>
	<td>${notice.category}</td>
	<td style="text-align: left;">
		<a href="noticedetail.do?seq=${notice.seq}">
			${notice.title}
		</a>
	</td>
	<td>${notice.readcount}</td>
	<td>${notice.username}</td>
	<td>${notice.regdate.substring(2,19) }</td>
	
</tr>
</c:forEach>
</tbody>
</table>


<form name="file_Down" action="fileDownload.do" method="post">
	<input type="hidden" name="newfilename">
	<input type="hidden" name="seq">
	<input type="hidden" name="filename">
</form>

<script>
$("#_btnAdd").click(function () {
	location.href = "noticewrite.do";	
});

$(".btn_fileDelete").click(function () {
	let data_file_seq = $(this).attr("data_file_seq");
	alert(data_file_seq);
});

function filedown(newfilename, seq, filename) {
	
	// location.href = "fileDownload.do?newfilename=" + newfilename + "&seq=" + seq + "&filename=" + filename;
	 
	let doc = document.file_Down;
	doc.newfilename.value = newfilename;
	doc.seq.value = seq;
	doc.filename.value = filename;
	doc.submit(); 
}

</script>
















    