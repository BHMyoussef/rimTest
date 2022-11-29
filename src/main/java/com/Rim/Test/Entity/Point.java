package com.Rim.Test.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Table(name = "arch_1004901")
public class Point {

    @EmbeddedId
    private PointKey pointKey;
    private double latitude;
    private double longitude;
    private int speed;
    private int fuel;
    private boolean ignition;
    private double odo;

}
