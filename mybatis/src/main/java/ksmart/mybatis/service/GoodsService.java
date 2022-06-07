package ksmart.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart.mybatis.dto.Goods;
import ksmart.mybatis.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	public final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	/*상품 등록*/
	public int addGoods(Goods goods) {
		int result = goodsMapper.addGoods(goods);
		
		return result;
	}
	
	/* 상품 목록 조회 */
	public List<Goods> getGoodsList(){
		List<Goods> goodsList = goodsMapper.getGoodsList();
		return goodsList;
	}
}
