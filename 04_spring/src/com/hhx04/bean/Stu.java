package com.hhx04.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author hhxStellar
 * @date 2021/9/11-19:08
 */
public class Stu {
    //数组类型属性
    private String[] info;

    //list类型属性
    private List<String> books;

    //map类型属性
    private Map<String, Integer> scores;

    //set类型属性
    private Set<String> courses;

    public String[] getInfo() {
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "info=" + Arrays.toString(info) +
                ", books=" + books +
                ", scores=" + scores +
                ", courses=" + courses +
                '}';
    }
}
