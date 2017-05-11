// JavaScript Document


// 前质控完成 //

$(document).ready(function(){
	
	/*$(".receive_btn").click(function(){
		$(".container_1").addClass("none");
		$(".module ul li").eq(1).addClass("selected");
	});*/
});

// 转诊分配完成-显示弹层 //

$(document).ready(function(){
	
	$(".complete_btn").click(function(){
		$("#bg").show();   
       $(".sms_layer").fadeIn(200);  
		});
	});

// 弹层短信通知-确定 //
	
$(document).ready(function(){
	$(".apply").click(function(){
		$(".sms_layer").fadeOut(200);
    	$("#bg").hide(); 
		$(".container_2").addClass("none");
		$(".module ul li").eq(2).addClass("selected");
		});
	});
	
// 弹层短信通知-取消 //
	
$(document).ready(function(){
	$(".cancel").click(function(){
		$(".sms_layer").fadeOut(200);
    	$("#bg").hide(); 
		});
	});
	

// 联动下拉菜单--选择医院/科室 //

$(function(){
	$('#hopit').change(function(){
		var value=$("#hopit").find("option:selected").val();

			if(value=='1'){
			$('#Cont_1').removeClass('none');
			$('#Cont_2,#Cont_3,#Cont_4').addClass('none');
			}
			if(value=='2'){
			$('#Cont_2').removeClass('none');
			$('#Cont_1,#Cont_3,#Cont_4').addClass('none');
			}
			if(value=='3'){
			$('#Cont_3').removeClass('none');
			$('#Cont_1,#Cont_2,#Cont_4').addClass('none');
			}
			if(value=='4'){
			$('#Cont_4').removeClass('none');
			$('#Cont_1,#Cont_2,#Cont_3').addClass('none');
			}
		});

	});
	

// 质控触发退回 //
$(function(){
	$('#quality_opinion').change(function(){
		var value=$("#quality_opinion").find("option:selected").val();

			if(value=='1'){
			$('#back_btn1,#back_btn2').removeClass('selected');
			}
			if(value=='2'){
			$('#back_btn1,#back_btn2').addClass('selected');
			}
			if(value=='3'){
			$('#back_btn1,#back_btn2').addClass('selected');
			}
			if(value=='4'){
			$('#back_btn1,#back_btn2').addClass('selected');
			}
		});

	});

	

	
// 蒙层 //
	
$(function(){   
        $(".bg").width($(document).width());   
        $('.bg').height($(document).height());   
        $('.bg').css('left',0);      
        $('.bg').css('top',0);   

}); 
	
//会诊页面导航切换//
$(document).ready(function(){
	
$(".right .box .tab .label ul li a").click(function(){
	$(".right .box .tab .label ul li a").removeClass("selected");
	$(this).addClass("selected");
	})	
$("#tab1").click(function(){
	$("#tab_1").show();
	$("#tab_2").hide();
	$("#tab_3").hide();
	})
$("#tab2").click(function(){
	$("#tab_2").show();
	$("#tab_1").hide();
	$("#tab_3").hide();
	})
$("#tab3").click(function(){
	$("#tab_3").show();
	$("#tab_2").hide();
	$("#tab_1").hide();
	})
	
	//子菜单切换//
$(".second-level-menu-box .navc li a").click(function(){
	$(".second-level-menu-box .navc li a").removeClass("current");
	$(this).addClass("current");
	})	
$("#level1").click(function(){
	$("#level_1").show();
	$("#level_2").hide();
	$("#level_3").hide();
	$("#level_4").hide();
	})
$("#level2").click(function(){
	$("#level_2").show();
	$("#level_1").hide();
	$("#level_3").hide();
	$("#level_4").hide();
	})
$("#level3").click(function(){
	$("#level_3").show();
	$("#level_2").hide();
	$("#level_1").hide();
	$("#level_4").hide();
	})
$("#level4").click(function(){
	$("#level_4").show();
	$("#level_2").hide();
	$("#level_1").hide();
	$("#level_3").hide();
	})
	
	
	//子菜单 检查子菜单切换//	
$(".inspect .lis .tab a").click(function(){
	$(".inspect .lis .tab a").removeClass("selected");
	$(this).addClass("selected");
	})
$("#type_label").click(function(){
	$(".type").show();
	$(".date").hide();
	})
$("#date_label").click(function(){
	$(".date").show();
	$(".type").hide();
	})
	
	
	
	
//左侧菜单切换//	
		
/*$(".complete_btn").click(function(){
    $(".container_2").addClass("none");
    $(".module ul li").eq(2).addClass("selected");
});
$("#last_btn").click(function(){
    $(".container_3").addClass("none");
	$(".module ul li").eq(3).addClass("selected");
});
$("#afterControl").click(function(){
	$(".container_4").addClass("none");
	$(".module ul li").eq(4).addClass("selected");
});*/
		

	
//	setting //
    $("#setting").hide();
$("#setting-icon").click(function(){
    $("#setting").fadeToggle("slow");
    });

$("#setting li").click(function(){
    $("#setting").hide();
    });
	

$(".right .tab ul li a").click(function(){
	$(".right .tab ul li a").removeClass("selected");
	$(this).addClass("selected");
	})	




//高级搜索//
    $("#h-src").hide();
$("#h-butten").click(function(){
	$("#h-src").show();
	$("#search").hide();
	})
$("#h-src-sure").click(function(){
	$("#search").show();
	$("#h-src").hide();
	})


//滚动条//
$(".table_scroll_bar").mCustomScrollbar({ 
				theme:"minimal-dark", 
				axis:"yx",
				setLeft: 0,
				callbacks:{
					whileScrolling : function(){
						if(this.mcs.direction == "x"){
							$("#myTitle").css("left", this.mcs.left + "px")
						}
					}
				}
});
	
//对齐表格
$("#titleTable").width($("#contentTable").width() + "px");
$("#contentTable tr:first td").each(function(i){
	var w = $(this).outerWidth(true);
	$("#titleTable tr:first th").eq(i).css({"width" : w + "px"});
	});
})