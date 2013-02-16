var ssxn = {
	box: function(title,html,width,yes,no,url){
		var lock = $('body').lock();
		lock.height($(window).height());
		var container = $('<div align="center" style="position:absolute;width:100%;">').appendTo($('body'));
		var profile = $('<div class="prof" style="width:'+width+'px;">').appendTo(container);
		var title = $('<div class="title">').appendTo(profile).html(title);
		var content = $('<div class="content">').html(html).appendTo(profile);
		var btnDiv = $('<div style="margin-bottom:20px;text-align:center;">').appendTo(profile);
		var commit = $('<input type="button" value='+yes+'>').appendTo(btnDiv).click(function(){
			$('body').unlock(lock);
			profile.remove();
		});
		if(no){
			var cancel = $('<input type="button" value="'+no+'">').appendTo(btnDiv).click(function(){
				$('body').unlock(lock);
				profile.remove();
			});
		};
		container.css({top:parseInt($(window).height()/2-(content.height()/2))});
	}, form : function(title,cancel){
		var lock = $(this).lock();
		lock.height($(window).height());
		var content = $('<div align="center" style="position:absolute;width:100%;">').appendTo(tar);
		var profile = $('<div class="prof">').appendTo(content);
		if(p){
			
		} else {
			var title = $('<div class="title">').appendTo(profile).html('编辑个人资料');
			var mr = $('<div style="text-align:center"><label style="margin-right:10px;">先生：<input type="radio" name="man" value="true"></label><label>女士：<input type="radio" name="man" value="false"></label></div>').appendTo(profile);
			var tel = $('<div><label><span>电话号码：</span><input type="text"></label></div>').appendTo(profile);
			var qq = $('<div><label><span>QQ：</span><input type="text"></label></div>').appendTo(profile);
			var birth = $('<div><label><span>生日：</span><input type="text"></label></div>').appendTo(profile);
			var birth = $('<div><label><span>职业：</span><input type="text"></label></div>').appendTo(profile);
			var birth = $('<div style="margin-bottom:10px;"><label><span>住址：</span><input type="text"></label></div>').appendTo(profile);
			var btnDiv = $('<div style="margin-bottom:20px;text-align:center;">').appendTo(profile);
			var commit = $('<input type="button" value="修改">').appendTo(btnDiv).click(function(){
				tar.unlock(lock);
				profile.remove();
			});
			var cancel = $('<input type="button" value="取消">').appendTo(btnDiv).click(function(){
				tar.unlock(lock);
				profile.remove();
			});
			content.css({top:$(window).height()/2-(content.height()/2)});
		}
	}
};
ssxn.box('警告', '确定删除吗？', 350, '是', '否');	