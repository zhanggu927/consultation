var baseUrl = window.location.href;
/**
 * 跳转转诊详情
 * @param conId
 */
function show(referralId){
    var orgCode = localStorage.getItem("orgCode");
    window.location.href = baseUrl.substring(0,baseUrl.indexOf("referral"))+"referral/show?orgCode="+orgCode+"&referralId="+referralId;
}

/**
 * 分页
 */
function jump(page){
    //获取会诊状态
    var totalPage =  $("#totalPage").html();
    totalPage = parseInt(totalPage);
    page = parseInt(page);
    if(page<1){
        page = 1;
        return;
    }
    if(page>totalPage){
        page = totalPage;
        return;
    }

    //获取会诊状态
    var type = $("#type").html();
    window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/search?orgCode="+localStorage.getItem("orgCode")+"&type="+type+"&page="+page+"&time="+new Date().getTime();
}



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