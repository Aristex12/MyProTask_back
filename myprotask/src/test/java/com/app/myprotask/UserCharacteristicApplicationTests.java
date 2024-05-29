package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserCharacteristic;

public class UserCharacteristicApplicationTests {
	@Test
    public void testEmptyConstructor() {
        UserCharacteristic userCharacteristic = new UserCharacteristic();

        assertNull(userCharacteristic.getUser());
        assertNull(userCharacteristic.getCharacteristic());
        assertNull(userCharacteristic.getExperience());
    }

    @Test
    public void testParameterizedConstructor() {
        User user = new User();
        Characteristic characteristic = new Characteristic();
        int experience = 2;

        UserCharacteristic userCharacteristic = new UserCharacteristic(user, characteristic, experience);

        assertEquals(user, userCharacteristic.getUser());
        assertEquals(characteristic, userCharacteristic.getCharacteristic());
        assertEquals(experience, userCharacteristic.getExperience());
    }

    @Test
    public void testToString() {
        User user = new User();
        Characteristic characteristic = new Characteristic();
        int experience = 2;

        UserCharacteristic userCharacteristic = new UserCharacteristic(user, characteristic, experience);

        String expectedToString = "UserCharacteristic [idUserCharacteristic=null, user=" + user
                + ", characteristic=" + characteristic + ", experience=" + experience + "]";

        assertEquals(expectedToString, userCharacteristic.toString());
    }
}
