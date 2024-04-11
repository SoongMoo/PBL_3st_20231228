/**
 * 
 */
$(function(){
	$("#frm").submit(function(){
		if($("input:checkbox[name='nums']:checked").length < 1){
			alert("하나이상 선택이상 선택하셔야 합니다.");
			return false;
		}
	});	
	$("#checkBoxs").click(function(){
		if($("#checkBoxs").prop("checked")){
			$("input:checkbox[name='nums']").prop("checked",true);
		}else{
			$("input:checkbox[name='nums']").prop("checked",false);
		}
		goodsChk();
	});
	$("input:checkbox[name='nums']").click(function(){
		var tot = $("input:checkbox[name='nums']").length;
	    var chc = $("input:checkbox[name='nums']:checked").length;
		if(tot == chc) $("#checkBoxs").prop("checked", true);
		else $("#checkBoxs").prop("checked", false);
		goodsChk();
	});
});