package com.example.jersey.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Chris
 * @version 1.0
 * @date 2021/7/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private static final long serialVersionUID = 1L;

    // @XmlAttribute(name = "id")
    private int id;

    // @XmlAttribute(name = "uri")
    private String uri;

    // @XmlElement(name = "firstName")
    private String firstName;

    // @XmlElement(name = "lastName")
    private String lastName;

}
