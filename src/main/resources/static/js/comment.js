//function saveComment(e) {
//    Swal.fire({
//        icon: 'success',
//        title: 'Your work has been saved',
//        showConfirmButton: false,
//        timer: 1500
//    })
//}

jQuery(document).ready(function($) {
	
		  $(".btn-delete").click(function(e){
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
			

	// 立即顯示多張照片 - 評論
	$('#imagefiles').on('change', function() {
		var imagefiles = document.getElementById("imagefiles");
		var number = imagefiles.files.length;
		document.getElementById("formFile").innerHTML = ""
		for (i = 0; i < number; i++) {
			var urls = URL.createObjectURL(event.target.files[i]);
			console.log(urls)
			document.getElementById("formFile").innerHTML +=
				'<div class="col-4 mb-3"> <img class="rounded mb-3" width="100%" src="' + urls + '" /> </div>';
//			processImageFile(event.target.files[i]);

		}
	})

	// 立即顯示多張照片 - 租車
	$('#carImage').on('change', function() {
		var imagefiles = document.getElementById("carImage");
		var number = imagefiles.files.length;
		document.getElementById("formFileCar").innerHTML = ""
		for (i = 0; i < number; i++) {
			var urls = URL.createObjectURL(event.target.files[i]);
			document.getElementById("formFileCar").innerHTML +=
				'<div class=""> <img class=" mb-3" src="' + urls + '" /> </div>';
		}
	})

//	function processImageFile(imageObject) {
//		//確認區域與所選擇的相同，因為使用免費的，所以區域選West Center US
//		var uriBase = "https://computer-vision-lynn.cognitiveservices.azure.com/vision/v2.1/analyze";
//
//		var params = {
//			"visualFeatures": "Adult",
//			"details": "",
//			"language": "en",
//		};
//
//		//送出分析
//		$.ajax({
//			url: uriBase + "?" + $.param(params),
//			// Request header
//			beforeSend: function(xhrObj) {
//				xhrObj.setRequestHeader("Content-Type", "application/octet-stream");
//				xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key", "");
//			},
//			type: "POST",
//			processData: false,
//			contentType: false,
//			// Request body
//			data: imageObject
//		})
//			.done(function(data) {
//				//顯示JSON內容
//
//				if (data.adult.isAdultContent == true || data.adult.isRacyContent == true || data.adult.isGoryContent == true) {
//					console.log('請勿上傳色情、暴力或任何包含成人內容的圖片')
//					$('#isAdult').css('display', 'block');
//				} else {
//					hideInvalidText($('#formFile'));
//					$('#isAdult').css('display', 'none');
//				}
//
//			})
//			.fail(function(jqXHR, textStatus, errorThrown) {
//				//丟出錯誤訊息
//				//            var errorString = (errorThrown === "") ? "Error. " : errorThrown + " (" + jqXHR.status + "): ";
//				//            errorString += (jqXHR.responseText === "") ? "" : jQuery.parseJSON(jqXHR.responseText).message;
//				//            alert(errorString);
//			});
//	};




	let contentMax = 200;
	let imagefilesMax = 3;

	$(function() {

		let contentLength = $("#content").val().length;
		$("#content-length").text('(' + contentLength + '/' + contentMax + ')');

		// 確認表單內容
		$('#btn-insert').click(function(e) {
			let isItemTbValid = $('#itemTb').val() !== 'no';
			let isItemIdVaild = $('#itemId').val() !== '';
			let isUserIdVaild = $('#userId').val() !== '';
			let isContentVaild = $("#content").val().length <= contentMax;
			let isimagefilesVaild = $("#imagefiles")[0].files.length <= imagefilesMax;

			if (!isItemTbValid || !isItemIdVaild || !isUserIdVaild || !isContentVaild || !isimagefilesVaild) {
				e.preventDefault();
				isItemTbValid ? hideInvalidText($('#itemTb')) : showInvalidText($('#itemTb'));
				isItemIdVaild ? hideInvalidText($('#itemId')) : showInvalidText($('#itemId'));
				isUserIdVaild ? hideInvalidText($('#userId')) : showInvalidText($('#userId'));
				isContentVaild ? hideInvalidText($('#content')) : showInvalidText($('#content'));
				isimagefilesVaild ? hideInvalidText($('#imagefiles')) : showInvalidText($('#imagefiles'));
				$("form").addClass('validated');
			} else {
				e.preventDefault();
				Swal.fire({
					icon: 'success',
					title: '儲存成功',
					showConfirmButton: false,
					timer: 1500
				});

				setInterval(function() {
					$('#insertForm').submit()
				}, 1500);
			}
		})
		// 確認表單內容
		$('#btn-insert-com').click(function(e) {
			let isContentVaild = $("#content").val().length <= contentMax;
			let isimagefilesVaild = $("#imagefiles")[0].files.length <= imagefilesMax;

			if (!isContentVaild || !isimagefilesVaild) {
				e.preventDefault();
				isContentVaild ? hideInvalidText($('#content')) : showInvalidText($('#content'));
				isimagefilesVaild ? hideInvalidText($('#imagefiles')) : showInvalidText($('#imagefiles'));
				$("form").addClass('validated');
			} else {
				e.preventDefault();
				Swal.fire({
					icon: 'success',
					title: '儲存成功',
					showConfirmButton: false,
					timer: 1500
				});

				let itemTb = $('itemTb').val();
				let comment = {
							"itemTb": $('#itemTb').val(),
							"itemId": $('#itemId').val(), 
							"userId": "admin", 
							"rating": $('input[type=radio]:checked').val(), 
							"content": $('#content').val(),
							"status": "show",
						    "images": [
							        {
							            "imagePath": "/data/uploadimages/comment/ford.jpg",
							            "commentId": 251
							        },
							        {
							            "imagePath": "/data/uploadimages/comment/jeep.jpg",
							            "commentId": 251
							        },
							        {
							            "imagePath": "/data/uploadimages/comment/blue-car.jpg",
							            "commentId": 251
							        },
							    ]
						  };
				console.log($('input[name=itemTb]').val())
				$.ajax({
					type: 'POST',
					url: '/gotrip/api/comments',
					dataType: 'json',
					contentType: 'application/json',
					data: JSON.stringify(comment),
					success: function(data) {
						$(".comments-itemId").text('');
						getComments();
					},
					error: function() {
						console.log('error')
					}
				})
			}
		})
	});

	function showInvalidText(selector) {
		selector.removeClass('is-valid').addClass('is-invalid');
		selector.siblings('.invalid-feedback').css('display', 'block')
	}

	function hideInvalidText(selector) {
		selector.removeClass('is-invalid').addClass('is-valid');
		selector.siblings('.invalid-feedback').css('display', 'none')
	}



	$('#itemTb').on('change', function() {
		if ($("form").hasClass('validated'))
			$('#itemTb').val() == null ? showInvalidText($('#itemTb')) : hideInvalidText($('#itemTb'))
	})

	$('#itemId').keyup(function() {
		if ($("form").hasClass('validated'))
			$('#itemId').val() == '' ? showInvalidText($('#itemId')) : hideInvalidText($('#itemId'))
	})

	$('#userId').keyup(function() {
		if ($("form").hasClass('validated'))
			$('#userId').val() == '' ? showInvalidText($('#userId')) : hideInvalidText($('#userId'))
	})

	// 顯示評論字數
	$("#content").keyup(function() {
		let contentLength = $("#content").val().length;
		$("#content-length").text('(' + contentLength + '/' + contentMax + ')');
		if (contentLength > contentMax) {
			$('#content-length').removeClass('text-black-50').addClass('text-danger')
		} else {
			$('#content-length').removeClass('text-danger').addClass('text-black-50')
		}
		if ($("form").hasClass('validated')) {
			contentLength > contentMax ? showInvalidText($('#content')) : hideInvalidText($('#content'))
		}
	});
	
		// 顯示評論字數
	$("#content").on("blur",function() {
		let contentLength = $("#content").val().length;
		$("#content-length").text('(' + contentLength + '/' + contentMax + ')');
		if (contentLength > contentMax) {
			$('#content-length').removeClass('text-black-50').addClass('text-danger')
		} else {
			$('#content-length').removeClass('text-danger').addClass('text-black-50')
		}
		if ($("form").hasClass('validated')) {
			contentLength > contentMax ? showInvalidText($('#content')) : hideInvalidText($('#content'))
		}
	});

	// 顯示上傳照片數量
	$("#imagefiles").on("change", function() {
		let imagefilesLength = $("#imagefiles")[0].files.length;
		$('#images-length').text('(' + imagefilesLength + '/' + imagefilesMax + ')')
		if (imagefilesLength > imagefilesMax) {
			$('#images-length').removeClass('text-black-50').addClass('text-danger')
		} else {
			$('#images-length').removeClass('text-danger').addClass('text-black-50')
		}
		if ($("form").hasClass('validated')) {
			imagefilesLength > imagefilesMax ? showInvalidText($('#imagefiles')) : hideInvalidText($('#imagefiles'))
		}
	});


	// 顯示商品資訊
	$('.btn-select').on('click', function() {
		let itemTb = $(this).attr('value');
		$.ajax({
			type: 'GET',
			url: '/gotrip/api/' + itemTb,
			dataType: 'json',
			success: function(data) {
				// 清空tbody內容
				$("tbody").html('');
				let str = "";
				// ajax回傳資料放到tbody
				$.each(data, function(i) {
					if (itemTb == 'tickets') {
						str = "<tr>" +
							"<td style='text-align: center' value='tickets'>景點行程</td>" +
							"<td style='text-align: center'>" + data[i].ticketNo + "</td>" +
							"<td>" + data[i].ticketName + "</td>" +
							"<td class='info' style='text-align:center'><i class='ti-info-alt'></i></td>" +
							"</tr>";
					} else if (itemTb == 'hotels') {
						str = "<tr>" +
							"<td style='text-align: center' value='tickets'>飯店住宿</td>" +
							"<td style='text-align: center'>" + data[i].id + "</td>" +
							"<td>" + data[i].hotel_name + "</td>" +
							"<td class='info' style='text-align:center'><i class='ti-info-alt'></i></td>" +
							"</tr>";
					} else if (itemTb == 'cars') {
						str = "<tr>" +
							"<td style='text-align: center' value='tickets'>租車車款</td>" +
							"<td style='text-align: center'>" + data[i].id + "</td>" +
							"<td>" + data[i].makeEn + "</td>" +
							"<td>" + data[i].model + "</td>" +
							"<td class='info' style='text-align:center'><i class='ti-info-alt'></i></td>" +
							"</tr>";
					}
					$("tbody").append(str)
				})
				// td on click 自動填入
				$("td").on('click', function() {
					let id = $(this).closest("tr").find('td').eq(1).html();
					$("#itemId").val(id);
					switch (itemTb) {
						case "tickets":
							$("#itemTb").val("ticket");
							break;
						case "hotels":
							$("#itemTb").val("hotel");
							break;
						case "restaurants":
							$("#itemTb").val("restaurant");
							break;
						case "cars":
							$("#itemTb").val("carRental");
							break;
						default :
							$("#itemTb").val("");
					}
					
					// form validation 設定更改
					if ($("form").hasClass('validated')) {
						$('#itemTb').val() !== null ? hideInvalidText($('#itemTb')) : showInvalidText($('#itemTb'));
						$('#itemId').val() !== '' ? hideInvalidText($('#itemId')) : showInvalidText($('#itemId'));
					}
				});
				// info on click 找該商品資訊
				$('.info').on('click', function() {
					let row = $(this).closest("tr");
					let id = $(row).find('td').eq(1).html();
					popUpInfo(itemTb, id);
				});

			},
			error: function() {
				console.log('error')
			}
		})
	})



	function popUpInfo(itemTb, itemId) {
		$.ajax({
			type: 'GET',
			url: '/gotrip/api/' + itemTb + '/' + itemId,
			dataType: 'json',
			success: function(data) {
				let itemInfo;
				if (itemTb == "tickets") {
					itemInfo = "<table class='text-left'><colgroup><col span='1' style='width: 20%;'><col span='1' style='width: 80%;'>" +
						"<tbody><tr><td>商品項目：</td><td>景點票券</td></tr>" +
						"<tr><td>商品類型：</td><td>" + data.tagName + "</td></tr>" +
						"<tr><td>商品編號：</td><td>" + data.ticketNo + "</td></tr>" +
						"<tr><td>商品名稱：</td><td>" + data.ticketName + "</td></tr>" +
						"<tr><td>商品價格：</td><td>NT$" + data.price + "</td></tr>" +
						"<tr><td>電話：　　</td><td>" + data.phone + "</td></tr>" +
						"<tr><td>地址：　　</td><td>" + data.city + data.location + data.address + "</td></tr>" +
						"<tr><td>商品簡述：　　</td><td>" + data.ticketIntro + "</td></tr></tbody></table>";
				} else if (itemTb == "hotels") {
					itemInfo = "<table class='text-left'>" +
						"<tbody><tr><td>商品項目：</td><td>飯店住宿</td></tr>" +
						"<tr><td>商品類型：</td><td>" + data.hotelStyle + "</td></tr>" +
						"<tr><td>商品編號：</td><td>" + data.id + "</td></tr>" +
						"<tr><td>商品名稱：</td><td>" + data.hotel_name + "</td></tr>" +
						"<tr><td>商品價格：</td><td>NT$" + data.price + "</td></tr>" +
						"<tr><td>電話：　　</td><td>" + data.phone + "</td></tr>" +
						"<tr><td>地址：　　</td><td>" + data.city + data.fullAddress + "</td></tr>" +
						"<tr><td>商品簡述：　　</td><td>飯店設備 - " + data.provide + "</td></tr></tbody></table>";
				} else if (itemTb == "hotels")
					//                    else if (String(parsed.tableName) == "行程") {
					//                        itemInfo = "商品項目：" + parsed.tableName +
					//                            "<br>商品編號：" + parsed.itemId +
					//                            "<br>商品名稱：" + parsed.itemName +
					//                            "<br>商品價格：NT$" + parsed.price +
					//                            "<br>電話：　　" + parsed.phone +
					//                            "<br>地址：　　" + parsed.city + parsed.district + parsed.address +
					//                            "<br>商品介紹：<br>" + parsed.info;
					//                    }
					Swal.fire({
						html: '<div class="text-dark text-start small">' + itemInfo + '</div>',
						// width: 800,
						confirmButtonColor: '#FF8D29',
					})
			},
			error: function() {
				console.log('error')
			}
		})
	}

//    $('.js-show-modal-item').on('click',function(e){
//        e.preventDefault();
//        $('.js-modal-item').addClass('show-modal1');
//    });
//
//    $('.js-hide-modal-item').on('click',function(){
//        $('.js-modal1-item').removeClass('show-modal1');
//    });
    
    
    $("#btn-insert-correct").on("click", function() {
		$('#content').focus()
		$('#itemTb').val('carRental')
		$('#itemId').val(1)
		$('#userId').val(12)
		$("input[name='rating'][value='4']").attr("checked", true);
		$('#content').val('若你有行駛高速公路，還車時專員會跟你當場結清ETC的費用。另外，租賃期間，若因交通違規而產生罰鍰，是由租借方負責繳清。'+
						  '別以為你在路上超速或是違規，就可以拍拍屁股不負責任唷!'+ '經過這次的租賃經驗，幾點心得跟大家分享：' + 
						  '若你沒有車子，或是車子的空間不足，租車是個好選擇。' + 
						  '整體來說我覺得格上租車的服務確實相當好，若有租車需求的話，不妨參考看看我們這次的心得囉。')

		$('#content').blur()
	});
    $("#btn-insert-correct-com").on("click", function() {
		$('#content').focus()
		$("input[name='rating'][value='4']").attr("checked", true);
		$('#content').val('若你有行駛高速公路，還車時專員會跟你當場結清ETC的費用。另外，租賃期間，若因交通違規而產生罰鍰，是由租借方負責繳清。'+
						  '別以為你在路上超速或是違規，就可以拍拍屁股不負責任唷!'+ '經過這次的租賃經驗，幾點心得跟大家分享：' + 
						  '若你沒有車子，或是車子的空間不足，租車是個好選擇。' + 
						  '整體來說我覺得格上租車的服務確實相當好，若有租車需求的話，不妨參考看看我們這次的心得囉。')

		$('#content').blur()
	});
	
	$("#btn-insert-wrong").on("click", function() {
		console.log('ok');
		$('#content').focus()
		$('#itemTb').val('carRental')
		$('#itemId').val(1)
		$('#userId').val(12)
		$("input[name='rating'][value='2']").attr("checked", true);
		$('#content').val('若你有行駛高速公路，還車時專員會跟你當場結清ETC的費用。另外，租賃期間，若因交通違規而產生罰鍰，是由租借方負責繳清。'+
						  '別以為你在路上超速或是違規，就可以拍拍屁股不負責任唷!'+ '經過這次的租賃經驗，幾點心得跟大家分享：' + 
						  '1)若你沒有車子，或是車子的空間不足，租車是個好選擇。' + '2)車種選擇非常多，可以嘗試許多廠牌的車子，讓駕馭變有趣。'+
						  '3)駕駛租賃車時保持平常心，把它當成自己的車子愛護，心情就會輕鬆愉快。' +
						  '整體來說我覺得格上租車的服務確實相當好，若有租車需求的話，不妨參考看看我們這次的心得囉。')

		$('#content').blur()
	});
	$("#btn-insert-wrong-com").on("click", function() {
		$('#content').focus()
		$("input[name='rating'][value='2']").attr("checked", true);
		$('#content').val('若你有行駛高速公路，還車時專員會跟你當場結清ETC的費用。另外，租賃期間，若因交通違規而產生罰鍰，是由租借方負責繳清。'+
						  '別以為你在路上超速或是違規，就可以拍拍屁股不負責任唷!'+ '經過這次的租賃經驗，幾點心得跟大家分享：' + 
						  '1)若你沒有車子，或是車子的空間不足，租車是個好選擇。' + '2)車種選擇非常多，可以嘗試許多廠牌的車子，讓駕馭變有趣。'+
						  '3)駕駛租賃車時保持平常心，把它當成自己的車子愛護，心情就會輕鬆愉快。' +
						  '整體來說我覺得格上租車的服務確實相當好，若有租車需求的話，不妨參考看看我們這次的心得囉。')

		$('#content').blur()
	});
    

})

