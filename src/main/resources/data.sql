USE [GoTrip];

SET IDENTITY_INSERT [dbo].[comment] ON;

INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (1, N'hotel', 1, N'david_lin', CAST(N'2022-04-25T01:00:00' AS SmallDateTime), 5, N'環境舒適，交通方便，真的超級推薦!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (2, N'restaurant', 1, N'kelly', CAST(N'2022-04-26T02:00:00' AS SmallDateTime), 4, N'食物很好吃，但服務態度不值得這個價位，店家員工訓練有待加強!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (3, N'carRental', 2, N'nobody', CAST(N'2022-04-27T03:00:00' AS SmallDateTime), 1, N'車上竟然有其他顧客的垃圾...難以置信...', N'banned')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (4, N'ticket', 1, N'montLover', CAST(N'2022-04-28T04:00:00' AS SmallDateTime), 5, N'超棒的露營區!! 竟然還有獨立衛浴!!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (5, N'hotel', 8, N'wendy123', CAST(N'2022-04-29T05:00:00' AS SmallDateTime), 5,N'價格偏高，但整個度假體驗非常好，疫情期間不能出國還是能一秒住villa', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (6, N'restaurant', 2, N'michael', CAST(N'2022-04-30T06:00:00' AS SmallDateTime), 3, N'可怕的網美店，拍起來很美但食物調味超怪，標準的一次店', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (7, N'carRental', 3, N'queenB', CAST(N'2022-05-01T07:00:00' AS SmallDateTime), 5, N'竟然可以租到全新車，服務也很好，很推薦~',
        N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (8, N'restaurant', 3, N'ann0800', CAST(N'2022-05-02T08:00:00' AS SmallDateTime), 3, N'約會好去處，但假日遊客太多，小孩尖叫亂跑，很掃興',
        N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (9, N'hotel', 25, N'jimmy', CAST(N'2022-05-03T09:00:00' AS SmallDateTime), 4, N'中規中矩的商務旅館', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (10, N'carRental', 34, N'gary_ispan', CAST(N'2022-05-04T10:00:00' AS SmallDateTime), 5,
        N'服務很好，最後還車前忘了加滿油，店家也是便宜算^^', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (11, N'ticket', 2, N'kids', CAST(N'2022-05-05T11:00:00' AS SmallDateTime), 5, N'畢旅的回憶~~~', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (12, N'ticket', 3, N'youngCP', CAST(N'2022-05-06T12:00:00' AS SmallDateTime), 5,
        N'拍照很美! 但門票小貴，動物生長在這麼小的水族箱感覺很痛苦，希望園區可以妥善照顧動物', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (13, N'hotel', 4, N'angela', CAST(N'2022-05-07T13:00:00' AS SmallDateTime), 4, N'環境很好 度假風格 設施有點舊但維護的不錯', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (14, N'ticket', 1, N'manager', CAST(N'2022-05-08T14:00:00' AS SmallDateTime), 5,
        N'夜宿海生館真的是這輩子最難忘的回憶之一，他們還主動提供耳塞以免睡覺時被別人干擾，也會個別詢問有沒有需要更多毯子或墊子~ 真的超棒', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (15, N'ticket', 2, N'zoolover', CAST(N'2022-05-09T15:00:00' AS SmallDateTime), 4, N'不敢玩遊樂設施的人，光是去動物園就值回門票了!',
        N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (16, N'ticket', 5, N'manager', CAST(N'2022-05-10T16:00:00' AS SmallDateTime), 3,
        N'價格有點高，但疫情下旅遊景點經營不易，也算是辛苦經營單位了', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (17, N'hotel', 4, N'lovelylady', CAST(N'2022-05-11T17:00:00' AS SmallDateTime), 5, N'超喜歡這裡，窗戶很大，視野非常好', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (18, N'hotel', 2, N'emp0315', CAST(N'2022-05-12T18:00:00' AS SmallDateTime), 4, N'還不錯，出公差而來，沒享受到飯店設施，稍嫌可惜',
        N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (19, N'hotel', 5, N'employee2', CAST(N'2022-05-13T19:00:00' AS SmallDateTime), 5, N'超值的體驗', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (20, N'restaurant', 2, N'manager', CAST(N'2022-05-14T20:00:00' AS SmallDateTime), 2, N'心灰意冷，bug好多', N'banned')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (21, N'hotel', 8, N'wendy_chen', CAST(N'2022-05-15T21:00:00' AS SmallDateTime), 5,
        N'極力推薦大家可以到中庭餐廳享用中西式的自助餐，或者在預訂房間時就加訂早餐，那麼就能夠在義大早起床就前往氣派的中庭用餐喔！', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (22, N'ticket', 5, N'montbell', CAST(N'2022-05-16T22:00:00' AS SmallDateTime), 4,
        N'太平山蘊藏珍貴林木，昔日與阿里山、八仙山並列台灣三大林場 乘坐蹦蹦車，沉浸在森林芬多精的世界，美不勝收。', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (23, N'ticket', 4, N'artlover', CAST(N'2022-05-17T23:00:00' AS SmallDateTime), 4,
        N'桃園青埔又將迎來全新景點！肩負推廣悠久歷史的橫山書法藝術館，建築外觀結合硯台、墨池意象!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (24, N'ticket', 1, N'ryan0412', CAST(N'2022-04-28T04:00:00' AS SmallDateTime), 4, N'超棒的露營區!! 竟然還有獨立衛浴!!',
        N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (25, N'hotel', 4, N'angela', CAST(N'2022-05-07T13:00:00' AS SmallDateTime), 3, N'環境很好 度假風格 設施有點舊但維護的不錯', N'show')
SET IDENTITY_INSERT [dbo].[comment] OFF;

SET
    IDENTITY_INSERT [dbo].[comment_image] ON;

INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (1, N'/data/uploadimages/comment/hotel.jpg', 1)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (2, N'/data/uploadimages/comment/hotel-room.jpg', 1)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (3, N'/data/uploadimages/comment/hotel-room2.jpg', 1)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (4, N'/data/uploadimages/comment/healthy-food.jpg', 2)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (5, N'/data/uploadimages/comment/healthy-food-2.jpg', 2)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (6, N'/data/uploadimages/comment/ford.jpg', 3)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (7, N'/data/uploadimages/comment/jepp.jpg', 3)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (8, N'/data/uploadimages/comment/fall.jpg', 4)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (9, N'/data/uploadimages/comment/villa2.jpg', 5)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (10, N'/data/uploadimages/comment/villa-3.jpg', 5)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (11, N'/data/uploadimages/comment/villa.jpg', 5)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (12, N'/data/uploadimages/comment/healthy-food-2.jpg', 6)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (13, N'/data/uploadimages/comment/restaurant.jpg', 8)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (14, N'/data/uploadimages/comment/pizza.jpg', 8)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (15, N'/data/uploadimages/comment/hotel-room-5.jpg', 9)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (16, N'/data/uploadimages/comment/theme_park_1.jpg', 11)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (17, N'/data/uploadimages/comment/theme_park_2.jpg', 11)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (18, N'/data/uploadimages/comment/Xpark_1.jpg', 12)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (19, N'/data/uploadimages/comment/Xpark_2.jpg', 12)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (20, N'/data/uploadimages/comment/Xpark_3.jpg', 12)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (21, N'/data/uploadimages/comment/aquarium.jpg', 14)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (22, N'/data/uploadimages/comment/aquarium.webp', 14)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (23, N'/data/uploadimages/comment/theme_park_1.jpg', 15)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (24, N'/data/uploadimages/comment/hotel-room4.jpg', 19)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (25, N'/data/uploadimages/comment/hotel.jpg', 19)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (26, N'/data/uploadimages/comment/restaurant.jpg', 21)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (27, N'/data/uploadimages/comment/hotel-room4.jpg', 21)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (28, N'/data/uploadimages/comment/art.jpg', 23)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (29, N'/data/uploadimages/comment/fall.jpg', 24)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])VALUES (30, N'/data/uploadimages/comment/friends-min.jpg', 24)
SET IDENTITY_INSERT [dbo].[comment_image] OFF;

SET
    IDENTITY_INSERT [dbo].[car_model] ON;

INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (1, N'經濟轎車', N'豐田', N'Toyota', N'Yaris', N'燃油車', N'AT', 1500, 5, 4, 1, 2, N'/data/uploadimages/car/toyota-yaris.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (2, N'經濟轎車', N'豐田', N'Toyota', N'Vios', N'燃油車', N'AT', 1500, 5, 4, 1, 2, N'/data/uploadimages/car/toyota-vios.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (3, N'經濟轎車', N'豐田', N'Toyota', N'Altis', N'燃油車', N'AT', 1800, 5, 4, 2, 2, N'/data/uploadimages/car/toyota-altis.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (4, N'經濟轎車', N'豐田', N'Toyota', N'Prius C', N'燃油車', N'AT', 2000, 5, 4, 2, 2, N'/data/uploadimages/car/toyota-camry.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (5, N'豪華轎車', N'豐田', N'Toyota', N'Camry', N'燃油車', N'AT', 2000, 5, 4, 1, 2, N'/data/uploadimages/car/toyota-prius-c.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (6, N'豪華轎車', N'豐田', N'Toyota', N'Auris', N'燃油車', N'AT', 2000, 5, 4, 2, 2, N'/data/uploadimages/car/toyota-auris.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (7, N'休旅車/SUV', N'豐田', N'Toyota', N'bZ4X', N'電動車', N'AT', 0, 5, 4, 2, 1, N'/data/uploadimages/car/toyota-bz4x.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (8, N'休旅車/SUV', N'豐田', N'Toyota', N'Corolla Cross', N'燃油車', N'AT', 1800, 5, 5, 3, 2, N'/data/uploadimages/car/toyota-corolla-cross.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image])
VALUES (9, N'休旅車/SUV', N'豐田', N'Toyota', N'Sienta', N'燃油車', N'AT', 1500, 5, 5, 2, 2, N'/data/uploadimages/car/toyota-sienta.png')
SET IDENTITY_INSERT [dbo].[car_model] OFF;

SET IDENTITY_INSERT [dbo].[car_location] ON 

INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (1, N'建國北路一段71-1號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'中山區', N'/data/uploadimages/car/1-201.jpg', N'25.051116', N'121.537212', N'台北建北站', N'08:30:00.0000000', N'02-25021389', N'隱藏')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (2, N'忠孝東路五段705號1樓', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'信義區', N'/data/uploadimages/car/1-202.jpg', N'25.042552', N'121.580242', N'台北忠孝站', N'08:30:00.0000000', N'02-8785662', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (3, N'羅斯福路五段221號1樓', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'文山區', N'/data/uploadimages/car/1-203.jpg', N'25.001994', N'121.539215', N'台北景美站', N'08:30:00.0000000', N'02-89310266', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (4, N'德行西路81號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'士林區', N'/data/uploadimages/car/1-204.jpg', N'25.10463', N'121.521746', N'台北士林站', N'08:30:00.0000000', N'02-2835110', N'隱藏')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (5, N'內湖路1段236號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'內湖區', N'/data/uploadimages/car/1-205.jpg', N'25.085367', N'121.559064', N'台北內湖站', N'08:30:00.0000000', N'02-25021389', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (6, N'經貿一路59號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'南港區', N'/data/uploadimages/car/1-206.jpg', N'25.056254', N'121.620053', N'台北南港站', N'08:30:00.0000000', N'02-26511333', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (7, N'忠孝西路一段47號B1樓', N'21:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'中正區', N'/data/uploadimages/car/1-210.jpg', N'25.046533', N'121.517414', N'台北車站', N'08:30:00.0000000', N'02-25159393', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (8, N'敦化北路340之9號', N'19:00:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'松山區', N'/data/uploadimages/car/1-219.jpg', N'25.063869', N'121.549778', N'台北松山機場站', N'08:30:00.0000000', N'02-27151133', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (9, N'中興路三段11號B1', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'新店區', N'/data/uploadimages/car/1-208.jpg', N'24.978089', N'121.545138', N'台北新店站', N'08:30:00.0000000', N'02-29153311', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (10, N'三民路88號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'蘆洲區', N'/data/uploadimages/car/1-216.jpg', N'25.085351', N'121.473882', N'台北蘆洲站', N'08:30:00.0000000', N'02-22852299', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (11, N'中央路三段158號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'土城區', N'/data/uploadimages/car/1-217.jpg', N'24.965811', N'121.432132', N'台北土城站', N'08:30:00.0000000', N'02-22693131', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (12, N'連城路126號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'中和區', N'/data/uploadimages/car/1-218.jpg', N'24.999459', N'121.495982', N'台北中和站', N'08:30:00.0000000', N'02-22423232', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (13, N'中正路1號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'淡水區', N'/data/uploadimages/car/1-222.jpg', N'25.174829', N'121.432696', N'台北淡水站', N'08:30:00.0000000', N'02-26299393', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (14, N'縣民大道二段7號1樓', N'22:00:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'板橋區', N'/data/uploadimages/car/1-224.jpg', N'25.014534', N'121.463512', N'台北板橋車站', N'08:30:00.0000000', N'02-29658080', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (15, N'光榮路334號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'宜蘭縣', N'羅東鎮', N'/data/uploadimages/car/1-231.jpg', N'24.678532', N'121.77797', N'宜蘭羅東站', N'08:30:00.0000000', N'03-9602116', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (16, N'復興路325號', N'20:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'桃園區', N'/data/uploadimages/car/1-301.jpg', N'24.989491', N'121.304653', N'桃園復興站', N'08:30:00.0000000', N'03-3319555', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (17, N'青埔里高鐵北路一段6號', N'22:00:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'中壢區', N'/data/uploadimages/car/1-302.jpg', N'25.014084', N'121.215952', N'桃園高鐵站', N'07:00:00.0000000', N'03-2611881', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (18, N'中華路二段128號', N'20:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'中壢區', N'/data/uploadimages/car/1-303.jpg', N'24.965952', N'121.240602', N'桃園中壢站', N'08:30:00.0000000', N'03-4629911', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (19, N'三民路二段50之2號', N'19:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'大園區', N'/data/uploadimages/car/1-305.jpg', N'25.088127', N'121.253123', N'桃園大園站', N'08:30:00.0000000', N'03-3830123', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (20, N'航站南路15號', N'19:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'大園區', N'/data/uploadimages/car/1-306.jpg', N'25.081168', N'121.237053', N'桃園機場站', N'08:30:00.0000000', N'03-3931133', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (21, N'高鐵三路268號', N'20:00:00.0000000', 2, N'隔尚租車', N'台灣', N'苗栗縣', N'後龍鎮', N'/data/uploadimages/car/1-307.jpg', N'24.605421', N'120.825767', N'苗栗高鐵站', N'08:00:00.0000000', N'03-7248168', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county], [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status]) VALUES (22, N'中華路一段315號', N'20:30:00.0000000', 2, N'隔尚租車', N'台灣', N'新竹市', N'東區', N'/data/uploadimages/car/1-311.jpg', N'24.809551', N'120.983957', N'新竹中華站', N'08:30:00.0000000', N'03-5153528', N'顯示')

SET IDENTITY_INSERT [dbo].[car_location] OFF

SET
    IDENTITY_INSERT [dbo].[car_option] ON;

INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (1, 1, 1, 2000, 0.75, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (2, 1, 2, 2000, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (3, 1, 3, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (4, 1, 4, 2200, 0.699999988079071, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (5, 2, 1, 2000, 0.75, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (6, 2, 2, 2000, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (7, 3, 4, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (8, 4, 5, 2200, 0.699999988079071, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (9, 3, 2, 2000, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (10, 4, 3, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (11, 5, 4, 2200, 0.699999988079071, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (12, 6, 8, 3000, 0.89999997615814209, 1)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (13, 6, 9, 3200, 0.85000002384185791, 2)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (14, 7, 6, 2800, 0.800000011920929, 2)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (15, 7, 7, 2800, 0.85000002384185791, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (16, 8, 5, 2500, 0.89999997615814209, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (17, 9, 7, 3000, 0.800000011920929, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (18, 10, 6, 2800, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (19, 10, 8, 3000, 0.89999997615814209, 3)
SET IDENTITY_INSERT [dbo].[car_option] OFF;

SET IDENTITY_INSERT [dbo].[user_data] ON
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone],
                          [city], [location], [address], [image], [authority])
VALUES (1, N'admin', NULL, NULL, N'$2a$10$juAszWkBW1M0P5l8A6bQw..z3h4bU2AlzpPlerAfnxy2AqhiVwlai', NULL, NULL, NULL,
        NULL, NULL, NULL, NULL, N'admin')
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone],
                          [city], [location], [address], [image], [authority])
VALUES (2, N'dealer', NULL, NULL, N'$2a$10$iVMluTlijqCYBRs3DtGO9./iYxFI/9wB2BP5fQavZeIpatQOeJMfC', NULL, NULL, NULL,
        NULL, NULL, NULL, NULL, N'dealer')
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone],
                          [city], [location], [address], [image], [authority])
VALUES (3, N'elvispan@gmail.com', NULL, NULL, N'$2a$10$rJUmwbkulb//M5phPQVQxuHCQozOcBeCd100fKJuycpxtyikGKl4K', NULL,
        NULL, NULL, NULL, NULL, NULL, NULL, N'user')
SET IDENTITY_INSERT [dbo].[user_data] OFF


SET IDENTITY_INSERT [dbo].[hotel] ON
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'4', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:00:08.6030000', NULL, NULL, NULL, N'嚴長壽', N'臺中市', N'1', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'臺中市東區', N'400', NULL, N'公寓', N'雙星大飯店 (Twinstar Hotel)', NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於台中市東區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的台中彩虹眷村。 這間4星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'300', N'976472309', NULL, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'5', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:01:52.1490000', NULL, NULL, NULL, N'陳佳鑫', N'臺中市', N'2', N'附屬spa',
        N'提供3c高級筆電', N'提供美式餐點', NULL, N'臺中市西區', N'2000', NULL, N'公寓', N'台中金典酒店 (Splendor Hotel)', NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於台中市東區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的台中彩虹眷村。 這間4星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'800', N'916752161', NULL, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'6', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:02.4310000', NULL, NULL, NULL, N'王家豪', N'桃園市', N'3', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市中壢區', N'20000', NULL, N'公寓', N'古華花園飯店 (Kuva Chateau Hotel)', NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於桃園市中壢區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人健身中心、餐廳和室外泳池',
        N'Taiwan', N'1000', N'911223333', NULL, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'7', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'名人堂花園大飯店 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'8', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:08:53.5640000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'5', N'附屬美容室',
        N'提供超跑特別租借', N'提供中式餐點', NULL, N'桃園市復興區華陵村巴崚156-7號, 桃園市復興區華陵村巴崚156-7號', N'20000', NULL, N'公寓', N'拉拉山桃山渡假農場',
        NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於桃園市復興區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間5星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'9', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:08:53.5640000', NULL, NULL, NULL, N'龍王英', N'高雄市', N'6', N'附屬美容室',
        N'提供超跑特別租借', N'提供中式餐點', NULL, N'中山二路199號, 前鎮區, 高雄市', N'20000', NULL, N'公寓', N'高雄菁英國際旅館',
        NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於桃園市復興區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間5星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')

INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'11', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'名人堂花園大飯店 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'12', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'花園淘淘國際酒店 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'13', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'歐嗨喲國際商業旅館 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'14', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'牙拜一旅館 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'15', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'6', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'鴻泰爽 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'16', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'17', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'18', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'19', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'20', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'21', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'22', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'23', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'24', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'25', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'26', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'27', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'28', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'29', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'30', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'31', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'32', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'33', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'34', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', NULL, NULL, NULL, N'營業中')

SET IDENTITY_INSERT [dbo].[hotel] OFF

SET IDENTITY_INSERT [dbo].[hotel_image] ON


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'1', N'2022-07-19 10:00:08.6080000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-161758.jpg', N'4')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'2', N'2022-07-19 10:00:08.6110000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-164595.jpg', N'4')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'3', N'2022-07-19 10:00:08.6110000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-221457.jpg', N'4')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'4', N'2022-07-19 10:01:52.1530000', NULL, N'/data/uploadimages/hotelImage/pexels-francesco-ungaro-96444.jpg',
        N'5')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'5', N'2022-07-19 10:01:52.1550000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271618.jpg', N'5')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'6', N'2022-07-19 10:01:52.1560000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271624.jpg', N'5')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'7', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg', N'6')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'8', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg', N'6')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'9', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'6')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'10', N'2022-07-19 10:04:55.0060000', NULL,
        N'/data/uploadimages/hotelImage/pexels-konstantinos-eleftheriadis-2034335.jpg', N'7')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'11', N'2022-07-19 10:04:55.0080000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271618.jpg', N'7')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'12', N'2022-07-19 10:04:55.0090000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271624.jpg', N'7')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'13', N'2022-07-19 10:08:53.5670000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-261169.jpg', N'8')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'14', N'2022-07-19 10:08:53.5680000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271618.jpg', N'8')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'15', N'2022-07-19 10:08:53.5690000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271624.jpg', N'8')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'16', N'2022-07-19 10:08:53.5690000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271624.jpg', N'9')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'17', N'2022-07-19 10:04:55.0060000', NULL,
        N'/data/uploadimages/hotelImage/pexels-konstantinos-eleftheriadis-2034335.jpg', N'9')
INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'18', N'2022-07-19 10:04:55.0060000', NULL,
        N'/data/uploadimages/hotelImage/pexels-konstantinos-eleftheriadis-2034335.jpg', N'9')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'20', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'11')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'21', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'11')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'22', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'11')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'23', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'12')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'24', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'12')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'25', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'12')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'26', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'13')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'27', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'13')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'29', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'13')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'30', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'14')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'31', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'14')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'32', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'14')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'33', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'15')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'34', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'15')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'35', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'15')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'36', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'16')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'37', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'16')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'38', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'16')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'39', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'17')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'40', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'17')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'41', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'17')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'42', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'18')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'43', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'18')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'44', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'18')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'45', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'19')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'46', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'19')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'47', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'19')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'48', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'20')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'49', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'20')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'50', N'2022-07-19 10:04:02.4370000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-279746.jpg', N'20')


