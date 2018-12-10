package o2o.service.impl;

import o2o.dao.AreaDao;
import o2o.entity.Area;
import o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hxk
 * 2018/12/10 9:52
 */

@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
