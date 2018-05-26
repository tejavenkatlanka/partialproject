package org.mumbai.forsociety.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "events")
public class Event
{
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private Long eventId;
    @Column(name = "heading")
    private  String heading;
    @Column(name = "description")
    private  String description;
    @Column(name = "event_date")
    private Date eventDate;
    //@OneToMany(fetch = FetchType.EAGER,cascade={CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})//cascade={CascadeType.REMOVE}
   // @JoinColumn(name="event_picture_id",nullable=true)
    @OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})
	@JoinTable(name="event_picture_rel",joinColumns={@JoinColumn(name="event_no")},inverseJoinColumns={@JoinColumn(name="event_pic_id")})
	private List<EventPicture> pictures;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public List<EventPicture> getPictures() {
        return pictures;
    }

    public void setPictures(List<EventPicture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", eventDate=" + eventDate +
                ", pictures=" + pictures +
                '}';
    }



}
