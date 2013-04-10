var ssxn = {
	prjName : '/ssxn',
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
var CookieUtils = {
	getCookie : function(c_name) {
		if (document.cookie.length > 0) {
			c_start = document.cookie.indexOf(c_name + "=");
			if (c_start != -1) {
				c_start = c_start + c_name.length + 1;
				c_end = document.cookie.indexOf(";", c_start);
				if (c_end == -1)
					c_end = document.cookie.length;
				return unescape(document.cookie.substring(c_start, c_end));
			}
		}
		return "";
	},
	setCookie : function(c_name, value) {
		document.cookie = c_name + "=" + escape(value);
	}
};
(function($) {
	$.fn.extend({
		lock: function(str){
			var top=this.offset().top,left=this.offset().left,wid=this.outerWidth(),hei=this.outerHeight();
			return $('<div>').css({'position':'absolute','left':0,'top':0,'text-align':'center','width':wid,'height':hei}).
				append($('<div>').css({'width':'100%','height':'100%','background-color':'#cccccc','opacity':'0.5'})).
				append($('<div>').css({'width':'100%','position':'absolute','left':0,'top':0,'line-height':(hei-2)+'px','color':'white','font-weight':'bold','font-size':'20px'}).html(str)).
				appendTo(this);
		}, unlock: function(e){
			e.remove();
		}, rendTable : function(tar, config) {
			tar.html('');
			var columns = config['columns'];
			var data = config['data'];
			var table = $('<table>').appendTo(tar);
			var o_col = [];
			for ( var attr in config['attr']) {
				table.attr(attr, config['attr'][attr]);
			}
			var thead = $('<thead>').appendTo(table);
			var tbody = $('<tbody>').appendTo(table);
			var page = $('<tr>').appendTo(thead);
			var p_tr = $('<td align="center" colspan="'+columns.length+'">').appendTo(page);
			var tr = $('<tr>').appendTo(thead);
			for ( var i = 0; i < columns.length; i++) {
				var tr_e = columns[i];
				o_col[i]=tr_e['name'];
				var td = $('<td>').text(tr_e['z_name']).appendTo(tr);
				for ( var attr in tr_e['attr']) {
					td.attr(attr, tr_e['attr'][attr]);
				}
				for ( var attr in config['c_attr']) {
					td.attr(attr, config['c_attr'][attr]);
				}
			}
			for ( var i = 0; i < data.length; i++) {
				var tr = $('<tr>').appendTo(tbody);
				for(var j=0;j<o_col.length;j++){
					for ( var key in data[i]) {
						if(o_col[j]==key){
							var td = $('<td>').appendTo(tr);
							td.html(data[i][key]);							
						}
					}
				}
			}
		}, renderDate : function(config){
			var tar = $(this);
			tar.html('');
			$.ajax({
				url : config['url'],
				type : config['type'],
				dataType : 'json',
				success : function(data, textStatus, jqXHR) {
					var result = data['result'];
					var table = $('<table>');
					var thead = $('<thead>').appendTo(table);
					var tr_h = $('<tr>').appendTo(thead);
					var tbody = $('<tbody>').appendTo(table);
					var columns = config['columns'];
					//添加头
					for(var i=0;i<columns.length;i++){
						tr_h.append('<td>'+columns[i]['text']+'</td>');
					}
					//添加内容
					for(var i=0;i<result.length;i++){
						var tr = $('<tr>').appendTo(tbody);
						for(var j=0;j<columns.length;j++){
							var val = result[i][columns[j]['val']];
							if(val){
								tr.append('<td>'+val+'</td>');
							}
						}
					}
					table.appendTo(tar);
				}
			});
		}
	});
})(jQuery);