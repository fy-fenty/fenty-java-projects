$(document).ready(function(){
	$('.profile').click(function(){
		$.ajax({
			url : '/ssxn/user/edit',
			method : 'POST',
			dataType : 'json',
			success : function(d,s,x){
				if(d['success']){
					
				} else {
					if(confirm(d['data']+'是否现在编辑个人资料？')){
						ssxn.showProfile($('body'));
					}
				}
			}, error : function(x,s,e){
				alert(e);
			}
		});
	});
	$('.order').click(function() {
		$.ajax({
			url : '/ssxn/order/list',
			method : 'POST',
			dataType : 'json',
			success : function(d,s,x){
				$(this).rendTable($('.right'), {
					columns : [ {
						name : 'brideConsultant',
						z_name : '新娘顾问'
					}, {
						name : 'setMealPrice',
						z_name : '套餐价格'
					}, {
						name : 'outShooting',
						z_name : '拍摄外景'
					}, {
						name : 'innerShooting',
						z_name : '拍摄内景'
					}, {
						name : 'weddingDay',
						z_name : '婚期'
					}, {
						name : 'remark',
						z_name : '备注'
					} ],
					data : d['data'],
					attr : {cellpadding:'0', cellspacing:'0', border:'1', bordercolor:'#ccc'},
					c_attr : {width : 150, align:'center'}
				});
			}, error : function(x,s,e){
				alert('错误。');
			}
		});
	});
	$('.order').click();
});