SET IDENTITY_INSERT [dbo].[hotel_image] OFF

SET IDENTITY_INSERT [dbo].[hotel_room] ON


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'1', N'2', N'2', N'2', N'拉拉山桃山渡假農場提供每日免費早餐。', N'附近有虎頭山公園', N'提供B&W 整套音響', N'40', N'2', N'浴巾,免鑰匙進出,免費停車', N'入住拉拉山桃山渡假農場，盡情享受桃園市冒險之旅。
拉拉山桃山渡假農場提供完善的設施服務，讓您享受無憂無慮的度假時光。 飯店提供免費Wi-Fi，無論您想發照片、回郵件，都能輕鬆完成。 自駕前往的住客可免費停車。 想一整天都宅在客房裡嗎？每日客房清潔等客房服務讓您躺著就能享受愉快假期。
拉拉山桃山渡假農場客房都有貼心設施。 浴室設施對住客來說非常重要，因此這間飯店的部分客房提供吹風機和盥洗用品。
', N's', N'愛情海房間', N'4000', N'雙人房', N'4')


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'2', N'2', N'2', N'2', N'鴻海農場提供每日免費早餐。', N'附近有非洲大草原公園', N'提供B&W 整套音響', N'40', N'2',
        N'浴巾,免鑰匙進出,免費停車,廚房用具(廚具`油`調味料),專用入口', N'入住郭董套房，盡情享受鴻海冒險之旅。
