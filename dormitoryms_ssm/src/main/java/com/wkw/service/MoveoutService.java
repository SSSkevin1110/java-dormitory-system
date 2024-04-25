package com.wkw.service;

import com.wkw.entity.Moveout;

import java.util.List;

public interface MoveoutService {
    public List<Moveout> list();
    public List<Moveout> search(String key,String value);
}
