package com.mitrais.jumat.unittest.service;

import com.mitrais.jumat.unittest.model.Item;
import com.mitrais.jumat.unittest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item getItem(Integer id) {
        Item ball = itemRepository.getOne(id);
        ball.setValue(ball.getQty() * ball.getPrice());

        return ball;
    }

    @Override
    public List<Item> findAllItems() {
        List<Item> all = itemRepository.findAll();
        all.forEach(item -> {
            item.setValue(item.getQty() * item.getPrice());
        });
        return all;
    }
}
