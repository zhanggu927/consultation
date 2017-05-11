var baseUrl = window.location.href;
$(function(){
    /**
     * 绑定登录事件
     */
    $("#loginBtn").click(function(){
        login();
    });
    /**
     * 绑定进入会诊中心事件
     */
    $("#confirm").click(function(){
        toIndex();
    });
});
/**
 * 登录
 */
function login(){
    var userId = $("#adminName").val().trim();
    var password = $("#adminPassword").val().trim();
    if(userId == "" || password == ""){
        $("#message").val("用户名或密码不能为空");
        return;
    }
    //拿用户信息
    $.ajax({
        url :baseUrl.substring(0,baseUrl.indexOf("login"))+"login",
        type : 'POST',
        data : {
            'userId' : userId,
            'password':password
        },
        dataType : 'JSON',
        success : function(response) {
            console.log(response);
            var data = response.data;
            if(data.length==0){
                $("#message").html("用户名或密码不正确");
                $("#message").show();
                return;
            }else{
                console.log(data);
                $("#centerList").empty();
                for(var i=0;i<data.length;i++){
                    var afterControl = data[i].afterControl;
                    var name = data[i].name;
                    var orgCode = data[i].orgCode;
                    var preControl = data[i].preControl;
                    var html = '<option value="'+orgCode+'" afterControl="'+afterControl+'" preControl="'+preControl+'">'+name+'</option>';
                    $("#centerList").append(html);
                }
                $('#myModal').modal({
                    keyboard: true
                });
            }
        }
    });
}
/**
 * 跳转会诊首页
 */
function toIndex(){
    var orgCode = $("#centerList").val();
    var orgName = $("#centerList").find("option:selected").text();
    var afterControl = $("#centerList").find("option:selected").attr("afterControl");
    var preControl = $("#centerList").find("option:selected").attr("preControl");
    localStorage.setItem("orgCode",orgCode);
    localStorage.setItem("orgName",orgName);
    localStorage.setItem("afterControl",afterControl);
    localStorage.setItem("preControl",preControl);
    window.location.href = baseUrl.substring(baseUrl.indexOf("consultation"))+"consultation/sendList?orgCode="+localStorage.getItem("orgCode");
}
