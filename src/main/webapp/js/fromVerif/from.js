/*验证字符串长度
 * 
 * parameter(i-s之间)
 * 
 * 符合要求返回true
 * */
function strLength(str,wp,warnings,i,s,warn) {
	if(str.length<i||str.length>s){
		wp.html(warnings);
		return false;
	}else{
		wp.html(warn);
		return true;
	}
}

/*验证字符串是否相同
 * 
 * parameter()
 * 
 * 符合要求返回true
 * */
function pwdEq(pwd,repwd,wp,warnings){
	if(pwd!=repwd){
		wp.html(warnings);
		return false; 
	}else{
		wp.html("正确");
		return true;
	}
}
/*ajax同步POST
 * 
 * parme(url连接，parameter)
 * 
 * 返回值
 * */
function ajaxAction(url,parameter){
	var flag;
	$.ajax({
		type:"POST",
		async:false,
		url:url,
		data:parameter,
		success:function(data){
			flag=data.msg;
		}
	})
//	alert(flag)
	return flag;
}