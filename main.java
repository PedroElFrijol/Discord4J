package dev.virusfusion;j

import dev.virusfusion.events.EventListener;
import dev.virusfusion.events.listeners.MessageReceived;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class joemama {

    public static void main(String[] args) {

        MessageReceived messageReceived = new MessageReceived();

        JDABuilder builder = JDABuilder.createDefault("token");
        JDA jda = null;
        EventListener eventListener = new EventListener(messageReceived);
        builder.addEventListeners(eventListener);
        try {
            jda = builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.watching("how to poop on the toilet correctly"));


    }

}
