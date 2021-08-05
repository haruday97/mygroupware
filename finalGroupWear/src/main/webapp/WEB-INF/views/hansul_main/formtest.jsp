<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
     <div class="bs-docs-section" style="width:70%; margin-left:15%;">
        <div class="row">
          <div class="col-lg-12">
            <div class="page-header">
              <h1 id="forms">Forms</h1>
            </div>
          </div>
        </div>

        
              <form>
                <fieldset>
                  <legend>Legend</legend>
                  <div class="form-group row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="email@example.com">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                  </div>
                  <div class="form-group">
                    <label for="exampleSelect1">Example select</label>
                    <select class="form-select" id="exampleSelect1">
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                      <option>4</option>
                      <option>5</option>
                    </select>
                  </div>
                  <div class="form-group">
                    <label for="exampleSelect2">Example multiple select</label>
                    <select multiple class="form-select" id="exampleSelect2">
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                      <option>4</option>
                      <option>5</option>
                    </select>
                  </div>
                  <div class="form-group">
                    <label for="exampleTextarea">Example textarea</label>
                    <textarea class="summernote"></textarea> 
                  </div>
                  <div class="form-group">
                    <label for="formFile" class="form-label">Default file input example</label>
                    <input class="form-control" type="file" id="formFile">
                  </div>
                  <fieldset class="form-group">
                    <legend>Radio buttons</legend>
                    <div class="form-check">
                      <label class="form-check-label">
                        <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                        Option one is this and that&mdash;be sure to include why it's great
                      </label>
                    </div>
                    <div class="form-check">
                      <label class="form-check-label">
                        <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2" value="option2">
                        Option two can be something else and selecting it will deselect option one
                      </label>
                    </div>
                    <div class="form-check disabled">
                      <label class="form-check-label">
                        <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios3" value="option3" disabled>
                        Option three is disabled
                      </label>
                    </div>
                  </fieldset>
                  <fieldset class="form-group">
                    <legend>Checkboxes</legend>
                    <div class="form-check">
                      <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                      <label class="form-check-label" for="flexCheckDefault">
                        Default checkbox
                      </label>
                    </div>
                    <div class="form-check">
                      <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
                      <label class="form-check-label" for="flexCheckChecked">
                        Checked checkbox
                      </label>
                    </div>
                  </fieldset>
                  <fieldset>
                    <legend>Switches</legend>
                    <div class="form-check form-switch">
                      <input class="form-check-input" type="checkbox" id="flexSwitchCheckDefault">
                      <label class="form-check-label" for="flexSwitchCheckDefault">Default switch checkbox input</label>
                    </div>
                    <div class="form-check form-switch">
                      <input class="form-check-input" type="checkbox" id="flexSwitchCheckChecked" checked>
                      <label class="form-check-label" for="flexSwitchCheckChecked">Checked switch checkbox input</label>
                    </div>
                  </fieldset>
                  <fieldset class="form-group">
                    <legend>Ranges</legend>
                      <label for="customRange1" class="form-label">Example range</label>
                      <input type="range" class="form-range" id="customRange1">
                      <label for="disabledRange" class="form-label">Disabled range</label>
                      <input type="range" class="form-range" id="disabledRange" disabled>
                      <label for="customRange3" class="form-label">Example range</label>
                      <input type="range" class="form-range" min="0" max="5" step="0.5" id="customRange3">
                  </fieldset>
                   <div class="form-group">
                <fieldset disabled>
                  <label class="form-label" for="disabledInput">Disabled input</label>
                  <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled>
                </fieldset>
              </div>

              <div class="form-group">
                <fieldset>
                  <label class="form-label" for="readOnlyInput">Readonly input</label>
                  <input class="form-control" id="readOnlyInput" type="text" placeholder="Readonly input here..." readonly>
                </fieldset>
              </div>

              <div class="form-group has-success">
                <label class="form-label" for="inputValid">Valid input</label>
                <input type="text" value="correct value" class="form-control is-valid" id="inputValid">
                <div class="valid-feedback">Success! You've done it.</div>
              </div>

              <div class="form-group has-danger">
                <label class="form-label" for="inputInvalid">Invalid input</label>
                <input type="text" value="wrong value" class="form-control is-invalid" id="inputInvalid">
                <div class="invalid-feedback">Sorry, that username's taken. Try another?</div>
              </div>

              <div class="form-group">
                <label class="col-form-label col-form-label-lg" for="inputLarge">Large input</label>
                <input class="form-control form-control-lg" type="text" placeholder=".form-control-lg" id="inputLarge">
              </div>

              <div class="form-group">
                <label class="col-form-label" for="inputDefault">Default input</label>
                <input type="text" class="form-control" placeholder="Default input" id="inputDefault">
              </div>

              <div class="form-group">
                <label class="col-form-label col-form-label-sm" for="inputSmall">Small input</label>
                <input class="form-control form-control-sm" type="text" placeholder=".form-control-sm" id="inputSmall">
              </div>

              <div class="form-group">
                <label class="form-label mt-4">Input addons</label>
                <div class="form-group">
                  <div class="input-group mb-3">
                    <span class="input-group-text">$</span>
                    <input type="text" class="form-control" aria-label="Amount (to the nearest dollar)">
                    <span class="input-group-text">.00</span>
                  </div>
                </div>
              </div>

              <div class="form-group">
                <label class="form-label mt-4">Floating labels</label>
                <div class="form-floating mb-3">
                  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                  <label for="floatingInput">Email address</label>
                </div>
                <div class="form-floating">
                  <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
                  <label for="floatingPassword">Password</label>
                </div>
              </div>
                  
                  
                  <button type="submit" class="btn btn-primary">Submit</button>
                </fieldset>
              </form>
            </div>
            

 
          


