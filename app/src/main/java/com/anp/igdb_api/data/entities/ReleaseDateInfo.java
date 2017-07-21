package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class ReleaseDateInfo {

  @SerializedName("platform_name") private String platformName;

  @SerializedName("release_date") private Date releaseDate;

  public String getPlatformName() {
    return platformName;
  }

  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }
}
