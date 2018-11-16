package com.mitrais.jumat.unittest.controller;

import com.mitrais.jumat.unittest.model.Item;
import com.mitrais.jumat.unittest.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private IItemService itemService;

    @GetMapping("/get-item")
    public Item getItem(){
        return itemService.getItem(1);
    }

    @GetMapping("/find-all-items")
    public List<Item> findAllItems(){
        return itemService.findAllItems();
    }

    @Autowired
    public void setItemService(IItemService itemService) {
        this.itemService = itemService;
    }
}