鴻海農場提供完善的設施服務，讓您享受無憂無慮的度假時光。 飯店提供免費Wi-Fi，無論您想發照片、回郵件，都能輕鬆完成。 自駕前往的住客可免費停車。 想一整天都宅在客房裡嗎？每日客房清潔等客房服務讓您躺著就能享受愉快假期。
拉拉山桃山渡假農場客房都有貼心設施。 浴室設施對住客來說非常重要，因此這間飯店的部分客房提供吹風機和盥洗用品。
', N'兒童與加床收費標準
歡迎兒童入住。

其他規定
請注意：若單筆預訂超過5間客房，可能會需要遵守其他相關規定以及符合額外的要求。
加床規定依房型而異，更多細節請向住宿洽詢。', N'郭董愛情房間', N'5000', N'雙人房', N'4')


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'3', N'2', N'2', N'2', N'◎房間陽台面對清境最美的山景。', N'◎房間均以台灣檜木或肖楠構築而成，充滿木頭的香氣。', N'◎精心設計的室內空間，自然通風的溫暖舒適遠勝人工空調。', N'40',
        N'2', N'浴巾,免鑰匙進出,免費停車,廚房用具(廚具`油`調味料),專用入口', N'1.台灣檜木/肖楠打造的室內空間，讓房間充滿天然木頭芬芳。
