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
		},
		rendTable : function(tar, config) {
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
			var p_pre = $('<button>').css({'margin-right':'20px'}).html('上一页').appendTo(p_tr);
			var p_next = $('<button>').html('下一页').appendTo(p_tr);
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
		}
	});
})(jQuery);