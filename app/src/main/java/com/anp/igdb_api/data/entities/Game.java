package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

public class Game {

  private int id;
  private String slug;
  private String name;
  @SerializedName("created_at") private Date createdAt;
  @SerializedName("updated_at") private Date updatedAt;
  private String summary;
  private List<GenreInfo> genres;
  private List<ThemeInfo> themes;
  private double rating;

  private List<GameCompanyInfo> companies;
  private ImageInfo cover;
  private List<ScreenshotInfo> screenshots;
  private List<VideoInfo> videos;

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

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public List<GenreInfo> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreInfo> genres) {
    this.genres = genres;
  }

  public List<ThemeInfo> getThemes() {
    return themes;
  }

  public void setThemes(List<ThemeInfo> themes) {
    this.themes = themes;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public List<GameCompanyInfo> getCompanies() {
    return companies;
  }

  public void setCompanies(List<GameCompanyInfo> companies) {
    this.companies = companies;
  }

  public ImageInfo getCover() {
    return cover;
  }

  public void setCover(ImageInfo cover) {
    this.cover = cover;
  }

  public List<ScreenshotInfo> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<ScreenshotInfo> screenshots) {
    this.screenshots = screenshots;
  }

  public List<VideoInfo> getVideos() {
    return videos;
  }

  public void setVideos(List<VideoInfo> videos) {
    this.videos = videos;
  }
}
