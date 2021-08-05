<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form name="frmForm" id="_frmForm" action="noticeupload.do" method="post"
										enctype="multipart/form-data">

<table class="list_table">
<tr>
	<th>필독여부</th>
	<td style="text-align: left">
		<input type="checkbox" name="imt" value="imt">&nbsp;&nbsp;설정
	</td>
</tr>
<tr>
	<th>작성자</th>
	<td style="text-align: left">
		${login.username}
	</td>
</tr>
<tr>
	<th>제목</th>
	<td style="text-align: left">
		<input type="text" name="title" size="65">
	</td>
</tr>
<tr>
	<th>파일 업로드</th>
	<td style="text-align: left">
		<input type="file" name="fileload" style="width: 400px">
	</td>
</tr>
<tr>
	<th>내용</th>
	<td style="text-align: left">
		<textarea rows="10" cols="62" name="content"></textarea>
	</td>
</tr>
<tr>
	<th>예약글 설정</th>
	<td style="text-align: left"><input type="date"><input type="time"></td>
</tr>
<tr>
	<td colspan="2" style="height: 50px; text-align: center;">
		<a href="#none" id="_btnNotice" title="자료올리기">
			<img alt="" src="image/bwrite.png">
		</a>
	</td>
</tr>

</table>
</form>    

<script>
$("#_btnNotice").click(function () {
	
	// 빈칸 첵크
	
	$("#_frmForm").submit();
});
</script>












