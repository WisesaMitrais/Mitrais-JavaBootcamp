package com.mitrais.jumat.unittest.service;

import com.mitrais.jumat.unittest.model.Item;

import java.util.List;

public interface IItemService {
    Item getItem(Integer id);

    List<Item> findAllItems();
}
