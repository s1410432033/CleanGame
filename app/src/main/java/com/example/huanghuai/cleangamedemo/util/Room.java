package com.example.huanghuai.cleangamedemo.util;

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/29.
 */

public class Room {
    private String roomName;
    private int numberOfTeam;
    private int numberOfTeamMember;
    private String totleRules;
    private ArrayList<Team> teamArray;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public int getNumberOfTeamMember() {
        return numberOfTeamMember;
    }

    public String getTotleRules() {
        return totleRules;
    }

    public void setNumberOfTeam(int numberOfTeam) {
        this.numberOfTeam = numberOfTeam;
    }


    public void setNumberOfTeamMember(int numberOfTeamMember) {
        this.numberOfTeamMember = numberOfTeamMember;
    }

    public void setTotleRules(String totleRules) {
        this.totleRules = totleRules;
    }

    public ArrayList<Team> getTeamArray() {
        return teamArray;
    }

    public void setTeamArray(ArrayList<Team> teamArray) {
        this.teamArray = teamArray;
    }
}
