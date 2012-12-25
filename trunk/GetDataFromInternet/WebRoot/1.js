(function() {
	var s = "{datas:[";
	var index = 0;
	$('#r table').each(function() {
		var title = $(this).find('span>b').text().replace("/[\"]/", "“");
		var href = $(this).find('td>a').attr('href');
		var from = $(this).find('font>nobr').text();
		var comment = $(this).find('font[size=-1]').text()
		s += "{index:" + ++index + ",";
		s += "data:{'title':'" + title + "','link':'" + href + "',from:'" + from + "',comment:'" + comment + "'}},"
	});
	s = s.substr(0, s.length - 1) + ']}';
	$.post('http://localhost:8080/WebTest/servlet/MyServlet', {
		data : s
	}, 'script');
})();