package cn.itcast.core.controller.brand;

import cn.itcast.core.entity.PageResult;
import cn.itcast.core.entity.Result;
import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.service.brand.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: BrandController
 * @Company: http://www.itcast.cn/
 * @Description: 品牌管理模块
 * @author 阮文 
 * @date 2018年9月16日 下午6:20:42
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
	
	@Reference
	private BrandService brandService;


	@RequestMapping("/findAll.do")
	public List<Brand> findAll(){
		return brandService.findAll();
	}



}
