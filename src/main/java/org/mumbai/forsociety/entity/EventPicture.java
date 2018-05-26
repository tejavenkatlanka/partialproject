package org.mumbai.forsociety.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "event_picture")
public class EventPicture {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "picture_id")
    private Long pictureId;
    @Column(name = "photo_url")
    private String photoUrl;
    @Column(name = "event_picture_details")
    private String eventPictureDetails;

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getEventPictureDetails() {
        return eventPictureDetails;
    }

    public void setEventPictureDetails(String eventPictureDetails) {
        this.eventPictureDetails = eventPictureDetails;
    }

    @Override
    public String toString() {
        return "EventPicture{" +
                "pictureId=" + pictureId +
                ", photoUrl='" + photoUrl + '\'' +
                ", eventPictureDetails='" + eventPictureDetails + '\'' +
                '}';
    }
}