2.樓中樓房型挑高閣樓設計，讓您全家出遊仍有寬敞舒適的活動空間。
3.景觀陽台讓您坐擁日出、雲海、廬山溫泉夜景。
4.獨立筒彈簧床墊與高級羽毛被，提供您ㄧ年四季溫暖好眠。
5.房間內提供免費寬頻上網(有線)，公共空間提供免費無線上網。', N'兒童與加床收費標準
歡迎兒童入住。

其他規定
請注意：若單筆預訂超過5間客房，可能會需要遵守其他相關規定以及符合額外的要求。
加床規定依房型而異，更多細節請向住宿洽詢。', N'愛情泡泡房間', N'5000', N'四人房', N'4')


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'4', N'1', N'1', N'1', N'◎房間陽台面對清境最美的山景。', N'◎房間均以台灣檜木或肖楠構築而成，充滿木頭的香氣。', N'◎精心設計的室內空間，自然通風的溫暖舒適遠勝人工空調。', N'10',
        N'2', N'浴巾,免鑰匙進出,免費停車,廚房用具(廚具`油`調味料),專用入口', N'可以養寵物', N'兒童與加床收費標準
歡迎兒童入住。

其他規定
請注意：若單筆預訂超過5間客房，可能會需要遵守其他相關規定以及符合額外的要求。
加床規定依房型而異，更多細節請向住宿洽詢。', N'寵物房', N'1200', N'雙人房', N'4')


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'5', N'2', N'3', N'2', N'◎房間陽台面對清境最美的山景。', N'附近有非洲大草原公園', N'提供B&W 整套音響', N'2', N'4', N'濱海,免費停車,免費wifi,暖風,電視', N'採用肖楠壁板的房間，散發著淡淡的木頭香氣。高級的材質加上與眾不同的設計讓房間內部呈現不同於一般飯店旅館的感受。
下雨過後，坐在私人的陽台欣賞瞬息萬變的山嵐；靜謐的夜晚，在躺椅上仰望滿天星斗；四季風情讓人輕易地忘卻時光的流逝。', N'加床規定依房型而異，更多細節請向住宿洽詢。', N' 巴里風情二人房', N'4000', N'單人房', N'5')


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'6', N'4', N'4', N'4', N'1. 私人景觀陽台，可觀賞奇萊山日出、雲海、山嵐與廬山夜景。', N'2. 肖楠原木壁板採透氣漆處理，散發天然原木香氣。', N'提供B&W 整套音響', N'100',
        N'4', N'浴巾,空調,陽台或露台,書桌', N'高雅靜謐的精緻客房，私人陽台提供頂樓的絕佳視野。早上拉開窗簾就可以看日出；在陽台上不論是做瑜珈、打太極或是裹在棉被裡捧著一杯溫暖香醇的咖啡，都是享受！
