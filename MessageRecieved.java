package dev.virusfusion.events.listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class MessageReceived {

    private MessageReceivedEvent e;

    public void setMessage(MessageReceivedEvent e) {
        this.e = e; // stores event within messagereceived class
        update(); // calling the method
    }

    public void update() {

        e.getChannel().sendMessage("your a nerd").queue(); // get the channel the last message was spoken in, then send the following message

    }

}
