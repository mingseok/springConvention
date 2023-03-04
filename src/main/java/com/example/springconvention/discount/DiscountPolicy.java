package com.example.springconvention.discount;

import com.example.springconvention.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
