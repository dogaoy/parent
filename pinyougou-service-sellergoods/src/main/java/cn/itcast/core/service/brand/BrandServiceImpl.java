package cn.itcast.core.service.brand;

import cn.itcast.core.dao.good.BrandDao;
import cn.itcast.core.entity.PageResult;
import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.pojo.good.BrandQuery;
import cn.itcast.core.pojo.good.BrandQuery.Criteria;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandDao brandDao;

	/*
	 * (non-Javadoc)
	 * <p>Title: findAll</p>
	 * <p>Description: 查询所有品牌</p>
	 * @return
	 * @see cn.itcast.core.service.brand.BrandService#findAll()
	 */
	@Override
	public List<Brand> findAll() {
		List<Brand> list = brandDao.selectByExample(null);
		return list;
	}


}
