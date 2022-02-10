# structure

```lua
shipping-mall
├── admin -- 后台
├── common
├── portal -- 前台
├── repository
├── search -- 商品搜索
└── seckill -- 秒杀模块
```

# choosing technology

| dependency    | version |
| :------------ | ------- |
| JDK           | 8.0     |
| RocketMQ      | 4.9.1   |
| Redis         | 5.0.14  |
| ElasticSearch | 7.3.2   |
| Kibana        | 7.3.2   |
| Sentinel      | 1.8.0   |
| SpringBoot    | 2.5.2   |
| Mybatis-Plus  | 3.4.1   |



# database design

## 总设计

![](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/shopping_mall.png)

## 优选商品-商品专题-话题-举报-帮助模块

**业务设计**

- 优选专区

  后台管理员手动挑选出商品展示在优选专区 or 根据每个商品的综合评估自动显示在优选专区

- 商品专题

  与以上一致

- 话题

  用户创建话题到话题区，其他用户评论，评论后该用户收到消息

  管理员对该话题有删除权限

**table design**

- subject `商品专题表`

- subject_category

  > sort：该分类的排序

- subject_comment 商品专题评论表

  > member_name：评论人

- project_subject_relation

  > 记录哪些商品在该商品专题下

- topic `话题表`

  > **该话题无关商品**，只是给用户讨论交流
  >
  > attend_count：话题参与人数
  >
  > attentition_count：话题关注人数

- topic_category

  > sort：该分类的排序

- topic_comment `话题评论表`

- preference_area `优选商品表`

- preference_area_product_relation

  > 记录哪些商品在优选专区

- help `帮助表`

- help_category

- member_report `用户举报表`

  > report_status：举报状态
  >
  > handle_status：处理状态



**UML**

 ![order_task](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/cms.png)







## 订单-购物车-地址模块

**table design**

- order

  > code：订单编号
  >
  > pay_amount：应付金额[əˈmaʊnt] 
  >
  > total_amount：总金额
  >
  > coupon_amount：优惠券金额[ˈkuːpɒn]
  >
  > note：备注

- order_item 

  > 记录订单对应的产品

- order_operate_history

  > 对订单的创建与修改的记录表
  >
  > operate_man：可以是用户、管理员

- order_return_apply

  > [əˈplaɪ] 申请
  >
  > reason_id：原因id

- order_return_season

- order_setting

  > flash_over_time：秒杀订单超时时间
  >
  > normal_over_time：订单超时时间
  >
  > confirm_over_time：发货后自动确实收获时间

- cart `购物车表[kɑːt]` 

  > quantity：数量[ˈkwɒntəti]

- adress

  > default_send_status：是否默认发货地址

  



**UML**

 ![order_task](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/oms.png)



​		



## 产品模块

**table design**

- album

  > 相册表[ˈælbəm]

- alubm_image

  > 图片表
  >
  > album_id：该图片对应哪个相册

- brand

  > 品牌表[brænd]
  >
  > logo：品牌logo
  >
  > story：品牌的故事

- product_comment

  > 商品评价表
  >
  > star：评价星数

- comment_reply

  > 评论回复表

- super_member_price

  > 记录某些商品对于会员的价格
  >
  > member_level_id：哪些会员等级可以拥有该价格

- feight_template

  > charge_type：计费类型[tʃɑːdʒ] 
  >
  > first_weight：什么重量就需要支付以下的first_fee，有5个该重量即须支付5个first_fee
  >
  > first_fee：费用[fiː]

- product

  > sale：销量
  >
  > product_attribute_category_id：因为是product_attribute_category_id，**一个商品拥有多个product_attribute**

- product_category

- prodcuct_category_attribute_relation

  > 某个**商品分类**对应有哪些属性

- product_attribute_category

  > 商品属性分类表

- product_attribute

  > 商品属性表

- product_attribute_relation

  > 记录商品与属性的对应关系

- product_full_reduction

  > 商品满减表[rɪˈdʌkʃn]
  >
  > reduce_price：减少了多少金额

- product_ledder

  > [ˈlædə(r)] 商品数量达到多少后，每个商品级折扣多少
  >
  > discount：折扣百分比
  >
  > price：折扣后的价格

- product_operate_log

- product_verify_record

  > 商品审核记录表

- product_sku_stock

  > low_stock：预警库存
  >
  > lock_stock：锁定库存
  >
  > sale：销量



**UML**

 ![order_task](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/pms.png)







## 秒杀营销与首页模块

**table design**

- coupon

  > 优惠券表
  >
  > limit：每人限领数

- coupon_history

  > 优惠券使用记录

- coupon_product_category_relation

  > 每个商品分类都有优惠券

- coupon_product_relation

  > 哪个商品设置优惠券

- flash_promotion

  > [prəˈməʊʃn]秒杀促销表，即限时购表
  >
  > title：限时购主题

- flash_promotion_log

  > 推送限时购记录表
  >
  > product_id：哪个商品在限时购

- flash_promotion_product_relation

  > 记录哪些商品在限时购里

- flash_promotion_session

  > [ˈseʃ(ə)n]限时购场次表
  >
  > name：场次名称

- home_advertise

  > [ˈædvətaɪz]首页广告表
  >
  > status：上线或下线广告

- home_brand

  > 首页品牌推荐表

- home_new_product

  > 首页新鲜好物表

- home_recommend_product

  > [ˌrekəˈmend]首页推荐商品

- home_subject



**UML**

 ![order_task](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/sms.png)















## 后台管理员与用户管理模块

**table design**

- growth_change_history

  > 成长值记录表
  >
  > type：增加或减少
  >
  > count

- integration_change_history

  > [ˌɪntɪˈɡreɪʃn]积分

- integration_consume_setting

  > [kənˈsjuːm]消费
  >
  > count：一元相当于多少积分
  >
  > coupon_status：是否可以和优惠券使用

- member_product_category_id

  > 用户喜欢哪个商品分类

- member_tag_id

  > 用户喜欢哪个标签

- member_receive_adress

- member_integration_setting

  > 用户连续登录赠送积分设置表
  >
  > continue_day_count：连续登录几天有赠送

- member_task

  > 用户任务表
  >
  > integration：赠送积分



**UML**

后台管理员模块

 ![order_task](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/admin.png)



用户模块

 ![order_task](https://codeman666.oss-cn-beijing.aliyuncs.com/GitHub/shopping-mall/member.png)





