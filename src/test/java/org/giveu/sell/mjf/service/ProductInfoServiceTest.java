package org.giveu.sell.mjf.service;

import org.giveu.sell.mjf.mapper.ProductInfoMapper;
import org.giveu.sell.mjf.model.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceTest {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    public void testFindOne(){

    }

    @Test
    public void testInsertProductInfo(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setCreateTime(new Date());
        productInfo.setProductDescription("bad");
        productInfo.setProductId("2");
        productInfo.setProductName("手机");
        productInfo.setProductPrice(10000);
        productInfo.setProductStock(100);
        productInfo.setUpdateTime(new Date());
        productInfoMapper.save(productInfo);
    }

}