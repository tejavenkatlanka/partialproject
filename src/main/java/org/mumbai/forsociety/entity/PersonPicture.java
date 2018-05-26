package org.mumbai.forsociety.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonPicture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "picture_id")
    private Long pictureId;
    @Column(name = "person_picture_url")
    private String personPictureUrl;

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public String getPersonPictureUrl() {
        return personPictureUrl;
    }

    public void setPersonPictureUrl(String personPictureUrl) {
        this.personPictureUrl = personPictureUrl;
    }

}
