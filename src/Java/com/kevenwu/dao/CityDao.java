package com.kevenwu.dao;

import com.kevenwu.pojo.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao {
    String queryById(String id);
}