肖楠原木經過費力耗時的裁切，將堅硬的原木裁切成長短厚薄不一的條狀木片，然後再一片片、一條條拼貼成參差而具有立體感的牆面，是考驗工匠技藝的精心傑作。
浴室天花板採用台灣檜木，再加上進口石英岩所打造的淋浴空間，天然的防滑特性與潔淨的色澤，讓您不用擔心家裡小朋友與老人家的浴室安全。絕佳的通風與排水，讓您一早起來就能享受乾爽的衛浴空間。', N'1.不得抽菸
2.必須化妝
3.必須有車
4.不得偷竊任何物品
5.必須有品味
進房時間：16:00~20:00，逾時未辦理入住程序亦未事先電話通知者視同取消訂房
　　　　　，訂金將不予退還。
超時入住：超過20:00入住亦未事先電話連絡者，將酌收超時入住費用(500元/房)，
　　　　　敬請按規定時間辦理入住程序或事先電話連絡。
退房時間：中午12:00，超時退房將酌收超時費用(500元/小時)。', N'日出四人房', N'7500', N'四人房', N'7')


INSERT INTO [dbo].[hotel_room] ([id], [bath_count], [bed_count], [bedroom_count], [feature1], [feature2], [feature3],
                                [hotel_area], [people_count], [provide], [room_introduce], [room_rule], [roomname],
                                [roomprice], [roomtype], [hotel_id])
