$().ready(function() {
	(function($) {
		$(".llogin form").submit(function() {
			var g = $(this);
			$.ajax({
				url : g.attr("action"),
				data : g.serialize(),
				type : "text",
				success : function(dt) {
					g.parent().html($(dt).find("#actl"));
					$("head").append("<link rel='stylesheet' type='text/css' href='css/index.css'>");
					$("head").append("<script type='text/javascript' src='js/index.js'></script>");
					g.parent().append("span").addClass("clr");
				}
			})
			return false;
		})
	})(jQuery);
})