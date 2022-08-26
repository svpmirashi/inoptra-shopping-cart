--USE SHOPPING_CART;

INSERT INTO VENDOR (vendor_id, vendor_name, vendor_address, created_by, created_date, modified_by, modified_date) 
VALUES ( 1, 'ABC Electronics', 'Address 1',  'testUser1', '2021-08-16', 'testUser1', '2021-08-16');
INSERT INTO VENDOR (vendor_id, vendor_name, vendor_address, created_by, created_date, modified_by, modified_date) 
VALUES ( 2, 'XZY Electronics', 'Address 2',  'testUser1', '2021-08-16', 'testUser1', '2021-08-16');
INSERT INTO VENDOR (vendor_id, vendor_name, vendor_address, created_by, created_date, modified_by, modified_date) 
VALUES ( 3, 'Avenger Sports', 'Address 3',  'testUser1', '2021-08-16', 'testUser1', '2021-08-16');
INSERT INTO VENDOR (vendor_id, vendor_name, vendor_address, created_by, created_date, modified_by, modified_date) 
VALUES ( 4, 'Champion Sports', 'Address 4',  'testUser1', '2021-08-16', 'testUser1', '2021-08-16');
INSERT INTO VENDOR (vendor_id, vendor_name, vendor_address, created_by, created_date, modified_by, modified_date) 
VALUES ( 5, 'Fashion Mall', 'Address 5',  'testUser1', '2021-08-16', 'testUser1', '2021-08-16');
INSERT INTO VENDOR (vendor_id, vendor_name, vendor_address, created_by, created_date, modified_by, modified_date) 
VALUES ( 6, 'Brand One Clothing', 'Address 6',  'testUser1', '2021-08-16', 'testUser1', '2021-08-16');



INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 100, 'iPhone 12 Pro Max',1, 'testUser1', '2022-08-06', 'testUser1', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 101, 'iPhone 13 Pro Max',1, 'testUser1', '2022-08-06', 'testUser1', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 102, 'iPhone 13',2, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 103, 'iPhone 13',2, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 104, 'OnePlus 10R',2, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 105, 'OnePlus 10R',1, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 106, 'OnePlus 10R',1, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 107, 'Cricket Bat A1',3, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 108, 'Cricket Bat A1',3, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 109, 'Cricket Bat A1',4, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 110, 'Cricket Bat - Curved',3, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 111, 'Cricket Bat - Primium',4, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 112, 'Printed Men Round Neck',5, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 113, 'Stripped Men Round Neck',5, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 114, 'Stripped Men Round Neck',6, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 115, 'Printed Men Round Neck',6, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 116, 'Women Gown Dress',5, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 117, 'Women Gown Dress',6, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 118, 'Women T Shirt',5, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');
INSERT INTO PRODUCT_ITEM (product_item_id, name, vendor_id, created_by, created_date, modified_by, modified_date) 
VALUES ( 119, 'Women T Shirt',6, 'testUser2', '2022-08-06', 'testUser2', '2022-08-06');



INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (100, 'iPhone 12 Pro Max', 'iPhone', 'Black',109900, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (101, 'iPhone 13 Pro Max', 'iPhone', 'Pink',138900, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (102, 'iPhone 13', 'iPhone', 'Gray',71900, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (103, 'iPhone 13', 'iPhone', 'Blue',71500, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (104, 'OnePlus 10R', 'OnePlus', 'Gray',34900, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (105, 'OnePlus 10R', 'OnePlus', 'Black',35100, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (106, 'OnePlus 10R', 'OnePlus', 'Blue',34800, 'MOBILE_AND_ACCESSORIES', '2022-05-01', '2022-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (107, 'Cricket Bat A1', 'LYCAN', 'Gray',480, 'SPORTS_AND_FITNESS', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (108, 'Cricket Bat A1', 'LYCAN', 'Gray',550, 'SPORTS_AND_FITNESS', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (109, 'Cricket Bat A1', 'LYCAN', 'Gray',499, 'SPORTS_AND_FITNESS', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (110, 'Cricket Bat - Curved', 'LYCAN', 'Gray',710, 'SPORTS_AND_FITNESS', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (111, 'Cricket Bat - Primium', 'LYCAN', 'Gray',1795, 'SPORTS_AND_FITNESS', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (112, 'Printed Men Round Neck', 'Danish', 'Multicolor',799, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (113, 'Stripped Men Round Neck', 'Danish', 'Black and White',899, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (114, 'Stripped Men Round Neck', 'Danish', 'Green',759, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (115, 'Printed Men Round Neck', 'Danish', 'Red',950, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (116, 'Women Gown Dress', 'W', 'Pink', 950, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (117, 'Women Gown Dress', 'W', 'Yellow',950, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (118, 'Women T Shirt', 'W', 'White',950, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 
INSERT INTO PRODUCT_META (product_item_id, title, brand, color, base_price, category, mfg_date, expiry_date, created_by, created_date, modified_by, modified_date) 
VALUES (119, 'Women T Shirt', 'W', 'Pink',950, 'MEN_FASHION', '2022-05-01', '2032-05-15', 'testUser1', '2022-08-06', 'testUser1', '2022-08-06'); 




INSERT INTO SHOPPING_CART (shopping_cart_id, gross_total_amount, net_payable_amount, total_discount_amount, created_by, created_date, modified_by, modified_date) 
VALUES (1001, 0, 0, 0,   'testUser1',  '2021-08-16',  'testUser1', '2021-08-16');
INSERT INTO SHOPPING_CART (shopping_cart_id, gross_total_amount, net_payable_amount, total_discount_amount, created_by, created_date, modified_by, modified_date) 
VALUES (1002, 0, 0, 0,   'testUser2',  '2021-08-16',  'testUser2', '2021-08-16');
INSERT INTO SHOPPING_CART (shopping_cart_id, gross_total_amount, net_payable_amount, total_discount_amount, created_by, created_date, modified_by, modified_date) 
VALUES (1003, 0, 0, 0,   'testUser2',  '2021-08-16',  'testUser2', '2021-08-16');


INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1001,100);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1001,106);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1002,101);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1002,105);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1002,103);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1003,108);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1003,113);
INSERT INTO SHOPPING_CART_PRODUCT_ITEM (shopping_cart_fk, product_item_fk) 
VALUES (1003,118);


UPDATE SHOPPING_CART AS CART
SET CART.GROSS_TOTAL_AMOUNT = (
			SELECT SUM(PM.BASE_PRICE) 
			FROM SHOPPING_CART SC,  SHOPPING_CART_PRODUCT_ITEM SCP, PRODUCT_META PM
			WHERE CART.SHOPPING_CART_ID = SC.SHOPPING_CART_ID AND SC.SHOPPING_CART_ID = SCP.SHOPPING_CART_FK AND SCP.PRODUCT_ITEM_FK = PM.PRODUCT_ITEM_ID 
			GROUP BY SC.SHOPPING_CART_ID);

			
UPDATE SHOPPING_CART CART
SET CART.NET_PAYABLE_AMOUNT = CART.GROSS_TOTAL_AMOUNT;
