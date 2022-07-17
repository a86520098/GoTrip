jQuery(document).ready(function($) {

	$(".btn-delete").click(function(e) {
		e.preventDefault(); // 取消原始動作
		let id = $(this).val();
		Swal.fire({
			icon: 'warning',
			title: '確定刪除?',
			text: "確認刪除後將不可復原",
			showCancelButton: true,
			confirmButtonColor: '#FF8D29',
			cancelButtonColor: '#FFCD38',
			confirmButtonText: '確認',
			cancelButtonText: '取消',
			reverseButtons: true
		}).then((result) => {
			if (result.isConfirmed) {
				$(this).parent().submit();
			}
		})
	})



	const countyArr = ["台北市", "基隆市", "新北市", "宜蘭縣", "桃園市", "新竹市", "苗栗縣", "台中市", "彰化縣", "南投縣", "嘉義市", "嘉義縣", "雲林縣", "台南市", "高雄市", "澎湖縣", "金門縣", "屏東縣", "台東縣", "花蓮縣", "連江縣"]
	//	const countyEngArr = ["taipei", "keelung", "new-taipei", "yilan", "taoyuan", "hsinchu", "miaoli", "taichung", "changhua", "nantou", "嘉義市", "嘉義縣", "雲林縣", "台南市", "高雄市", "澎湖縣", "金門縣", "屏東縣", "台東縣", "花蓮縣", "連江縣"]
	let str = "";
	let n = countyArr.length;
	for (let i = 0; i < n; i++) {
		str += '<div class="form-check">' +
			'<input class="form-check-input" type="checkbox" value="' + countyArr[i] + '" id="' + i + '">' +
			'<label class="form-check-label" for="' + i + '">' + countyArr[i] +
			'</label>' +
			'</div>';
	}

	$('#select-county').html(str)

	// 立即顯示多張照片 - 租車
	$('#imagefile').on('change', function() {
		var imagefiles = document.getElementById("imagefile");
		var number = imagefiles.files.length;
		document.getElementById("formFile").innerHTML = ""
		for (i = 0; i < number; i++) {
			var urls = URL.createObjectURL(event.target.files[i]);
			$("#formFile").html('<div class="col-12"> <img class="img-responsive my-4" alt="image" width="100%" height="auto" src="' + urls + '" /> </div>');
		}
	})


	//	$(function() {

	//		let contentLength = $("#content").val().length;
	//		$("#content-length").text('(' + contentLength + '/' + contentMax + ')');

	let isNameValid, isCountyVaild, isDistrictVaild, isZipcodeVaild, isAddresseVaild, isPhoneVaild;

	// 確認表單內容
	$('#btn-insert-loc').click(function(e) {
		//			let isContentVaild = $("#content").val().length <= contentMax;
		//			let isimagefilesVaild = $("#imagefiles")[0].files.length <= imagefilesMax;
		isNameValid = $('#name').val() !== '';
		isCountyVaild = $('.county').val() !== '';
		isDistrictVaild = $('.district').val() !== '';
		isZipcodeVaild = $('.zipcode').val() !== '';
		isAddresseVaild = $('#address').val() !== '';
		isPhoneVaild = $('#phone').val().indexOf(2) == '-' && $('#phone').val().length >= 10 && $('#phone').val().length <= 11;
		if (!isNameValid || !isCountyVaild || !isDistrictVaild || !isZipcodeVaild || !isAddresseVaild || !isPhoneVaild) {
			e.preventDefault();
			isNameValid ? hideInvalidText($('#name')) : showInvalidText($('#name'));
			isCountyVaild ? hideInvalidText($('.county')) : showInvalidText($('.county'));
			isDistrictVaild ? hideInvalidText($('.district')) : showInvalidText($('.district'));
			isZipcodeVaild ? hideInvalidText($('.district')) : showInvalidText($('.district'));
			isAddresseVaild ? hideInvalidText($('#address')) : showInvalidText($('#address'));
			isPhoneVaild ? hideInvalidText($('#phone')) : showInvalidText($('#phone'));
			//				isContentVaild ? hideInvalidText($('#content')) : showInvalidText($('#content'));
			//				isimagefilesVaild ? hideInvalidText($('#imagefiles')) : showInvalidText($('#imagefiles'));
			$("form").addClass('validated');
			console.log('validated')
		} else {
			console.log('success')
			e.preventDefault();
			Swal.fire({
				icon: 'success',
				title: '儲存成功',
				showConfirmButton: false,
				timer: 1500
			});

			setInterval(function() {
				$('#insert-loc-form').submit()
			}, 1500);
		}
	})
	//	});

	function showInvalidText(selector) {
		selector.removeClass('is-valid').addClass('is-invalid');
		selector.siblings('.invalid-feedback').css('display', 'block')
	}

	function hideInvalidText(selector) {
		selector.removeClass('is-invalid').addClass('is-valid');
		selector.siblings('.invalid-feedback').css('display', 'none')
	}



	$('#name').keyup(function() {
		if ($("form").hasClass('validated'))
			isNameValid ? showInvalidText($('#name')) : hideInvalidText($('#name'))
	})

	$('.county').on('change', function() {
		if ($("form").hasClass('validated'))
			isCountyVaild ? showInvalidText($('.county')) : hideInvalidText($('.county'))
	})

	$('.district').on('change', function() {
		if ($("form").hasClass('validated'))
			isDistrictVaild ? showInvalidText($('.district')) : hideInvalidText($('.district'))
	})

	$('.zipcode').on('change', function() {
		if ($("form").hasClass('validated'))
			isZipcodeVaild ? showInvalidText($('.zipcode')) : hideInvalidText($('.zipcode'))
	})

	$('#address').on('change', function() {
		if ($("form").hasClass('validated'))
			isAddressVaild ? showInvalidText($('#address')) : hideInvalidText($('#address'))
	})
	$('#phone').on('change', function() {
		if ($("form").hasClass('validated'))
			isPhoneVaild ? showInvalidText($('#phone')) : hideInvalidText($('#phone'))
	})




	$('.js-show-modal-item').on('click', function(e) {
		e.preventDefault();
		$('.js-modal-item').addClass('show-modal1');
	});

	$('.js-hide-modal-item').on('click', function() {
		$('.js-modal1-item').removeClass('show-modal1');
	});


	$("#btn-insert-correct").on("click", function() {
		console.log('ok');
		//		$('#content').focus()

		$('#name').val('資策中壢站')
		$('#county').val('台灣')
		//		$('#county').val('桃園市')
		//		$('#district').val('中壢區')
		$('.county').focus()
		$('.county').val('桃園市')
		$('.county').blur()

		$(".county option[value='" + $('.county option:selected').val('桃園市') + "']").prop("selected", true);
		$('.district').focus()
		$('.district').val('中壢區')
		$('.district').blur()


		$('#address').val('新生路二段421號')
		$('#phone').val('03-4533013')
		$('#openTime').val('09:00')
		$('#closeTime').val('16:30')
		$('#userId').val(12)
	});

	$("#btn-insert-wrong").on("click", function() {
		console.log('ok');
		$('#content').focus()
		$('#itemTb').val('carRental')
		$('#itemId').val(1)
		$('#userId').val(12)
		$("input[name='rating'][value='2']").attr("checked", true);
		$('#content').val('若你有行駛高速公路，還車時專員會跟你當場結清ETC的費用。另外，租賃期間，若因交通違規而產生罰鍰，是由租借方負責繳清。' +
			'別以為你在路上超速或是違規，就可以拍拍屁股不負責任唷!' + '經過這次的租賃經驗，幾點心得跟大家分享：' +
			'1)若你沒有車子，或是車子的空間不足，租車是個好選擇。' + '2)車種選擇非常多，可以嘗試許多廠牌的車子，讓駕馭變有趣。' +
			'3)駕駛租賃車時保持平常心，把它當成自己的車子愛護，心情就會輕鬆愉快。' +
			'整體來說我覺得格上租車的服務確實相當好，若有租車需求的話，不妨參考看看我們這次的心得囉。')

		$('#content').blur()
	});


})


