package cn.flyme.shop.service;

import cn.flyme.shop.entities.Admin;
import cn.flyme.shop.entities.AdminExample;
import cn.flyme.shop.mapper.AdminMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminMapper mapper;

    public PageInfo getAll(Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            //默认查询为第一页 10条数据
            pageNum = 1;
            pageSize = 10;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Admin> admins = mapper.selectByExample(new AdminExample());
        PageInfo page = new PageInfo(admins);
        return page;
    }

    public boolean insertAdmin(Admin admin) {
        return mapper.insert(admin) > 0 ? true : false;
    }

    public Admin select() {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria().andUnameEqualTo("yan");
        List<Admin> admins = mapper.selectByExample(example);
        return admins.get(0);
    }

    public void delete() {
        mapper.deleteByPrimaryKey((long) 11);
    }

    public void update() {
        Admin admin = new Admin();
        admin.setPasswd("123");
        AdminExample example = new AdminExample();
        example.createCriteria().andIdEqualTo((long) 1);
        mapper.updateByExampleSelective(admin, example);
    }

}
