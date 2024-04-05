/**
 * 
 */
$(function(){
	$("#frm").ajaxForm({
		  beforeSubmit : function(){
			if($("#memberPw").val() == ""){
				alert("비밀번호를 입력하세요");return false;
			}
			if($("#memberName").val() == ""){
				alert("이름을 입력하세요");return false;
			}
			if($("#memberAddr").val() == ""){
				alert("주소를 입력하세요");return false;
			}
			if($("#memberPhone1").val() == ""){
				alert("연락처를 입력하세요");return false;
			}
			if($("#userEmail").val() == ""){
				alert("이메일을 입력하세요");return false;
			}
		 },
		 success:function(result){
			 if(result.SUCCESS == "200") location.reload();
			 else if(result.SUCCESS == "999") {
				 $("#memberPw").val("");
				 $("#memberPw").focus();
				 alert("비밀번호가 틀렸습니다.");
			  };
		 },
		 error: function(){
			 alert("서버오류");
		 }
	});
});