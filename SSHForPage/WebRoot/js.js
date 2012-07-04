$().ready(function() {
	$("#show form").submit(function() {
		$("body>div>div").css("display","block");
		$.ajax({
			url : "muser-login.action",
			success : function(dc, st, ob) {
				var json = eval("("+ob.responseText+")");
				if ("0000" == json["result"]) {
					putPage();
				}
			}
		});
		return false;
	});

	function putPage(pg) {
		var start = 0, limit = 5, can = true, lr = 3, cn = 5;
		if (can) {
			can = false;
			$.ajax({
				url : "muser-page.action",
				data : "pageVo.start=" + (!pg?start:limit*pg) + "&pageVo.limit=" + limit,
				success : function(dc, st, ob) {
					$("body>div>div").css("display","none");
					var json = eval("(" + ob.responseText + ")");
					var data = json["data"];
					var html = "<table align='center'><tbody align='center'>"
					for ( var i = 0; i < data.length; i++) {
						html += "<tr>";
						html += "<td width='100px'>" + (data[i]["mname"]) + "</td>";
						html += "<td width='100px'>" + (data[i]["mpwd"]) + "</td>";
						html += "<td width='200px'>" + new Date(data[i]["mdate"]["time"]).toLocaleString() + "</td>";
						html += "</tr>";
					}
					html += "<tr><td colspan=3>";
					var totalPage = parseInt(json.totalPage);
					var currentPage = parseInt(json.currentPage);
					var nextPage = parseInt(json.nextPage);
					var prevPage = parseInt(json.prevPage);
					var totalResults = parseInt(json.totalResults);
					var leftMore=false,rightMore=false;
					var startCount = lr;
					var endCount = lr;
					var endStart = totalPage - lr;
					var centerStart = 0
					if(currentPage - lr >= lr){
						leftMore = true;
					} else {
						startCount = cn;
					}
					if(currentPage + parseInt(cn / 2) < totalPage - 1 - lr ){
						rightMore = true;
					} else {
						endCount = cn;
						endStart = totalPage - cn;
					}
					if(!leftMore && currentPage+cn/2>cn){
						startCount = currentPage+parseInt(cn/2)+1;
					}
					if(!rightMore && currentPage+cn/2>endStart){
						endStart = currentPage-parseInt(cn/2);
						endStart = endStart > totalPage - cn ? totalPage - cn : endStart; 
					}
					html += "<a rel='0'><<</a><a rel='"+prevPage+"'><</a>";
					for ( var j = 0; j < startCount; j++) {
						html += "<a rel="+j+">" + (j + 1) + "</a>";
					}
					if(leftMore){
						for ( var j = 0; j < 3; j++) {
							html += "<a>.</a>";
						}
						for ( var j = currentPage - parseInt(cn / 2); j < startCount; j++) {
							html += "<a rel="+j+">" + (j + 1) + "</a>";
						}
					}
					if(rightMore && leftMore){
						for ( var j = currentPage - parseInt(cn / 2); j < cn + currentPage - parseInt(cn / 2); j++) {
							html += "<a rel="+j+">" + (j + 1) + "</a>";
						}
					}
					if(rightMore){
						for ( var j = 0; j < 3; j++) {
							html += "<a>.</a>";
						}
					}
					for ( var j = endStart; j < totalPage; j++) {
						html += "<a rel='"+j+"'>" + (j+1) + "</a>";
					}
					html += "<a rel='"+nextPage+"'>></a><a rel='"+(totalPage-1)+"'>>></a>";
					html += "</td></tr>";
					html += "</tbody></table>";
					$("body>div").html(html);
					$("a[rel]").css({"cursor":"pointer","padding":"0 5px"}).click(function(){putPage($(this).attr("rel"))})
					$("body>div a").each(function(){
						if($(this).html()==currentPage+1){
							$(this).css({"font-weight":"bold","color":"#6669999"});	
						}
					})
					can = true;
				}
			})
		}
	}
})