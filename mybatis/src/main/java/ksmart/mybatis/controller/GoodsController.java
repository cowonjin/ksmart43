package ksmart.mybatis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart.mybatis.dto.Goods;
import ksmart.mybatis.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	

	//3. 생성자 메서드 주입방식
	private final GoodsService goodsService;
	
	public GoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	@PostMapping("/addGoods")
	public String addGoods(Goods goods
							,@RequestParam(name="goodsCode", required = false) String goodsCode
							,HttpServletRequest request){
		goodsService.addGoods(goods);
						
		return "redirect:/goods/goodsList";
	}
	


	
	@GetMapping("/goodsList")
	public String getGoodsList(Model model) {
		List<Goods> goodsList = goodsService.getGoodsList();
		model.addAttribute("goodsList", goodsList);
		
		return "goods/goodsList";
	}
	
}
