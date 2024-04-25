package com.wkw.service;

import com.wkw.dto.AccountDto;
import com.wkw.form.AccountForm;

public interface AccountService {
    public AccountDto login(AccountForm accountForm);
}
