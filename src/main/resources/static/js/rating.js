jQuery(document).ready(function($) {

	$(function () {
		$.ajax({
			url: "/gotrip/api/comments/ratings",
			method: "GET",
			dataType: "json",
			success: function(data) {
				// 設定總分5分
				let starNum = 5;
				let n = data.length
				// 選擇器對應html中評分項目標籤
				$(".rating-count").map(function() {
					let score;

					// 抓id
					let itemId = $(this).attr('id');
					let itemTb = $(this).attr('value');
					console.log(itemTb)
					console.log(itemId)
					let star = "";
					for (let i = 0; i < n; i++) {
						if (data[i].itemTb == itemTb && data[i].itemId == itemId) {
							score = Math.floor(data[i].avgRating)
							for (let x = 0; x < score; x++) {
								star += '<i class="fa fa-star cl1" aria-hidden="true"></i>'
							}
							for (let x = 0; x < 5 - score; x++) {
								star += '<i class="fa fa-star cl12" aria-hidden="true"></i>'
							}
							$(this).html(star + ' ' + data[i].avgRating + ' (' + data[i].count + '則評論)')
							break
						}
					}
				})

			},
			error: function(err) {
				console.log(err);
				$('.rating-count').text('尚無評論')
			},
		});


	})

})


