package com.example.springconvention;

import com.example.springconvention.discount.DiscountPolicy;
import com.example.springconvention.discount.OrderService;
import com.example.springconvention.discount.OrderServiceImpl;
import com.example.springconvention.discount.RateDiscountPolicy;
import com.example.springconvention.member.MemberRepository;
import com.example.springconvention.member.MemberService;
import com.example.springconvention.member.MemberServiceImpl;
import com.example.springconvention.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}