<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
.dropdown:hover .dropdown-menu {
    display: block;
    margin-top: 0;
}
#navbar{
	padding-top:1.5%;
}

</style>


  
    <div class="navbar navbar-expand-lg fixed-top navbar-dark bg-primary" id="navbar">
      <div class="container">
      
        <a href="realMain.do" class="navbar-brand">웨하스</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
        
          <ul class="navbar-nav">          
          
          <!-- 1. 김계림 - 공지사항, 자료실 -->
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="notice">공지사항<span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="notice">
              
                <a class="dropdown-item" href="noticelist.do"><b>공지사항</b></a>
                <div>
	                <a class="dropdown-item" href="#">&nbsp; 팀별공지사항</a>
	                <a class="dropdown-item" href="#">&nbsp; 직급별공지사항</a>
	                <a class="dropdown-item" href="#">&nbsp; 즐겨찾기</a>
                </div>
                <div class="dropdown-divider"></div>                
                <a class="dropdown-item" href="../lumen/"><b>자료실</b></a>
              </div>
            </li>
          <!-- 1-2. 김계림 - 일정관리 -->
             <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="notice">일정관리<span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="calender">
                <a class="dropdown-item" href="../flatly/">일정관리</a>
                <a class="dropdown-item" href="../journal/">전체일정</a>
                <a class="dropdown-item" href="../litera/">나의일정</a>
              </div>
            </li>
            
            
          <!-- 2. 이한슬 - 전자문서 -->  
          	<li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="notice">전자문서<span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="notice">
              
                <a class="dropdown-item" href="notice.do"><b>문서작성함</b></a>
                <div>
	                <a class="dropdown-item" href="docuMyList.do">&nbsp; 작성문서관리</a>
	                <a class="dropdown-item" href="docuMyProcess.do">&nbsp; 문서결재현황</a>
	                <a class="dropdown-item" href="#">&nbsp; 즐겨찾기</a>
                </div>
                <div class="dropdown-divider"></div>                
                <a class="dropdown-item" href="../lumen/"><b>문서수신함</b></a>
                <div>
	                <a class="dropdown-item" href="#">&nbsp; 수신문서함</a>
	                <a class="dropdown-item" href="#">&nbsp; 참조문서함</a>
	                <a class="dropdown-item" href="#">&nbsp; 중요문서보관함</a>
                </div>
              </div>
            </li>
            
            
           <!-- 3. 김민경 - 인사관리 -->  
          	<li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="notice">인사관리<span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="notice">
              
                <a class="dropdown-item" href="notice.do">출퇴근관리</a>
                <a class="dropdown-item" href="notice.do">내 휴가</a>
              	<a class="dropdown-item" href="notice.do">급여정보</a>
              	<a class="dropdown-item" href="notice.do">조직도</a>
              	
              	<div class="dropdown-divider"></div>  
              	
              	<!-- 하단은 인사 관리자에게 추가로 노출되는 부분 -->
              	<a class="dropdown-item" href="../lumen/"><b>관리자전용</b></a>
              	<div>
	              	<a class="dropdown-item" href="notice.do">&nbsp; 사원현황</a>
	                <a class="dropdown-item" href="notice.do">&nbsp; 사원근태관리</a>
	              	<a class="dropdown-item" href="notice.do">&nbsp; 사원휴가관리</a>
	              	<a class="dropdown-item" href="notice.do">&nbsp; 사원급여관리</a>
	              	<a class="dropdown-item" href="notice.do">&nbsp; 조직도현황</a>
              	</div>
              </div>
            </li>
            
            
           
          
          
          <!-- 이하루 - 마이페이지 -->
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="notice">마이페이지<span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="notice">
              
                <a class="dropdown-item" href="notice.do"><b>내정보관리</b></a>
                <div>
	                <a class="dropdown-item" href="#">&nbsp; 개인정보수정</a>
	                <a class="dropdown-item" href="#">&nbsp; 내 근태</a>
	                <a class="dropdown-item" href="#">&nbsp; 내 일정</a>
	                <a class="dropdown-item" href="#">&nbsp; 내 작성활동</a>
                </div>
                <div class="dropdown-divider"></div>                
                <a class="dropdown-item" href="../lumen/"><b>사원연락처</b></a>
              </div>
            </li>
          </ul>
          
          
          <ul class="navbar-nav ms-md-auto" style="padding-left:200px;">
            <li class="nav-item">
               <a class="nav-link" href="../help/">메일</a>
            </li>
            
            <!-- 5. 강소영 - 메신저 -->
            <li class="nav-item">
              <a target="_blank" rel="noopener" class="nav-link" href="https://twitter.com/bootswatch"><i class="fa fa-twitter"></i> 메신저</a>
            </li>
          </ul>
          
          
          
        </div>
      </div>
    </div>
