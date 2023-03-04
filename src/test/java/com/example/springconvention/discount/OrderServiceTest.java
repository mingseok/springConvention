package com.example.springconvention.discount;

import com.example.springconvention.member.Grade;
import com.example.springconvention.member.Member;
import com.example.springconvention.member.MemberService;
import com.example.springconvention.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}