<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/TreeTest/resource/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/TreeTest/resource/js/normal.js"></script>
</head>
<body>

</body>
<script type="text/javascript">
	function append(e,d){
		
	}
	$(document).ready(function() {
		$.ajax({
			url : cons.prjName + '/menu/findAll.action',
			type : 'get',
			dataType : 'json',
			success : function(data, textStatus, jqXHR) {
				if (textStatus == 'success') {
					var root;
					var i=0;
					while(data[i]['menuId']!=1){i++;}
					root = data[i];
					append($('body'),root);
				}
			}
		});
	});
</script>
</html>