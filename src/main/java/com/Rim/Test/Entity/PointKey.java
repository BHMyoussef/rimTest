package com.Rim.Test.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Data
@Embeddable
public class PointKey implements Serializable {
    @Column(name = "id_device")
    private int idDevice;
    @Column(name = "date")
    private Date date;
}
