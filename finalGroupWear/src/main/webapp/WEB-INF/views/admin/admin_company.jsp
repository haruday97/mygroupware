<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회사정보관리</title>
</head>
<body>

<table border="1" style="width: 95%">
<colgroup>
<col width="10%"> <col width="80%"><col width="10%">
</colgroup>
	<tr>
		<td>
			<select id="category">
				<option value="comCode">회사코드</option>
				<option value="comName">회사명</option>
				<option value="comTel">전화번호</option>
				<option value="comRep">대표자명</option>
			</select> 
		</td>
		<td><input type="text" id="search"><input type="button" value="검색" id="btn_search"></td>
		<td><button id="btn_exelize">엑셀파일 다운로드</button></td>
	</tr>
</table>

<table border="1" style="width: 95%">
<colgroup>
<col width="5%"><col width="20%"><col width="20%"><col width="20%"><col width="20%"><col width="15%">
</colgroup>	
	<thead>
		<tr>
			<th><input type="checkbox" id="chk_selAll"></th>
			<th>회사명</th>
			<th>회사코드</th>
			<th>전화번호</th>
			<th>대표자명</th>
			<th>관리</th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${empty comList}"> <!-- 넘어온 데이터가 없을경우 -->
			등록된 회사가 없습니다.
		</c:if>
		<c:forEach items="${comList}" var="com" varStatus="i"> <!-- 반복문시작 -->
			<tr>
				<td>
					<input type="checkbox" name="chk">
				</td>
				<td><a href="adminCompanyDetail.do?comcode=${com.comCode}">${com.comName}</a></td>
				<td>${com.comCode}</td>
				<td>${com.comTel}</td>
				<td>${com.comRep}</td>
				<td>
					<a href="adminCompanyDetail.do?cls=mod&comcode='${com.comCode}'"><input type="button" value="수정" id="btn_modify"></a>
					<a href="companyDelete.do?comcode=${com.comCode}"><input type="button" value="삭제" id="btn_delete"></a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<div>
	<div>
		<input type="button" value="선택 삭제" id="btn_selDel">
		<input type="button" value="회사 등록" id="btn_newCom">
	</div>
	<div class="container">
	    <nav aria-label="Page navigation">
	        <ul class="pagination" id="pagination" style="justify-content:center;"></ul>
	    </nav>
	</div>
</div>


<script type="text/javascript">
let category = "${category}";
let search = "${search}";
let pageNumber = "${pageNumber}";
let totalCp = "${totalCp}";
let pageSize = 10;
let _totalPages = totalCp / pageSize; 
if (totalCp % pageSize > 0){
	_totalPages++;
}
alert("category: " + category + "/ search: " + search + "/ pageNumber: " + pageNumber + "/ totalCp: " + totalCp);

$(document).ready(function() {
	/* paging */
	
	$("#pagination").twbsPagination({
		startPage: pageNumber,
		totalPages: _totalPages,
		visiblePages: 10,
		first:'<span sria-hidden="true">«</span>',
		prev:"이전",
		next:"다음",
		last:'<span sria-hidden="true">»</span>',
		initiateStartPageClick:false,		// onPageClick 자동 실행되지 않도록 한다
		onPageClick:function(event, page){
//			alert(page);
			location.href = "adminCompany.do?category=" + $("#category").val() + "&search=" + $("#search").val() + "&pageNumber=" + (page - 1);	
		}
	});
	
	$("#btn_exelize").click(function() {
		alert('엑셀다운로드 클릭');
	});
	$("#chk_selAll").click(function() {
//		alert('체크박스클릭');
		if($("#chk_selAll").prop("checked")){
			$("input[name=chk]").prop("checked",true);
		}else{
			$("input[name=chk]").prop("checked",false);
		}

	});
	$("#btn_delete").click(function() {
		alert('삭제 클릭');
	});	
	$("#btn_modify").click(function() {
		location.href = "adminCompanyModify.do";
	});	
	$("#btn_search").click(function() {
//		alert('검색 클릭');
		location.href = "adminCompany.do?category="+ $("#category").val() + "&search=" + $("#search").val();
	});	
	$("#btn_newCom").click(function() {
		location.href = "adminCompanyAdd.do";
	});
	$("#btn_selDel").click(function() {
		alert('선택삭제 클릭');
	});		
});
</script>

</body>
</html>