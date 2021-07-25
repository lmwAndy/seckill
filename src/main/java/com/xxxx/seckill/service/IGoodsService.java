package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.Goods;
import com.xxxx.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * @author zhoubin
 *
 */
public interface IGoodsService extends IService<Goods> {

	/**
	 * 功能描述: 获取商品列表
	 */
	List<GoodsVo> findGoodsVo();


	/**
	 * 功能描述: 获取商品详情
	 */
	GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
