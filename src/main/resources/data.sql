USE [GoTrip];

SET IDENTITY_INSERT [dbo].[comment] ON;

INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (1, N'hotel', 1, N'david_lin', CAST(N'2022-04-25T01:00:00' AS SmallDateTime), 5, N'環境舒適，交通方便，真的超級推薦!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (2, N'restaurant', 1, N'kelly', CAST(N'2022-04-26T02:00:00' AS SmallDateTime), 4,
        N'食物很好吃，但服務態度不值得這個價位，店家員工訓練有待加強!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (3, N'carRental', 2, N'nobody', CAST(N'2022-04-27T03:00:00' AS SmallDateTime), 1, N'車上竟然有其他顧客的垃圾...難以置信...',
        N'banned')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (4, N'ticket', 1, N'montLover', CAST(N'2022-04-28T04:00:00' AS SmallDateTime), 5, N'超棒的露營區!! 竟然還有獨立衛浴!!',
        N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (5, N'hotel', 8, N'wendy123', CAST(N'2022-04-29T05:00:00' AS SmallDateTime), 5,
        N'價格偏高，但整個度假體驗非常好，疫情期間不能出國還是能一秒住villa', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status])
VALUES (6, N'restaurant', 2, N'michael', CAST(N'2022-04-30T06:00:00' AS SmallDateTime), 3,
        N'可怕的網美店，拍起來很美但食物調味超怪，標準的一次店', N'show')
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

INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (1, N'/data/uploadimages/comment/hotel.jpg', 1)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (2, N'/data/uploadimages/comment/hotel-room.jpg', 1)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (3, N'/data/uploadimages/comment/hotel-room2.jpg', 1)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (4, N'/data/uploadimages/comment/healthy-food.jpg', 2)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (5, N'/data/uploadimages/comment/healthy-food-2.jpg', 2)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (6, N'/data/uploadimages/comment/ford.jpg', 3)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (7, N'/data/uploadimages/comment/jepp.jpg', 3)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (8, N'/data/uploadimages/comment/fall.jpg', 4)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (9, N'/data/uploadimages/comment/villa2.jpg', 5)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (10, N'/data/uploadimages/comment/villa-3.jpg', 5)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (11, N'/data/uploadimages/comment/villa.jpg', 5)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (12, N'/data/uploadimages/comment/healthy-food-2.jpg', 6)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (13, N'/data/uploadimages/comment/restaurant.jpg', 8)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (14, N'/data/uploadimages/comment/pizza.jpg', 8)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (15, N'/data/uploadimages/comment/hotel-room-5.jpg', 9)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (16, N'/data/uploadimages/comment/theme_park_1.jpg', 11)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (17, N'/data/uploadimages/comment/theme_park_2.jpg', 11)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (18, N'/data/uploadimages/comment/Xpark_1.jpg', 12)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (19, N'/data/uploadimages/comment/Xpark_2.jpg', 12)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (20, N'/data/uploadimages/comment/Xpark_3.jpg', 12)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (21, N'/data/uploadimages/comment/aquarium.jpg', 14)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (22, N'/data/uploadimages/comment/aquarium.webp', 14)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (23, N'/data/uploadimages/comment/theme_park_1.jpg', 15)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (24, N'/data/uploadimages/comment/hotel-room4.jpg', 19)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (25, N'/data/uploadimages/comment/hotel.jpg', 19)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (26, N'/data/uploadimages/comment/restaurant.jpg', 21)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (27, N'/data/uploadimages/comment/hotel-room4.jpg', 21)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (28, N'/data/uploadimages/comment/art.jpg', 23)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (29, N'/data/uploadimages/comment/fall.jpg', 24)
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id])
VALUES (30, N'/data/uploadimages/comment/friends-min.jpg', 24)
SET IDENTITY_INSERT [dbo].[comment_image] OFF;

SET
    IDENTITY_INSERT [dbo].[car_model] ON;

INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (1, N'經濟轎車', N'豐田', N'Toyota', N'Yaris', N'燃油車', N'AT', 1500, 5, 4, 1, 2,
        N'/data/uploadimages/car/toyota-yaris.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (2, N'經濟轎車', N'豐田', N'Toyota', N'Vios', N'燃油車', N'AT', 1500, 5, 4, 1, 2,
        N'/data/uploadimages/car/toyota-vios.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (3, N'經濟轎車', N'豐田', N'Toyota', N'Altis', N'燃油車', N'AT', 1800, 5, 4, 2, 2,
        N'/data/uploadimages/car/toyota-altis.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (4, N'經濟轎車', N'豐田', N'Toyota', N'Prius C', N'燃油車', N'AT', 2000, 5, 4, 2, 2,
        N'/data/uploadimages/car/toyota-camry.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (5, N'豪華轎車', N'豐田', N'Toyota', N'Camry', N'燃油車', N'AT', 2000, 5, 4, 1, 2,
        N'/data/uploadimages/car/toyota-prius-c.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (6, N'豪華轎車', N'豐田', N'Toyota', N'Auris', N'燃油車', N'AT', 2000, 5, 4, 2, 2,
        N'/data/uploadimages/car/toyota-auris.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (7, N'休旅車/SUV', N'豐田', N'Toyota', N'bZ4X', N'電動車', N'AT', 0, 5, 4, 2, 1,
        N'/data/uploadimages/car/toyota-bz4x.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (8, N'休旅車/SUV', N'豐田', N'Toyota', N'Corolla Cross', N'燃油車', N'AT', 1800, 5, 5, 3, 2,
        N'/data/uploadimages/car/toyota-corolla-cross.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat],
                          [door], [suitcase], [bag], [image])
