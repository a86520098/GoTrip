jQuery(document).ready(function($) {

	// 商品列表 回傳所有商品星星和評論總數 
	$(function() {
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
					// 抓table(ticket, hotel or carRental)和id
					let itemId = $(this).attr('id');
					let itemTb = $(this).attr('value');
					let star = "";
					for (let i = 0; i < n; i++) {
						// 找到對應的table和id
						if (data[i].itemTb == itemTb && data[i].itemId == itemId) {
							// 給星星
							score = Math.floor(data[i].avgRating)
							for (let x = 0; x < score; x++) {
								star += '<i class="fa fa-star cl1" aria-hidden="true"></i>'
							}
							for (let x = 0; x < starNum - score; x++) {
								star += '<i class="fa fa-star cl12" aria-hidden="true"></i>'
							}
							// 給評論總數
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

	// 商品詳細說明頁面 給table和id 回傳該商品的List<Comment>
	$(function() {
		let itemTb = $(".comments-itemId").attr('value');
		let itemId = $(".comments-itemId").attr('id');

		$.ajax({
			url: "/gotrip/api/comments/item",
			method: "GET",
			data: {
				table: itemTb,
				id: itemId
			},
			dataType: "json",
			success: function(data) {
				console.log(data);
				let comments = $(".comments-itemId");
				let userStr, star, score, content, images;
				let starNum = 5;
				let n = data.length;
				for (let i = 0; i < n; i++) {
					// 使用者id(實際上給的是String)
					userStr = '<p>' + data[i].userId + '</p>';
					// 用評分給星星
					star = "<div>";
					score = data[i].rating;
					for (let x = 0; x < score; x++) {
						star += '<i class="fa fa-star cl1" aria-hidden="true"></i>'
					}
					for (let x = 0; x < starNum - score; x++) {
						star += '<i class="fa fa-star cl12" aria-hidden="true"></i>'
					}
					star += '</div>';
					content = '<p>' + data[i].content + '</p>';
					images = '<div class="row">'
					for (let j = 0; j < data[i].images.length; j++) {
						images += '<img class="rounded mb-3 col-4" src="' + data[i].images[j].imagePath + '" />'
					}

					comments.append(userStr).append(star).append(content).append(images);
				}

			},
			error: function(err) {
				console.log(err);
				//				$('.rating-count').text('尚無評論')
			},
		});


	})

})


