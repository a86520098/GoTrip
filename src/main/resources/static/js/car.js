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

	$('.select-county').html(str)

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


	let isNameValid, isCountyVaild, isDistrictVaild, isZipcodeVaild, isAddresseVaild, isPhoneVaild;

	// 確認表單內容
	$('#btn-insert-loc').click(function(e) {
		isNameValid = $('#name').val() !== '';
		isCountyVaild = $('.county').val() !== '';
		isDistrictVaild = $('.district').val() !== '';
		isZipcodeVaild = $('.zipcode').val() !== '';
		isAddresseVaild = $('#address').val() !== '';
		isPhoneVaild = $('#phone').val().charAt(2) == '-' && $('#phone').val().length >= 10 && $('#phone').val().length <= 11;
		isOpenVaild = $('#openTime').val().substring(3) < 60 && $('#openTime').val().substring(0,2) < 24;
		isCloseVaild = $('#openTime').val().substring(3) < 60 && $('#openTime').val().substring(0,2) < 24;
		
		if (!isNameValid || !isCountyVaild || !isDistrictVaild || !isZipcodeVaild || !isAddresseVaild || !isPhoneVaild || !isOpenVaild || !isCloseVaild) {
			e.preventDefault();
			isNameValid ? hideInvalidText($('#name')) : showInvalidText($('#name'));
			isCountyVaild ? hideInvalidText($('.county')) : showInvalidText($('.county'));
			isDistrictVaild ? hideInvalidText($('.district')) : showInvalidText($('.district'));
			isZipcodeVaild ? hideInvalidText($('.district')) : showInvalidText($('.district'));
			isAddresseVaild ? hideInvalidText($('#address')) : showInvalidText($('#address'));
			isPhoneVaild ? hideInvalidText($('#phone')) : showInvalidText($('#phone'));
			isOpenVaild ? hideInvalidText($('#openTime')) : showInvalidText($('#openTime'));
			isCloseVaild ? hideInvalidText($('#closeTime')) : showInvalidText($('#closeTime'));
			$("form").addClass('validated');
		} else {
			console.log('success')
			e.preventDefault();
			Swal.fire({
				icon: 'success',
				title: '儲存成功',
				text: "即將會您導回地點列表",
				showConfirmButton: false,
				timer: 1500
			});

			setInterval(function() {
				$('#insert-loc-form').submit()
			}, 1500);
		}
	})

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
	
	$('#phone').on('blur', function() {
		if ($("form").hasClass('validated'))
			isPhoneVaild ? showInvalidText($('#phone')) : hideInvalidText($('#phone'))
	})
	
	$('#openTime').on('blur', function() {
		if ($("form").hasClass('validated'))
			isOpenVaild ? showInvalidText($('#openTime')) : hideInvalidText($('#openTime'))
	})
	
	$('#closeTime').on('blur', function() {
		if ($("form").hasClass('validated'))
			isCloseVaild ? showInvalidText($('#closeTime')) : hideInvalidText($('#closeTime'))
	})




