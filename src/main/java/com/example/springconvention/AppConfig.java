package com.example.springconvention;

import com.example.springconvention.discount.FixDiscountPolicy;
import com.example.springconvention.discount.OrderService;
import com.example.springconvention.discount.OrderServiceImpl;
import com.example.springconvention.member.MemberService;
import com.example.springconvention.member.MemberServiceImpl;
import com.example.springconvention.member.MemoryMemberRepository;

public class AppConfig {


    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}