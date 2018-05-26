package org.mumbai.forsociety.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Long personId;
    @Column(name = "person_name")
    private String name;
    @Column(name = "person_occupation")
    private String personOccupation;
    //@OneToOne()
    ///@PrimaryKeyJoinColumn(referencedColumnName = "photo_id")
    //@ManyToOne(fetch = FetchType.EAGER,cascade={CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})
    //@JoinColumn(name="person_photo_id",nullable=false)//nullable=false
    @OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})
  	@JoinTable(name="person_picture_rel",joinColumns={@JoinColumn(name="person_no")},inverseJoinColumns={@JoinColumn(name="pic_id")})
    private PersonPicture personPicture;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonOccupation() {
        return personOccupation;
    }

    public void setPersonOccupation(String personOccupation) {
        this.personOccupation = personOccupation;
    }

    public PersonPicture getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(PersonPicture personPicture) {
        this.personPicture = personPicture;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", personOccupation='" + personOccupation + '\'' +
                ", personPicture=" + personPicture +
                '}';
    }
}