VALUES (N'7', N'4', N'4', N'4', N'Accessible by elevator', N'Safety/security feature', N'房內保險箱', N'100', N'4',
        N'浴巾,空調,陽台或露台,書桌', N'高雅靜謐的精緻客房，私人陽台提供頂樓的絕佳視野。早上拉開窗簾就可以看日出；在陽台上不論是做瑜珈、打太極或是裹在棉被裡捧著一杯溫暖香醇的咖啡，都是享受！
肖楠原木經過費力耗時的裁切，將堅硬的原木裁切成長短厚薄不一的條狀木片，然後再一片片、一條條拼貼成參差而具有立體感的牆面，是考驗工匠技藝的精心傑作。
浴室天花板採用台灣檜木，再加上進口石英岩所打造的淋浴空間，天然的防滑特性與潔淨的色澤，讓您不用擔心家裡小朋友與老人家的浴室安全。絕佳的通風與排水，讓您一早起來就能享受乾爽的衛浴空間。', N'1.不得抽菸
2.必須化妝
3.必須有車
4.不得偷竊任何物品
5.必須有品味
進房時間：16:00~20:00，逾時未辦理入住程序亦未事先電話通知者視同取消訂房
　　　　　，訂金將不予退還。
超時入住：超過20:00入住亦未事先電話連絡者，將酌收超時入住費用(500元/房)，
　　　　　敬請按規定時間辦理入住程序或事先電話連絡。
退房時間：中午12:00，超時退房將酌收超時費用(500元/小時)。', N'御質行驛(港景大床套房) (Silks Club Junior Suite King with Harbour View)', N'7500', N'雙人房',
        N'7')


SET IDENTITY_INSERT [dbo].[hotel_room] OFF


-- MySQL區域


