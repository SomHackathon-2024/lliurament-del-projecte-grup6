package com.backend.hackathon.domain;


import com.backend.hackathon.application.dto.ReviewDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity(name = "reviews")
public class Review {

    @Id
    private String id;

    @ManyToOne
    @MapsId("eventsId")
    private Events events;

    @ManyToOne
    @MapsId("studentId")
    private Users student;

    private String title;
    private String content;
    private int satisfaction;
    private LocalDate reviewDate;

    public Review(ReviewDTO reviewDTO, Events events, Users student) {
        this.id = new ReviewId(student.getId(),events.getId()).toString();
        this.title = reviewDTO.getTitle();
        this.content = reviewDTO.getContent();
        this.satisfaction = reviewDTO.getSatisfaction();
        this.reviewDate = getReviewDate();
        this.events = events;
        this.student = student;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
}
