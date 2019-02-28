package com.zns.ticket.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @功能描述：TODO
 * @创建日期: 2019/2/28 12:09
 */
@Component
@Service //将服务发布出去
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《厉害了我的国》";
    }
}
