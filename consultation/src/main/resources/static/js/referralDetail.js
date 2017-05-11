var baseUrl = window.location.href;


/**
 * 跳转会诊中心
 */
function consultationCenter(){
    var orgCode = localStorage.getItem("orgCode");
    if(orgCode === null){
        //跳转的登录页面
        window.location.href = baseUrl.substring(0,baseUrl.indexOf("referral"));
    }
    window.location.href = baseUrl.substring(0,baseUrl.indexOf("referral"))+"consultation/sendList?orgCode="+orgCode;
}
/**
 * 跳转双向转诊
 */
function referral(){
	 var orgCode = localStorage.getItem("orgCode");
	    if(orgCode === null){
	        //跳转的登录页面
	        window.location.href = baseUrl.substring(0,baseUrl.indexOf("referral"));
	    }
	    window.location.href = baseUrl.substring(0,baseUrl.indexOf("referral"))+"referral/sendList?orgCode="+orgCode;
}