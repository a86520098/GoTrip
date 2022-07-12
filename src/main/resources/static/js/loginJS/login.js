$(() => {
    $("#loginForm").on("submit", function() {
		// 驗證表單輸入欄位填寫及格式
        return verifyFormInput();
    });

	// Description: 驗證表單輸入欄位填寫及格式
	function verifyFormInput() {
        // 檢查帳號
		var verifyEmail = isValidEmail($("#email").val());
		if(!verifyEamil.valid) {
            alert(verifyEmail.message);
            $("#email").focus();
            return false;
		}

        // 檢查密碼
		var verifyPassword = isValidPassword($("#password").val());
		if(!verifyPassword.valid) {
            alert(verifyPassword.message);
            $("#password").focus();
            return false;
        }
	}
})