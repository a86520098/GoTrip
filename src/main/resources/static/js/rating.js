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
				$('.rating-count').text('尚無評論')
			},
		});


	})

	// 商品詳細說明頁面 給table和id 回傳該商品的List<Comment>
	$(function() {
		getComments();
	})
	
	
	function getComments() {
		let itemTb = $(".comments-itemId").attr('value');
		let itemId = $(".comments-itemId").attr('id');

		if (itemTb && itemId) {
			$.ajax({
				url: "/gotrip/api/comments/item",
				method: "GET",
				data: {
					table: itemTb,
					id: itemId
				},
				dataType: "json",
				success: function(data) {
					let comments = $(".comments-itemId");
					let userStr, star, score, content, images;
					let starNum = 5;
					let n = data.length;
					for (let i = 0; i < n; i++) {
						// 使用者id(實際上給的是String)
	
						userStr = '<p class="mt-2">' + data[i].userId + '</p>';
						// 用評分給星星
						star = "<div>";
						score = data[i].rating;
						for (let x = 0; x < score; x++) {
							star += '<i class="fa fa-star cl1" aria-hidden="true"></i>'
						}
						for (let x = 0; x < starNum - score; x++) {
							star += '<i class="fa fa-star cl12" aria-hidden="true"></i>'
						}
						star += data[i].date.substring(0, 10) + '</div>';
						
						comments.append(userStr).append(star)
						if (data[i].content != "") {
							content = '<div class="bg6 card bornone mb-2"><div class="card-body"><p >' + data[i].content + '</p>';
		
							for (let j = 0; j < data[i].images.length; j++) {
								content += '<img class="block2-pic mr-3 mt-4" src="/gotrip' + data[i].images[j].imagePath + '"style="object-fit: cover; width:100px; height:100px;"/>'
							}
							content += '</div></div>'
							comments.append(content);
						}
					}
	
				},
				error: function(err) {
					 $('.rating-count').text('尚無評論')
				},
			});
		}
	}

})


