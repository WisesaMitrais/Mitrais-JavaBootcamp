package com.mitrais.jumat.unittest;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ListMockTest {

    // SUT
    List listMock = mock(List.class);

    @Test
    public void verifcation(){
        when(listMock.size()).thenReturn(5);

        assertEquals(5, listMock.size());

        verify(listMock, times(1)).size();
        verify(listMock, never()).get(0);
        verify(listMock, never()).get(1);
        verify(listMock, never()).get(anyInt());

        /**
         * public void tarikTunai(input){
         *   if (uangcukup(input)) then
         *     debetSaldo(input); -- verify
         *     keluarkanUang(input);
         *   else
         *     notifSaldoTidakCukup();
         *   endif
         * }
         *
         * when(uangcukup(anyFloat)).thenReturn(false)
         * verify(this, never()).debetSaldo()
         * verify(this, never()).keluarUang()
         * verify(this, times(1)).notifSaldoTidakCukup()
         */


    }
}
