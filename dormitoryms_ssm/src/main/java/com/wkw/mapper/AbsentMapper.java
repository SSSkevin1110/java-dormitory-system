package com.wkw.mapper;

import com.wkw.entity.Absent;

import java.util.List;

public interface AbsentMapper {
    public List<Absent> list();
    public List<Absent> searchByBuildingName(String value);
    public List<Absent> searchByDormitoryName(String value);
    public void save(Absent absent);
}
