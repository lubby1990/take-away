package com.lubby.dao;

import com.lubby.bean.Customer;

/**
 * Created by lubby on 2015/11/30.
 */
public interface CustomerMapper {
    Customer getCustomerById(long cid);
}
