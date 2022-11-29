package com.Rim.Test.service;

import com.Rim.Test.Entity.Point;
import com.Rim.Test.repository.PointRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    @Autowired
    private PointRepo pointRepo;

    public List<Point> getAllPoint(){
        return pointRepo.findAll();
    }
}
