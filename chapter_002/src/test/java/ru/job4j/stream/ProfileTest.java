package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import org.junit.Assert;

public class ProfileTest {

    @Test
    public void profilesMap1() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Москва", "Ленина", 1, 1)),
                new Profile(new Address("Санкт-Петербург", "Пушкина", 5, 29)),
                new Profile(new Address("Москва", "Дзержинского", 13, 7)),
                new Profile(new Address("Москва", "Ленина", 1, 1)),
                new Profile(new Address("Омск", "Ленина", 10, 12)));

        Assert.assertEquals(Profile.collect(profiles), List.of(
                new Address("Москва", "Ленина", 1, 1),
                new Address("Москва", "Дзержинского", 13, 7),
                new Address("Омск", "Ленина", 10, 12),
                new Address("Санкт-Петербург", "Пушкина", 5, 29)));
    }

}
