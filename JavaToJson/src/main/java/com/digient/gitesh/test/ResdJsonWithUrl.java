package com.digient.gitesh.test;

import java.io.IOException;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.digient.gitesh.dto.User;

public class ResdJsonWithUrl {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
        try {
            User usrPost = mapper.readValue(new URL("http://jsonplaceholder.digient.com/posts/1"), User.class);
            System.out.println(usrPost);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
