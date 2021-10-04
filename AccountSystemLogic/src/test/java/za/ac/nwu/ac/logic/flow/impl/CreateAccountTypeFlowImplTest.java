package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    @Mock
    private  AccountTypeTranslator translator;

    @InjectMocks
    private CreateAccountTypeFlowImpl flow;

    @Before
    public void setUp() throws Exception {
//        translator = Mockito.mock(AccountTypeTranslator.class);
//        flow = new CreateAccountTypeFlowImpl(translator);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {

        AccountTypeDto accountTypeDto = new AccountTypeDto(null, null, LocalDate.now());
        when(translator.create(any(AccountTypeDto.class))).then(returnsFirstArg());
        AccountTypeDto result = flow.create(new AccountTypeDto());
        assertNotNull(result);
        assertEquals(LocalDate.now(), result.getCreationDate());
        verify(translator, times(2)).create(eq(accountTypeDto));

//        when(translator.create(any(AccountTypeDto.class))).thenThrow(new RuntimeException());
//        try{
//            flow.create(new AccountTypeDto());
//            fail("Should throw an exception");
//        }catch (Exception e) {
//        }
//
//        verify(translator, never()).create(any(AccountTypeDto.class));

//        when(translator.create(any(AccountTypeDto.class))).thenReturn(new AccountTypeDto());

//
//        verify(translator).create(any(AccountTypeDto.class));
//        verify(translator, times(1)).create(any(AccountTypeDto.class));
//        verify(translator, never()).create(any(AccountTypeDto.class));
//        verify(translator, atLeastOnce()).create(any(AccountTypeDto.class));

//        AccountTypeDto accountTypeDto = new AccountTypeDto("mnemonic", "Name", LocalDate.parse("2020-01-01"));
//        AccountTypeDto accountTypeDto = new AccountTypeDto();
//        AccountTypeDto accountTypeDto2 = new AccountTypeDto("mnemonic2", "Name2", LocalDate.parse("2020-01-01"));
//        when(translator.create(eq(accountTypeDto))).thenReturn(accountTypeDto2);
//        when(translator.create(any(AccountTypeDto.class))).thenReturn(accountTypeDto2);
//        AccountTypeDto result = flow.create(accountTypeDto);
//
//        assertNull(result);
//        assertNotNull(result);
//
//        verify(translator, times(1)).create(eq(accountTypeDto));
//        verify(translator, times(2)).create(any(AccountTypeDto.class));
//        verify(translator, times(1)).create(eq(accountTypeDto2));
    }
}