package com.darren.demo.manager;

import com.darren.demo.domain.ListingSellOrderResponse;
import com.darren.demo.domain.MyListingSellOrderRequest;

/**
 * 订单接口
 * @author JiangDarun
 * @Time 2019/1/2.
 */
public interface OrderApiService {

    /**
     * 查询待支付订单
     * @param orderRequest
     * @return
     */
    ListingSellOrderResponse queryWaitPayOrders(MyListingSellOrderRequest orderRequest);

}
