package com.example.huanghuai.cleangamedemo.util;

import java.util.ArrayList;

/**
 * Created by huanghuai on 2019/3/29.
 */

public class Team {
    private String teamRule;
    private int teamNumber;
    private ArrayList teamMember;

    public ArrayList getTeamMember() {
        return teamMember;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public String getTeamRule() {
        return teamRule;
    }

    public void setTeamMember(ArrayList teamMember) {
        this.teamMember = teamMember;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public void setTeamRule(String teamRule) {
        this.teamRule = teamRule;
    }
}
