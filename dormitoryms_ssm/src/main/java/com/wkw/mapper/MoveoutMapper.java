package com.wkw.mapper;

import com.wkw.entity.Moveout;

import java.util.List;

public interface MoveoutMapper {
    public List<Moveout> list();
    public List<Moveout> searchByStudentName(String value);
    public List<Moveout> searchByDormitoryName(String value);
}