//	$('.js-show-modal-item').on('click', function(e) {
//		e.preventDefault();
//		$('.js-modal-item').addClass('show-modal1');
//	});
//
//	$('.js-hide-modal-item').on('click', function() {
//		$('.js-modal1-item').removeClass('show-modal1');
//	});


	$("#btn-insert-correct-loc").on("click", function() {
		$('#companyId').val(1)
		$('#companyName').val('資展租車')
		$('#name').val('資展中壢站')
		$('#county').val('台灣')
		$('.county').focus()
		$('.county').val('桃園市')
		$('.county').blur()

		$(".county option[value='" + $('.county option:selected').val('桃園市') + "']").prop("selected", true);
		$('.district').focus().val('中壢區').blur()

		$('#address').val('新生路二段421號').blur()
		$('#openTime').focus()
		$('#phone').focus().val('03-4533013').blur()
		
		$('#openTime').focus().val('09:00').blur()
		$('#closeTime').focus().val('16:30').blur()
		$('#longitude').val(121.222129)
		$('#latitude').val(24.984981)

	});
	
	
	$("#btn-insert-wrong-loc").on("click", function() {
		$('#companyId').val(1)
		$('#companyName').val('資展租車')
		$('#name').val('資展中壢站')
		$('#county').val('台灣')
		$('.county').focus().val('桃園市').blur()
		$(".county option[value='" + $('.county option:selected').val('桃園市') + "']").prop("selected", true);
		$('.district').focus().val('中壢區').blur()
		$('#address').focus().val('新生路二段421號').blur()
		$('#phone').val('(03)4533013')
		$('#openTime').val('上午9點')
		$('#closeTime').val('晚上8點')

	});

	$("#btn-insert-wrong-car").on("click", function() {
		$('#type').val('豪華轎車')
		$('#makeCh').val('特斯拉')
		$('#makeEn').val('Tesla')
		$('#model').val('')
		$("input[name='power'][value='電動車']").attr("checked", true);
		$('#transmission').val('')
		$('#engine').val('-5')
		$('#seat').val('5')
		$('#door').val('4')
		$('#suitcase').val('2')
		$('#bag').val('2')
	});
	
	
	$("#btn-insert-correct-car").on("click", function() {
		$('#type').focus().val('豪華轎車').blur()
		$('#makeCh').focus().val('特斯拉').blur()
		$('#makeEn').focus().val('Tesla').blur();
		$('#model').focus().val('Model S').blur()
		$("input[name='power'][value='電動車']").attr("checked", true);
		$("input[name='transmission'][value='AT']").attr("checked", true);
		$('#engine').focus().val('0').blur()
		$('#seat').val('5')
		$('#door').val('4')
		$('#suitcase').val('2')
		$('#bag').val('2')
	});
	
	
	let isTypeVaild, isMakeChValid, isMakeEnValid, isModelVaild, isPowerVaild, isTransmissionVaild, isEngineVaild, isSeatVaild, isDoorVaild, isSuitcaseVaild, isBagVaild;

	// 確認表單內容
	$('#btn-insert-car').click(function(e) {
		isTypeValid = $('#type').val() !== '';
		isMakeChValid = $('#makeCh').val() !== '';
		isMakeEnValid = $('#makeEn').val() !== '';
		isModelVaild = $('#model').val() !== '';
		isPowerVaild = $('#power').val() !== '';
		isTransmissionVaild = $('#transmission').val() !== '';
		isEngineVaild = $('#engine').val() >= 0;
		isSeatVaild = $('#seat').val() >= 0;
		isDoorVaild = $('#door').val() >= 0;
		isSuitcaseVaild = $('#suitcase').val() >= 0;
		isBagVaild = $('#bag').val() >= 0;
		
		if (!isMakeChValid || !isMakeEnValid || !isModelVaild || !isPowerVaild || !isTransmissionVaild || !isEngineVaild || !isSeatVaild || !isDoorVaild || !isSuitcaseVaild || !isBagVaild ){
			e.preventDefault();
			isTypeValid ? hideInvalidText($('#type')) : showInvalidText($('#type'));
			isMakeChValid ? hideInvalidText($('#makeCh')) : showInvalidText($('#makeCh'));
			isMakeEnValid ? hideInvalidText($('#makeEn')) : showInvalidText($('#makeEn'));
			isModelVaild ? hideInvalidText($('#model')) : showInvalidText($('#model'));
			isPowerVaild ? hideInvalidText($('#power')) : showInvalidText($('#power'));
			isTransmissionVaild ? hideInvalidText($('#transmission')) : showInvalidText($('#transmission'));
			isEngineVaild ? hideInvalidText($('#engine')) : showInvalidText($('#engine'));
			isSeatVaild ? hideInvalidText($('#seat')) : showInvalidText($('#seat'));
			isDoorVaild ? hideInvalidText($('#door')) : showInvalidText($('#door'));
			isSuitcaseVaild ? hideInvalidText($('#suitcase')) : showInvalidText($('#suitcase'));
			isBagVaild ? hideInvalidText($('#bag')) : showInvalidText($('#bag'));
			$("form").addClass('validated');
		} else {
			console.log('success')
			e.preventDefault();
			Swal.fire({
				icon: 'success',
				title: '儲存成功',
				text: "即將會您導回地點列表",
				showConfirmButton: false,
				timer: 1500
			});

			setInterval(function() {
				$('#insert-car-form').submit()
			}, 1500);
		}
	})
	
	$('#type').on('blur', function() {
		if ($("form").hasClass('validated'))
			isTypeVaild ? showInvalidText($('#type')) : hideInvalidText($('#type'))
	})
	$('#makeCh').on('blur', function() {
		if ($("form").hasClass('validated'))
			isMakeChVaild ? showInvalidText($('#makeCh')) : hideInvalidText($('#makeCh'))
	})
	$('#makeEn').on('blur', function() {
		if ($("form").hasClass('validated'))
			isMakeEnVaild ? showInvalidText($('#makeEn')) : hideInvalidText($('#makeEn'))
	})
	$('#model').on('blur', function() {
		if ($("form").hasClass('validated'))
			isModelVaild ? showInvalidText($('#model')) : hideInvalidText($('#model'))
	})
	$('#transmission').on('blur', function() {
		if ($("form").hasClass('validated'))
			isTransmissionVaild ? showInvalidText($('#transmission')) : hideInvalidText($('#transmission'))
	})
	$('#engine').on('blur', function() {
		if ($("form").hasClass('validated'))
			isEngineVaild ? showInvalidText($('#engine')) : hideInvalidText($('#engine'))
	})
	
	$('#filter-all').on('click', function() {
		$('div[name="經濟轎車"]').show()
		$('div[name="豪華轎車"]').show()
		$('div[name="休旅車/SUV"]').show()
	})
	$('#filter-compact').on('click', function() {
		$('div[name="經濟轎車"]').show()
		$('div[name="豪華轎車"]').hide()
		$('div[name="休旅車/SUV"]').hide()
	})
	$('#filter-mid-size').on('click', function() {
		$('div[name="經濟轎車"]').hide()
		$('div[name="豪華轎車"]').show()
		$('div[name="休旅車/SUV"]').hide()
	})
	
	$('#filter-suv').on('click', function() {
		$('div[name="經濟轎車"]').hide()
		$('div[name="豪華轎車"]').hide()
		$('div[name="休旅車/SUV"]').show()
	})


})

