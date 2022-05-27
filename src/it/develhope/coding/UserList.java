package it.develhope.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserList {

    static volatile List<User> userList = Collections.synchronizedList(new ArrayList<>());



}
