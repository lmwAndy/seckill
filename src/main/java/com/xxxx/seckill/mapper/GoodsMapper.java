package com.xxxx.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.seckill.pojo.Goods;
import com.xxxx.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 *
 */
public interface GoodsMapper extends BaseMapper<Goods> {

	/**
	 * 功能描述: 获取商品列表
	 */
	List<GoodsVo> findGoodsVo();

	/**
	 * 功能描述: 获取商品详情

	 */
	GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
