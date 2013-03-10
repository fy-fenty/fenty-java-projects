(function(){
	$(document).ready(function(){
		$('label').click(function(){
			$(this).parent().find('input').focus();
		});
		$('.text input').change(function(){
			if($(this).val()==''){
				$(this).parent().removeClass('focus');
			}
		});
		$('.text input').keydown(function(){
			$(this).parent().addClass('focus');
		});
		$('.text input').blur(function(){
			if($(this).val()==''){
				$(this).parent().removeClass('focus');
			}
		});
	});
})();