<script>

/* <textarea class="summernote"></textarea>   */

/* $(document).ready(function() {

	var toolbar = [
		    // 글꼴 설정
		    ['fontname', ['fontname']],
		    // 글자 크기 설정
		    ['fontsize', ['fontsize']],
		    // 굵기, 기울임꼴, 밑줄,취소 선, 서식지우기
		    ['style', ['bold', 'italic', 'underline','strikethrough', 'clear']],
		    // 글자색
		    ['color', ['forecolor','color']],
		    // 표만들기
		    ['table', ['table']],
		    // 글머리 기호, 번호매기기, 문단정렬
		    ['para', ['ul', 'ol', 'paragraph']],
		    // 줄간격
		    ['height', ['height']],
		    // 그림첨부, 링크만들기, 동영상첨부
		    ['insert',['picture','link','video']],
		    // 코드보기, 확대해서보기, 도움말
		    ['view', ['codeview','fullscreen', 'help']]
		  ];

	var setting = {
            height : 300,
            minHeight : null,
            maxHeight : null,
            focus : true,
            lang : 'ko-KR',
            toolbar : toolbar,
            callbacks : { //여기 부분이 이미지를 첨부하는 부분
            onImageUpload : function(files, editor, welEditable) {
		            for (var i = files.length - 1; i >= 0; i--) {
		            uploadSummernoteImageFile(files[i], this);
            		}
            	}
            }
         };

    $('.summernote').summernote(setting);
    });
        
	function uploadSummernoteImageFile(file, el) {
		data = new FormData();
		data.append("file", file);
		$.ajax({
			data : data,
			type : "POST",
			url : "uploadSummernoteImageFile",
			contentType : false,
			enctype : 'multipart/form-data',
			processData : false,
			success : function(data) {
				$(el).summernote('editor.insertImage', data.url);
			}
		});
} */

$('.summernote').summernote({
	  toolbar: [
		    // [groupName, [list of button]]
		    ['fontname', ['fontname']],
		    ['fontsize', ['fontsize']],
		    ['style', ['bold', 'italic', 'underline','strikethrough', 'clear']],
		    ['color', ['forecolor','color']],
		    ['table', ['table']],
		    ['para', ['ul', 'ol', 'paragraph']],
		    ['height', ['height']],
		    ['insert',['picture','link','video']],
		    ['view', ['fullscreen', 'help']]
		  ],
		fontNames: ['Arial', 'Arial Black', 'Comic Sans MS', 'Courier New','맑은 고딕','궁서','굴림체','굴림','돋움체','바탕체'],
		fontSizes: ['8','9','10','11','12','14','16','18','20','22','24','28','30','36','50','72']
});
</script>

</body>
</html>