function myPanFunction() {
	var panVal = $('#panNumber').val();
	var regpan = /^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$/;

	if (regpan.test(panVal)) {
		alert("INVALID PAN"); 
	} else {
		alert("INVALID PAN"); 
	}
}