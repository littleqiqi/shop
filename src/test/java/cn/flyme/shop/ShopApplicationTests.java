package cn.flyme.shop;

import cn.flyme.shop.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopApplicationTests {

    @Autowired
    MailService service;

    @Test
    public void contextLoads() {

        String sender="yanqishi1@163.com";   //这个是发送人的邮箱
        String receiver="1004623577@qq.com";  //这个是接受人的邮箱
        String title="给丁晓玉的一封信";    //标题
        String text="　同学，你好，我是四川大学计算机学院2019夏令营工作人员，现在需要统计一下你们的一些信息，请扫右下方的二维码或者点击链接https://www.wenjuan.com/s/iaquimH/\n" +
                "\n" +
                "若确定不参加夏令营，只需在文档中的“是否参加夏令营”一栏填否即可。\n" +
                "\n" +
                "若确定参加夏令营，请填写好完整的信息，其中T恤的尺码表如下图，男女生通版，填写信息的截止时间是2019年6月27日（周四）中午12点，请大家尽快填写。\n" +
                "\n" +
                "确认参加夏令营的同学请加入夏令营QQ群（879367005），后续所有通知均会在QQ群中进行，请留意。\n" +
                "\n" +
                "夏令营的初步安排表如下所示。\n";

        String result=service.send(sender, receiver, title, text);
        System.out.println(result);
    }



}
