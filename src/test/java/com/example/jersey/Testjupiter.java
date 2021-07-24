package com.example.jersey;

import com.example.jersey.demo.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/07/25
 */
public class Testjupiter {

    @ParameterizedTest
    @MethodSource("source_user")
    public void test1(User user) {
        System.out.println(user);
    }

    private static Stream<User> source_user() {
        return Stream.of(
                new User(1, "/aaa", "a", "b")
        );
    }
}
