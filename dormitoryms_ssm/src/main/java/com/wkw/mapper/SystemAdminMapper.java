package com.wkw.mapper;

import com.wkw.entity.SystemAdmin;

public interface SystemAdminMapper {
    public SystemAdmin findByUsername(String username);

    void saveSystemAdmin(SystemAdmin systemAdmin);
}
