package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;

public class GameCompanyInfo extends Game {

  @SerializedName("publisher") private boolean isPublisher;
  @SerializedName("developer") private boolean isDeveloper;

  public boolean isPublisher() {
    return isPublisher;
  }

  public void setPublisher(boolean publisher) {
    isPublisher = publisher;
  }

  public boolean isDeveloper() {
    return isDeveloper;
  }

  public void setDeveloper(boolean developer) {
    isDeveloper = developer;
  }
}
