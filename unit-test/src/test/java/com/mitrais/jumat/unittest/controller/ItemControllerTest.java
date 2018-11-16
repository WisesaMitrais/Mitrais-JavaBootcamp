package com.mitrais.jumat.unittest.controller;

import com.mitrais.jumat.unittest.model.Item;
import com.mitrais.jumat.unittest.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemService itemService;

    @Test
    public void findAllItems_basic() throws Exception {
        when(itemService.findAllItems()).thenReturn(Arrays.asList(
                new Item(1, "Bike 1", 1, 100),
                new Item(2, "Bike 2", 2, 200),
                new Item(3, "Bike 3", 3, 300)
        ));


        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/find-all-items")
                .accept(MediaType.APPLICATION_JSON);

        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().json("[{id: 1, name:\"Bike 1\"}, " +
                                                        "{id: 2}, " +
                                                        "{id: 3}]"));
    }

}