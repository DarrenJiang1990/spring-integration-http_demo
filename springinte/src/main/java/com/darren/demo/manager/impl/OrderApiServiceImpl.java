package com.darren.demo.manager.impl;

import com.darren.demo.domain.ListingSellOrderBo;
import com.darren.demo.domain.ListingSellOrderResponse;
import com.darren.demo.domain.MyListingSellOrderRequest;
import com.darren.demo.manager.OrderApiService;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author JiangDarun
 * @Time 2019/1/2.
 * 访问方式：http://localhost:8083/service?channel=MyListingSellOrderRequest&loginAccount=1709060003&platformId=2e2302818a996993c08f2f07c9606e79&appKey=mobile
 *
 */
@Scope("singleton")
@Service("orderApiService")
public class OrderApiServiceImpl  implements OrderApiService{


    @Override
    public ListingSellOrderResponse queryWaitPayOrders(MyListingSellOrderRequest orderRequest) {
        ListingSellOrderResponse response=new  ListingSellOrderResponse();
        String  loginAccount=orderRequest.getLoginAccount();
        if(StringUtils.isEmpty(loginAccount)){
            response.setCode("9999");
            response.setResult("用户账户不能为空");
        }
        for(int i=1;i<3;i++){
            ListingSellOrderBo listingSellOrderBo=new  ListingSellOrderBo();
            listingSellOrderBo.setProductCode("product"+i);
            listingSellOrderBo.setContractAmount(String.valueOf(100*i));
            listingSellOrderBo.setTradeTime(String.valueOf(System.currentTimeMillis()));
            response.addListingSellOrderBo(listingSellOrderBo);
        }
        response.setCode("0000");
        return response;
    }
}
