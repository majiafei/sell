package org.giveu.sell.mjf.mapper;

import org.giveu.sell.mjf.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoMapper extends JpaRepository<ProductInfo,Integer> {


}
