package com.example.microservice1;

import javax.persistence.*;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEVICE_GENERATOR")
    @SequenceGenerator(name = "SEQ_DEVICE_GENERATOR", sequenceName = "SEQ_DEVICE")
    Integer id;
    @Column
    String sn;
    @Column
    String groupname;
    @Column
    String family;

    public Device() {
    }

    public Device(Integer id, String sn, String groupname, String family) {
        this.id = id;
        this.sn = sn;
        this.groupname = groupname;
        this.family = family;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
