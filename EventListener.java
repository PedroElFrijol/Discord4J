package dev.virusfusion.events;

import dev.virusfusion.events.listeners.MessageReceived;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class EventListener extends ListenerAdapter {

    private final MessageReceived messageReceived;

    public EventListener(MessageReceived messageReceived) {


        this.messageReceived = messageReceived;

    }
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) { // this gets activated when someone always sends a message
        if (event.getAuthor().isBot()) // if the person who is talking is a bot then its not gonna do shit
            return;

        messageReceived.setMessage(event); // stores the event inside of a variable in messagereceived class
    }

    // In Java args contains the supplied command-line arguments as an array of String objects.
    // In other words, if you run your program as java MyProgram one two then args will contain ["one", "two"]

}
