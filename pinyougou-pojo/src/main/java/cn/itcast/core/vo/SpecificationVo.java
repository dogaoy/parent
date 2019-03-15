package cn.itcast.core.vo;

import cn.itcast.core.pojo.specification.Specification;
import cn.itcast.core.pojo.specification.SpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @ClassName: SpecificationVo
 * @Company: http://www.itcast.cn/
 * @Description: 封装页面的数据
 * @author 阮文 
 * @date 2018年9月19日 下午5:51:34
 */
@SuppressWarnings("serial")
public class SpecificationVo implements Serializable{

	private Specification specification;
	private List<SpecificationOption> specificationOptionList;

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public List<SpecificationOption> getSpecificationOptionList() {
		return specificationOptionList;
	}

	public void setSpecificationOptionList(List<SpecificationOption> specificationOptionList) {
		this.specificationOptionList = specificationOptionList;
	}
}



	
	

