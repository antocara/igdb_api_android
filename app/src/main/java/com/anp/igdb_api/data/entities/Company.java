package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;

public class Company {

  private int id;
  private String name;
  private String slug;
  @SerializedName("average_rating") private double averageRating;
  private int parent;
  @SerializedName("company_logo")
  private ImageInfo companyLogo;
  @SerializedName("founded_year") private int foundedAtYear;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public double getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(double averageRating) {
    this.averageRating = averageRating;
  }

  public int getParent() {
    return parent;
  }

  public void setParent(int parent) {
    this.parent = parent;
  }

  public ImageInfo getCompanyLogo() {
    return companyLogo;
  }

  public void setCompanyLogo(ImageInfo companyLogo) {
    this.companyLogo = companyLogo;
  }

  public int getFoundedAtYear() {
    return foundedAtYear;
  }

  public void setFoundedAtYear(int foundedAtYear) {
    this.foundedAtYear = foundedAtYear;
  }
}
