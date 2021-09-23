package com.logos.lesson19.context;

import com.logos.lesson18.bank.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Context {
    private static Context context;
    private Context(){}

    public static Context getContext(){
        if (Objects.isNull(context)){
            context = new Context();
        }
        return context;
    }

    @Getter
    Database database = new Database();

    @Getter
    User user = new User(1l, "name");
}
