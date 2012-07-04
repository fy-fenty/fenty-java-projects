$().ready(function() {
			$("input").autocomplete("servlet/auto", {
						"dataType" : "json",
                        "pageSize" : "2",
                        "pageIndex" : "1",
				        "selectPageBtn" : "selectPageBtn",
				        "selectPageTxt" : "selectPageTxt",
				        "selectPageBtn" : "selectPageBtn",
				        "selectPage" : "selectPage",
                        "paging" : true,
						"parse" : function(dt) {
							return $(dt).map(
                              function() {
                                   return {
                                    data : arguments[1],
                                    value : arguments[1],
                                    result : arguments[1]
                                   }
                              })
						},
						"formatItem" : function(rw) {
							return rw
						}
					})
		})
  
//$().ready(function(){
//   var availableTags = [
//         "ActionScript",
//         "AppleScript",
//         "Asp",
//         "BASIC",
//         "C",
//         "C#",
//         "C++",
//         "Clojure",
//         "COBOL",
//         "ColdFusion",
//         "Erlang",
//         "Fortran",
//         "Groovy",
//         "Haskell",
//         "Java",
//         "JavaScript",
//         "Lisp",
//         "Perl",
//         "PHP",
//         "Python",
//         "Ruby",
//         "Scala",
//         "Scheme"
//      ];
//      $("input").autocomplete(availableTags,{
//         "pageSize" : "2",
//         "pageIndex" : "1",
//         "selectPageBtn" : "selectPageBtn",
//         "selectPageTxt" : "selectPageTxt",
//         "selectPageBtn" : "selectPageBtn",
//         "selectPage" : "selectPage",
//         "paging" : true,
//         "parse" : function(dt){
//            return $(dt).map(
//              function() {
//                   return {
//                    data : arguments[1],
//                    value : arguments[1],
//                    result : arguments[1]
//                   }
//              })
//         }
//      })
//})