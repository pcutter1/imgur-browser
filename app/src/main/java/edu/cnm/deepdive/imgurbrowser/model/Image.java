package edu.cnm.deepdive.imgurbrowser.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Image implements Serializable {

  private static final long serialVersionUID = 1821408953225516614L;

  @Expose
  @SerializedName("id")
  private String imageId;

  @Expose
  private String title;

  @Expose
  private String description;

  @Expose
  @SerializedName("datetime")
  private Long imageDateTime;

  @Expose
  private String type;

  @Expose
  private Integer width;

  @Expose
  private Integer height;

  @SerializedName("link")
  @Expose
  private String url;

  @Expose
  private Integer views;

  @Expose
  private Long badnwidth;

  public Image(String imageUrl) {
    url = imageUrl;
  }

  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getImageDateTime() {
    return imageDateTime;
  }

  public void setImageDateTime(Long imageDateTime) {
    this.imageDateTime = imageDateTime;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getViews() {
    return views;
  }

  public void setViews(Integer views) {
    this.views = views;
  }

  public Long getBadnwidth() {
    return badnwidth;
  }

  public void setBadnwidth(Long badnwidth) {
    this.badnwidth = badnwidth;
  }

  @NonNull
  @Override
  public String toString() {
    String alt = "Title N/A";
    if (title == null) {
      title = alt;
    }
    return title;
  }
}
