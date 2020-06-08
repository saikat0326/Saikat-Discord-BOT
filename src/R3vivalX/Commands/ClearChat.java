package R3vivalX.Commands;

import R3vivalX.Main.Eraser;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ClearChat extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String args[] = event.getMessage().getContentRaw().split("\\s+");
		String member = "empty";
		member =  event.getMember().getId().toString();
		
		if (args[0].equalsIgnoreCase(Eraser.PREFIX + "clear")) {
			
			if(member.equals("523183373603045436")||member.equals("610543904865124374")) {
			
		    	if (args.length < 2) {
		    	    // Usage
		    	    EmbedBuilder usage = new EmbedBuilder();
		     	    usage.setColor(0xff3923);
		     	    usage.setTitle("Specify amount to delete");
		    	    usage.setDescription("Usage: `" + Eraser.PREFIX + "clear [# of messages]`");
		    	    event.getChannel().sendMessage(usage.build()).queue();
		    	    
		    	}
		    
	     	     else {
	     		    try {
	    		 	    java.util.List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
	    		      	event.getChannel().deleteMessages(messages).queue();
	   		
		    	    	// Success
		     	    	EmbedBuilder success = new EmbedBuilder();
		     	    	success.setColor(0x22ff2a);
			    	    success.setTitle("✅   " + args[1] + " messages Were Removed From Its Existence.");
		     	    	event.getChannel().sendMessage(success.build()).queue();
	     	     	}
    		    	catch (IllegalArgumentException e) {
	    		if (e.toString().startsWith("java.lang.IllegalArgumentException: Message retrieval")) {
	     			// Too many messages
	     			EmbedBuilder error = new EmbedBuilder();
		    		error.setColor(0xff3923);
		    		error.setTitle("🔴 Too many messages selected");
		    		error.setDescription("Between 1-100 messages can be deleted at one time.");
		    		event.getChannel().sendMessage(error.build()).queue();
	    		}
	     		else {
		    		// Messages too old
	     			EmbedBuilder error = new EmbedBuilder();
		     		error.setColor(0xff3923);
		     		error.setTitle("🔴 Selected messages are older than 2 weeks");
		    		error.setDescription("Messages older than 2 weeks cannot be deleted.");
		     		event.getChannel().sendMessage(error.build()).queue();
		    	}
	    	}
    	}
   }
			else{
				
				event.getMessage().delete().queue();
				EmbedBuilder builder = new EmbedBuilder();
				builder.setTitle("Lmao Noob !!! ");
				builder.setDescription("You Are Not Authorized To Use This Command");
				builder.setColor(0x00ff00);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(builder.build()).queue();
				}
}	  
}
	}

