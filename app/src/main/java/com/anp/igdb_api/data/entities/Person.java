package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class Person {
  private int id;
  private String slug;
  private String name;
  @SerializedName("dob") private Date dateOfBirth;
  @SerializedName("country") private int countryId;
  private String bio;
  @SerializedName("person_mug_shot") private ImageInfo mugshot;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getCountryId() {
    return countryId;
  }

  public void setCountryId(int countryId) {
    this.countryId = countryId;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public ImageInfo getMugshot() {
    return mugshot;
  }

  public void setMugshot(ImageInfo mugshot) {
    this.mugshot = mugshot;
  }
}
