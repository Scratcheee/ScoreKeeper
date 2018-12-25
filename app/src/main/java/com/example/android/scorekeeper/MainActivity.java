package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Int variables for Team A
     */
    int teamAScore = 0;
    int teamAFoul = 0;
    int teamAYellowCard = 0;
    int teamARedCard = 0;
    int teamAOffside = 0;
    int teamACorner = 0;

    /**
     * Int variables for Team B
     */
    int teamBScore = 0;
    int teamBFoul = 0;
    int teamBYellowCard = 0;
    int teamBRedCard = 0;
    int teamBOffside = 0;
    int teamBCorner = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));

    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));

    }

    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));

    }

    public void displayOffsideForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_offside);
        scoreView.setText(String.valueOf(score));

    }

    public void displayCornerForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));

    }

    public void goalForTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayScoreForTeamA(teamAScore);

    }

    public void foulForTeamA(View view) {
        teamAFoul = teamAFoul + 1;
        displayFoulForTeamA(teamAFoul);

    }

    public void yellowForTeamA(View view) {
        teamAYellowCard = teamAYellowCard + 1;
        displayYellowForTeamA(teamAYellowCard);

    }

    public void redForTeamA(View view) {
        teamARedCard = teamARedCard + 1;
        displayRedForTeamA(teamARedCard);

    }

    public void offsideForTeamA(View view) {
        teamAOffside = teamAOffside + 1;
        displayOffsideForTeamA(teamAOffside);

    }

    public void cornerForTeamA(View view) {
        teamACorner = teamACorner + 1;
        displayCornerForTeamA(teamACorner);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));

    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));

    }

    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));

    }

    public void displayOffsideForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_offside);
        scoreView.setText(String.valueOf(score));

    }

    public void displayCornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));

    }

    public void goalForTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayScoreForTeamB(teamBScore);

    }

    public void foulForTeamB(View view) {
        teamBFoul = teamBFoul + 1;
        displayFoulForTeamB(teamBFoul);

    }

    public void yellowForTeamB(View view) {
        teamBYellowCard = teamBYellowCard + 1;
        displayYellowForTeamB(teamBYellowCard);

    }

    public void redForTeamB(View view) {
        teamBRedCard = teamBRedCard + 1;
        displayRedForTeamB(teamBRedCard);

    }

    public void offsideForTeamB(View view) {
        teamBOffside = teamBOffside + 1;
        displayOffsideForTeamB(teamBOffside);

    }

    public void cornerForTeamB(View view) {
        teamBCorner = teamBCorner + 1;
        displayCornerForTeamB(teamBCorner);

    }

    /**
     * Resets everything.
     */


    public void resetValues(View view) {

        teamAScore = 0;
        teamAFoul = 0;
        teamAYellowCard = 0;
        teamARedCard = 0;
        teamAOffside = 0;
        teamACorner = 0;

        teamBScore = 0;
        teamBFoul = 0;
        teamBYellowCard = 0;
        teamBRedCard = 0;
        teamBOffside = 0;
        teamBCorner = 0;

        displayScoreForTeamA(teamAScore);
        displayScoreForTeamB(teamBScore);
        displayFoulForTeamA(teamAFoul);
        displayFoulForTeamB(teamBFoul);
        displayYellowForTeamA(teamAYellowCard);
        displayYellowForTeamB(teamBYellowCard);
        displayRedForTeamA(teamARedCard);
        displayRedForTeamB(teamBRedCard);
        displayOffsideForTeamA(teamAOffside);
        displayOffsideForTeamB(teamBOffside);
        displayCornerForTeamA(teamACorner);
        displayCornerForTeamB(teamBCorner);
    }
}
