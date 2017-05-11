var baseUrl = window.location.href;
var consultationId = "";
$(function(){
    var state = $("#state").html();
    state = parseInt(state);
    for(var i=0;i<state;i+=10){
     /*$(".module ul li").eq(i).addClass("selected");
     $(".container_"+i).addClass("none");*/
        //console.log(i);
        $(".container_"+(i/10)).addClass("none");
        $(".module ul li").eq(i/10).addClass("selected");
    }
    var orgCode = localStorage.getItem("orgCode");
    //console.log(orgCode);
    if(orgCode === null){
        window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"));
    }
    var orgName = localStorage.getItem("orgName");
    $("#orgName").html(orgName);
    consultationId = $("#consultationId").html();
    /**
     * 绑定前质控完成事件
     */
    $(".receive_btn").click(function(){
        btn1();
    });
    /**
     * 分配点击事件
     */
    $(".complete_btn").click(function(){
        btn2();
    });
    /**
     * 发起会诊点击事件
     */
    $(".handle").click(function(){
        btn3();
    });
    $("#afterControl").click(function(){
        btn4();
    });
    /**
     * 驳回点击事件
     */
    $(".normal").click(function(){
        refuse();
    });
    //当会诊状态是20时，获取会诊专家列表
    console.log(state);
    if(state==20){
        var applyOrgCode = $("#applyOrgCode").html();
        $.ajax({
            url :baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/getExpertLabels",
            type : 'POST',
            data:{
                "applyOrgCode":applyOrgCode,
                "orgCode":orgCode
            },
            dataType : 'JSON',
            success : function(response) {
                console.log(response);
                for(var i=0;i<response.length;i++){
                    var count = response[i].count;
                    var name = response[i].name;
                    var expertLabelId = response[i].expertLabelId;
                    var orgCode = response[i].orgCode;
                    console.log("count:"+count);
                    console.log("name:"+name);
                    console.log("expertLabelId:"+expertLabelId);
                    console.log("orgCode:"+orgCode);
                    console.log("=================");

                }
                $.ajax({
                    url: baseUrl.substring(0, baseUrl.indexOf("consultation")) + "consultation/getExperts",
                    type: 'POST',
                    data: {
                        "expertLabelId": "1",
                    },
                    dataType: 'JSON',
                    success: function (response) {
                        console.log(response);
                        for(var j=0;j<response.length;j++){
                            var  age = response[j].age;
                            var  departmentName = response[j].departmentName;
                            var  expertId = response[j].expertId;
                            var  gender = response[j].gender;
                            var  goodAt = response[j].goodAt;
                            var  name = response[j].name;
                            var  orgCode = response[j].orgCode;
                            var  orgName = response[j].orgName;
                            var  phone = response[j].phone;
                            var  role = response[j].role;
                            var  userId = response[j].userId;
                        }
                    }
                });
            }
        });
    }
})
/**
 * 前质控完成点击
 */
function btn1(){
    $.ajax({
        url :baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/getHospital",
        type : 'POST',
        data:{
            "consultationId":consultationId,
        },
        dataType : 'JSON',
        success : function(response) {
            //console.log(response);
            $(".container_1").addClass("none");
            $(".module ul li").eq(1).addClass("selected");
            $("#state").html("20");
            console.log($("#state").html());
        }
    });
}
/**
 * 分配点击
 */
function btn2(){
    var state = $("#state").html();
    state = parseInt(state);
    $.ajax({
        url :baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/changeStatus",
        type : 'POST',
        data:{
            "consultationId":consultationId,
            "state":state+10
        },
        dataType : 'JSON',
        success : function(response) {
            //console.log(response);
            var state1 = (state+10)/10;
            $(".container_"+(state1-1)).addClass("none");
            $(".module ul li").eq(state1-1).addClass("selected");
            $("#state").html((state+10)+"");
            //console.log(state);
            console.log($("#state").html());
        }
    });
}
/**
 * 发起会诊点击事件
 */
function btn3(){
    var state = $("#state").html();
    state = parseInt(state);
    $.ajax({
        url :baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/changeStatus",
        type : 'POST',
        data:{
            "consultationId":consultationId,
            "state":state+10
        },
        dataType : 'JSON',
        success : function(response) {
            //console.log(response);
            var state1 = (state+10)/10;
            $(".container_"+(state1-1)).addClass("none");
            $(".module ul li").eq(state1-1).addClass("selected");
            $("#state").html((state+10)+"");
            console.log($("#state").html());
        }
    });
}
/**
 * 驳回会诊
 */
function refuse(){
    var msg = prompt("确定要驳回该会诊吗？确定后该会诊立即作废  (y/n确定)");
    console.log(msg);
    if(msg == 'y'){
        //window.location.href = baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/refuse?consultationId="+consultationId
        $.ajax({
            url :baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/refuse",
            type : 'POST',
            data:{
                "consultationId":consultationId
            },
            dataType : 'JSON',
            success : function(response) {
                console.log(response);
                for(var i=1;i<=6;i++){
                    $(".container_"+i).addClass("none");
                    $(".module ul li").eq(i).addClass("selected");
                }
                $("#state").html(100);
            }
        });
    }
}
/**
 * 后指控完成点击
 */
function btn4(){
    var state = $("#state").html();
    state = parseInt(state);
    $.ajax({
        url :baseUrl.substring(0,baseUrl.indexOf("consultation"))+"consultation/changeStatus",
        type : 'POST',
        data:{
            "consultationId":consultationId,
            "state":state+10
        },
        dataType : 'JSON',
        success : function(response) {
            //console.log(response);
            var state1 = (state+10)/10;
            $(".container_"+(state1-1)).addClass("none");
            $(".module ul li").eq(state1-1).addClass("selected");
            $("#state").html((state+10)+"");
            console.log($("#state").html());
        }
    });
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