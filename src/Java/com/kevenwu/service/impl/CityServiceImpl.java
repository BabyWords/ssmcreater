package com.kevenwu.service.impl;
 import com.kevenwu.dao.CityDao;
 import com.kevenwu.service.CityService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    CityDao cityDao;
    public String getCityName(String  id) {
        return cityDao.queryById(id);
    }
}
