package arcmop.blog.springbootest.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import arcmop.blog.springbootest.dao.SumaDao;
import arcmop.blog.springbootest.entity.Suma;
@Component
public class SumaServiceImpl implements SumaService{
	@Resource 
	SumaDao sumaDao;
        
	@Override
	public void insertSuma(Suma suma) {
		sumaDao.insertSuma(suma);
		
	}
}
