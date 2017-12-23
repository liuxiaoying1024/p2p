/*表单提交验证
 * 
 * 正确返回true
 * */
function myFrom(){
	if(!verlName() && verName() && !verPwd() && verlPwd()){
		return true;
	}
	return false;
}


/*用户名ajax验证
 * 
 * 
 * 正确返回true
 * */	
function verName(){
	var user=$("#username").val()
	if(!ajaxAction("user/regNameVil","userName="+user)){
		$(".warnings-p").eq(0).html("该用户不存在");
		return false;
	}
	return true;
}
/*用户名失焦事件 */
$("#username").blur(function(){
	if(!verlName()){
		verName();
	}
})
/*用户名非空验证
 * 
 * 
 * 正确返回false
 * */
function verlName(){
	var str = $("#username").val();
	var wp = $(".warnings-p").eq(0);
	var i = 0;
	var s = 0;
	var warnings="";
	var warn = "请填写用户名";
	return strLength(str,wp,warnings,i,s,warn);
}
/*密码失焦事件 */
$("#password").blur(function(){
	if(!verPwd()){
		if(!verlPwd()){
			$(".warnings-p").eq(1).html("密码错误")
		}
	}
})
/*密码ajax验证
 * 
 * 
 * 正确返回true
 * */
function verlPwd(){
	var user = $("#username").val();
	var pwd= $("#password").val();
	return ajaxAction("user/regPwdVil","userName="+user+"&password="+pwd)
}
/*密码非空验证
 * 
 * 
 * 正确返回false
 * */
function verPwd(){
	var str = $("#password").val();
	var wp = $(".warnings-p").eq(1);
	var i = 0;
	var s = 0;
	var warnings="";
	var warn = "请填写密码";
	strLength(str,wp,warnings,i,s,warn);
}
