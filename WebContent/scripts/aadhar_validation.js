$(document).ready(function() {
	$('#adar').keyup(function() {
	  var value = $(this).val();
	  value = value.replace(/\D/g, "");
	  $(this).val(value);
	});

	$('#adar').on("change, blur", function() {
	  var value = $(this).val();
	  var maxLength = $(this).attr("maxLength");
	  if (value.length != maxLength) {
	    $(this).addClass("highlight-error");
	  } else {
	    $(this).removeClass("highlight-error");
	  }
	})
	});