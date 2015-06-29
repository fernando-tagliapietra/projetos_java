$(document).ready(function(){
	
	var message = $("body").find(".message")	
	if (message) {
		message.prepend("<a href='#' id='close'> X </a>");
	}
	
	$("#form-login").on("submit", function(){
		var login = $("#form-login").find("#login").val();
		var password = $("#form-login").find("#password").val();
		var validation = (login.trim() == "" || password.trim() == "")
		if (validation)
			alert("Login or password is empty, please write this fields.");
		return (!validation);		
	});
	
	$("#close").on("click", function(){
		$("body").find(".message").css("visibility","hidden");
	});
	
});	