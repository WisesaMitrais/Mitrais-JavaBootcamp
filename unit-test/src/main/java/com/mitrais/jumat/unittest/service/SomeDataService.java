package com.mitrais.jumat.unittest.service;

import java.util.Arrays;

public class SomeDataService implements ISomeDataService {

    private SomeDataHelper someDataHelper;

    @Override
    public int calculateSum(int[] numbers) {
        return Arrays.stream(numbers).reduce(Integer::sum).orElse(0);
    }

    @Override
    public int calculateSumFromOtherClass() {
        int[] numbers = someDataHelper.findAllHardcoded();
        return Arrays.stream(numbers).reduce(Integer::sum).orElse(0);
    }

    public void setSomeDataHelper(SomeDataHelper someDataHelper) {
        this.someDataHelper = someDataHelper;
    }
}
