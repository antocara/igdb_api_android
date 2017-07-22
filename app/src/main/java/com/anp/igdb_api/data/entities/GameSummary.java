package com.anp.igdb_api.data.entities;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GameSummary extends Game{

  @SerializedName("alternative_names") private List<AlternativeName> alternativeNames;
  @SerializedName("release_dates") private List<ReleaseDateInfo> releaseDates;


  public List<AlternativeName> getAlternativeNames() {
    return alternativeNames;
  }

  public void setAlternativeNames(List<AlternativeName> alternativeNames) {
    this.alternativeNames = alternativeNames;
  }

  public List<ReleaseDateInfo> getReleaseDates() {
    return releaseDates;
  }

  public void setReleaseDates(List<ReleaseDateInfo> releaseDates) {
    this.releaseDates = releaseDates;
  }
}
