package id.sch.smktelkom_mlg.privateassignment.xirpl406.individu2.model;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Windows XP on 15/05/2017.
 */

public class Movie extends SugarRecord implements Serializable {

    private static String poster_path;
    private static String backdrop_path;
    private static String overview;
    private static String release_date;
    private static int id;
    private static String title;
    private static float vote_average;
    public String source;
    private boolean adult;
    private String[] genre_ids;
    private String language;
    private String org_title;
    private String org_language;
    private float popularity;
    private int vote_count;
    private boolean video;

    public static String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        Movie.backdrop_path = backdrop_path;
    }

    public static String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        Movie.poster_path = poster_path;
    }

    public static String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        Movie.overview = overview;
    }

    public static String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        Movie.release_date = release_date;
    }

    public static int getID() {
        return id;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Movie.title = title;
    }

    public static float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        Movie.vote_average = vote_average;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String[] getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(String[] genre_ids) {
        this.genre_ids = genre_ids;
    }

    public void setId(int id) {
        Movie.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOrg_title() {
        return org_title;
    }

    public void setOrg_title(String org_title) {
        this.org_title = org_title;
    }

    public String getOrg_language() {
        return org_language;
    }

    public void setOrg_language(String org_language) {
        this.org_language = org_language;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
}