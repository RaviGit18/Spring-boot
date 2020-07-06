insert into supplier (supplier_Id,supplier_Name) values (1000,'CloudTail');
insert into supplier (supplier_Id,supplier_Name) values (1001,'WS Retail');
insert into supplier (supplier_Id,supplier_Name) values (1002,'Retailnet');
insert into supplier (supplier_Id,supplier_Name) values (1003,'Appario Retail');
insert into product (product_Id,product_Name) values (3000,'Shirt');
insert into product (product_Id,product_Name) values (3001,'Pant');
insert into product (product_Id,product_Name) values (3002,'Socks');
insert into product (product_Id,product_Name) values (3003,'Caps');
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4000,'Invictus',800.00,'Black','XL','sku_100',14,3000,1000);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4001,'Invictus',600.00,'Black','XS','sku_101',5,3000,1000);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4002,'Peter England',300.00,'Blue','XL','sku_102',1,3000,1001);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4003,'Nike',100.00,'Grey','S','sku_103',3,3000,1002);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4004,'Nike',1000.00,'Green','L','sku_104',18,3001,1003);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4005,'Peter England',400.00,'Yellow','M','sku_105',25,3001,1002);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4006,'Wrangler',700.00,'Orange','M','sku_106',2,3003,1000);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4007,'Reebok',670.00,'Black','S','sku_107',11,3002,1003);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4008,'Nike',890.00,'Green','S','sku_108',13,3002,1002);
insert into inventory (inventory_Id,brand_Name,price,color,size,sku_Id,quantity,product_Id,supplier_Id) 
	values (4009,'Puma',799.00,'Blue','L','sku_109',1,3003,1001);