VALUES (9, N'休旅車/SUV', N'豐田', N'Toyota', N'Sienta', N'燃油車', N'AT', 1500, 5, 5, 2, 2,
        N'/data/uploadimages/car/toyota-sienta.png')
SET IDENTITY_INSERT [dbo].[car_model] OFF;

SET IDENTITY_INSERT [dbo].[car_location] ON

INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (1, N'建國北路一段71-1號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'中山區', N'/data/uploadimages/car/1-201.jpg',
        N'25.051116', N'121.537212', N'台北建北站', N'08:30:00.0000000', N'02-25021389', N'隱藏')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (2, N'忠孝東路五段705號1樓', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'信義區', N'/data/uploadimages/car/1-202.jpg',
        N'25.042552', N'121.580242', N'台北忠孝站', N'08:30:00.0000000', N'02-8785662', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (3, N'羅斯福路五段221號1樓', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'文山區', N'/data/uploadimages/car/1-203.jpg',
        N'25.001994', N'121.539215', N'台北景美站', N'08:30:00.0000000', N'02-89310266', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (4, N'德行西路81號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'士林區', N'/data/uploadimages/car/1-204.jpg',
        N'25.10463', N'121.521746', N'台北士林站', N'08:30:00.0000000', N'02-2835110', N'隱藏')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (5, N'內湖路1段236號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'內湖區', N'/data/uploadimages/car/1-205.jpg',
        N'25.085367', N'121.559064', N'台北內湖站', N'08:30:00.0000000', N'02-25021389', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (6, N'經貿一路59號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'南港區', N'/data/uploadimages/car/1-206.jpg',
        N'25.056254', N'121.620053', N'台北南港站', N'08:30:00.0000000', N'02-26511333', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (7, N'忠孝西路一段47號B1樓', N'21:30:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'中正區', N'/data/uploadimages/car/1-210.jpg',
        N'25.046533', N'121.517414', N'台北車站', N'08:30:00.0000000', N'02-25159393', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (8, N'敦化北路340之9號', N'19:00:00.0000000', 1, N'隔尚租車', N'台灣', N'台北市', N'松山區', N'/data/uploadimages/car/1-219.jpg',
        N'25.063869', N'121.549778', N'台北松山機場站', N'08:30:00.0000000', N'02-27151133', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (9, N'中興路三段11號B1', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'新店區', N'/data/uploadimages/car/1-208.jpg',
        N'24.978089', N'121.545138', N'台北新店站', N'08:30:00.0000000', N'02-29153311', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (10, N'三民路88號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'蘆洲區', N'/data/uploadimages/car/1-216.jpg',
        N'25.085351', N'121.473882', N'台北蘆洲站', N'08:30:00.0000000', N'02-22852299', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (11, N'中央路三段158號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'土城區', N'/data/uploadimages/car/1-217.jpg',
        N'24.965811', N'121.432132', N'台北土城站', N'08:30:00.0000000', N'02-22693131', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (12, N'連城路126號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'中和區', N'/data/uploadimages/car/1-218.jpg',
        N'24.999459', N'121.495982', N'台北中和站', N'08:30:00.0000000', N'02-22423232', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (13, N'中正路1號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'淡水區', N'/data/uploadimages/car/1-222.jpg',
        N'25.174829', N'121.432696', N'台北淡水站', N'08:30:00.0000000', N'02-26299393', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (14, N'縣民大道二段7號1樓', N'22:00:00.0000000', 1, N'隔尚租車', N'台灣', N'新北市', N'板橋區', N'/data/uploadimages/car/1-224.jpg',
        N'25.014534', N'121.463512', N'台北板橋車站', N'08:30:00.0000000', N'02-29658080', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (15, N'光榮路334號', N'20:30:00.0000000', 1, N'隔尚租車', N'台灣', N'宜蘭縣', N'羅東鎮', N'/data/uploadimages/car/1-231.jpg',
        N'24.678532', N'121.77797', N'宜蘭羅東站', N'08:30:00.0000000', N'03-9602116', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (16, N'復興路325號', N'20:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'桃園區', N'/data/uploadimages/car/1-301.jpg',
        N'24.989491', N'121.304653', N'桃園復興站', N'08:30:00.0000000', N'03-3319555', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (17, N'青埔里高鐵北路一段6號', N'22:00:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'中壢區', N'/data/uploadimages/car/1-302.jpg',
        N'25.014084', N'121.215952', N'桃園高鐵站', N'07:00:00.0000000', N'03-2611881', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (18, N'中華路二段128號', N'20:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'中壢區', N'/data/uploadimages/car/1-303.jpg',
        N'24.965952', N'121.240602', N'桃園中壢站', N'08:30:00.0000000', N'03-4629911', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (19, N'三民路二段50之2號', N'19:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'大園區', N'/data/uploadimages/car/1-305.jpg',
        N'25.088127', N'121.253123', N'桃園大園站', N'08:30:00.0000000', N'03-3830123', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (20, N'航站南路15號', N'19:30:00.0000000', 2, N'隔尚租車', N'台灣', N'桃園市', N'大園區', N'/data/uploadimages/car/1-306.jpg',
        N'25.081168', N'121.237053', N'桃園機場站', N'08:30:00.0000000', N'03-3931133', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (21, N'高鐵三路268號', N'20:00:00.0000000', 2, N'隔尚租車', N'台灣', N'苗栗縣', N'後龍鎮', N'/data/uploadimages/car/1-307.jpg',
        N'24.605421', N'120.825767', N'苗栗高鐵站', N'08:00:00.0000000', N'03-7248168', N'顯示')
INSERT [dbo].[car_location] ([id], [address], [close_time], [company_id], [company_name], [country], [county],
                             [district], [image], [latitude], [longitude], [name], [open_time], [phone], [status])
VALUES (22, N'中華路一段315號', N'20:30:00.0000000', 2, N'隔尚租車', N'台灣', N'新竹市', N'東區', N'/data/uploadimages/car/1-311.jpg',
        N'24.809551', N'120.983957', N'新竹中華站', N'08:30:00.0000000', N'03-5153528', N'顯示')

SET IDENTITY_INSERT [dbo].[car_location] OFF


SET
    IDENTITY_INSERT [dbo].[car_option] ON;

INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (1, 1, 1, 2000, 0.75, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (2, 1, 2, 2000, 0.80, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (3, 1, 3, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (4, 1, 4, 2200, 0.70, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (5, 2, 1, 2000, 0.75, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (6, 2, 2, 2000, 0.80, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (7, 3, 4, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (8, 4, 5, 2200, 0.70, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (9, 3, 2, 2000, 0.80, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (10, 4, 3, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (11, 5, 4, 2200, 0.70, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (12, 6, 8, 3000, 0.90, 1)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (13, 6, 9, 3200, 0.85, 2)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (14, 7, 6, 2800, 0.80, 2)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (15, 7, 7, 2800, 0.85, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (16, 8, 5, 2500, 0.90, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (17, 9, 7, 3000, 0.80, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (18, 10, 6, 2800, 0.80, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount])
VALUES (19, 10, 8, 3000, 0.90, 3)
SET IDENTITY_INSERT [dbo].[car_option] OFF;

SET
    IDENTITY_INSERT [dbo].[user_data] ON
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone],
                          [city], [location], [address], [image], [authority], [enabled], [verification_code])
VALUES (1, N'admin', N'管理員', N'ADMIN', N'$2a$10$0CyR/2imAewmqwur36Xqy.FhTcyZ8KwZkJCeScapxC9DDCyrnihom', NULL, NULL, NULL,
        NULL, NULL, NULL, NULL, N'ROLE_ADMIN',1,NULL)
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone],
                          [city], [location], [address], [image], [authority], [enabled], [verification_code])
VALUES (2, N'dealer', NULL, NULL, N'$2a$10$iuo37iB/g9tK0l94aHFVK.f/onjfh3MFMNIgBy2SLYwrC/RsXw/MC', NULL, NULL, NULL,
        NULL, NULL, NULL, NULL, N'ROLE_DEALER',1,NULL)
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone],
                          [city], [location], [address], [image], [authority], [enabled], [verification_code])
VALUES (12, N'user', NULL, NULL, N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', NULL,
        NULL, NULL, NULL, NULL, NULL, NULL, N'ROLE_USER',1,NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) 
VALUES (13, N'臺南市仁德區建國南路二段139號', NULL, N'1987-06-09', N'陳傑森', N'臺南市', NULL, N'Jason Chen', 0, N'男', NULL, N'仁德區', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'0978048778', NULL, N'jason5566@gmai.com', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) 
VALUES (14, N'新竹縣關西鎮仁安里中豐路二段132號', NULL, N'1988-07-06', N'彭莎莉', N'新竹縣', NULL, N'Sally Peng', 0, N'女', NULL, N'關西鎮', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'0963596489', NULL, N'sally1968@gmail.com', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) VALUES (15, N'南投縣埔里鎮中成路23號', NULL, N'1984-02-15', N'王大明', N'南投縣', NULL, N'Wang Da Min', 0, N'男', NULL, N'埔里鎮', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'0965865665', NULL, N'minmin@yahoo.com.tw', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) VALUES (16, N'桃園市桃園區平和二路7號', NULL, N'1973-07-19', N'王佳琳', N'桃園市', NULL, N'Wang Jia Lin', 0, N'女', NULL, N'桃園區', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'0995267516', NULL, N'jiajialin2234@gmail.com', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) VALUES (17, N'臺南市歸仁區文澄街4號', NULL, N'1995-06-06', N'劉琉球', N'臺南市', NULL, N'Liu Liu Qiu', 0, N'女', NULL, N'歸仁區', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'0946785615', NULL, N'llq78965@gmail.com', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) VALUES (20, N'屏東縣東港鎮明德一街22號', NULL, N'1988-08-22', N'趙紫梅', N'屏東縣', NULL, N'Chao zhi may', 1, N'女', NULL, N'東港鎮', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'09659646289', NULL, N'chao8855@gmail.com', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) VALUES (21, N'臺中市西屯區上明一街16號', NULL, N'1998-11-19', N'梁奕風', N'臺中市', NULL, N'Liang Yi Fung', 1, N'男', NULL, N'西屯區', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', N'0964864866', NULL, N'windy@gmail.com', NULL)
INSERT [dbo].[user_data] ([user_id], [address], [authority], [birthday], [ch_name], [city], [dealer_name], [en_name], [enabled], [gender], [image], [location], [password], [phone], [tax_id], [username], [verification_code]) VALUES (22, N'雲林縣水林鄉蔦松路23號', NULL, N'1992-01-25', N'李志平', N'雲林縣', NULL, NULL, 1, N'男', NULL, N'水林鄉', N'$2a$10$nchrTpwB.ocbZd2KFA.Im.3LT2/T.QsrRNq5nCfLiwq.XZLHpe.G.', NULL, NULL, N'leeeee1122@hotmail.com', NULL)
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
        N'Taiwan', N'300', N'976472309', 4000, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'5', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:01:52.1490000', NULL, NULL, NULL, N'陳佳鑫', N'臺中市', N'2', N'附屬spa',
        N'提供3c高級筆電', N'提供美式餐點', NULL, N'臺中市西區', N'2000', NULL, N'公寓', N'台中金典酒店 (Splendor Hotel)', NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於台中市東區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的台中彩虹眷村。 這間4星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'800', N'916752161', 1000, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'6', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:02.4310000', NULL, NULL, NULL, N'王家豪', N'桃園市', N'3', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市中壢區', N'20000', NULL, N'公寓', N'古華花園飯店 (Kuva Chateau Hotel)', NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於桃園市中壢區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人健身中心、餐廳和室外泳池',
        N'Taiwan', N'1000', N'911223333', 3000, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'7', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'名人堂花園大飯店 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 3000, NULL, NULL, N'營業中')


INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'8', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:08:53.5640000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'5', N'附屬美容室',
        N'提供超跑特別租借', N'提供中式餐點', NULL, N'桃園市復興區華陵村巴崚156-7號, 桃園市復興區華陵村巴崚156-7號', N'20000', NULL, N'公寓', N'拉拉山桃山渡假農場',
        NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於桃園市復興區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間5星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'1000', N'911223222', 3000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'9', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:08:53.5640000', NULL, NULL, NULL, N'龍王英', N'高雄市', N'6', N'附屬美容室',
        N'提供超跑特別租借', N'提供中式餐點', NULL, N'中山二路199號, 前鎮區, 高雄市', N'20000', NULL, N'公寓', N'高雄菁英國際旅館',
        NULL,
        N'入住完美住宿，是完美旅程的必備要素。快來享受住宿提供的客房免費Wi-Fi吧！ 住宿位於桃園市復興區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間5星級飯店的設施十分完善，可大大提升您的住宿品質，為旅程增添歡樂。',
        N'Taiwan', N'1000', N'911223222', 2000, NULL, NULL, N'營業中')

INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'11', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'名人堂花園大飯店 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 1000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'12', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'花園淘淘國際酒店 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 5000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'13', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'歐嗨喲國際商業旅館 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 9000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'14', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'4', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'牙拜一旅館 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 1000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'15', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'桃園市', N'6', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'桃園市龍潭區', N'20000', NULL, N'公寓', N'鴻泰爽 (Fame Hall Garden Hotel)', NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 3000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'16', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 499, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'17', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 2000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'18', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 1000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'19', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 4000, NULL, NULL, N'營業中')
INSERT INTO [dbo].[hotel] ([id], [howgoto], [admission_time], [bath_count], [bed_count], [bedroom_count], [boss_name],
                           [city], [company_id], [feature1], [feature2], [feature3], [file_name], [full_address],
                           [hotel_area], [hotel_rule], [hotel_style], [hotel_name], [image], [introduce], [notional],
                           [people_count], [phone], [price], [provide], [roomtype], [status])
VALUES (N'20', N'1.搭乘捷運出站可到達
2.開車國一南下出交流道 開啟Google即可到達', N'2022-07-19 10:04:55.0020000', NULL, NULL, NULL, N'許佳佳', N'台南市', N'7', N'附屬健身房',
        N'提供機場接送服務', N'提供BBQ餐點', NULL, N'忠義路二段145號8F, 台南市, 台南市', N'20000', NULL, N'公寓', N'立和商旅台南館 (LIHO Hotel Tainan)',
        NULL,
        N'住宿提供免費Wi-Fi和免費停車服務，讓您保持連線，並來去自如。 住宿位於桃園市龍潭區的絕佳位置，讓您輕鬆探索熱門景點和餐飲選擇。 離開前，別忘了探訪知名的華泰名品城。 這間高品質飯店被評為5星級，提供客人熱水浴缸、健身中心和溫泉浴池。',
        N'Taiwan', N'1000', N'911223222', 4000, NULL, NULL, N'營業中')

SET IDENTITY_INSERT [dbo].[hotel] OFF

SET IDENTITY_INSERT [dbo].[hotel_image] ON


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'1', N'2022-07-19 10:00:08.6080000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-161758.jpg', N'4')

INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'4', N'2022-07-19 10:01:52.1530000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-161758.jpg',
        N'5')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'7', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-161758.jpg', N'6')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'10', N'2022-07-19 10:04:55.0060000', NULL,
        N'/data/uploadimages/hotelImage/pexels-konstantinos-eleftheriadis-2034335.jpg', N'7')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'13', N'2022-07-19 10:08:53.5670000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-261169.jpg', N'8')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'16', N'2022-07-19 10:08:53.5690000', NULL, N'/data/uploadimages/hotelImage/pexels-pixabay-271624.jpg', N'9')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'20', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'11')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'23', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'12')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'26', N'2022-07-19 10:04:02.4340000', NULL, N'/data/uploadimages/hotelImage/pexels-amar-saleem-70441.jpg',
        N'13')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'30', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'14')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'33', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'15')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'36', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'16')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'39', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'17')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'42', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'18')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'45', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'19')


INSERT INTO [dbo].[hotel_image] ([id], [admission_time], [file_name], [image_path], [hotel_id])
VALUES (N'48', N'2022-07-19 10:04:02.4360000', NULL, N'/data/uploadimages/hotelImage/pexels-pew-nguyen-244133.jpg',
        N'20')


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

--Ticket
SET IDENTITY_INSERT [dbo].[ticket] ON;
INSERT [dbo].[ticket] ([ticket_no], [address], [city], [country], [location], [phone], [price], [status], [tag_name], [tag_no], [ticket_brief_intro], [ticket_end_date], [ticket_end_time], [ticket_intro], [ticket_name], [ticket_open_time], [ticket_open_week], [ticket_start_date], [company_id], [ticket_image_data]) VALUES (1, N'59號', N'嘉義縣', N'台灣', N'阿里山鄉', N'052679917', 215, 0, N'歷史景點', N'4', N'欣賞阿里山五奇絕景日出、雲海、鐵路、森林、晚霞，阿里山雲海更名為台灣八景之一 親近大自然，感受神秘巨木群的清幽之美及森林芬多精，沐浴在清新空氣中 體驗遠近馳名、日治時期開始修建的阿里山小火車與森林鐵道', NULL, NULL, N'<h3>商品說明</h3>
<p>－ 行程說明 －</p>

<ul>
	<li>開放時間：24 小時開放</li>
	<li>兌換方式：本國籍民眾，兌換時請出示身分證明文件，至阿里山國家森林遊樂區收費站由工作人員感應QR code後即可入場。半票、免票等優待票種請於現場購票（<a href="https://www.forest.gov.tw/0000184">票種參考</a>）。</li>
	<li>聯絡電話：白天 05 - 2679917，夜間 05 - 2679715</li>
	<li>營業地址：臺灣嘉義縣阿里山鄉正村59號<br />
	<br />
	<br />
	&nbsp;</li>
</ul>

<p>－ 介紹 －</p>

<ul>
	<li>祝山線(黃線)</li>
</ul>

<ol>
	<li>遊客中心站&rarr;祝山站：距離約 5.5 公里，行駛時間含遊客上下車時間約為 35 分鐘</li>
	<li>乘車地點為候車總站、遊客中心站及沼平站，停靠站為對高岳站，並在祝山站下車，欲搭回程祝山線的遊客請依時刻表搭車。</li>
	<li>發車時間(為固定班次)：<br />
	A. 日間祝山（上山）服務時間： 9：00、 11：00、 13：00、15：00&nbsp;<br />
	B. 日間祝山（下山）服務時間： 9：30、 11：30、 13：30、15：30、16：30</li>
	<li>2.祝山站為阿里山國家森林遊樂區內重要的觀日景點，非觀日時間亦有機會從觀景台一覽雲海景觀，而祝山站再往上走即可抵達小笠原觀景台，為360度之絕佳視野觀景台。<br />
	<br />
	&nbsp;</li>
</ol>

<p>－ 景點介紹 －</p>

<p>阿里山山脈為台灣五大山脈之一，阿里山並不是一座山，而是泛指這個山區；自古擁有豐沛的紅檜與扁柏，然從 191 2年起成為台灣最具規模的林場，一直到 1960 年代末期為止。歷經日本、國民政府的採伐後，原始檜木林幾乎伐盡，現今存有第一期與第二期巨木群棧道近四十株的紅檜巨木，讓人緬懷過去神木林的壯闊神聖。其中最高的「阿里山香林神木」，高 45 公尺，樹圍 12.3 公尺，樹齡約2300年，是到訪阿里山的必遊之處。<br />
<br />
在阿里山國家森林遊樂區內有豐富的生態，其中最特殊的植物，莫過於稀有的蓧蕨、相馬氏石杉、阿里山十大功勞與一葉蘭了；動物則有台灣獼猴、帝雉、藪鳥、阿里山鴝、阿里山山椒魚等小明星助陣，熱鬧非凡。除了神木，阿里山還有非常多具可看性的景點：森林小火車、空靈飄渺的姊妹潭、壯闊動人的雲海、美麗的祝山日出、受鎮宮、百年慈雲寺、林業史蹟、春天盛開的各類櫻花與杜鵑&hellip;阿里山森林遊樂區是一個足以代表台灣霧林帶的國際級觀光景點，歡迎著來自全世界的旅人們，前來認識台灣山林豐富而美麗的面貌。<br />
<br />
「春賞花、夏避暑、秋攬楓、冬觀雲」詳述了一年四季萬種風情的阿里山國家森林遊樂區。在阿里山您只須放慢腳步，享受舒適宜人的綿延群山，伴蟲鳴入眠、被林間輕脆鳥啼喚醒，不妨現在就背起行李，規劃一趟阿里山輕旅行，讓自己徜徉於神木群的芬多精中，為身心靈安排一趟大自然的洗禮吧。</p>

<p>阿里山國家森林遊樂區門票核銷地點</p>

<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_100459/20200525093404_OJoNB/jpg" style="height:540px; width:720px" /></p>

<p>阿里山國家森林遊樂區大門口</p>

<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_100459/20200525093410_Swr05/jpg" style="height:404px; width:720px" /></p>

<p>&nbsp;</p>

<p>沼平車站就是阿里山舊火車站，建於西元1914年，於大正3年3月14日正式開始營運，原為阿里山林業鐵路登山本線的終點站。</p>

<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_100459/20200525093406_4V2nx/jpg" style="height:404px; width:720px" /></p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>
', N'阿里山國家森林遊樂區門票', NULL, NULL, NULL, 1, NULL)
--INSERT [dbo].[ticket] ([ticket_no], [address], [city], [country], [location], [phone], [price], [status], [tag_name], [tag_no], [ticket_brief_intro], [ticket_end_date], [ticket_end_time], [ticket_intro], [ticket_name], [ticket_open_time], [ticket_open_week], [ticket_start_date], [company_id], [ticket_image_data]) VALUES (2, N'春德路105號', N'桃園市', N'台灣', N'中壢區', N'032875000', 550, 0, N'水族館&動物園', N'3', N'由日本高人氣八景島團隊首度跨海來台，打造日系都會型水族館，全台首見 結合當地商場，鄰近高鐵站、機場捷運，交通方便，吃喝玩樂一次滿足', NULL, NULL, N'
--<p>－ 行程特色 －</p>
--
--<p>Xpark 為台灣首座新都會型水生公園。將生活在地球上各種地域的生物們的環境，透過空間演出與科技的融合，加以忠實的重現。在連氣溫、濕度、味道及聲音都經過縝密計算的空間裡，從天花板到地坪、延伸至水槽的影像演出呈現出 360&deg; 具魄力的沉浸式空間。來訪旅客彷彿真的身歷其境，使用五感體驗各真實場景。主角，是生活在那裡的生物們，隨環境變遷而演變進化的生物們的不思議，從各種角度將其魅力性襯托出來的環境演出也是一大特徵。Xpark 是一個滿足人們無止盡的「對於求知的慾望和獲知的喜悅」，並在世界上也是獨一無二的寓教於樂設施。<br />
--<br />
--＊館區最新消息及詳細說明請參考<a href="https://www.xpark.com.tw/index.php">Xpark官網</a><br />
--＊購票請先註冊KKday會員<br />
--＊購票請參考線上訂票流程教學<a href="https://www.youtube.com/watch?v=CXmVaSSBYOU&amp;feature=youtu.be">影片</a><br />
--＊<a href="https://www.kkday.com/zh-tw/product/preview/j28vd0xkw1mkgrrhvyr2jrwz3qpn6r47">兒童新樂園ｘXpark</a>｜獨家聯合套票<br />
--＊<a href="https://www.kkday.com/zh-tw/product/125616">Xpark＆國立故宮博物院</a>｜雙展聯票<br />
--＊高鐵國旅聯票<a href="https://www.kkday.com/zh-tw/product/116970">來回車票</a>＆桃園Xpark都會型水生公園門票<br />
--＊高鐵國旅聯票<a href="https://www.kkday.com/zh-tw/product/118924">單程車票</a>＆桃園Xpark都會型水生公園門票<br />
--＊KKday<a href="https://blog.kkday.com/71281/taiwan-taoyuan-xpark-guide">編輯帶路</a>文章</p>
--
--<p>&nbsp;</p>
--
--<p>&mdash; 檔期企劃 &mdash;</p>
--
--<ul>
--	<li>沈浸式繪本『Xbook～流向我們的物語～』<br />
--	- 活動期間：2022/01/15 ~ 2022/12/31<br />
--	- 票價資訊：Xpark 門票（不需另收費）<br />
--	<br />
--	很久很久以前，地球是被岩漿所包圍的星球。<br />
--	不論是動物、植物或是大海，就連一滴水都不存在。<br />
--	然而天空被雲給覆蓋，下了將近千年的雨。<br />
--	最後，誕生了大海。<br />
--	<br />
--	接著物語就開始了。<br />
--	物種的起源、進化、多樣性，孕育生命的海所見證的歷史。<br />
--	從生物上所聽見關於大海的各種傳說與寓言。<br />
--	<br />
--	那便是，流向我們的物語。<br />
--	是否從何處聽見時空鯨魚的呼喚？<br />
--	走吧！一起踏上未知的旅程。</li>
--</ul>
--
--<p>&nbsp;</p>
--
--<p>－ 入館資訊 －</p>
--
--<ul>
--	<li>使用期限：限於票券指定當日及有效時間內使用</li>
--	<li>入場時間：旅客所選該場次一小時內，建議參觀時間為兩小時。<br />
--	ex：場次 10:00（入場時間 10:00 - 11:00）</li>
--	<li>特殊節日營業時間：無</li>
--	<li>停車折抵：請持票券中的 QRcode 至桃園置地廣場停車場繳費處掃描折抵<br />
--	＊一台車可持一張成人門票折抵停車，折抵上限為 1 小時（僅限成人票）</li>
--</ul>
--
--<p>&nbsp;</p>
--
--<p>－ Xpark AR －</p>
--
--<p>Xpark 結合影像創意與數位技術的嶄新水族館活動。來到 Xpark 的客人須先下載專屬 APP，在館內的 AR 拍照處開啟 APP 及相機功能，即可開展出獨創角色的 AR 短篇動畫。此外、Xfun 販售之系列商品，也內藏了獨創角色會出現的動畫影片，在家就能體驗擴充實境，將在 Xpark 的美好回憶帶回家。這前所未有的水族館玩法是 Xpark 與 ROBOT 帶給台灣民眾的嶄新體驗。這是一群可愛的獨創角色在「Xpark＝有一點不可思議的另一個地球」探險的全新平行時空冒險故事，歡迎大家來體驗另一個平行時空。</p>
--
--<p>&nbsp;</p>
--
--<p>－ 展區特色 －</p>
--
--<ul>
--	<li>1 樓展區：Xcafe、漫步叢林、潮間戲灘、世外桃源</li>
--	<li>2 樓展區：福爾摩沙、癒見水母、企鵝奇遇</li>
--	<li>3 樓展區：珊瑚潛行、暖海生機、雨林探險、寒帶行凍、深海尋秘</li>
--</ul>
--
--<p>&nbsp;</p>
--
--<p>－ 新冠肺炎 (COVID-19) 疫情因應措施－</p>
--
--<ul>
--	<li>遊客入館前需消毒手部並全程配戴口罩，社交距離請維持至少1.5公尺，敬請遵循工作人員指示與貼心叮嚀</li>
--	<li>實施紅外線體溫量測儀進行體溫監測。若體溫過高則使用非接觸式體溫計重測，若高於攝氏 37.5 度則得拒絕入館</li>
--	<li>導入時段性入館措施，以便讓遊客確保適當之社交距離。關於每日、每時段的入場上限人數，將遵循開幕時的「防疫新生活運動」之規定</li>
--</ul>
--
--<p>? Xpark 夏日限定活動【涼夏浴衣套票】，穿上浴衣在 Xpark 內漫步享受今年最特別的夏天</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_101517/20220622073835_3xhWz/jpg" style="height:479px; width:720px" /></p>
--
--<p>? Xpark 主打新都會型水族館，13 大主題展區帶你沉浸奇幻無比的水生世界</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_101517/20200715042523_hm6ts/png" style="height:446px; width:720px" /></p>
--
--<p>? 「Xcafe by PRONTO」為 Xpark 與日本知名咖啡連鎖店「PRONTO corporation」攜手合作的台灣一號咖啡店，滿足味蕾享受的各種餐點，充分發揮 Xpark 獨特性的餐點！</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_101517/20220701103619_c5ob3/jpg" style="height:540px; width:720px" />? ZONE 1 ｜福爾摩沙 Formosa ｜ 台灣被海洋擁抱著，有著豐富多樣的魚種生態、變化萬千的海底地形，福爾摩沙完整呈現了這樣美麗的海洋環境，宛若走進海中，一覽海洋世界的壯闊之美</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_101517/20210629031915_yoPZu/jpg" style="height:450px; width:720px" /></p>
--
--<p>? ZONE 2 ｜珊瑚潛行 Diving in Coral Sea | 充滿迫力的 180 度環景設計，完美展現 湛藍海洋與珊瑚礁所交織出的美麗樣貌，邀您一同潛入絢爛的珊瑚之海，徜徉在色彩繽紛的 光、珊瑚、魚群、海水之中</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_101517/20200930090309_aKuk2/jpg" style="height:480px; width:720px" /></p>
--
--<p>?「Xfun」是位於 Xpark 的紀念品店，更多限定聯名商品值得你收藏</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_101517/20210119011850_Ftlli/jpg" style="height:329px; width:720px" /></p>
--
--<p>&nbsp;</p>
--
--<p>&nbsp;</p>
--
--<p>&nbsp;</p>
--', N'Xpark 都會型水生公園門票', NULL, NULL, NULL, 1, NULL)
--INSERT [dbo].[ticket] ([ticket_no], [address], [city], [country], [location], [phone], [price], [status], [tag_name], [tag_no], [ticket_brief_intro], [ticket_end_date], [ticket_end_time], [ticket_intro], [ticket_name], [ticket_open_time], [ticket_open_week], [ticket_start_date], [company_id], [ticket_image_data]) VALUES (4, N'189號', N'花蓮縣', N'台灣', N'壽豐鄉', N'038123199', 780, 0, N'主題樂園', N'1', N'8大主題遊樂設施，遊玩精彩一整天 走訪超人氣全台最大海洋公園，享受依山傍海美景，創造無限回憶 欣賞4大主題表演：海豚秀、海獅秀、美人魚生態教室、水晶城堡秀', NULL, NULL, N'
--<p>&ndash; 七月限定「海洋冰風暴2-冰怪來襲」活動 &ndash;</p>
--
--<p>海洋公園獨家暑期限定活動【海洋冰風暴2-冰怪來襲】<br />
--炎熱的夏日即將到來！我們將極凍整個夏天！<br />
--水槍水車激起的水花大戰，帶領大家持續清涼high酷到最高點！</p>
--
--<ul>
--	<li>活動日期：2022.07.01 至 2022.09.11</li>
--	<li>活動內容：</li>
--</ul>
--
--<ol>
--	<li>【冰風暴之冰怪來襲】（地點：布萊登海岸）：<br />
--	海洋家族們在酷涼派對裡為大家帶來清涼水花！ 沒想到真正的大海冰怪「ICE」已悄悄出現，冰怪會從哪裡現身？ 即將為布萊登海岸掀起一場極酷冰涼水花大戰！<br />
--	&nbsp;</li>
--	<li>【超好拍涼感戲水樂】（地點：布萊登海岸）：<br />
--	今夏最夯的網美拍照景點「海豚3D戲水池」、「水漾動感噴泉」， 沁涼必玩消暑NO.1水槍冰桶預備！<br />
--	&nbsp;</li>
--	<li>【冰風暴沁涼主題餐】（地點：多尼漢堡/花車）：<br />
--	主廚推出各式冰品、派對炸物餐點。<br />
--	&nbsp;</li>
--	<li>【可愛酷炫冰怪商品】：<br />
--	冰怪果凍包搭配可愛冰怪防曬披肩，夏季玩水時尚、涼感一次包辦！</li>
--</ol>
--
--<p>&nbsp;</p>
--
--<p>&nbsp;</p>
--
--<p>&ndash; 方案說明 &ndash;&nbsp;</p>
--
--<ul>
--	<li>【6月限定套票】遠雄海洋公園 |雙人門票＆卡娜赫拉的小動物下午茶專屬約會</li>
--	<li>【限時87折】遠雄海洋公園 | 雙人套票：成人票＊2，每組1560元<br />
--	-訂購此方案每次訂購為2人為一組，每張QRcode限一人使用。</li>
--	<li>【限時87折】遠雄海洋公園 | 三人套票：成人票＊3，每組2340元<br />
--	&nbsp;-訂購此方案每次訂購為3人為一組，每張QRcode限一人使用。</li>
--	<li>【限時88折】遠雄海洋公園 | 成人票</li>
--	<li>【限時84折】海洋甜心愛戀雙人悠遊 - 雙成人票<br />
--	- 本專案平、假日及特殊節日皆可使用<br />
--	- 每次限2人使用1張憑證（4人使用2張，以此類推），15 人以上之團體不適用</li>
--</ul>
--
--<p>園區營運調整公告】</p>
--
--<p>配合中央流行疫情指揮中心管制原則，相關規範調整、異動如下（最新資訊可參考<a href="https://www.farglory-oceanpark.com.tw/public/info-in/157ZTE4qsbXHcyg2/607Yn54nx4Ms0PI0">官網</a>為準)</p>
--
--<ul>
--	<li>園區每日實施總量管制，入園人數上限為 9,600 人（原承載人數之 80%）</li>
--	<li>營業時間：平日 9:30~17:00，假日 9:00~17:00（閉園前2小時停止售票及入園）</li>
--	<li>採防疫實聯制，需全程配載口罩，保持社交安全距離</li>
--	<li>入園時需量測體溫，如出現疑似病徵或體溫超過 37.5 度等情況，園方有權婉拒入園</li>
--	<li>詳細園區內規範請參考<a href="https://www.farglory-oceanpark.com.tw/info-in/157ZTE4qsbXHcyg2/607Yn54nx4Ms0PI0">官網</a>資訊，規劃行程前請參閱<a href="https://www.farglory-oceanpark.com.tw/notice">園區維修停演公告時程</a></li>
--</ul>
--
--<p>&nbsp;</p>
--
--<p><br />
--&ndash;&nbsp;樂園特色 &ndash;</p>
--
--<p>【八大主題區】<br />
--海洋村、探險島、海洋劇場、嘉年華歡樂街、海盜灣、布萊登海岸、海底王國、水晶城堡</p>
--
--<p>【三大場館】<br />
--虛實體驗「探險島水族館」、海底探索「海洋哺乳動物生態館」沈浸式「水晶城堡劇場」</p>
--
--<p>【五大主秀】<br />
--水中精靈「海豚傳說-跳浪奇緣」、活潑逗趣「海獅小學堂」、國際級表演「奇妙海洋慶典」、動畫實境劇場「美人魚的神秘傳說」、浩瀚海底世界「大洋池的生態奧秘」</p>
--
--<p>【十大設施】<br />
--有適合各年齡層的遊樂設施，晴空纜車、黑鬍子海盜船、海盜大驚航、愛情摩天輪、海豚3D戲水池、飛琁海豚、碰碰船、小藍鯨探險記</p>
--
--<p>【海景美食街】<br />
--提供多樣異國主題特色餐點的海景風光美食街</p>
--
--<p>【英倫商店街】<br />
--英式建築造景街道，IG網美拍照熱點，還有園區吉祥物海豚、海獅、鯊魚、美人魚等家族成員驚喜現身，與遊客一同拍照遊玩</p>
--
--<p>&nbsp;</p>
--
--<p>&nbsp;</p>
--
--<p>暑期限定活動【海洋冰風暴2-冰怪來襲】：炎熱的夏日即將到來！我們將極凍整個夏天！ 水槍水車激起的水花大戰，帶領大家持續清涼high酷到最高點！</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_107922/20220711061509_KFo6S/jpg" style="height:1018px; width:720px" />位於臺灣最美麗的東海岸風景區，緊鄰著太平洋左岸，是第一座台灣最大、最美且具有國際水準的海洋主題休閒、旅遊及渡假的王國</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_107922/20201126074516_D3DEY/jpg" style="height:479px; width:720px" />海洋公園吉祥物，陪伴遊園的好夥伴</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_107922/20201125094104_UdajR/jpg" style="height:480px; width:720px" /></p>
--
--<p>來訪繽紛的海洋公園！宛如夢遊仙境的場景、精彩表演與遊戲，吸引著大小朋友，喚起心中的童趣夢幻之心！</p>
--
--<p><img alt="" src="https://image.kkday.com/v2/image/get/w_960%2Cc_fit%2Cq_55%2Ct_webp/s1.kkday.com/product_107922/20201125094150_XHHUh/jpg" style="height:482px; width:720px" /></p>
--
--<p>&nbsp;</p>
--
--<p>&nbsp;</p>
--', N'花蓮遠雄海洋公園電子門票', NULL, NULL, NULL, 1 ,NULL)


SET IDENTITY_INSERT [dbo].[ticket] OFF;

--Ticket_image
SET IDENTITY_INSERT [dbo].[ticket_image] ON;

INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (1, N'/data/uploadimages/ticket/阿里山.webp', 1)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (2, N'/data/uploadimages/ticket/阿里山2.jpg', 1)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (3, N'/data/uploadimages/ticket/阿里山3.jpg', 1)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (4, N'/data/uploadimages/ticket/阿里山4.jpg', 1)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (5, N'/data/uploadimages/ticket/阿里山5.jpg', 1)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (6, N'/data/uploadimages/ticket/阿里山6.jpg', 1)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (7, N'/data/uploadimages/ticket/Xpark.jpg', 2)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (8, N'/data/uploadimages/ticket/Xpark2.png', 2)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (9, N'/data/uploadimages/ticket/Xpark3.jpg', 2)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (10, N'/data/uploadimages/ticket/Xpark4.jpg', 2)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (11, N'/data/uploadimages/ticket/Xpark5.jpg', 2)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (12, N'/data/uploadimages/ticket/Xpark6.jpg', 2)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (13, N'/data/uploadimages/ticket/海生館.jpg', 3)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (14, N'/data/uploadimages/ticket/海生館2.jpg', 3)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (15, N'/data/uploadimages/ticket/海生館3.jpg', 3)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (16, N'/data/uploadimages/ticket/海生館4.jpg', 3)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (17, N'/data/uploadimages/ticket/海生館5.jpg', 3)
--INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (18, N'/data/uploadimages/ticket/海生館6.jpg', 3)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (19, N'/data/uploadimages/ticket/遠雄海洋公園1.jpg', 4)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (20, N'/data/uploadimages/ticket/遠雄海洋公園2.jpg', 4)
INSERT [dbo].[ticket_image] ([id], [image_path], [ticket_no1]) VALUES (21, N'/data/uploadimages/ticket/遠雄海洋公園3.jpg', 4)

SET IDENTITY_INSERT [dbo].[ticket_image] OFF;



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




