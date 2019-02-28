package com.zns.user.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.zns.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @功能描述：TODO
 * @创建日期: 2019/2/28 12:36
 */
@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到的票："+ticket);
    }
}
