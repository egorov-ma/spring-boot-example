package ru.neoflex.domain;

import org.springframework.data.annotation.Id;

public class Message {
    private String data;
    @Id
    private Long id;
    private String name;
    private int age;

    public Message(String data, Long id, String name, int age) {
        this.data = data;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getData() {
        return data;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Message{" +
                "data='" + data + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
