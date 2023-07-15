package com.cybertek.tests.Z.Day8_windows_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1(){
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);
        String Subi_Champion=faker.leagueOfLegends().champion();
        String Subi_Rank=faker.leagueOfLegends().rank();
        String Subi_SummonerSpell=faker.leagueOfLegends().summonerSpell();
        System.out.println("Subi_Cutie's Champion = " + Subi_Champion);
        System.out.println("Subi_Cutie's Rank = " + Subi_Rank);
        System.out.println("Subi_Cutie's SummonerSpell = " + Subi_SummonerSpell);






    }
}
