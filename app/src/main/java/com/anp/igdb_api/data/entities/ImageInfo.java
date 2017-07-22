package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;

public class ImageInfo {

  private String id;
  @SerializedName("url") private String urlPath;
  private int Width;
  private int height;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUrlPath() {
    return urlPath;
  }

  public void setUrlPath(String urlPath) {
    this.urlPath = urlPath;
  }

  public int getWidth() {
    return Width;
  }

  public void setWidth(int width) {
    Width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
