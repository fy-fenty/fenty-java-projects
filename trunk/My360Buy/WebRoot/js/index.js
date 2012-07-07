(function(a) {
	a.fn.sss = function() {
		if (!this.length) {
			return;
		}
		var g = $(this), o, n, m, t, s, e, i = 0, start = function() {
			e = g.find(".t>div");
			m = g.find(".t");
			s = g.find(".b>span");
			n = o = $(e.get(0)).fadeIn("slow");
			$(s.get(0)).addClass("cur");
			f();
		}, l = function() {
			if (typeof arguments[0] == "object") {
				var temp = s.index(arguments[0]);
				if (temp == i) {
					return;
				}
				n = e.get(temp);
				i = temp;
			} else {
				n = ++i >= e.length ? e.get(i = 0) : e.get(i);
			}
			b(o, n);
			o = n;
		}, f = function() {
			s.hover(function() {
				clearInterval(t);
				l(this);
			}, function() {
				t = setInterval(l, 5000);
			})
			m.hover(function() {
				clearInterval(t);
			}, function() {
				t = setInterval(l, 5000);
			})
			t = setInterval(l, 5000);
		}, b = function(x, y) {
			$(x).fadeOut("slow");
			$(y).fadeIn("slow");
			$(s.get(e.index(x))).removeClass("cur");
			$(s.get(e.index(y))).addClass("cur");
		}
		start();
	}
})(jQuery);
(function(a) {
	a.fn.ssa = function() {
		var g = $(this), o, start = function() {
			o = $(g.get(0)).addClass("cur");
			b();
		}, b = function() {
			g.mouseover(function() {
				o.removeClass("cur");
				o = $(this).addClass("cur")
			})
		}
		start.call(this);
	}
})(jQuery);
(function(a) {
	a.fn.ssb = function() {
		var g = $(this), m, s, o, start = function() {
			s = g.find(".bb > span");
			m = g.find(".m > ul");
			o = $(s.get(0)).addClass("cur");
			i();
		}, i = function() {
			s.bind("mouseover", function() {
				o.removeClass("cur");
				m.stop().animate({
					left : 225 * (s.index(this)) * -1
				}, 200);
				;
				o = $(this).addClass("cur");
			})
		}
		start();
	}
})(jQuery);
$("#bar .r .cc").hover(function() {
	$(this).addClass("cur")
}, function() {
	$(this).removeClass("cur")
});
$("#menu .list li[class!='b']").hover(function() {
	$(this).addClass("cur")
}, function() {
	$(this).removeClass("cur")
});
$("#menu .list .cont c3").click(function() {
	$(this).parent().parent().removeClass("cur")
});
$("#menu .r .t > div").hover(function() {
	$(this).addClass("cur");
	$(this).parent().addClass("hover");
}, function() {
	$(this).removeClass("cur");
	$(this).parent().removeClass("hover");
});
$(".hot > .l .b").each(function() {
	var g = $(this);
	setInterval(function() {
		var l = g.find("dl:last-child").remove();
		g.prepend(l.css({
			"height" : "0px"
		}));
		l.animate({
			height : "60px"
		})
	}, 8000)
});
$(".time .l ul li").each(function() {
	var g = $(this);
	var b = g.find("div:first-child");
	var s = b.find("span");
	var hour = parseInt(g.attr("date"));
	var nd = new Date();
	if (hour - nd.getHours() <= 0 && nd.getMinutes() > 0) {
		b.html("<span>时间已过</span>");
		return;
	}
	nd.setMinutes(0);
	nd.setSeconds(0)
	var t = setInterval(function() {
		var od = new Date();
		var h = hour - od.getHours();
		if (h < 0) {
			clearInterval(t);
			b.html("<span>时间已过</span>");
			return;
		}
		od.setHours(h);
		od.setMinutes(nd.getMinutes() - od.getMinutes());
		od.setSeconds(nd.getSeconds() - od.getSeconds());
		$(s.get(0)).html(od.getHours());
		$(s.get(1)).html(od.getMinutes());
		$(s.get(2)).html(od.getSeconds());
	}, 1000)
})
$("#menu .top .cen").sss();
$("#menu .con .r .b>div").ssa();
$("#.middle .actc .cont > div").ssa();
$("#actl > div").ssa();
$("#middle > .r > div").ssa();
$("#middle .r1 .c > .m").ssb();