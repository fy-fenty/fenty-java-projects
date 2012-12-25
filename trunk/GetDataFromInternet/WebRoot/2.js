// ==UserScript==
// @name       MyScript
// @namespace  http://use.i.E.your.homepage/
// @version    0.1
// @description  enter something useful
// @match      http://*.baidu.com*
// @copyright  2012+, You
// ==/UserScript==
var jqScript = document.createElement('script');
jqScript.id = "jquery";
jqScript.src = "http://code.jquery.com/jquery-1.8.3.min.js";
jqScript.onload = jqScript.onreadystatechange = function() {
	if (!this.readyState || this.readyState === "loaded" || this.readyState === "complete") {
		var myScript = document.createElement('script');
		myScript.id = "myScript";
		myScript.src = "http://127.0.0.1:8080/WebTest/1.js";
		document.body.appendChild(myScript);
	}
}
document.body.appendChild(jqScript);