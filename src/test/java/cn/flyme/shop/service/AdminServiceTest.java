package cn.flyme.shop.service;

import cn.flyme.shop.entities.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTest {

    @Autowired
    AdminService service;

    @Test
    public void test() {
//        List<Admin> all = service.getAll(1,5);
//        for(Admin admin:all){
//            System.out.println(admin.getId()+" "+admin.getUname());
//        }
    }

    @Test
    public void testInsert() {
        Admin admin = new Admin();
        admin.setUname("yan");
        admin.setPasswd("123");
        admin.setPower(4);
        service.insertAdmin(admin);
    }

    @Test
    public void testSelect() {
        service.delete();
        Admin admin = service.select();
        System.out.println(admin);
    }

    @Test
    public void update() {
        service.update();
    }
}