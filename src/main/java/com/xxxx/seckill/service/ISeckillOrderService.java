package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.SeckillOrder;
import com.xxxx.seckill.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

	/**
	 * 功能描述: 获取秒杀结果
	 */
	Long getResult(User user, Long goodsId);
}
