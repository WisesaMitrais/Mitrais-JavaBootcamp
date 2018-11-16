package com.mitrais.jumat.unittest.service;

import com.mitrais.jumat.unittest.model.Item;
import com.mitrais.jumat.unittest.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {

    @InjectMocks
    private ItemService itemService;
    @Mock
    private ItemRepository itemRepository;

    @Test
    public void getItem_Basic(){
        when(itemRepository.getOne(2)).thenReturn(new Item(2, "Bike", 2, 1000));

        Item item = itemService.getItem(2);
        assertEquals(2000, item.getValue(), 0);
    }

    @Test
    public void findAllItems_Basic(){
        when(itemRepository.findAll()).thenReturn(Arrays.asList(
                new Item(1, "Bike 1", 1, 100),
                new Item(2, "Bike 1", 2, 200),
                new Item(3, "Bike 1", 3, 300)
        ));

        List<Item> items = itemService.findAllItems();
        assertEquals(100, items.get(0).getValue(), 0);
        assertEquals(400, items.get(1).getValue(), 0);
        assertEquals(900, items.get(2).getValue(), 0);

        verify(itemRepository, atLeastOnce()).findAll();
    }
}