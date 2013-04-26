(function($){
	$.ssxn = {
		defaults : {
			width : '100%',
			type : 'POST',
			dataType : 'json'
		},
		tar : null
	};
	$.fn.extend({
		table : function(options){
			$.ssxn.tar = $(this);
			$.extend(options, $.ssxn.defaults);
			var tar = $(this);
			tar.html('');
			this.readData.call(this, options, this.rendData);
		}, 
		rendData : function(options, data){
			var result = data.result;
			var table = $('<table class="x_tb">');
			if(options.width){
				table.attr('width', options.width);
			}
			var thead = $('<thead>').appendTo(table);
			var tr_h = $('<tr>').appendTo(thead);
			var tbody = $('<tbody>').appendTo(table);
			var columns = options.columns;
			//添加头
			for(var i=0;i<columns.length;i++){
				tr_h.append('<th>'+columns[i]['text']+'</th>');
			}
			//添加操作项
			tr_h.append('<th>操作</th>');
			//添加内容
			for(var i=0;i<result.length;i++){
				var tr = $('<tr>').appendTo(tbody);
				for(var j=0;j<columns.length;j++){
					var val = result[i][columns[j]['val']];
					if(val){
						switch(typeof val){
						case 'boolean':
							val = val ? '是' : '否';
							break;
						case 'object':
							var time = val['time'];
							if(time != undefined){
								var date = new Date(time);
								val = date.toLocaleDateString();
							}
							break;
						}
						tr.append('<td>'+val+'</td>');
					}
					if(j+1==columns.length){
						var td = $('<td>').appendTo(tr);
						
						$('<button class="x_btn x_btn_edit">')
						.html('编辑')
						.click(function(){
							alert('编辑');
						}).appendTo(td);
						
						$('<button class="x_btn x_btn_del">')
						.html('删除')
						.click(function(){
							alert('删除');
						})
						.appendTo(td);
					}
				}
			}
			
			/*
			var option = options['options'];
			if(option){
				var tr_op = $('<div>');
				switch (option['location']) {
				case 'top':
					table.before(tr_op);
					break;
				case 'bottom':
					table.after(tr_op);
					break;	
				}
				var op_col = option['columns'];
				for(var i=0;i<op_col.length;i++){
					var btn = $('<button class="x_btn">').appendTo(tr_op);
					btn.html(op_col[i]['text']);
					btn.click(op_col[i]['handler']);
				}
			}
			*/
			
			table.appendTo($.ssxn.tar);
		}, 
		readData : function(options, sucFun){
			$.ajax({
				url : options.url.read,
				method : options.type,
				dataType : options.dataType,
				success : function(){
					sucFun.call(this, options, arguments[0]);
				}
			});
		}
	});
})(jQuery);