function fromVerli(){
	var user=$("#username").val()
	
	if(!ajaxAction("user/regNameVil","userName="+user)){
		if(verlName() && verlPwd() && verlRePwd()){
			return true;
		}
	}
	return false;
}

$("#username").blur(function(){
	var user = $(this).val();
	if(verlName()){
		if(ajaxAction("user/regNameVil","userName="+user)){
			var wp = $(".warnings-p").eq(0).html("该用户已存在");
		}else{
			var wp = $(".warnings-p").eq(0).html("用户名可以使用");
		}
	}
})

function verlName(){
	var str = $("#username").val();
	var wp = $(".warnings-p").eq(0);
	var i = 4;
	var s = 16;
	var warnings="用户名为4~16位字母，数字，符号或中文";
	var warn = "用户名可以使用";
	return strLength(str,wp,warnings,i,s,warn);
}
$("#password").blur(function(){
	verlPwd()
})	
function verlPwd(){
	var str = $("#password").val();
	var wp = $(".warnings-p").eq(1);
	var i = 4;
	var s = 16;
	var warnings="密码为4~16位字符组成,采用数字、字母、符号安全性更高";
	var warn = "正确";
	return strLength(str,wp,warnings,i,s,warn);
}

$("#rePassword").blur(function(){
	verlRePwd();
})

function verlRePwd(){
	var repwd= $("#rePassword").val();
	var pwd = $("#password").val();
	var wp = $(".warnings-p").eq(2);
	var warnings="密码不一致，请再次确认";
	return pwdEq(pwd,repwd,wp,warnings);
}
	

