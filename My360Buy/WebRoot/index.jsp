<%@page import="java.io.PrintWriter"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>MyHtml.html</title>

		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">

		<link rel="stylesheet" type="text/css" href="css/index.css">
		<link rel="stylesheet" type="text/css" href="css/normal.css">
		<script type="text/javascript" src="js/jquery-1.7.2-dev.js"></script>
		
	</head>

	<body>
		<div id="bar">
			<c3>
				<div class="c">
					<ul class="l">
						<li class="l1 cc"><c3></c3>收藏京东商城</li>
						<li class="bg1">360TOP奢侈品</li>
						<li>迷你挑</li>
						<li>京东好药师</li>
					</ul>
					<ul class="r">
						<li class="l1">
							您好，欢迎来到京东商城！
							<a>[登录]</a>
							<a>[免费注册]</a>
						</li>
						<li>我的订单</li>
						<li class="cc">
							<dl>
								<dt>特色栏目<c3></c3></dt>
								<dd>
									<div>校园频道</div>
									<div>在线读书</div>
									<div>装机大师</div>
									<div>礼品卡</div>
								</dd>
							</dl>
						</li>
						<li>移动京东</li>
						<li class="cc">
							<dl>
								<dt>企业服务<c3></c3></dt>
								<dd>
									<div>企业客户</div>
									<div>办公直通车</div>
								</dd>
							</dl>
						</li>
						<li class="cc">
							<dl>
								<dt>客户服务<c3></c3></dt>
								<dd>
									<div>常见问题</div>
									<div>售后服务</div>
									<div>在线客服</div>
									<div>投诉中心</div>
									<div>客服邮箱</div>
								</dd>
							</dl>
						</li>
					</ul>
					<div class="clr"></div>
				</div>
			</c3>			
		</div>
		<div class="c">
			<div class="topad">
				<img alt="广告" src="img/rBEIC0_VVMgIAAAAAAB8uIaRHkwAAAipgK2UXgAAHzQ741.jpg">
				<div class="clr"></div>
			</div>
			<div class="header">
				<div class="logo">
					<img alt="logo" src="img/logo.png">
					<div class="q"><img alt="" src="img/rBEIC0_Vw9QIAAAAAAAXo2OwfYYAAAj5QFhvl0AABe7325.gif"></div>
				</div>
				<div class="s">
					<form action="">
						<c3 class="l"></c3>
						<c3 class="c">
							<input type="text" />
							<c3><input type="submit" value="搜索" /></c3>
						</c3>
						<c3 class="r"></c3>
					</form>
					<div class="m">
						<span>热门搜索：</span>
						<a>ThinkPad笔记本</a>
						<a>疯狂低价</a>
						<a>三星优惠券</a>
						<a>全民疯抢</a>
						<a>苏泊尔压力锅</a>
						<a>司法考试</a>
					</div>
				</div>
				<div class="u">
					<div class="m">
						<img alt="" src="http://misc.360buyimg.com/lib/img/e/blank.gif">
						<a>我的京东</a>
						<c3></c3>	
					</div>
					<div class="g">
						<a>去购物车结算</a>
						<c3></c3>
					</div>
				</div>
				<div class="clr"></div>				
			</div>
			<div id="menu">
				<div class="top">
					<div class="l">
						<c3></c3>
						<div class="m">
							<a>全部商品分类</a>
						</div>
						<div class="list">
							<ul>
								<li>
									<div>
										<c3></c3>
										<a>图书</a>、<a>电子书刊</a>、<a>音像</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>家用电器</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>手机数码</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>电脑</a>、<a>办公</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>家居家装</a>、<a>厨具</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>服饰鞋帽</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>个护化妆</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>礼品箱包</a>、<a>钟表</a>、<a>珠宝</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>运动健康</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>汽车用品</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>母婴</a>、<a>玩具乐器</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>食品饮料</a>、<a>保健食品</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li>
									<div>
										<c3></c3>
										<a>彩票</a>、<a>旅行</a>、<a>充值</a>、<a>票务</a>
										<c3></c3>
									</div>
									<div class="cont"><c3></c3></div>
								</li>
								<li class="b">
									<span>全部商品分类</span>
								</li>
							</ul>
						</div>
					</div>
					<ul class="c">
						<li class="l1 cur"><a>首页</a></li>
						<li><a>服装城</a></li>
						<li><a>团购</a></li>
						<li><a>夺宝岛</a></li>
						<li><a>京东社区</a></li>
					</ul>
					<div class="ad">
						<img alt="" src="img/rBEIC0_R-bgIAAAAAAAaqMYrlhQAAAgEAG31u0AABrA984.gif">
					</div>
					<div class="con">
						<div class="cen">
							<div class="t">
								<div>
									<img class="i1" alt="" src="img/rBEDik_ejH0IAAAAAADt4OIlT9EAAAvcAJ7H-gAAO34072.jpg">
									<img class="i2" alt="" src="img/rBEDik_eA6gIAAAAAAA3eCDo2D4AAAvPAPTEK4AADeQ306.jpg">
									<img class="i3" alt="" src="img/rBEIC0_dSaQIAAAAAAA3KhSk7MIAAAuUwK6bDAAADdC280.jpg">
									<img class="i4" alt="" src="img/rBEIC0_alCYIAAAAAAAuiHrnUj8AAAqkgGmu7QAAC6g386.jpg">
								</div>
								<div>
									<img class="i1" alt="" src="img/rBEIDE_eiMEIAAAAAADSYt5zjosAAAvaQJD7D8AANJ6537.jpg">
									<img class="i2" alt="" src="img/rBEIC0_ekUYIAAAAAAAxEmDJ0FMAAAvewLHqVIAADEq507.jpg">
									<img class="i3" alt="" src="img/rBEIDE_dTCgIAAAAAAAjK-mWFSsAAAuWABDxeYAACND503.jpg">
									<img class="i4" alt="" src="img/rBEDik_ekL8IAAAAAAAq5jricsIAAAveQP_x_QAACr-504.jpg">
								</div>
								<div>
									<img class="i1" alt="" src="img/rBEIDE_dOOkIAAAAAADu5aWAhbgAAAuPQPIzJgAAO79913.jpg">
									<img class="i2" alt="" src="img/rBEDik_eA6gIAAAAAAA3eCDo2D4AAAvPAPTEK4AADeQ306.jpg">
									<img class="i3" alt="" src="img/rBEIC0_dSaQIAAAAAAA3KhSk7MIAAAuUwK6bDAAADdC280.jpg">
									<img class="i4" alt="" src="img/rBEIC0_alCYIAAAAAAAuiHrnUj8AAAqkgGmu7QAAC6g386.jpg">
								</div>
								<div>
									<img class="i1" alt="" src="img/rBEDik_dW6QIAAAAAADNDCw2nmoAAAubAGvW20AAM0k096.jpg">
									<img class="i2" alt="" src="img/rBEIC0_ekUYIAAAAAAAxEmDJ0FMAAAvewLHqVIAADEq507.jpg">
									<img class="i3" alt="" src="img/rBEIDE_dTCgIAAAAAAAjK-mWFSsAAAuWABDxeYAACND503.jpg">
									<img class="i4" alt="" src="img/rBEDik_ekL8IAAAAAAAq5jricsIAAAveQP_x_QAACr-504.jpg">
								</div>
							</div>
							<div class="b">
								<span>1</span>
								<span>2</span>
								<span>3</span>
								<span>4</span>
							</div>
						</div>
						<div class="r">
							<div class="t">
								<div class="rt">
									<c1></c1>
									<h7>货到付款</h7>
									<div>
										<h9>货到付款</h9>
										<span>京东商城在全国303个地区提供货到付款服务。</span>
										<div>
											<a>了解详细信息<span>></span></a>
										</div>
									</div>
								</div>
								<div class="rm">
									<c1></c1>
									<h7>满39元免运费</h7>
									<div>
										<h9>满39元免运费</h9>
										<span>金额不足39元的订单收取5元运费，钻石级别（一至五钻）会员享受全场免运费的特别优惠。</span>
										<div>
											<a>了解详细信息<span>></span></a>
										</div>
									</div>
								</div>
								<div class="rb">
									<c1></c1>
									<h7>售后上门</h7>
									<div>
										<h9>售后上门</h9>
										<span>若您自购买之日15天内（含15天）因商品质量问题提交退换申请且审核通过，京东免费提供上门取件服务。</span>
										<div>
											<a>了解详细信息<span>></span></a>
										</div>
									</div>
								</div>
								<span class="clr"></span>
							</div>
							<div class="m">
								<div>
									<h8>京东快报</h8>
									<a>更多快报<span>></span></a>
								</div>
								<div class="mc">
									<div>
									    <a>影视全场满150减55！</a><br />
									    <a>夏季最潮女装超值抢购</a><br />
									    <a>ThinkPad惊爆价限时抢！</a><br />
									    <a>老爸也疯狂！名表5折起！</a><br />
									</div>
									<div>
									    <a>焦作漯河开通货到付款！</a><br />
									    <a>安阳平顶山开通货到付款！</a><br />
									    <a>魅力女人专场 2折起！</a><br />
									    <a>四川绵竹分公司成立！</a><br />
									</div>
									<span class="clr"></span>
								</div>
								<span class="clr"></span>
							</div>
							<div class="b">
								<div class="bb">
									<div class="a a1"><h8>手机充值</h8></div>
									<div class="cc">
										<iframe src="mode/chongZhi.html" frameborder="0" height="139px" scrolling="no"></iframe>
									</div>
								</div>
								<div class="bb">
									<div class="a a2"><h8>彩票</h8></div>
									<div class="cc">
										<iframe src="mode/caiPiao.html" frameborder="0" height="139px" scrolling="no"></iframe>
									</div>
								</div>
								<div class="bb">
									<div class="a a3"><h8>旅行</h8></div>
									<div class="cc">
										<iframe src="mode/lvXing.html" frameborder="0" height="139px" scrolling="no"></iframe>
									</div>
								</div>
								<span class="clr"></span>
							</div>
						</div>
					</div>
					<span class="clr"></span>
				</div>
				<span class="clr"></span>
			</div>
			<div id="act">
				<div id="actl">
					<div class="a1 cur">
						<div class="t"><h8>疯狂抢购</h8></div>
						<div class="c">
							<dl>
								<dd><img alt="" src="img/418b82fd-a194-4147-b99e-631014e1b6be.jpg"></dd>
								<dt>
									<a>美丽雅双涡轮旋转地拖HC17665</a>
									<span>京东价：</span><span>￥249.00</span>
								</dt>
							</dl>
							<dl>
								<dd>
									<img alt="" src="img/d528fe19-37b8-4968-981b-8a2b7978689a.jpg">
									<c4><h8>直降</h8></c4>
								</dd>
								<dt>
									<a>联想 A500 红六月疯抢！直降100元！</a>
									<span>京东价：</span><span>￥249.00</span>
								</dt>
							</dl>
							<dl>
								<dd><img alt="" src="img/df05f49a-51f7-4cb4-b87e-d446f1fc2707.jpg"></dd>
								<dt>
									<a>薇薇花开 蝴蝶袖花苞连衣裙</a>
									<span>京东价：</span><span>￥249.00</span>
								</dt>
							</dl>
							<dl>
								<dd><img alt="" src="img/e4af1fe6-4190-439f-b3fc-cbcb645fb84f.jpg"></dd>
								<dt>
									<a>佳能60D单反套机 中端旗舰！店庆特惠！</a>
									<span>京东价：</span><span>￥249.00</span>
								</dt>
							</dl>
							<dl>
								<dd>
									<img alt="" src="img/f7a7e3ec-3928-44e7-80f0-e32c0c74f13a.jpg">
									<c4><h8>直降</h8></c4>
								</dd>
								<dt>
									<a>宏碁i3-2370M+1G独显 店庆聚惠！</a>
									<span>京东价：</span><span>￥249.00</span>
								</dt>
							</dl>
						</div>
					</div>
					<div class="a2">
						<div class="t"><h8>热卖商品</h8></div>
						<div class="c">
							热卖商品
						</div>
					</div>
					<div class="a3">
						<div class="t"><h8>热评商品</h8></div>
						<div class="c">
							热评商品
						</div>
					</div>
					<div class="a4">
						<div class="t"><h8>新品上架</h8></div>
						<div class="c">
							新品上架
						</div>
					</div>
					<div class="a5">
						<div class="t"><h8>猜您喜欢</h8></div>
						<div class="c">
							猜您喜欢
						</div>
					</div>
					<span class="clr"></span>
				</div>
				<div class="actr">
					<div>
						<h8>京东首发</h8>
					</div>
					<div class="mc">
						<div class="t">
							<div class="i">
								<img alt="" src="img/478b9aaa-e5eb-45cc-9a4a-2cffcca47a3f.jpg">
							</div>
							<div class="d">
							   <a>联想家用激光机</a>
							   <c1>首发</c1>
							   <div>联想家用激光打印机 “三好打印机 无忧打三年”。随机耗材1500页打印量，满足普通家庭三年需求；同时联想提供全国百城三年免费上门服务（安装，调试，故障维修等均可。具体城市名单以联想官网发布为准）。好产品 好价格 好服务 联想家用激光机 助你赢在起点！</div>
							</div>
						</div>
						<div class="b">
							<div class="d">
							   <a>AOC新款“祥龙系列”</a>
							   <c1>首发</c1>
							   <div>此系列显示器分“黑白”、“黑红”两款，“黑白”蕴含水墨韵味，“黑红”绘写龙纹祥云，让你的书桌彰显华夏底蕴，AOC一贯的节能、环保、独有的Clear Vision引擎</div>
							</div>
							<div class="i">
								<img alt="" src="img/rBEDik_YC8kIAAAAAAHBsl9NJtAAAAmpAB8wVYAAcHK534.jpg">
							</div>					   
						</div>
					</div>
					</div>
					<span class="clr"></span>
				</div>
			<div class="time">
				<div class="l">
					<div><h8>限时抢购</h8></div>
					<div>
						<ul>
							<li date="12">
								<div>剩余 <span></span> 小时 <span></span> 分 <span></span> 秒</div>
								<div>
									<dl>
										<dd>
											<img alt="" src="img/c47c298f-c626-40c8-86e7-1d68291c2863.jpg">
											<c4><div><h8>1.2</h8><br />折</div></c4>
										</dd>
										<dt>拥有或错过？只此一次！TCL 32寸LED液晶电视</dt>
									</dl>
								</div>
								<div><span>抢购价：</span><span>￥1599.00</span></div>
							</li>
							<li date="14">
								<div>剩余 <span></span> 小时 <span></span> 分 <span></span> 秒</div>
								<div>
									<dl>
										<dd>
											<img alt="" src="img/rBEDik_MhfAIAAAAAADokMkMmh8AAAYLQEfir0AAOio143.jpg">
											<c4><div><h8>1.3</h8><br />折</div></c4>
										</dd>
										<dt>IT-CEO 5000mah带您进入移动电源数显时代</dt>
									</dl>
								</div>
								<div><span>抢购价：</span><span>￥99.00</span></div>
							</li>
							<li date="15">
								<div>剩余 <span></span> 小时 <span></span> 分 <span></span> 秒</div>
								<div>
									<dl>
										<dd>
										<img alt="" src="img/25c4f2e9-dc36-40d8-9730-339ecb0a7fda.jpg">
											<c4><div><h8>1.4</h8><br />折</div></c4>
										</dd>
										<dt>直降200元！仅限三小时抢购！并参加满返</dt>
									</dl>
								</div>
								<div><span>抢购价：</span><span>￥99.00</span></div>
							</li>
							<li date="20">
								<div>剩余 <span></span> 小时 <span></span> 分 <span></span> 秒</div>
								<div>
									<dl>
										<dd>
											<img alt="" src="img/rBEIDE-2A6gIAAAAAAD09oKn0gQAAAADAJfh-UAAPUO074.jpg">
											<c4><div><h8>1.5</h8><br />折</div></c4>
										</dd>
										<dt>优优英语点读笔：会说话的英语绘本</dt>
									</dl>
								</div>
								<div><span>抢购价：</span><span>￥288.00</span></div>
							</li>
							<li date="24">
								<div>剩余 <span></span> 小时 <span></span> 分 <span></span> 秒</div>
								<div>
									<dl>
										<dd>
											<img alt="" src="img/592ade90-48e0-45b0-9fb7-b32127cf37e4.jpg">
											<c4><div><h8>1.6</h8><br />折</div></c4>
										</dd>
										<dt>Chance Chance·恰恰 南非狂野 彩色编织真皮拼接撞色厚底女鞋 0044 徐静蕾代言 米色 35</dt>
									</dl>
								</div>
								<div><span>抢购价：</span><span>￥249.00</span></div>
							</li>
						</ul>
						<span class="clr"></span>
					</div>
				</div>
				<div class="r">
					<div>
						<div class="t"><h8>今日团购</h8><a>更多团购<span>></span></a></div>
						<div>
							<div class="c">
								<div class="p">
									<a>仅65元，即得原价200元水立方嬉水乐园“魔幻星夜狂欢节”门票1张，全园11项水上娱乐项目一票制无限畅玩+水立方参观。深海龙卷风、魔幻漩涡、翻江倒海、急速暗涌、魔方城堡、海底穿梭、疯狂海啸、泡泡池、梦境漂流、水魔方大舞台11大嬉水项目让您又HIGH又过瘾！横跨五一、六一、端午三大黄金假期！幻水立方，越夜越精彩！本票还可参观水立方！</a>
									<span>原价：</span><span>200.00</span>
								</div>
								<div><img alt="" src="img/rBEIDE_amaIIAAAAAAAnTwWm1-cAAAqogFPVlwAACdn078.jpg"></div>
								<span class="clr"></span>
							</div>
							<span class="clr"></span>
							<div class="f"><c1><span>团购价：</span><span>￥65.00</span><c1></c1></c1></div>
							<span class="clr"></span>
						</div>
					</div>
					<div><img alt="" src="img/rBEIDE_b3ewIAAAAAAA-YcApVB4AAAssQMP9cwAAD55367.jpg"></div>
				</div>
				<span class="clr"></span>
			</div>
			<div id="middle">
				<div class="l">
					<div class="t"><c1></c1></div>
					<div>
						<ul>
						    <li><a><b>·</b>超极本</a></li>
						    <li><a><b>·</b>数码相机</a></li>
						    <li><a><b>·</b>笔记本</a></li>
						    <li><a><b>·</b>单反相机</a></li>
						    <li><a><b>·</b>平板电脑</a></li>
						    <li><a><b>·</b>台式电脑</a></li>
						    <li><a><b>·</b>打印机</a></li>
						    <li><a><b>·</b>耳机/耳麦</a></li>
						    <li><a><b>·</b>移动硬盘</a></li>
						    <li><a><b>·</b>数码配件</a></li>
						    <li><a><b>·</b>路由器</a></li>
						    <li><a><b>·</b>办公文仪</a></li>
						    <li><a><b>·</b>显示器</a></li>
						    <li><a><b>·</b>鼠标</a></li>
						    <li><a><b>·</b>CPU</a></li>
						    <li><a><b>·</b>机箱</a></li>
    					</ul>
						<div class="ad"><img alt="" src="img/rBEIC0_YZxMIAAAAAAAkMO79_SwAAAntAGjXh4AACRI235.jpg"></div>
						<span class="clr"></span>
					</div>
				</div>
				<div class="r">
					<div class="r1 cur">
						<div class="t"><h8>特价商品</h8></div>
						<div class="c">
							<dl class="d1">
								<dd><img alt="" src="img/112128.jpg"></dd>
								<dt>
									<a>红六月，电脑亿元大让利！</a>
									<h7>直降<span>800</span>起！</h7>
								</dt>
							</dl>
							<dl class="d2">
								<dd>
									<img alt="" src="img/64ca69cd-326b-4cf0-9aab-36eb08bbb230.jpg">
								</dd>
								<dt>
									<a>尼康D700返现1000成交价13099</a>
									<h7><span>￥14099.00</span></h7>
								</dt>
							</dl>
							<dl class="d3">
								<dd><img alt="" src="img/f7321769-f3ed-4421-ab97-57cef8c3b966.jpg"></dd>
								<dt>
									<a>索尼 D50 音乐神砖 传奇暗金装！</a>
									<h7><span>￥3399.00</span></h7>
								</dt>
							</dl>
							<dl class="d4">
								<dd>
									<img alt="" src="img/121628.jpg">
								</dd>
								<dt>
									<a>得力文具 每满100累减30！</a>
									<h7>品类丰富 多买多减</h7>
								</dt>
							</dl>
							<dl class="d5">
								<dd>
									<img alt="" src="img/441556cd-99a9-4508-9214-6877502b92b7.jpg">
								</dd>
								<dt>
									<a>微软无线便携蓝影6000 黑色</a>
									<h7><span>￥155.00</span></h7>
								</dt>
							</dl>
							<dl class="d6">
								<dd>
									<img alt="" src="img/040331.jpg">
								</dd>
								<dt>
									<a>【疯抢！】惠科（HKC）7英寸电容平板</a>
									<h7><span>369</span>元疯抢！</h7>
								</dt>
							</dl>
							<dl class="d7">
								<dd><img alt="" src="img/095225.jpg"></dd>
								<dt>
									<a>台式机红六月献礼！</a>
									<h7>最高直降<span>500</span>元</h7>
								</dt>
							</dl>
							<div class="m">
								<div class="m">
									<ul>
										<li><img alt="" src="img/rBEIDE_e17MIAAAAAAA6MOatzAcAAAwMgKxKQoAADpI633.jpg"></li>
										<li><img alt="" src="img/rBEIC0_emdkIAAAAAABPTMLZnfsAAAvkgGMxOMAAE9k693.jpg"></li>
										<li><img alt="" src="img/rBEDik_eeN0IAAAAAABNOTFLwhcAAAvVADA4HgAAE1R044.jpg"></li>
										<li><img alt="" src="img/rBEIC0_ZTwgIAAAAAABH7S8TmJwAAAoYAOafiIAAEgF195.jpg"></li>
									</ul>
								</div>
								<div class="b"></div>
								<div class="bb">
									<span>1</span>
									<span>2</span>
									<span>3</span>
									<span>4</span>
								</div>
							</div>
							<span class="clr"></span>
						</div>
					</div>
					<div class="r2">
						<div class="t"><h8>笔记本</h8></div>
						<div class="c">
							笔记本
						</div>
					</div>
					<div class="r3">
						<div class="t"><h8>数码影音</h8></div>
						<div class="c">
							数码影音
						</div>
					</div>
					<div class="r4">
						<div class="t"><h8>DIY攒机</h8></div>
						<div class="c">
							DIY攒机
						</div>
					</div>
					<div class="r5">
						<div class="t"><h8>办公打印</h8></div>
						<div class="c">
							办公打印
						</div>
					</div>
					<span class="clr"></span>
				</div>
				<div class="ad">
					<div class="a">
						<div class="t"><h8>品牌旗舰店</h8><a>更多品牌<span>></span></a></div>
						<div class="b">
							<ul>
								<li><img alt="" src="img/98_35_aEtGgb.gif"></li>
								<li><img alt="" src="img/98_35_cNplgS.gif"></li>
								<li><img alt="" src="img/98_35_LsKUmS.jpg"></li>
								<li><img alt="" src="img/rBEDik_bKXMIAAAAAAAHxzHt4ZoAAAsUQP_9XEAAAff592.gif"></li>
								<li><img alt="" src="img/rBEDik_MTIAIAAAAAAAKgHgORjEAAAXcwPnamAAAAqY700.gif"></li>
								<li><img alt="" src="img/98_35_wgVeco.gif"></li>
								<li class="f"><img alt="" src="img/rBEIC0_QGjEIAAAAAAAHGKGI4TwAAAcvgFcCekAAAcw469.gif"></li>
								<li class="f"><img alt="" src="img/rBEDik_Qg0MIAAAAAAAJcewHIaYAAAd6wP_3HoAAAmJ844.gif"></li>
								<li class="f"><img alt="" src="img/98_35_nVTdxg.jpg"></li>
							</ul>
						</div>
					</div>
					<div class="b">
						<c1></c1>
						<c1></c1>
						<span class="clr"></span>
					</div>
					<div class="ad"><img alt="" src="img/rBEIC0_ZVeAIAAAAAAAoxr_B2msAAAoeAOhgPsAACje338.jpg"></div>
					<div class="ad"><img alt="" src="img/rBEIDE_X6NMIAAAAAAAsrF3e_BgAAAmRQKtodkAACzE046.jpg"></div>
				</div>
				<span class="clr"></span>
			</div>
			<div class="hot">
				<div class="l">
					<div class="l">
						<div class="t"><h8>热门晒单</h8></div>
						<div class="b">
							<dl>
								<dt><img alt="" src="img/299e60be-fb67-420f-b49f-4a73d53c9f6e.jpg"></dt>
								<dd>
									<a>索尼LT22红，漂亮女人机！</a>
									<a>本来想等正在用的手机彻底坏掉再换新的，但是看到索尼的这款还是忍不住心动啊。</a>
									<c2></c2>
								</dd>
							</dl>
							<dl>
								<dt><img alt="" src="img/af00d12e-8586-4593-84bd-dfc293def38a.jpg"></dt>
								<dd>
									<a>发酷冷魔甲机箱购买理由，赢千元大奖</a>
									<a>魔兽战甲，号令天下--说出酷冷至尊魔甲兵机箱的三大购买理由，赢千元大奖！</a>
									<c2></c2>
								</dd>
							</dl>
							<dl>
								<dt><img alt="" src="img/d88a5d80-d764-4fbb-8adc-fd94e98da3e9.jpg"></dt>
								<dd>
									<a>索尼LT22红，漂亮女人机！</a>
									<a>本来想等正在用的手机彻底坏掉再换新的，但是看到索尼的这款还是忍不住心动啊。</a>
									<c2></c2>
								</dd>
							</dl>
							<dl>
								<dt><img alt="" src="img/rBEDik_AkOcIAAAAAAL3qsPxxwIAAALgwP8qpYAAvfC859.jpg"></dt>
								<dd>
									<a>发酷冷魔甲机箱购买理由，赢千元大奖</a>
									<a>魔兽战甲，号令天下--说出酷冷至尊魔甲兵机箱的三大购买理由，赢千元大奖！</a>
									<c2></c2>
								</dd>
							</dl>
						</div>
					</div>
					<div class="r">
						<div class="t"><h8>热门活动</h8></div>
						<div class="b">
							<dl>
								<dt><img alt="" src="img/rBEGD0-yOFcIAAAAAAGX8qW77wkAAA7_wCrfhEAAZgK394.jpg"></dt>
								<dd>
									<a>轻巧、方便、实用</a>
									<a>外观各角度照片</a>
									<c2></c2>
								</dd>
							</dl>
							<dl>
								<dt><img alt="" src="img/0efe2235-22f9-4f66-9462-38f82addf4bf.jpg"></dt>
								<dd>
									<a>科沃斯地宝——我家的贴心小棉袄</a>
									<a>两个月前我们迎来了可爱的女儿，一家人围着宝贝忙的不亦乐乎，快乐伴随着劳累，谁也没精力再打扫家里的地面了。</a>
									<c2></c2>
								</dd>
							</dl>
							<dl>
								<dt><img alt="" src="img/rBEDik--8AAIAAAAAACZajuOvPQAAAJkAH6N3IAAJmC826.jpg"></dt>
								<dd>
									<a>EC315 电信wiFi猫，一边优酷一边逛论坛</a>
									<a>优点总结一下，方便实用，插在电源上就可以直接使用了</a>
									<c2></c2>
								</dd>
							</dl>
							<dl>
								<dt><img alt="" src="img/rBEDik_DLzYIAAAAAADd1uxBDqUAAANJgCYQQUAAN3u786.jpg"></dt>
								<dd>
									<a>3G无线路由+移动电源+无线多媒体共享</a>
									<a>先说送货效率，今天中午下的订单，下午就送到了，京东的这次送货一个字--快！</a>
									<c2></c2>
								</dd>
							</dl>
						</div>
					</div>
					
					<span class="clr"></span>
				</div>
				<div class="r">
					<div class="a">
						<div class="t"><h8>在线读书</h8><a>更多在线读书<span>></span></a></div>
						<div class="b">
							<div><img alt="" src="img/030333.jpg"></div>
							<ul>
								<li><a><b>·</b>抱着黄金飞翔:日版黄金大劫案</a></li>
								<li><a><b>·</b>《山楂树之恋》作者艾米新作品</a></li>
								<li><a><b>·</b>蒋介石痛批自己:轻浮躁急 独断</a></li>
								<li><a><b>·</b>上班族午睡有禁忌:睡姿很重要</a></li>
							</ul>
						</div>
					</div>
					<div class="b">
						<form action="">
							<label><h8>订阅促销信息</h8></label><br />
							<div>
								<div><c2 class="e"></c2><input type="text"></div><c2 class="b"><input value="订阅" type="submit"></c2>
								<span class="clr"></span>
							</div>
						</form>
					</div>
				</div>
				<span class="clr"></span>
			</div>
			<div class="manual">
				<div class="cont">
					<dl class="c1">
						<dt><c2></c2><h8>购物指南</h8></dt>
						<dd>
							<ul>
								<li>购物流程</li>
								<li>会员介绍</li>
								<li>团购/机票/充值/点卡</li>
								<li>常见问题</li>
								<li>大家电</li>
								<li>联系客服</li>
							</ul>
						</dd>
					</dl>
					<dl class="c2">
						<dt><c2></c2><h8>配送方式</h8></dt>
						<dd>
							<ul>
								<li>上门自提</li>
								<li>快递运输</li>
								<li>特快专递（EMS）</li>
								<li>如何送礼</li>
								<li>海外购物</li>
							</ul>
						</dd>
					</dl>
					<dl class="c3">
						<dt><c2></c2><h8>支付方式</h8></dt>
						<dd>
							<ul>
								<li>货到付款</li>
								<li>在线支付</li>
								<li>分期付款</li>
								<li>邮局汇款</li>
								<li>公司转账</li>
							</ul>
						</dd>
					</dl>
					<dl class="c4">
						<dt><c2></c2><h8>售后服务</h8></dt>
						<dd>
							<ul>
								<li>售后服务政策</li>
								<li>售后服务流程</li>
								<li>价格保护</li>
								<li>退款说明</li>
								<li>返修/退换货</li>
								<li>退款申请</li>
							</ul>
						</dd>
					</dl>
					<dl class="c5">
						<dt><c2></c2><h8>特色服务</h8><h8></dt>
						<dd>
							<ul>
								<li>夺宝岛</li>
								<li>DIY装机</li>
								<li>延保服务</li>
								<li>家电下乡</li>
								<li>京东礼品卡</li>
								<li>能效补贴</li>
							</ul>
						</dd>
					</dl>
					<dl class="c6">
						<dt><c1><h8>京东商城各地分公司<h8></c1></dt>
						<dd>
							<span>京东商城已在全国303个城市建立了自己的分公司。提供上门自提、货到付款、POS机刷卡和售后上门服务。</span><br>
							<a>查看各地分公司<span>></span></a>
						</dd>
					</dl>
					<span class="clr"></span>
				</div>
			</div>
			<div class="foot" align="center">
				<ul>
					<li>关于我们</li>
					<li>联系我们</li>
					<li>人才招聘</li>
					<li>商家入驻</li>
					<li>迷你挑</li>
					<li>奢侈品网</li>
					<li>广告服务</li>
					<li>移动终端</li>
					<li>友情链接</li>
					<li>销售联盟</li>
					<li>京东论坛</li>
				</ul>
				<div>
					北京市公安局朝阳分局备案编号110105014669  |  京ICP证070359号  |  互联网药品信息服务资格证编号(京)-非经营性-2011-0034<br>
					音像制品经营许可证苏宿批005号  |  出版物经营许可证编号新出发(苏)批字第N-012号  |  互联网出版许可证编号新出网证(京)字150号<br>
					Copyright©2004-2012  360buy京东商城 版权所<br>
				</div>
				<div><img alt="" src="img/108_40_zZOKnl.gif"><img alt="" src="img/112_40_EAWZul.jpg"><img alt="" src="img/108_40_OaNIwt.jpg"><img alt="" src="img/112_40_WvArIl.png"></div>
				<span class="clr"></span>
			</div>
		</div>
		<br />
		<script type="text/javascript" src="js/index.js"></script>
	</body>
</html>