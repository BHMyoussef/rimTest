package com.Rim.Test.repository;

import com.Rim.Test.Entity.Point;
import com.Rim.Test.Entity.PointKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepo extends JpaRepository<Point, PointKey> {
}
