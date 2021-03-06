var baseUrl = window.location.href;
$(function(){
    var orgCode = localStorage.getItem("orgCode");
    console.log(orgCode);
    if(orgCode === null){
        window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"));
    }
    var orgName = localStorage.getItem("orgName");
    $("#orgName").html(orgName);
})

/**
 * 跳转会诊详情
 * @param conId
 */
function show(conId){
    var orgCode = localStorage.getItem("orgCode");
    window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/show?orgCode="+orgCode+"&conId="+conId;
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

function jumpStatus(data){
    console.log(data);
    window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/search?orgCode="+localStorage.getItem("orgCode")+"&type="+data+"&page="+1+"&time="+new Date().getTime();

}

/**
 * 指定跳转多少页
 */
function goPage(){
    var page = $("#currentPage").val();
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
        window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"));
    }
    window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/sendList?orgCode="+orgCode;
}
/**
 * 跳转双向转诊
 */
function referral(){
	 var orgCode = localStorage.getItem("orgCode");
	    if(orgCode === null){
	        //跳转的登录页面
	        window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"));
	    }
	    window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"))+"referral/sendList?orgCode="+orgCode;
}