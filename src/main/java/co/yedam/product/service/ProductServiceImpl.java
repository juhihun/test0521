package co.yedam.product.service;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.product.ProductVO;
import co.yedam.product.mapper.ProductMapper;

public class ProductServiceImpl implements ProductService {
	SqlSession session = DataSource.getInstance().openSession(true);
	ProductMapper mapper = session.getMapper(ProductMapper.class);
	@Override
	public List<ProductVO> productList() {
		return mapper.productList();
	}

}
