package com.wkw.mapper;

import com.wkw.entity.Building;

import java.util.List;

public interface BuildingMapper {
    public List<Building> list();
    public List<Building> searchByName(String value);
    public List<Building> searchByIntroduction(String value);
    public void save(Building building);
    public void update(Building building);
    public void delete(Integer id);
}
