/**
 * check.js
 */
$(function(){
	$("#userId").on("change keyup",function(){
		$.ajax({
			type:'post',
			url:"/login/userIdCheck",
			data:{"userId":$("#userId").val()},
			dataType : "text", // 0, 1
			success : function(result){
				if(result.trim() == "1"){
					$("#idCheck").text("사용중인 아이디입니다.");
					$("#idCheck").css("color","red");
				}else{
					$("#idCheck").text("사용가능한 아이디입니다.");
					$("#idCheck").css("color","blue");
				}
			},
			error:function(){
				alert("서버 오류");	
			}
		});
	});
	$("#userEamil").on("change keyup",function(){
		$.ajax({
			type:'post',
			url:"/checkRest/userEmailCheck",
			data:{"userEmail":$("#userEamil").val()},
			dataType:"text",
			success:function(result){
				if(result == "1"){
					$("#emailCheck").text("사용중인 Email입니다.");
					$("#emailCheck").css("color","red");
				}else{
					$("#emailCheck").text("사용가능한 Email입니다.");
					$("#emailCheck").css("color","blue");
				}
			},
			error:function(){	
			}
		});
	});
	
	$("#frm").submit(function(){
		if($("#idCheck").text()=="" || $("#idCheck").text() =="사용중인 아이디입니다."){
			$("#idCheck").text("아이디 중복확인을 해주세요");
			return false;
		}
		if($("#emailCheck").text()=="" || $("#emailCheck").text() =="사용중인 Email입니다."){
			$("#emailCheck").text("email 중복확인을 해주세요");
			return false;
		}
	});
});