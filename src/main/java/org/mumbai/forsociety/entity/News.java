package org.mumbai.forsociety.entity;

import javax.persistence.*;

@Entity(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    private Long newsId;
    @Column(name = "heading")
    private String heading;
    @Column(name = "url")
    private String url;
    @Column(name = "videourl")
    private String videoUrl;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", heading='" + heading + '\'' +
                ", url='" + url + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }
}
