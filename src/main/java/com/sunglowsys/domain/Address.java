package com.sunglowsys.domain;

import java.util.Objects;

public class Address {
    private Long id;
    private String village;
    private String post;
    private String dist;
    private String state;
    public Address(){
        System.out.println("Address object created");
    }

    public Address(String village, String post, String dist, String state) {
        this.village = village;
        this.post = post;
        this.dist = dist;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(village, address.village) && Objects.equals(post, address.post) && Objects.equals(dist, address.dist) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, village, post, dist, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", village='" + village + '\'' +
                ", post='" + post + '\'' +
                ", dist='" + dist + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public void checkAddress(){
        System.out.println("AddressId: " + 1001);
        System.out.println("viilage: " + "khurrumpur");
        System.out.println("post: " + "kantaur");
        System.out.println("dist: " + "kasganj");
        System.out.println("state: " + "up");
    }
}
