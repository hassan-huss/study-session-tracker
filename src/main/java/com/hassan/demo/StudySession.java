package com.hassan.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;
@Entity
public class StudySession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;
    private String track;
    private int durationMinutes;
    private LocalDate date;
    private boolean wasUninterrupted;
    private String notes;

    public StudySession() {

    }

    public StudySession(String topic, String track, int durationMinutes, LocalDate date, boolean wasUninterrupted, String notes) {
        this.date = date;
        this.topic = topic;
        this.track = track;
        this.durationMinutes = durationMinutes;
        this.wasUninterrupted = wasUninterrupted;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isWasUninterrupted() {
        return wasUninterrupted;
    }

    public void setWasUninterrupted(boolean wasUninterrupted) {
        this.wasUninterrupted = wasUninterrupted;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}