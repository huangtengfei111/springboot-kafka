package com.example.kafkademo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/17 15:37
 */
@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    @GetMapping("/message/send")
    public String send(String msg){
        kafkaTemplate.send("demo", msg); //使用kafka模板发送信息
        return "success";
    }

}
