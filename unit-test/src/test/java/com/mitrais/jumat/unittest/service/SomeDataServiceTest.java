package com.mitrais.jumat.unittest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SomeDataServiceTest {

    @InjectMocks
    SomeDataService someDataService;
    @Mock
    SomeDataHelper someDataHelper;

    @Test
    public void calculateSum_Basic(){
        // PREPARATION

        // ACTION
        int sum = someDataService.calculateSum(new int[]{1, 2, 3});

        // VERIFICATION
        assertEquals(6, sum);
    }

    @Test
    public void calculateSum_Empty(){
        // PREPARATION

        // ACTION
        int sum = someDataService.calculateSum(new int[]{});

        // VERIFICATION
        assertEquals(0, sum);
    }

    @Test
    public void calculateSum_OneValue(){
        // PREPARATION

        // ACTION
        int sum = someDataService.calculateSum(new int[]{1});

        // VERIFICATION
        assertEquals(1, sum);
    }

    @Test
    public void calculateSumFromOtherClass_Basic(){
        // PREPARATION
        when(someDataHelper.findAllHardcoded()).thenReturn(new int[] {3, 4, 5});

        // ACTION
        int sum = someDataService.calculateSumFromOtherClass();

        // VERIFICATION
        assertEquals(12, sum);
    }

    @Test
    public void calculateSumFromOtherClass_Empty(){
        // PREPARATION
        when(someDataHelper.findAllHardcoded()).thenReturn(new int[] {});

        // ACTION
        int sum = someDataService.calculateSumFromOtherClass();

        // VERIFICATION
        assertEquals(0, sum);
    }

    @Test
    public void calculateSumFromOtherClass_OneValue(){
        // PREPARATION
        when(someDataHelper.findAllHardcoded()).thenReturn(new int[] {3});

        // ACTION
        int sum = someDataService.calculateSumFromOtherClass();

        // VERIFICATION
        assertEquals(3, sum);

    }


}