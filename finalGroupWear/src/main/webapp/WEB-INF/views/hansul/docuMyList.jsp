<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<style>
.t1{
	text-align: center;
}
.t2{
	text-align: center;
}

.t4{
	text-align: center;
}
.t5{
	text-align: center;
}
</style>

<div class="bs-docs-section">
  <div class="row">
    <div class="col-lg-12">

    <div class="bs-component" style="margin-top:5%">
        <table class="table table-hover">
        <colgroup>
        	<col width="10%"/>
        	<col width="15%"/>
        	<col width="45%"/>
        	<col width="15%"/>
        	<col width="15%"/>
        </colgroup>
        	
        <thead>
          <tr>
      		<td colspan="4" style="text-align:left;"><h4>상신문서현황</h4></td>
      		<td style="text-align:right;">
      		<a href="docuReportList.do">
      				<button type="button" class="btn btn-link">더 보기</button>
      			</a>
      	</tr>
        </thead>
        
        <tbody>
          <tr class="table-primary">
            <th class="t1" scope="colgroup">문서번호</th>
            <th class="t2" scope="colgroup">분류</th>
            <th class="t3" scope="colgroup" style="text-align: center;">제목</th>
            <th class="t4"scope="colgroup">상신일자</th>
            <th class="t5" scope="colgroup">처리상태</th>
          </tr>
          <tr>
            <td class="t1">0001</td>
            <td class="t2">품의서예시</td>
            <td class="t3">2021년 8월 에어컨 구매 신청의 건</td>
            <td class="t4">2021-08-01</td>
            <td class="t5">미처리</td>
          </tr>
          
        </tbody>
      </table>
    </div>
    

<div class="bs-component" style="margin-top:5%">
      
      <table class="table table-hover">
      <colgroup>
      	<col width="10%"/>
      	<col width="15%"/>
      	<col width="45%"/>
      	<col width="15%"/>
      	<col width="15%"/>
      </colgroup>
      
      	<thead>
          <tr>
      		<td colspan="4" style="text-align:left;"><h4>미상신 기안</h4></td>
      		<td style="text-align:right;">
      			<a href="docuUnreportList.do">
      				<button type="button" class="btn btn-link">더 보기</button>
      			</a>
      		</td>
      	  </tr>
        </thead>
          
        <tbody>
          <tr class="table-info">
            <th class="t1" scope="colgroup">문서번호</th>
            <th class="t2" scope="colgroup">분류</th>
            <th class="t3" scope="colgroup" style="text-align: center;">제목</th>
            <th class="t4"scope="colgroup">작성일자</th>
            <th class="t5" scope="colgroup">상신하기</th>
          </tr>
          <tr>
            <td class="t1">0001</td>
            <td class="t2">품의서예시</td>
            <td class="t3">2021년 8월 에어컨 구매 신청의 건</td>
            <td class="t4">2021-08-01</td>
            <td class="t5"><button type="button" id="reportGo" class="btn btn-outline-info">상신</button></td>
          </tr>
            
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>  
    
