# gmall0218
项目搭建
	gmall-parent : 所有的jar 版本
		gmall-bean :
		gmall-interface ：
		gmall-common-util :
		gmall-service-util :
		gmall-web-util :
		用户服务 gmall-user-manage :  8080
		订单服务 gmall-order-web :    8081
		gmall-item-web:8084
		搜索
		gmall-list-service 8085
		gmall-list-web 8086
		gmall-passport-web 8087 单点登录
		gmall-cart-web 8088
		
服务提供者是指service他依赖service - util  
服务消费者是指web web依赖的是web - util
web - tuil 和service - tuil都依赖common - util	
	
服务提供者：依赖的模块 service-util
服务消费者：依赖的模块 web-uitl
service-util，web-util 都依赖于 common-util	

前后端分离项目
    1、接口文档  与前端对接的标准！
    
商品后台
    gmall-manage-web 8082

spu 相关的数据表结构
				
    spuInfo ： 商品表
    spuImage ： 商品图片表
    spuSaleAttr : 商品销售属性
    spuSaleAttrValue : 商品销售属性值
    spuPoster : 商品海报
    baseSaleAttr ：商品销售属性字典表，基本的属性表

商品管理：
    SPU : 根据一级分类，二级分类，三级分类 ，		
    根据三级分类Id 查询spuInfo 列表！


sku 对应的数据库表结构：		
    spu 图片 与 sku 图片关系：
    所有的sku图片，都是来自于spu 图片
            
    --------------sku相关数据表结构-------------------
    spuInfo: 商品表
    skuInfo: 库存单元表
    skuImage: 商品图片 数据来源  spuImage
    skuSaleAttrValue : 销售属性值表 {记录每个商品对应的销售属性，以及属性值都是什么}
    skuAttrValue : 平台属性值表 {记录每个商品对应的平台属性，属性值是什么}
		