-- DROP TABLE IF EXISTS `hotel_room`;
-- DROP TABLE IF EXISTS `hotel_image`;
-- DROP TABLE IF EXISTS `hotel`;
-- CREATE TABLE ` hotel `
-- (
--     `
--     id `             int NOT NULL AUTO_INCREMENT, `
--     howgoto `        varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     admission_time ` datetime DEFAULT NULL, `
--     bath_count `     int      DEFAULT NULL, `
--     bed_count `      int      DEFAULT NULL, `
--     bedroom_count `  int      DEFAULT NULL, `
--     boss_name `      varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     city `           varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     company_id `     int      DEFAULT NULL, `
--     feature1 `       varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     feature2 `       varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     feature3 `       varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     file_name `      varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     full_address `   varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     hotel_area `     int      DEFAULT NULL, `
--     hotel_rule `     varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     hotel_style `    varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     hotel_name `     varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     image `          longblob, `
--     introduce `      varchar(1000) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     notional `       varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     people_count `   int      DEFAULT NULL, `
--     phone `          int      DEFAULT NULL, `
--     price `          int      DEFAULT NULL, `
--     provide `        varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     roomtype `       varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL, `
--     status `         varchar(255) CHARACTER
--     SET
--     utf8mb3
--     COLLATE
--     utf8_general_ci
--     DEFAULT
--     NULL,
--     PRIMARY KEY (` id `)
-- ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
-- -- ----------------------------
-- -- Records of hotel
-- -- ----------------------------
-- BEGIN
--     ;
--     INSERT INTO ` hotel ` (` id `, ` howgoto `, ` admission_time `, ` bath_count `, ` bed_count `, ` bedroom_count `, `
--                              boss_name `, ` city `,
--         ` company_id `, ` feature1 `, ` feature2 `, ` feature3 `, ` file_name `, ` full_address `, ` hotel_area `,
--         ` hotel_rule `, ` hotel_style `, ` hotel_name `, ` image `, ` introduce `, ` notional `, ` people_count `,
--         ` phone `, ` price `, ` provide `, ` roomtype `, ` status `)
--     VALUES (3, '國一南下，交流道下來\r\n導航即可到達', '2022-07-18 22:13:46', NULL, NULL, NULL, '嚴長壽', '宜蘭縣', 1, '附屬健身房', '提供機場接送服務',
--             '提供BBQ餐點', NULL, '宜蘭縣宜蘭市凱旋路135號', 790, NULL, '公寓', '煙波大飯店宜蘭館 (Lakeshore Hotel Yilan)', NULL,
--             '住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於宜蘭縣宜蘭市的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的宜蘭車站幾米公園。 這間4星級飯店提供餐廳，給您舒適難忘的住宿體驗。',
--             'Taiwan', 300, 916755122, NULL, NULL, NULL, '營業中');
--     INSERT INTO ` hotel ` (` id `, ` howgoto `, ` admission_time `, ` bath_count `, ` bed_count `, ` bedroom_count `, `
--                              boss_name `, ` city `,
--         ` company_id `, ` feature1 `, ` feature2 `, ` feature3 `, ` file_name `, ` full_address `, ` hotel_area `,
--         ` hotel_rule `, ` hotel_style `, ` hotel_name `, ` image `, ` introduce `, ` notional `, ` people_count `,
--         ` phone `, ` price `, ` provide `, ` roomtype `, ` status `)
--     VALUES (4, '開車南下或是火車都可以', NULL, NULL, NULL, NULL, '戴愛玲', '', 2, '附屬健身房', '提供機場接送服務', '提供BBQ餐點', NULL, '', 470, NULL,
--             '公寓', '東旅湯宿溫泉飯店-風華漾 (Yunoyado Onsen Hotspring Hotel Deyang)', NULL,
--             '住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於宜蘭縣礁溪鄉的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的宜蘭車站幾米公園。 這間高品質飯店被評為4星級，提供客人熱水浴缸、溫泉浴池和餐廳。',
--             'Taiwan', 30, 912333222, NULL, NULL, NULL, '營業中');
--     INSERT INTO ` hotel ` (` id `, ` howgoto `, ` admission_time `, ` bath_count `, ` bed_count `, ` bedroom_count `, `
--                              boss_name `, ` city `,
--         ` company_id `, ` feature1 `, ` feature2 `, ` feature3 `, ` file_name `, ` full_address `, ` hotel_area `,
--         ` hotel_rule `, ` hotel_style `, ` hotel_name `, ` image `, ` introduce `, ` notional `, ` people_count `,
--         ` phone `, ` price `, ` provide `, ` roomtype `, ` status `)
--     VALUES (5, 'MRT  & Google', '2022-07-18 22:22:30', NULL, NULL, NULL, 'KennyShow', '新北市', 3, '附屬健身房', '提供機場接送服務',
--             '提供BBQ餐點', NULL, '新北市深坑區', 400, NULL, '公寓', '中天溫泉渡假飯店 (Hotel Valletta)', NULL,
--             '住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於宜蘭縣礁溪鄉的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的宜蘭車站幾米公園。 這間高品質飯店被評為4星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
--             'Taiwan', 20, 916721123, NULL, NULL, NULL, '營業中');
--     COMMIT;
--
--     SET
--         FOREIGN_KEY_CHECKS = 1;
--
--     CREATE TABLE ` hotel_room `
--     (
--         `
--         id `             int NOT NULL AUTO_INCREMENT, `
--         bath_count `     int DEFAULT NULL, `
--         bed_count `      int DEFAULT NULL, `
--         bedroom_count `  int DEFAULT NULL, `
--         feature1 `       varchar(255) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         feature2 `       varchar(255) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         feature3 `       varchar(255) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         hotel_area `     int DEFAULT NULL, `
--         people_count `   int DEFAULT NULL, `
--         provide `        varchar(255) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         room_introduce ` varchar(2000) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         room_rule `      varchar(2000) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         roomname `       varchar(255) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         roomprice `      int DEFAULT NULL, `
--         roomtype `       varchar(255) CHARACTER
--         SET
--         utf8mb3
--         COLLATE
--         utf8_general_ci
--         DEFAULT
--         NULL, `
--         hotel_id `       int DEFAULT NULL,
--         PRIMARY KEY (` id `),
--         KEY `            FKkidx9n5p4parnjnpg912svvgi `(` hotel_id `
--     ) ,
--     CONSTRAINT `FKkidx9n5p4parnjnpg912svvgi` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
--     -- ----------------------------
-- -- Records of hotel_room
-- -- ----------------------------
--     BEGIN
--         ;
--         INSERT INTO ` hotel_room ` (` id `, ` bath_count `, ` bed_count `, ` bedroom_count `, ` feature1 `, `
--                                       feature2 `, ` feature3 `,
--             ` hotel_area `, ` people_count `, ` provide `, ` room_introduce `, ` room_rule `, ` roomname `,
--             ` roomprice `, ` roomtype `, ` hotel_id `)
--         VALUES (2, 2, 4, 1, '提供優質的健身房', '24小時皆可入住', '提供BOSE 音響 ＆音樂家咖啡系列', 47, 2, '浴巾,空調,陽台或露台,書桌,免鑰匙進出', '24小時可入住',
--                 '兒童與加床收費標準\r\n\r\n加床規定依房型而異，請查看各房型的人數限制瞭解詳細規定。\r\n\r\n歡迎兒童入住。', '高級家庭房', 4000, '雙人房', 5);
--         INSERT INTO ` hotel_room ` (` id `, ` bath_count `, ` bed_count `, ` bedroom_count `, ` feature1 `, `
--                                       feature2 `, ` feature3 `,
--             ` hotel_area `, ` people_count `, ` provide `, ` room_introduce `, ` room_rule `, ` roomname `,
--             ` roomprice `, ` roomtype `, ` hotel_id `)
--         VALUES (3, 1, 2, 1, '提供優質健身房', '24小時皆可入住', '提供BOS音響  & 音樂系列咖啡', 22, 2, '廚房用具(廚具`油`調味料),電視',
--                 '充滿各式各樣的音響 提供給喜愛音樂的您',
--                 '兒童與加床收費標準\r\n\r\n加床規定依房型而異，請查看各房型的人數限制瞭解詳細規定。\r\n\r\n歡迎兒童入住。', '大煙波雙人房', 4000, '雙人房', 3);
--         COMMIT;
--
--         SET
--             FOREIGN_KEY_CHECKS = 1;
--
--
--         CREATE TABLE ` hotel_image `
--         (
--             `
--             id `             int NOT NULL AUTO_INCREMENT, `
--             admission_time ` datetime DEFAULT NULL, `
--             file_name `      varchar(255) CHARACTER
--             SET
--             utf8mb3
--             COLLATE
--             utf8_general_ci
--             DEFAULT
--             NULL, `
--             image_path `     varchar(255) CHARACTER
--             SET
--             utf8mb3
--             COLLATE
--             utf8_general_ci
--             DEFAULT
--             NULL, `
--             hotel_id `       int      DEFAULT NULL,
--             PRIMARY KEY (` id `),
--             KEY `            FK293ve9b0ocbfji4u5hl2oh3ks `(` hotel_id `
--         ) ,
--     CONSTRAINT `FK293ve9b0ocbfji4u5hl2oh3ks` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
--         -- ----------------------------
-- -- Records of hotel_image
-- -- ----------------------------
--         BEGIN
--             ;
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (1, '2022-07-18 22:13:46', NULL, '/data/uploadimages/hotelImage/pexels-freemockupsorg-775219.jpg',
--                     3);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (2, '2022-07-18 22:13:46', NULL, '/data/uploadimages/hotelImage/pexels-francesco-ungaro-96444.jpg',
--                     3);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (3, '2022-07-18 22:16:59', NULL, '/data/uploadimages/hotelImage/pexels-markus-spiske-26139.jpg', 4);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (4, '2022-07-18 22:16:59', NULL, '/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg', 4);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (5, '2022-07-18 22:20:14', NULL, '/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg', 4);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (6, '2022-07-18 22:20:14', NULL, '/data/uploadimages/hotelImage/pexels-engin-akyurt-1579253.jpg', 4);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (7, '2022-07-18 22:20:32', NULL, '/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg', 4);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (8, '2022-07-18 22:20:32', NULL, '/data/uploadimages/hotelImage/pexels-pixabay-161758.jpg', 4);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (9, '2022-07-18 22:22:30', NULL, '/data/uploadimages/hotelImage/pexels-julie-aagaard-2096983.jpg',
--                     5);
--             INSERT INTO ` hotel_image ` (` id `, ` admission_time `, ` file_name `, ` image_path `, ` hotel_id `)
--             VALUES (10, '2022-07-18 22:22:30', NULL,
--                     '/data/uploadimages/hotelImage/pexels-konstantinos-eleftheriadis-2034335.jpg',
--                     5);
--             COMMIT;
--
--             SET
--                 FOREIGN_KEY_CHECKS = 1;




