USE
[GoTrip];

SET
IDENTITY_INSERT [dbo].[comment] ON;

INSERT
[dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (1, N'hotel', 1, N'david_lin', CAST(N'2022-04-25T01:00:00' AS SmallDateTime), 5, N'環境舒適，交通方便，真的超級推薦!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (2, N'restaurant', 1, N'kelly', CAST(N'2022-04-26T02:00:00' AS SmallDateTime), 4, N'食物很好吃，但服務態度不值得這個價位，店家員工訓練有待加強!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (3, N'carRental', 2, N'nobody', CAST(N'2022-04-27T03:00:00' AS SmallDateTime), 1, N'車上竟然有其他顧客的垃圾...難以置信...', N'banned')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (4, N'ticket', 1, N'montLover', CAST(N'2022-04-28T04:00:00' AS SmallDateTime), 5, N'超棒的露營區!! 竟然還有獨立衛浴!!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (5, N'hotel', 8, N'wendy123', CAST(N'2022-04-29T05:00:00' AS SmallDateTime), 5, N'價格偏高，但整個度假體驗非常好，疫情期間不能出國還是能一秒住villa', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (6, N'restaurant', 2, N'michael', CAST(N'2022-04-30T06:00:00' AS SmallDateTime), 3, N'可怕的網美店，拍起來很美但食物調味超怪，標準的一次店', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (7, N'carRental', 3, N'queenB', CAST(N'2022-05-01T07:00:00' AS SmallDateTime), 5, N'竟然可以租到全新車，服務也很好，很推薦~', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (8, N'restaurant', 3, N'ann0800', CAST(N'2022-05-02T08:00:00' AS SmallDateTime), 3, N'約會好去處，但假日遊客太多，小孩尖叫亂跑，很掃興', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (9, N'hotel', 25, N'jimmy', CAST(N'2022-05-03T09:00:00' AS SmallDateTime), 4, N'中規中矩的商務旅館', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (10, N'carRental', 34, N'gary_ispan', CAST(N'2022-05-04T10:00:00' AS SmallDateTime), 5, N'服務很好，最後還車前忘了加滿油，店家也是便宜算^^', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (11, N'ticket', 2, N'kids', CAST(N'2022-05-05T11:00:00' AS SmallDateTime), 5, N'畢旅的回憶~~~', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (12, N'ticket', 3, N'youngCP', CAST(N'2022-05-06T12:00:00' AS SmallDateTime), 5, N'拍照很美! 但門票小貴，動物生長在這麼小的水族箱感覺很痛苦，希望園區可以妥善照顧動物', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (13, N'hotel', 4, N'angela', CAST(N'2022-05-07T13:00:00' AS SmallDateTime), 4, N'環境很好 度假風格 設施有點舊但維護的不錯', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (14, N'ticket', 1, N'manager', CAST(N'2022-05-08T14:00:00' AS SmallDateTime), 5, N'夜宿海生館真的是這輩子最難忘的回憶之一，他們還主動提供耳塞以免睡覺時被別人干擾，也會個別詢問有沒有需要更多毯子或墊子~ 真的超棒', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (15, N'ticket', 2, N'zoolover', CAST(N'2022-05-09T15:00:00' AS SmallDateTime), 4, N'不敢玩遊樂設施的人，光是去動物園就值回門票了!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (16, N'ticket', 5, N'manager', CAST(N'2022-05-10T16:00:00' AS SmallDateTime), 3, N'價格有點高，但疫情下旅遊景點經營不易，也算是辛苦經營單位了', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (17, N'hotel', 4, N'lovelylady', CAST(N'2022-05-11T17:00:00' AS SmallDateTime), 5, N'超喜歡這裡，窗戶很大，視野非常好', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (18, N'hotel', 2, N'emp0315', CAST(N'2022-05-12T18:00:00' AS SmallDateTime), 4, N'還不錯，出公差而來，沒享受到飯店設施，稍嫌可惜', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (19, N'hotel', 5, N'employee2', CAST(N'2022-05-13T19:00:00' AS SmallDateTime), 5, N'超值的體驗', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (20, N'restaurant', 2, N'manager', CAST(N'2022-05-14T20:00:00' AS SmallDateTime), 2, N'心灰意冷，bug好多', N'banned')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (21, N'hotel', 8, N'wendy_chen', CAST(N'2022-05-15T21:00:00' AS SmallDateTime), 5, N'極力推薦大家可以到中庭餐廳享用中西式的自助餐，或者在預訂房間時就加訂早餐，那麼就能夠在義大早起床就前往氣派的中庭用餐喔！', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (22, N'ticket', 5, N'montbell', CAST(N'2022-05-16T22:00:00' AS SmallDateTime), 4, N'太平山蘊藏珍貴林木，昔日與阿里山、八仙山並列台灣三大林場 乘坐蹦蹦車，沉浸在森林芬多精的世界，美不勝收。', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (23, N'ticket', 4, N'artlover', CAST(N'2022-05-17T23:00:00' AS SmallDateTime), 4, N'桃園青埔又將迎來全新景點！肩負推廣悠久歷史的橫山書法藝術館，建築外觀結合硯台、墨池意象!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (24, N'ticket', 1, N'ryan0412', CAST(N'2022-04-28T04:00:00' AS SmallDateTime), 4, N'超棒的露營區!! 竟然還有獨立衛浴!!', N'show')
INSERT [dbo].[comment] ([id], [item_tb], [item_id], [user_id], [date], [rating], [content], [status]) VALUES (25, N'hotel', 4, N'angela', CAST(N'2022-05-07T13:00:00' AS SmallDateTime), 3, N'環境很好 度假風格 設施有點舊但維護的不錯', N'show')
SET IDENTITY_INSERT [dbo].[comment] OFF;

SET
IDENTITY_INSERT [dbo].[comment_image] ON ;

INSERT
[dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (1, N'/data/uploadimages/comment/hotel.jpg', 1)
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
INSERT [dbo].[comment_image] ([id], [image_path], [comment_id]) VALUES (30, N'/data/uploadimages/comment/friends-min.jpg', 24)
SET IDENTITY_INSERT [dbo].[comment_image] OFF;

SET
IDENTITY_INSERT [dbo].[car_model] ON;

INSERT
[dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (1, N'經濟轎車', N'豐田', N'Toyota', N'Yaris', N'燃油車', N'AT', 1500, 5, 4, 1, 2, N'/data/uploadimages/car/toyota-yaris.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (2, N'經濟轎車', N'豐田', N'Toyota', N'Vios', N'燃油車', N'AT', 1500, 5, 4, 1, 2, N'/data/uploadimages/car/toyota-vios.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (3, N'經濟轎車', N'豐田', N'Toyota', N'Altis', N'燃油車', N'AT', 1800, 5, 4, 2, 2, N'/data/uploadimages/car/toyota-altis.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (4, N'經濟轎車', N'豐田', N'Toyota', N'Prius C', N'燃油車', N'AT', 2000, 5, 4, 2, 2, N'/data/uploadimages/car/toyota-camry.png')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (5, N'豪華轎車', N'豐田', N'Toyota', N'Camry', N'燃油車', N'AT', 2000, 5, 4, 1, 2, N'/data/uploadimages/car/toyota-prius-c.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (6, N'豪華轎車', N'豐田', N'Toyota', N'Auris', N'燃油車', N'AT', 2000, 5, 4, 2, 2, N'/data/uploadimages/car/toyota-auris.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (7, N'休旅車/SUV', N'豐田', N'Toyota', N'bZ4X', N'電動車', N'AT', 0, 5, 4, 2, 1, N'/data/uploadimages/car/toyota-bz4x.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (8, N'休旅車/SUV', N'豐田', N'Toyota', N'Corolla Cross', N'燃油車', N'AT', 1800, 5, 5, 3, 2, N'/data/uploadimages/car/toyota-corolla-cross.jpg')
INSERT [dbo].[car_model] ([id], [type], [make_ch], [make_en], [model], [power], [transmission], [engine], [seat], [door], [suitcase], [bag], [image]) VALUES (9, N'休旅車/SUV', N'豐田', N'Toyota', N'Sienta', N'燃油車', N'AT', 1500, 5, 5, 2, 2, N'/data/uploadimages/car/toyota-sienta.png')
SET IDENTITY_INSERT [dbo].[car_model] OFF;

SET
IDENTITY_INSERT [dbo].[car_location] ON;

INSERT
[dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (1, 1, N'隔尚租車', N'台北建北站', N'台灣', N'台北市', N'中山區', N'建國北路一段71-1號', N'02-25021389', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-201.jpg', 121.537212, 25.051116)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (2, 1, N'隔尚租車', N'台北忠孝站', N'台灣', N'台北市', N'信義區', N'忠孝東路五段705號1樓', N'02-8785662', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-202.jpg', 121.580242, 25.042552)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (3, 1, N'隔尚租車', N'台北景美站', N'台灣', N'台北市', N'文山區', N'羅斯福路五段221號1樓', N'02-89310266', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-203.jpg', 121.539215, 25.001994)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (4, 1, N'隔尚租車', N'台北士林站', N'台灣', N'台北市', N'士林區', N'德行西路81號', N'02-2835110', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-204.jpg', 121.521746, 25.10463)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (5, 1, N'隔尚租車', N'台北內湖站', N'台灣', N'台北市', N'內湖區', N'內湖路1段236號', N'02-25021389', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-205.jpg', 121.559064, 25.085367)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (6, 1, N'隔尚租車', N'台北南港站', N'台灣', N'台北市', N'南港區', N'經貿一路59號', N'02-26511333', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-206.jpg', 121.620053, 25.056254)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (7, 1, N'隔尚租車', N'台北車站', N'台灣', N'台北市', N'中正區', N'忠孝西路一段47號B1樓', N'02-25159393', CAST(N'08:30:00' AS Time), CAST(N'21:30:00' AS Time), N'/data/uploadimages/car/1-210.jpg', 121.517414, 25.046533)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (8, 1, N'隔尚租車', N'台北松山機場站', N'台灣', N'台北市', N'松山區', N'敦化北路340之9號', N'02-27151133', CAST(N'08:30:00' AS Time), CAST(N'19:00:00' AS Time), N'/data/uploadimages/car/1-219.jpg', 121.549778, 25.063869)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (9, 1, N'隔尚租車', N'台北新店站', N'台灣', N'新北市', N'新店區', N'中興路三段11號B1', N'02-29153311', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-208.jpg', 121.545138, 24.978089)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (10, 1, N'隔尚租車', N'台北蘆洲站', N'台灣', N'新北市', N'蘆洲區', N'三民路88號', N'02-22852299', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-216.jpg', 121.473882, 25.085351)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (11, 1, N'隔尚租車', N'台北土城站', N'台灣', N'新北市', N'土城區', N'中央路三段158號', N'02-22693131', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-217.jpg', 121.432132, 24.965811)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (12, 1, N'隔尚租車', N'台北中和站', N'台灣', N'新北市', N'中和區', N'連城路126號', N'02-22423232', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-218.jpg', 121.495982, 24.999459)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (13, 1, N'隔尚租車', N'台北淡水站', N'台灣', N'新北市', N'淡水區', N'中正路1號', N'02-26299393', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-222.jpg', 121.432696, 25.174829)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (14, 1, N'隔尚租車', N'台北板橋車站', N'台灣', N'新北市', N'板橋區', N'縣民大道二段7號1樓', N'02-29658080', CAST(N'08:30:00' AS Time), CAST(N'22:00:00' AS Time), N'/data/uploadimages/car/1-224.jpg', 121.463512, 25.014534)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (15, 1, N'隔尚租車', N'宜蘭羅東站', N'台灣', N'宜蘭縣', N'羅東鎮', N'光榮路334號', N'03-9602116', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-231.jpg', 121.77797, 24.678532)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (16, 2, N'隔尚租車', N'桃園復興站', N'台灣', N'桃園市', N'桃園區', N'復興路325號', N'03-3319555', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-301.jpg', 121.304653, 24.989491)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (17, 2, N'隔尚租車', N'桃園高鐵站', N'台灣', N'桃園市', N'中壢區', N'青埔里高鐵北路一段6號', N'03-2611881', CAST(N'07:00:00' AS Time), CAST(N'22:00:00' AS Time), N'/data/uploadimages/car/1-302.jpg', 121.215952, 25.014084)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (18, 2, N'隔尚租車', N'桃園中壢站', N'台灣', N'桃園市', N'中壢區', N'中華路二段128號', N'03-4629911', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-303.jpg', 121.240602, 24.965952)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (19, 2, N'隔尚租車', N'桃園大園站', N'台灣', N'桃園市', N'大園區', N'三民路二段50之2號', N'03-3830123', CAST(N'08:30:00' AS Time), CAST(N'19:30:00' AS Time), N'/data/uploadimages/car/1-305.jpg', 121.253123, 25.088127)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (20, 2, N'隔尚租車', N'桃園機場站', N'台灣', N'桃園市', N'大園區', N'航站南路15號', N'03-3931133', CAST(N'08:30:00' AS Time), CAST(N'19:30:00' AS Time), N'/data/uploadimages/car/1-306.jpg', 121.237053, 25.081168)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (21, 2, N'隔尚租車', N'苗栗高鐵站', N'台灣', N'苗栗縣', N'後龍鎮', N'高鐵三路268號', N'03-7248168', CAST(N'08:00:00' AS Time), CAST(N'20:00:00' AS Time), N'/data/uploadimages/car/1-307.jpg', 120.825767, 24.605421)
INSERT [dbo].[car_location] ([id], [company_id], [company_name], [name], [country], [county], [district], [address], [phone], [open_time], [close_time], [image], [longitude], [latitude]) VALUES (22, 2, N'隔尚租車', N'新竹中華站', N'台灣', N'新竹市', N'東區', N'中華路一段315號', N'03-5153528', CAST(N'08:30:00' AS Time), CAST(N'20:30:00' AS Time), N'/data/uploadimages/car/1-311.jpg', 120.983957, 24.809551)
SET IDENTITY_INSERT [dbo].[car_location] OFF;

SET
IDENTITY_INSERT [dbo].[car_option] ON;

INSERT
[dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (1, 1, 1, 2000, 0.75, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (2, 1, 2, 2000, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (3, 1, 3, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (4, 1, 4, 2200, 0.699999988079071, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (5, 2, 1, 2000, 0.75, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (6, 2, 2, 2000, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (7, 3, 4, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (8, 4, 5, 2200, 0.699999988079071, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (9, 3, 2, 2000, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (10, 4, 3, 2200, 0.75, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (11, 5, 4, 2200, 0.699999988079071, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (12, 6, 8, 3000, 0.89999997615814209, 1)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (13, 6, 9, 3200, 0.85000002384185791, 2)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (14, 7, 6, 2800, 0.800000011920929, 2)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (15, 7, 7, 2800, 0.85000002384185791, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (16, 8, 5, 2500, 0.89999997615814209, 5)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (17, 9, 7, 3000, 0.800000011920929, 3)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (18, 10, 6, 2800, 0.800000011920929, 4)
INSERT [dbo].[car_option] ([id], [location_id], [model_id], [price], [discount], [amount]) VALUES (19, 10, 8, 3000, 0.89999997615814209, 3)
SET IDENTITY_INSERT [dbo].[car_option] OFF;

SET
IDENTITY_INSERT [dbo].[user_data] ON
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone], [city], [location], [address], [image], [authority]) VALUES (1, N'admin', NULL, NULL, N'$2a$10$juAszWkBW1M0P5l8A6bQw..z3h4bU2AlzpPlerAfnxy2AqhiVwlai', NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'admin')
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone], [city], [location], [address], [image], [authority]) VALUES (2, N'dealer', NULL, NULL, N'$2a$10$iVMluTlijqCYBRs3DtGO9./iYxFI/9wB2BP5fQavZeIpatQOeJMfC', NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'dealer')
INSERT [dbo].[user_data] ([user_id], [username], [ch_name], [en_name], [password], [gender], [birthday], [phone], [city], [location], [address], [image], [authority]) VALUES (12, N'elvispan@gmail.com', NULL, NULL, N'$2a$10$rJUmwbkulb//M5phPQVQxuHCQozOcBeCd100fKJuycpxtyikGKl4K', NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'user')
SET IDENTITY_INSERT [dbo].[user_data] OFF




